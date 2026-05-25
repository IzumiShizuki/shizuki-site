FROM php:8.2-apache

RUN docker-php-ext-install bcmath \
    && a2enmod rewrite

COPY third_party/meting-api/src/Meting.php /opt/meting/Meting.php
COPY tools/meting-sidecar/public/index.php /var/www/html/index.php
COPY tools/meting-sidecar/apache/meting-router.conf /etc/apache2/conf-available/meting-router.conf

RUN a2enconf meting-router

EXPOSE 80
