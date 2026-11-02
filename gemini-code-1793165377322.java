ure@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "orders.exchange";
    public static final String QUEUE_NAME = "inventory.q";
    public static final String QUEUE_NAME2 = "inventory.q";
    public static final String ROUTING_KEY = "order_created";
<<<<<<< HEAD
    public static final String feature = "order_created";

=======
    public static final String ROUTING_KEY2 = "order_created";
    public static final String ROUTING_KEY3 = "order_created";
>>>>>>> 43acce4 (Update gemini-code-1793165377322.java)

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue inventoryQueue() {
        return new Queue(QUEUE_NAME);
    }

    @Bean
    public Binding inventoryBinding(Queue inventoryQueue, DirectExchange directExchange) {
        return BindingBuilder
                .bind(inventoryQueue)
                .to(directExchange)
                .with(ROUTING_KEY);
    }
}
