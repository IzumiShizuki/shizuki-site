FROM m.daocloud.io/docker.io/library/php:8.2-apache

RUN docker-php-ext-install bcmath \
    && a2enmod rewrite

COPY third_party/meting-api/src/Meting.php /opt/meting/Meting.php
COPY tools/meting-sidecar/lib/playback_url.php /opt/meting/lib/playback_url.php
COPY tools/meting-sidecar/test/playback_url_test.php /opt/meting/test/playback_url_test.php
COPY tools/meting-sidecar/public/index.php /var/www/html/index.php
COPY tools/meting-sidecar/apache/meting-router.conf /etc/apache2/conf-available/meting-router.conf

RUN php /opt/meting/test/playback_url_test.php \
    && rm -r /opt/meting/test \
    && a2enconf meting-router

EXPOSE 80
