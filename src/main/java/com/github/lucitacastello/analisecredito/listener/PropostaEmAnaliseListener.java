package com.github.lucitacastello.analisecredito.listener;

import com.github.lucitacastello.analisecredito.domain.Proposta;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class PropostaEmAnaliseListener {

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta){

    }
}
