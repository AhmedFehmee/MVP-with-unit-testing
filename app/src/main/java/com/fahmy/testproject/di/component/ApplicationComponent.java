package com.fahmy.testproject.di.component;

import android.app.Application;
import android.content.Context;
import com.fahmy.testproject.TestApp;
import com.fahmy.testproject.data.DataManager;
import com.fahmy.testproject.di.ApplicationContext;
import com.fahmy.testproject.di.module.ApplicationModule;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(TestApp testApp);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
