package com.education.frescotest2;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

import okhttp3.OkHttpClient;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        OkHttpClient client = new OkHttpClient();
        ImagePipelineConfig config = OkHttpImagePipelineConfigFactory
                .newBuilder(this, client)
                .build();
        Fresco.initialize(this, config);
    }
}
