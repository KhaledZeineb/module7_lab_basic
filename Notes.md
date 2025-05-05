1. Service Discovery avec Eureka :
- Supprime le besoin de configurer les adresses IP/ports manuellement.
- Enregistrement automatique des services.
- Résilience : redirection vers d'autres instances en cas de panne.
- Favorise la scalabilité dynamique.

2. Avantages de Feign sur RestTemplate :
- Syntaxe déclarative plus simple et intuitive.
- Intégration directe avec Eureka pour le service discovery.
- Support intégré pour la résilience (Hystrix, Resilience4j).
- Moins de code répétitif.

3. Gestion de la panne du Product Service :
- Utilisation de Fallbacks (Hystrix, Resilience4j).
- Implémentation d’un Circuit Breaker pour éviter la surcharge.
- Mise en cache temporaire des données.
- Systèmes de monitoring et d’alerte (Grafana, Prometheus).
- Retries intelligents avec backoff progressif.

4. Défis de Scalabilité :
- Surcharge possible d’Eureka.
- Latence due à l’augmentation du trafic réseau.
- Difficultés à maintenir la cohérence entre services.
- Besoin d’outils de monitoring avancés.
- Gestion complexe des versions d’API.
