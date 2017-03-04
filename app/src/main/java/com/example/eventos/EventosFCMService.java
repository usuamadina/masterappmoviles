package com.example.eventos;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.example.eventos.EventosAplicacion.mostrarDialogo;

/**
 * Created by usuwi on 04/03/2017.
 */

public class EventosFCMService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null) {
            mostrarDialogo(getApplicationContext(), remoteMessage.getNotification().getBody());
        }

    }
}