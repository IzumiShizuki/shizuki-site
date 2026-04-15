.class public final Lcb/e0;
.super Lcb/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# virtual methods
.method public final m(Lcb/y;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcb/p;->a:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lcb/p;->h(Lcb/y;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lcb/p;->f:Landroid/support/v4/media/session/b;

    .line 22
    .line 23
    invoke-virtual {v0, p0, v3, p1}, Landroid/support/v4/media/session/b;->w(Lcb/p;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    invoke-static {p0, v1}, Lcb/p;->e(Lcb/p;Z)V

    .line 30
    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    new-instance v0, Lcb/f;

    .line 34
    .line 35
    invoke-direct {v0, p0, p1}, Lcb/f;-><init>(Lcb/e0;Lcb/y;)V

    .line 36
    .line 37
    .line 38
    sget-object v4, Lcb/p;->f:Landroid/support/v4/media/session/b;

    .line 39
    .line 40
    invoke-virtual {v4, p0, v3, v0}, Landroid/support/v4/media/session/b;->w(Lcb/p;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    :try_start_0
    sget-object v1, Lcb/r;->a:Lcb/r;

    .line 47
    .line 48
    invoke-interface {p1, v0, v1}, Lcb/y;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    :try_start_1
    new-instance v1, Lcb/c;

    .line 54
    .line 55
    invoke-direct {v1, p1}, Lcb/c;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    sget-object v1, Lcb/c;->b:Lcb/c;

    .line 60
    .line 61
    :goto_0
    sget-object p1, Lcb/p;->f:Landroid/support/v4/media/session/b;

    .line 62
    .line 63
    invoke-virtual {p1, p0, v0, v1}, Landroid/support/v4/media/session/b;->w(Lcb/p;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    return v2

    .line 67
    :cond_1
    iget-object v0, p0, Lcb/p;->a:Ljava/lang/Object;

    .line 68
    .line 69
    :cond_2
    instance-of v2, v0, Lcb/a;

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    check-cast v0, Lcb/a;

    .line 74
    .line 75
    iget-boolean v0, v0, Lcb/a;->a:Z

    .line 76
    .line 77
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 78
    .line 79
    .line 80
    :cond_3
    return v1
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
