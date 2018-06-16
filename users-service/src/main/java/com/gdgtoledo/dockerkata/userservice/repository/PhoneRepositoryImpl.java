package com.gdgtoledo.dockerkata.userservice.repository;

import com.gdgtoledo.dockerkata.userservice.client.PhoneClient;
import com.gdgtoledo.dockerkata.userservice.model.Phone;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class PhoneRepositoryImpl implements PhoneRepository {

    @Value("${environment.SERVER_URL}")
    private String enpoint;

    @Override
    public Set<Phone> getPhones(String userId) {
         PhoneClient phoneClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(PhoneClient.class))
                .logLevel(Logger.Level.FULL)
                .target(PhoneClient.class, enpoint);

         return phoneClient.getPhones(userId);
    }

}