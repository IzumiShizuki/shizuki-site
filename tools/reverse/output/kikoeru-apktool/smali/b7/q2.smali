.class public final Lb7/q2;
.super Lc7/f0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final j:Lc7/l1;

.field public final k:Lb7/c2;

.field public final l:Lb0/w1;


# direct methods
.method public constructor <init>(Lb7/c2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc7/f0;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 5
    .line 6
    invoke-static {v0}, Lc7/l1;->a(Landroid/content/Context;)Lc7/l1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lb7/q2;->j:Lc7/l1;

    .line 11
    .line 12
    iput-object p1, p0, Lb7/q2;->k:Lb7/c2;

    .line 13
    .line 14
    new-instance v0, Lb0/w1;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lb0/w1;-><init>(Lb7/c2;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lb7/q2;->l:Lb0/w1;

    .line 20
    .line 21
    return-void
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


# virtual methods
.method public final a(Landroid/os/Bundle;)Lc7/q;
    .locals 14

    .line 1
    iget-object v0, p0, Lc7/f0;->a:Lb0/w1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lb0/w1;->N()Lc7/k1;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    :goto_0
    move-object v7, p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    new-instance v1, Lb7/t1;

    .line 18
    .line 19
    iget-object p1, p0, Lb7/q2;->j:Lc7/l1;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lc7/l1;->b(Lc7/k1;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    sget-object p1, Lb7/x;->a:Lya/m0;

    .line 26
    .line 27
    const-string p1, "androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT"

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {v7, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct/range {v1 .. v7}, Lb7/t1;-><init>(Lc7/k1;IIZLb7/s1;Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    new-instance v10, Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    invoke-direct {v10}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v12, Lp4/f;

    .line 49
    .line 50
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lb7/q2;->k:Lb7/c2;

    .line 54
    .line 55
    iget-object p1, p1, Lb7/c2;->l:Landroid/os/Handler;

    .line 56
    .line 57
    new-instance v8, Lb7/f;

    .line 58
    .line 59
    const/4 v13, 0x3

    .line 60
    move-object v9, p0

    .line 61
    move-object v11, v1

    .line 62
    invoke-direct/range {v8 .. v13}, Lb7/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v8}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v12}, Lp4/f;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lb7/r1;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, p1, Lb7/r1;->a:Lb7/f4;

    .line 81
    .line 82
    iget-object p1, p1, Lb7/r1;->b:Lm4/u0;

    .line 83
    .line 84
    iget-object v3, v9, Lb7/q2;->l:Lb0/w1;

    .line 85
    .line 86
    invoke-virtual {v3, v2, v1, v0, p1}, Lb0/w1;->x(Ljava/lang/Object;Lb7/t1;Lb7/f4;Lm4/u0;)V

    .line 87
    .line 88
    .line 89
    sget-object p1, Lb7/s3;->a:Lc7/q;

    .line 90
    .line 91
    return-object p1

    .line 92
    :catch_0
    move-exception v0

    .line 93
    move-object p1, v0

    .line 94
    const-string v0, "MSSLegacyStub"

    .line 95
    .line 96
    const-string v1, "Couldn\'t get a result from onConnect"

    .line 97
    .line 98
    invoke-static {v0, v1, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    return-object p1
    .line 103
    .line 104
    .line 105
.end method

.method public final b(Lc7/d1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lb7/q2;->k:Lb7/c2;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/c2;->f:Lcom/cnl/kikoeru/MainService;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lc7/f0;->onCreate()V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lc7/f0;->h:Lc7/d1;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, Lc7/f0;->h:Lc7/d1;

    .line 18
    .line 19
    iget-object v0, p0, Lc7/f0;->a:Lb0/w1;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lb0/w1;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lc7/f0;

    .line 27
    .line 28
    iget-object v1, v1, Lc7/f0;->g:Lb5/d;

    .line 29
    .line 30
    new-instance v2, Lcb/t;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v2, v3, v0, p1, v4}, Lcb/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lb5/d;->b(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "The session token has already been set"

    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    const-string v0, "Session token may not be null"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
