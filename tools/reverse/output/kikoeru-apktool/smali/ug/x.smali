.class public final Lug/x;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lug/h;


# static fields
.field public static final E:Ljava/util/List;

.field public static final F:Ljava/util/List;


# instance fields
.field public final A:J

.field public final B:Lxa/h;

.field public final C:Lyg/c;

.field public final D:Lr/y1;

.field public final a:Lb0/w1;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Lw4/c;

.field public final e:Z

.field public final f:Z

.field public final g:Lug/b;

.field public final h:Z

.field public final i:Z

.field public final j:Lug/b;

.field public final k:Lug/f;

.field public final l:Lug/p;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lug/b;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Lug/j;

.field public final v:Landroid/support/v4/media/session/b;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lug/y;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lug/y;->f:Lug/y;

    .line 6
    .line 7
    aput-object v3, v1, v2

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    sget-object v4, Lug/y;->d:Lug/y;

    .line 11
    .line 12
    aput-object v4, v1, v3

    .line 13
    .line 14
    invoke-static {v1}, Lwg/g;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lug/x;->E:Ljava/util/List;

    .line 19
    .line 20
    new-array v0, v0, [Lug/n;

    .line 21
    .line 22
    sget-object v1, Lug/n;->f:Lug/n;

    .line 23
    .line 24
    aput-object v1, v0, v2

    .line 25
    .line 26
    sget-object v1, Lug/n;->g:Lug/n;

    .line 27
    .line 28
    aput-object v1, v0, v3

    .line 29
    .line 30
    invoke-static {v0}, Lwg/g;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lug/x;->F:Ljava/util/List;

    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public constructor <init>()V
    .locals 1

    .line 121
    new-instance v0, Lug/w;

    invoke-direct {v0}, Lug/w;-><init>()V

    invoke-direct {p0, v0}, Lug/x;-><init>(Lug/w;)V

    return-void
.end method

.method public constructor <init>(Lug/w;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lug/w;->a:Lb0/w1;

    .line 3
    iput-object v0, p0, Lug/x;->a:Lb0/w1;

    .line 4
    iget-object v0, p1, Lug/w;->c:Ljava/util/ArrayList;

    .line 5
    invoke-static {v0}, Lwg/g;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lug/x;->b:Ljava/util/List;

    .line 6
    iget-object v0, p1, Lug/w;->d:Ljava/util/ArrayList;

    .line 7
    invoke-static {v0}, Lwg/g;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lug/x;->c:Ljava/util/List;

    .line 8
    iget-object v0, p1, Lug/w;->e:Lw4/c;

    .line 9
    iput-object v0, p0, Lug/x;->d:Lw4/c;

    .line 10
    iget-boolean v0, p1, Lug/w;->f:Z

    .line 11
    iput-boolean v0, p0, Lug/x;->e:Z

    .line 12
    iget-boolean v0, p1, Lug/w;->g:Z

    .line 13
    iput-boolean v0, p0, Lug/x;->f:Z

    .line 14
    iget-object v0, p1, Lug/w;->h:Lug/b;

    .line 15
    iput-object v0, p0, Lug/x;->g:Lug/b;

    .line 16
    iget-boolean v0, p1, Lug/w;->i:Z

    .line 17
    iput-boolean v0, p0, Lug/x;->h:Z

    .line 18
    iget-boolean v0, p1, Lug/w;->j:Z

    .line 19
    iput-boolean v0, p0, Lug/x;->i:Z

    .line 20
    iget-object v0, p1, Lug/w;->k:Lug/b;

    .line 21
    iput-object v0, p0, Lug/x;->j:Lug/b;

    .line 22
    iget-object v0, p1, Lug/w;->l:Lug/f;

    .line 23
    iput-object v0, p0, Lug/x;->k:Lug/f;

    .line 24
    iget-object v0, p1, Lug/w;->m:Lug/p;

    .line 25
    iput-object v0, p0, Lug/x;->l:Lug/p;

    .line 26
    iget-object v0, p1, Lug/w;->n:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    .line 27
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lhh/a;->a:Lhh/a;

    .line 28
    :cond_0
    iput-object v0, p0, Lug/x;->m:Ljava/net/ProxySelector;

    .line 29
    iget-object v0, p1, Lug/w;->o:Lug/b;

    .line 30
    iput-object v0, p0, Lug/x;->n:Lug/b;

    .line 31
    iget-object v0, p1, Lug/w;->p:Ljavax/net/SocketFactory;

    .line 32
    iput-object v0, p0, Lug/x;->o:Ljavax/net/SocketFactory;

    .line 33
    iget-object v0, p1, Lug/w;->s:Ljava/util/List;

    .line 34
    iput-object v0, p0, Lug/x;->r:Ljava/util/List;

    .line 35
    iget-object v1, p1, Lug/w;->t:Ljava/util/List;

    .line 36
    iput-object v1, p0, Lug/x;->s:Ljava/util/List;

    .line 37
    iget-object v1, p1, Lug/w;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 38
    iput-object v1, p0, Lug/x;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 39
    iget v1, p1, Lug/w;->x:I

    .line 40
    iput v1, p0, Lug/x;->w:I

    .line 41
    iget v1, p1, Lug/w;->y:I

    .line 42
    iput v1, p0, Lug/x;->x:I

    .line 43
    iget v1, p1, Lug/w;->z:I

    .line 44
    iput v1, p0, Lug/x;->y:I

    .line 45
    iget v1, p1, Lug/w;->A:I

    .line 46
    iput v1, p0, Lug/x;->z:I

    .line 47
    iget-wide v1, p1, Lug/w;->B:J

    .line 48
    iput-wide v1, p0, Lug/x;->A:J

    .line 49
    iget-object v1, p1, Lug/w;->C:Lxa/h;

    if-nez v1, :cond_1

    .line 50
    new-instance v1, Lxa/h;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lxa/h;-><init>(I)V

    :cond_1
    iput-object v1, p0, Lug/x;->B:Lxa/h;

    .line 51
    iget-object v1, p1, Lug/w;->D:Lyg/c;

    if-nez v1, :cond_2

    .line 52
    sget-object v1, Lyg/c;->l:Lyg/c;

    :cond_2
    iput-object v1, p0, Lug/x;->C:Lyg/c;

    .line 53
    iget-object v1, p1, Lug/w;->b:Lr/y1;

    if-nez v1, :cond_3

    .line 54
    new-instance v1, Lr/y1;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lr/y1;-><init>(I)V

    .line 55
    iput-object v1, p1, Lug/w;->b:Lr/y1;

    .line 56
    :cond_3
    iput-object v1, p0, Lug/x;->D:Lr/y1;

    .line 57
    check-cast v0, Ljava/lang/Iterable;

    .line 58
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_2

    .line 59
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lug/n;

    .line 60
    iget-boolean v1, v1, Lug/n;->a:Z

    if-eqz v1, :cond_5

    .line 61
    iget-object v0, p1, Lug/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_7

    .line 62
    iput-object v0, p0, Lug/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 63
    iget-object v0, p1, Lug/w;->w:Landroid/support/v4/media/session/b;

    .line 64
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    iput-object v0, p0, Lug/x;->v:Landroid/support/v4/media/session/b;

    .line 65
    iget-object v1, p1, Lug/w;->r:Ljavax/net/ssl/X509TrustManager;

    .line 66
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    iput-object v1, p0, Lug/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 67
    iget-object p1, p1, Lug/w;->v:Lug/j;

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    iget-object v1, p1, Lug/j;->b:Landroid/support/v4/media/session/b;

    invoke-static {v1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    .line 70
    :cond_6
    new-instance v1, Lug/j;

    iget-object p1, p1, Lug/j;->a:Ljava/util/Set;

    invoke-direct {v1, p1, v0}, Lug/j;-><init>(Ljava/util/Set;Landroid/support/v4/media/session/b;)V

    move-object p1, v1

    .line 71
    :goto_0
    iput-object p1, p0, Lug/x;->u:Lug/j;

    goto/16 :goto_3

    .line 72
    :cond_7
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 73
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v0

    .line 77
    invoke-virtual {v0, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 78
    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v0

    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 79
    array-length v1, v0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_9

    const/4 v1, 0x0

    aget-object v4, v0, v1

    instance-of v5, v4, Ljavax/net/ssl/X509TrustManager;

    if-eqz v5, :cond_9

    .line 80
    check-cast v4, Ljavax/net/ssl/X509TrustManager;

    .line 81
    iput-object v4, p0, Lug/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 82
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    :try_start_0
    invoke-virtual {v0}, Lfh/e;->l()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    .line 85
    new-array v3, v3, [Ljavax/net/ssl/TrustManager;

    aput-object v4, v3, v1

    invoke-virtual {v0, v2, v3, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 86
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    const-string v1, "getSocketFactory(...)"

    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    iput-object v0, p0, Lug/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 88
    sget-object v0, Lfh/e;->a:Lfh/e;

    .line 89
    invoke-virtual {v0, v4}, Lfh/e;->c(Ljavax/net/ssl/X509TrustManager;)Landroid/support/v4/media/session/b;

    move-result-object v0

    .line 90
    iput-object v0, p0, Lug/x;->v:Landroid/support/v4/media/session/b;

    .line 91
    iget-object p1, p1, Lug/w;->v:Lug/j;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    iget-object v1, p1, Lug/j;->b:Landroid/support/v4/media/session/b;

    invoke-static {v1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    .line 94
    :cond_8
    new-instance v1, Lug/j;

    iget-object p1, p1, Lug/j;->a:Ljava/util/Set;

    invoke-direct {v1, p1, v0}, Lug/j;-><init>(Ljava/util/Set;Landroid/support/v4/media/session/b;)V

    move-object p1, v1

    .line 95
    :goto_1
    iput-object p1, p0, Lug/x;->u:Lug/j;

    goto :goto_3

    :catch_0
    move-exception p1

    .line 96
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No System TLS: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 97
    :cond_9
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Unexpected default trust managers: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 98
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_a
    :goto_2
    iput-object v2, p0, Lug/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 100
    iput-object v2, p0, Lug/x;->v:Landroid/support/v4/media/session/b;

    .line 101
    iput-object v2, p0, Lug/x;->q:Ljavax/net/ssl/X509TrustManager;

    .line 102
    sget-object p1, Lug/j;->c:Lug/j;

    iput-object p1, p0, Lug/x;->u:Lug/j;

    .line 103
    :goto_3
    iget-object p1, p0, Lug/x;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v0, p0, Lug/x;->v:Landroid/support/v4/media/session/b;

    iget-object v1, p0, Lug/x;->p:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v3, p0, Lug/x;->c:Ljava/util/List;

    iget-object v4, p0, Lug/x;->b:Ljava/util/List;

    const-string v5, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {v4, v5}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    .line 104
    invoke-static {v3, v5}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    .line 105
    iget-object v2, p0, Lug/x;->r:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 106
    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_b

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_4

    .line 107
    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lug/n;

    .line 108
    iget-boolean v3, v3, Lug/n;->a:Z

    if-eqz v3, :cond_c

    if-eqz v1, :cond_f

    if-eqz v0, :cond_e

    if-eqz p1, :cond_d

    goto :goto_5

    .line 109
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 110
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 111
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 112
    :cond_10
    :goto_4
    const-string v2, "Check failed."

    if-nez v1, :cond_14

    if-nez v0, :cond_13

    if-nez p1, :cond_12

    .line 113
    iget-object p1, p0, Lug/x;->u:Lug/j;

    sget-object v0, Lug/j;->c:Lug/j;

    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_11

    :goto_5
    return-void

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 114
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 115
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 116
    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 117
    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Null network interceptor: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 118
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_16
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Null interceptor: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 120
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Lb7/b1;)Lzg/n;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lzg/n;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lzg/n;-><init>(Lug/x;Lb7/b1;)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
