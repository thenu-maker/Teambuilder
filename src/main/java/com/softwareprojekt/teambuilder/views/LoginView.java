package com.softwareprojekt.teambuilder.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.*;

@Route("login")
@PageTitle("Login | TeamBuilder")
public class LoginView extends Div implements BeforeEnterListener {

    LoginOverlay loginOverlay = new LoginOverlay();

    public LoginView() {

        loginOverlay.setTitle("TeamBuilder");
        loginOverlay.setAction("login");
        add(loginOverlay);
        loginOverlay.setOpened(true);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent){
        if(beforeEnterEvent.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")){
            loginOverlay.setError(true);
        }
    }

}
