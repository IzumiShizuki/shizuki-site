.class public final Lcom/cnl/kikoeru/MainService;
.super Landroid/app/Service;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000B\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/cnl/kikoeru/MainService;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic i:I


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/os/Handler;

.field public final c:Lo/e;

.field public d:Lb7/p2;

.field public e:Lb7/p1;

.field public f:Lk9/c;

.field public g:Lb7/m;

.field public h:Lb7/v1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/cnl/kikoeru/MainService;->b:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lo/e;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Lo/u0;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/cnl/kikoeru/MainService;->c:Lo/e;

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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


# virtual methods
.method public final a(Lb7/v1;)V
    .locals 4

    .line 1
    const-string v0, "session must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lb7/v1;->a:Lb7/c2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb7/c2;->h()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    const-string v2, "session is already released"

    .line 15
    .line 16
    invoke-static {v2, v0}, Lp4/c;->b(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v2, p0, Lcom/cnl/kikoeru/MainService;->c:Lo/e;

    .line 23
    .line 24
    iget-object v3, p1, Lb7/v1;->a:Lb7/c2;

    .line 25
    .line 26
    iget-object v3, v3, Lb7/c2;->i:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lb7/v1;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    if-ne v2, p1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x0

    .line 40
    :cond_1
    :goto_0
    const-string v3, "Session ID should be unique"

    .line 41
    .line 42
    invoke-static {v3, v1}, Lp4/c;->b(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->c:Lo/e;

    .line 46
    .line 47
    iget-object v3, p1, Lb7/v1;->a:Lb7/c2;

    .line 48
    .line 49
    iget-object v3, v3, Lb7/c2;->i:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v1, v3, p1}, Lo/u0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->b:Landroid/os/Handler;

    .line 62
    .line 63
    new-instance v2, Lb5/m;

    .line 64
    .line 65
    const/4 v3, 0x4

    .line 66
    invoke-direct {v2, p0, v0, p1, v3}, Lb5/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw p1
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

.method public final b()Lb7/m;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->g:Lb7/m;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lb7/m;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lb7/m;-><init>(Lcom/cnl/kikoeru/MainService;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/cnl/kikoeru/MainService;->g:Lb7/m;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->g:Lb7/m;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c()Lb7/p1;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->e:Lb7/p1;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->f:Lk9/c;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lb7/n;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Lb7/n;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v2, v1, Lb7/n;->b:Z

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    xor-int/2addr v2, v3

    .line 25
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lk9/c;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Lk9/c;-><init>(Lb7/n;)V

    .line 31
    .line 32
    .line 33
    iput-boolean v3, v1, Lb7/n;->b:Z

    .line 34
    .line 35
    iput-object v2, p0, Lcom/cnl/kikoeru/MainService;->f:Lk9/c;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    new-instance v1, Lb7/p1;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/cnl/kikoeru/MainService;->f:Lk9/c;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->b()Lb7/m;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, p0, v2, v3}, Lb7/p1;-><init>(Lcom/cnl/kikoeru/MainService;Lk9/c;Lb7/m;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lcom/cnl/kikoeru/MainService;->e:Lb7/p1;

    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->e:Lb7/p1;

    .line 54
    .line 55
    monitor-exit v0

    .line 56
    return-object v1

    .line 57
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw v1
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

.method public final d()Lb7/p2;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->d:Lb7/p2;

    .line 5
    .line 6
    invoke-static {v1}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw v1
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
.end method

.method public final e(Lb7/v1;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->c:Lo/e;

    .line 5
    .line 6
    iget-object p1, p1, Lb7/v1;->a:Lb7/c2;

    .line 7
    .line 8
    iget-object p1, p1, Lb7/c2;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lo/u0;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    monitor-exit v0

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
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

.method public final f()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    new-instance v1, Lb7/p2;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lb7/p2;-><init>(Lcom/cnl/kikoeru/MainService;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/cnl/kikoeru/MainService;->d:Lb7/p2;

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
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
.end method

.method public final g()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->d:Lb7/p2;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v2, v1, Lb7/p2;->e:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v2, v1, Lb7/p2;->f:Landroid/os/Handler;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Lb7/p2;->h:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lb7/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    :try_start_1
    invoke-interface {v2}, Lb7/r;->a()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    :try_start_2
    iput-object v3, p0, Lcom/cnl/kikoeru/MainService;->d:Lb7/p2;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_1
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    throw v1
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

.method public final h(Lb7/v1;Z)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object v0, v1, Lb7/p1;->a:Lcom/cnl/kikoeru/MainService;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/cnl/kikoeru/MainService;->e(Lb7/v1;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lb7/p1;->a(Lb7/v1;)Lb7/d0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0}, Lb7/d0;->J()Lm4/i1;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Lm4/i1;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0}, Lb7/d0;->i()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_3

    .line 35
    .line 36
    iget v0, v1, Lb7/p1;->h:I

    .line 37
    .line 38
    add-int/2addr v0, v2

    .line 39
    iput v0, v1, Lb7/p1;->h:I

    .line 40
    .line 41
    iget-object v2, v1, Lb7/p1;->g:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcb/y;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    :try_start_0
    invoke-static {v2}, Lg8/a;->B(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lb7/d0;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    :cond_0
    const/4 v2, 0x0

    .line 65
    :goto_0
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, Lb7/d0;->f()V

    .line 68
    .line 69
    .line 70
    iget-object v2, v2, Lb7/d0;->b:Lb7/c0;

    .line 71
    .line 72
    invoke-interface {v2}, Lb7/c0;->T()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    invoke-interface {v2}, Lb7/c0;->P()Lya/i0;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    sget-object v2, Lya/i0;->b:Lya/g0;

    .line 84
    .line 85
    sget-object v2, Lya/a1;->e:Lya/a1;

    .line 86
    .line 87
    :goto_1
    move-object v3, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    sget-object v2, Lya/i0;->b:Lya/g0;

    .line 90
    .line 91
    sget-object v2, Lya/a1;->e:Lya/a1;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :goto_2
    new-instance v4, Lb7/g1;

    .line 95
    .line 96
    invoke-direct {v4, v1, v0, p1}, Lb7/g1;-><init>(Lb7/p1;ILb7/v1;)V

    .line 97
    .line 98
    .line 99
    new-instance v7, Landroid/os/Handler;

    .line 100
    .line 101
    invoke-virtual {p1}, Lb7/v1;->a()Lm4/y0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lv4/v;

    .line 106
    .line 107
    iget-object v0, v0, Lv4/v;->t:Landroid/os/Looper;

    .line 108
    .line 109
    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, Lb7/l1;

    .line 113
    .line 114
    const/4 v6, 0x0

    .line 115
    move-object v2, p1

    .line 116
    move v5, p2

    .line 117
    invoke-direct/range {v0 .. v6}, Lb7/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 118
    .line 119
    .line 120
    invoke-static {v7, v0}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    invoke-virtual {v1, v2}, Lb7/p1;->b(Z)V

    .line 125
    .line 126
    .line 127
    return-void
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final i(Lb7/v1;Z)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lb7/p1;->c(Lb7/v1;Z)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/cnl/kikoeru/MainService;->h(Lb7/v1;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catch_0
    move-exception p1

    .line 15
    sget p2, Lp4/c0;->a:I

    .line 16
    .line 17
    const/16 v0, 0x1f

    .line 18
    .line 19
    if-lt p2, v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Lb5/b0;->D(Ljava/lang/IllegalStateException;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p2, "MSessionService"

    .line 28
    .line 29
    const-string v0, "Failed to start foreground"

    .line 30
    .line 31
    invoke-static {p2, v0, p1}, Lp4/c;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La9/m;

    .line 35
    .line 36
    const/4 p2, 0x7

    .line 37
    invoke-direct {p1, p2, p0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lcom/cnl/kikoeru/MainService;->b:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_0
    throw p1
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
.end method

.method public final j(Lb7/v1;)V
    .locals 4

    .line 1
    const-string v0, "session must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->c:Lo/e;

    .line 10
    .line 11
    iget-object v2, p1, Lb7/v1;->a:Lb7/c2;

    .line 12
    .line 13
    iget-object v2, v2, Lb7/c2;->i:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lo/u0;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const-string v2, "session not found"

    .line 20
    .line 21
    invoke-static {v2, v1}, Lp4/c;->b(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->c:Lo/e;

    .line 25
    .line 26
    iget-object v2, p1, Lb7/v1;->a:Lb7/c2;

    .line 27
    .line 28
    iget-object v2, v2, Lb7/c2;->i:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lo/u0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/cnl/kikoeru/MainService;->b:Landroid/os/Handler;

    .line 39
    .line 40
    new-instance v2, Lb5/h;

    .line 41
    .line 42
    const/16 v3, 0x8

    .line 43
    .line 44
    invoke-direct {v2, v3, v0, p1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p1
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string v0, "androidx.media3.session.MediaSessionService"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_7

    .line 18
    .line 19
    const-string v0, "android.media.browse.MediaBrowserService"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string p1, "android.media.session.MediaController"

    .line 29
    .line 30
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_6

    .line 35
    .line 36
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v1, 0x1c

    .line 39
    .line 40
    if-lt v0, v1, :cond_3

    .line 41
    .line 42
    const/4 v0, -0x1

    .line 43
    invoke-static {v0, v0, p1}, Lb5/z;->n(IILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 47
    .line 48
    iget-object p1, p0, Lcom/cnl/kikoeru/MainService;->h:Lb7/v1;

    .line 49
    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    :goto_0
    const/4 p1, 0x0

    .line 53
    return-object p1

    .line 54
    :cond_4
    invoke-virtual {p0, p1}, Lcom/cnl/kikoeru/MainService;->a(Lb7/v1;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lb7/v1;->a:Lb7/c2;

    .line 58
    .line 59
    iget-object v0, p1, Lb7/c2;->a:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v0

    .line 62
    :try_start_0
    iget-object v1, p1, Lb7/c2;->x:Lb7/q2;

    .line 63
    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    iget-object v1, p1, Lb7/c2;->k:Lb7/v1;

    .line 67
    .line 68
    iget-object v1, v1, Lb7/v1;->a:Lb7/c2;

    .line 69
    .line 70
    iget-object v1, v1, Lb7/c2;->h:Lb7/o2;

    .line 71
    .line 72
    iget-object v1, v1, Lb7/o2;->k:Lc7/e1;

    .line 73
    .line 74
    iget-object v1, v1, Lc7/e1;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Lc7/w0;

    .line 77
    .line 78
    iget-object v1, v1, Lc7/w0;->c:Lc7/d1;

    .line 79
    .line 80
    new-instance v2, Lb7/q2;

    .line 81
    .line 82
    invoke-direct {v2, p1}, Lb7/q2;-><init>(Lb7/c2;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Lb7/q2;->b(Lc7/d1;)V

    .line 86
    .line 87
    .line 88
    iput-object v2, p1, Lb7/c2;->x:Lb7/q2;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    :goto_1
    iget-object p1, p1, Lb7/c2;->x:Lb7/q2;

    .line 94
    .line 95
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    new-instance v0, Landroid/content/Intent;

    .line 97
    .line 98
    const-string v1, "android.media.browse.MediaBrowserService"

    .line 99
    .line 100
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lc7/f0;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw p1

    .line 110
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    const-string v0, "packageName should be nonempty"

    .line 113
    .line 114
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_7
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->d()Lb7/p2;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final onCreate()V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lcom/cnl/kikoeru/MainService;->f()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk9/c;

    .line 7
    .line 8
    new-instance v2, Lb7/c3;

    .line 9
    .line 10
    const/16 v3, 0x15

    .line 11
    .line 12
    invoke-direct {v2, v3}, Lb7/c3;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lk9/c;-><init>(Lcom/cnl/kikoeru/MainService;Lb7/c3;)V

    .line 16
    .line 17
    .line 18
    const-string v2, "notification"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v4, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 25
    .line 26
    invoke-static {v2, v4}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast v2, Landroid/app/NotificationManager;

    .line 30
    .line 31
    sget v4, Lp4/c0;->a:I

    .line 32
    .line 33
    const/16 v5, 0x1a

    .line 34
    .line 35
    if-lt v4, v5, :cond_1

    .line 36
    .line 37
    invoke-static {v2}, Lb7/l;->z(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {}, Lp4/q;->g()V

    .line 45
    .line 46
    .line 47
    const v4, 0x7f0c0033

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4}, Lk1/g;->c(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const v5, 0x7f0c0031

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v4, v5}, Lk1/g;->o(Landroid/app/NotificationChannel;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v4}, Lk1/g;->n(Landroid/app/NotificationChannel;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4}, Lk1/g;->z(Landroid/app/NotificationChannel;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v4}, Lp4/q;->h(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    iget-object v2, v1, Lcom/cnl/kikoeru/MainService;->a:Ljava/lang/Object;

    .line 78
    .line 79
    monitor-enter v2

    .line 80
    :try_start_0
    iput-object v0, v1, Lcom/cnl/kikoeru/MainService;->f:Lk9/c;

    .line 81
    .line 82
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    invoke-static {}, Lh9/d;->c()Landroidx/media3/exoplayer/ExoPlayer;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    new-instance v7, Lpe/d;

    .line 88
    .line 89
    const/16 v0, 0xc

    .line 90
    .line 91
    invoke-direct {v7, v0}, Lpe/d;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v8, Landroid/os/Bundle;

    .line 98
    .line 99
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v9, Landroid/os/Bundle;

    .line 103
    .line 104
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 108
    .line 109
    sget-object v4, Lya/a1;->e:Lya/a1;

    .line 110
    .line 111
    const-string v0, " cannot be found in the navigation graph "

    .line 112
    .line 113
    const-string v5, "Navigation destination "

    .line 114
    .line 115
    sget-object v6, La9/u;->d:Ljava/lang/ref/WeakReference;

    .line 116
    .line 117
    if-eqz v6, :cond_2

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Le7/a0;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    const/4 v6, 0x0

    .line 127
    :goto_1
    sget-object v10, Lh9/d;->a:Lx0/e1;

    .line 128
    .line 129
    invoke-virtual {v10}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    if-eqz v10, :cond_10

    .line 134
    .line 135
    if-eqz v6, :cond_10

    .line 136
    .line 137
    new-instance v10, Lch/l;

    .line 138
    .line 139
    invoke-direct {v10, v6}, Lch/l;-><init>(Le7/a0;)V

    .line 140
    .line 141
    .line 142
    iget-object v6, v10, Lch/l;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v6, Lc4/n;

    .line 145
    .line 146
    iget-object v13, v10, Lch/l;->f:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v13, Ljava/util/ArrayList;

    .line 149
    .line 150
    const-string v14, "PlayingScreen"

    .line 151
    .line 152
    new-instance v15, Le7/s;

    .line 153
    .line 154
    sget v16, Le7/u;->e:I

    .line 155
    .line 156
    const-string v3, "android-app://androidx.navigation/"

    .line 157
    .line 158
    invoke-virtual {v3, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-direct {v15, v3}, Le7/s;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    iget-object v3, v10, Lch/l;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v3, Le7/w;

    .line 175
    .line 176
    if-eqz v3, :cond_4

    .line 177
    .line 178
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-eqz v15, :cond_4

    .line 187
    .line 188
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    check-cast v15, Le7/s;

    .line 193
    .line 194
    iget v15, v15, Le7/s;->a:I

    .line 195
    .line 196
    invoke-virtual {v10, v15}, Lch/l;->r(I)Le7/u;

    .line 197
    .line 198
    .line 199
    move-result-object v17

    .line 200
    if-eqz v17, :cond_3

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    sget v2, Le7/u;->e:I

    .line 204
    .line 205
    invoke-static {v6, v15}, Le7/g;->a(Lc4/n;I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 210
    .line 211
    new-instance v6, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v4

    .line 233
    :cond_4
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    const/4 v14, 0x0

    .line 238
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 239
    .line 240
    .line 241
    move-result v15

    .line 242
    if-eqz v15, :cond_5

    .line 243
    .line 244
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v15

    .line 248
    check-cast v15, Le7/s;

    .line 249
    .line 250
    iget v15, v15, Le7/s;->a:I

    .line 251
    .line 252
    mul-int/lit8 v14, v14, 0x1f

    .line 253
    .line 254
    add-int/2addr v14, v15

    .line 255
    goto :goto_3

    .line 256
    :cond_5
    iget-object v3, v10, Lch/l;->d:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v3, Landroid/content/Intent;

    .line 259
    .line 260
    iget-object v15, v10, Lch/l;->e:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v15, Le7/w;

    .line 263
    .line 264
    if-eqz v15, :cond_f

    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v17

    .line 270
    if-nez v17, :cond_e

    .line 271
    .line 272
    new-instance v12, Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 275
    .line 276
    .line 277
    new-instance v11, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    const/4 v1, 0x0

    .line 287
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v18

    .line 291
    if-eqz v18, :cond_8

    .line 292
    .line 293
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v18

    .line 297
    move-object/from16 v19, v2

    .line 298
    .line 299
    move-object/from16 v2, v18

    .line 300
    .line 301
    check-cast v2, Le7/s;

    .line 302
    .line 303
    iget v2, v2, Le7/s;->a:I

    .line 304
    .line 305
    move-object/from16 v18, v4

    .line 306
    .line 307
    invoke-virtual {v10, v2}, Lch/l;->r(I)Le7/u;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    if-eqz v4, :cond_7

    .line 312
    .line 313
    invoke-virtual {v4, v1}, Le7/u;->i(Le7/u;)[I

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    array-length v2, v1

    .line 318
    move-object/from16 v20, v1

    .line 319
    .line 320
    const/4 v1, 0x0

    .line 321
    :goto_5
    if-ge v1, v2, :cond_6

    .line 322
    .line 323
    aget v21, v20, v1

    .line 324
    .line 325
    move/from16 v22, v1

    .line 326
    .line 327
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    const/4 v1, 0x0

    .line 335
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    add-int/lit8 v1, v22, 0x1

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_6
    move-object v1, v4

    .line 342
    move-object/from16 v4, v18

    .line 343
    .line 344
    move-object/from16 v2, v19

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_7
    sget v1, Le7/u;->e:I

    .line 348
    .line 349
    invoke-static {v6, v2}, Le7/g;->a(Lc4/n;I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 354
    .line 355
    new-instance v3, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v2

    .line 377
    :cond_8
    move-object/from16 v19, v2

    .line 378
    .line 379
    move-object/from16 v18, v4

    .line 380
    .line 381
    invoke-static {v12}, Lvb/m;->F0(Ljava/util/Collection;)[I

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    const-string v1, "android-support-nav:controller:deepLinkIds"

    .line 386
    .line 387
    invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    .line 388
    .line 389
    .line 390
    const-string v0, "android-support-nav:controller:deepLinkArgs"

    .line 391
    .line 392
    invoke-virtual {v3, v0, v11}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 393
    .line 394
    .line 395
    iget-object v0, v10, Lch/l;->b:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Landroid/content/Context;

    .line 398
    .line 399
    new-instance v1, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 402
    .line 403
    .line 404
    new-instance v2, Landroid/content/Intent;

    .line 405
    .line 406
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    if-nez v4, :cond_9

    .line 414
    .line 415
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v2, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    :cond_9
    if-eqz v4, :cond_a

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    :try_start_1
    invoke-static {v0, v4}, Lg8/a;->K(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    :goto_6
    if-eqz v4, :cond_a

    .line 434
    .line 435
    invoke-virtual {v1, v5, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    invoke-static {v0, v4}, Lg8/a;->K(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 443
    .line 444
    .line 445
    move-result-object v4
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 446
    goto :goto_6

    .line 447
    :catch_0
    move-exception v0

    .line 448
    const-string v1, "TaskStackBuilder"

    .line 449
    .line 450
    const-string v2, "Bad ComponentName while traversing activity parent metadata"

    .line 451
    .line 452
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 456
    .line 457
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 458
    .line 459
    .line 460
    throw v1

    .line 461
    :cond_a
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    const/4 v4, 0x0

    .line 469
    :goto_7
    if-ge v4, v2, :cond_c

    .line 470
    .line 471
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    check-cast v5, Landroid/content/Intent;

    .line 476
    .line 477
    if-eqz v5, :cond_b

    .line 478
    .line 479
    const-string v6, "android-support-nav:controller:deepLinkIntent"

    .line 480
    .line 481
    invoke-virtual {v5, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 482
    .line 483
    .line 484
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 485
    .line 486
    goto :goto_7

    .line 487
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    if-nez v2, :cond_d

    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    new-array v3, v2, [Landroid/content/Intent;

    .line 495
    .line 496
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    check-cast v1, [Landroid/content/Intent;

    .line 501
    .line 502
    new-instance v3, Landroid/content/Intent;

    .line 503
    .line 504
    aget-object v4, v1, v2

    .line 505
    .line 506
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 507
    .line 508
    .line 509
    const v4, 0x1000c000

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    aput-object v3, v1, v2

    .line 517
    .line 518
    const/high16 v2, 0xc000000

    .line 519
    .line 520
    const/4 v11, 0x0

    .line 521
    invoke-static {v0, v14, v1, v2, v11}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    :goto_8
    move-object v3, v0

    .line 529
    goto :goto_a

    .line 530
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 531
    .line 532
    const-string v1, "No intents added to TaskStackBuilder; cannot getPendingIntent"

    .line 533
    .line 534
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw v0

    .line 538
    :cond_e
    const-string v0, "You must call setDestination() or addDestination() before constructing the deep link"

    .line 539
    .line 540
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 541
    .line 542
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    throw v1

    .line 546
    :cond_f
    const-string v0, "You must call setGraph() before constructing the deep link"

    .line 547
    .line 548
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 549
    .line 550
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    throw v1

    .line 554
    :cond_10
    move-object/from16 v19, v2

    .line 555
    .line 556
    move-object/from16 v18, v4

    .line 557
    .line 558
    const/4 v11, 0x0

    .line 559
    new-instance v0, Landroid/content/Intent;

    .line 560
    .line 561
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    const-class v2, Lcom/cnl/kikoeru/MainActivity;

    .line 566
    .line 567
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 568
    .line 569
    .line 570
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 571
    .line 572
    const/16 v2, 0x17

    .line 573
    .line 574
    if-lt v1, v2, :cond_11

    .line 575
    .line 576
    const/high16 v1, 0x4000000

    .line 577
    .line 578
    goto :goto_9

    .line 579
    :cond_11
    const/4 v1, 0x0

    .line 580
    :goto_9
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    const/4 v3, 0x0

    .line 585
    invoke-static {v2, v3, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    const-string v1, "getActivity(...)"

    .line 590
    .line 591
    invoke-static {v0, v1}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    goto :goto_8

    .line 595
    :goto_a
    sget v0, Lp4/c0;->a:I

    .line 596
    .line 597
    const/16 v1, 0x1f

    .line 598
    .line 599
    if-lt v0, v1, :cond_12

    .line 600
    .line 601
    invoke-static {v3}, Lb5/b0;->B(Landroid/app/PendingIntent;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    invoke-static {v0}, Lp4/c;->c(Z)V

    .line 606
    .line 607
    .line 608
    :cond_12
    new-instance v10, Lc7/e1;

    .line 609
    .line 610
    const/16 v0, 0x15

    .line 611
    .line 612
    invoke-direct {v10, v0}, Lc7/e1;-><init>(I)V

    .line 613
    .line 614
    .line 615
    new-instance v0, Lb7/v1;

    .line 616
    .line 617
    move-object/from16 v5, v18

    .line 618
    .line 619
    move-object/from16 v6, v18

    .line 620
    .line 621
    move-object/from16 v1, p0

    .line 622
    .line 623
    move-object/from16 v4, v18

    .line 624
    .line 625
    move-object/from16 v2, v19

    .line 626
    .line 627
    invoke-direct/range {v0 .. v10}, Lb7/v1;-><init>(Lcom/cnl/kikoeru/MainService;Landroidx/media3/exoplayer/ExoPlayer;Landroid/app/PendingIntent;Lya/i0;Lya/i0;Lya/i0;Lpe/d;Landroid/os/Bundle;Landroid/os/Bundle;Lc7/e1;)V

    .line 628
    .line 629
    .line 630
    iput-object v0, v1, Lcom/cnl/kikoeru/MainService;->h:Lb7/v1;

    .line 631
    .line 632
    new-instance v2, Lb7/k4;

    .line 633
    .line 634
    new-instance v0, Landroid/content/ComponentName;

    .line 635
    .line 636
    const-class v3, Lcom/cnl/kikoeru/MainService;

    .line 637
    .line 638
    invoke-direct {v0, v1, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 639
    .line 640
    .line 641
    invoke-direct {v2, v1, v0}, Lb7/k4;-><init>(Lcom/cnl/kikoeru/MainService;Landroid/content/ComponentName;)V

    .line 642
    .line 643
    .line 644
    sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 645
    .line 646
    new-instance v4, Lb7/a0;

    .line 647
    .line 648
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 649
    .line 650
    .line 651
    invoke-static {}, Lp4/c0;->v()Landroid/os/Looper;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    new-instance v6, Lb7/f0;

    .line 656
    .line 657
    invoke-direct {v6, v5}, Lb7/f0;-><init>(Landroid/os/Looper;)V

    .line 658
    .line 659
    .line 660
    iget-object v0, v2, Lb7/k4;->a:Lb7/j4;

    .line 661
    .line 662
    invoke-interface {v0}, Lb7/j4;->i()Z

    .line 663
    .line 664
    .line 665
    move-result v0

    .line 666
    if-eqz v0, :cond_13

    .line 667
    .line 668
    new-instance v11, Landroidx/media3/exoplayer/offline/u;

    .line 669
    .line 670
    new-instance v0, Ls4/i;

    .line 671
    .line 672
    invoke-direct {v0, v1}, Ls4/i;-><init>(Landroid/content/Context;)V

    .line 673
    .line 674
    .line 675
    invoke-direct {v11, v0}, Landroidx/media3/exoplayer/offline/u;-><init>(Ls4/i;)V

    .line 676
    .line 677
    .line 678
    :cond_13
    move-object v7, v11

    .line 679
    new-instance v0, Lb7/d0;

    .line 680
    .line 681
    invoke-direct/range {v0 .. v7}, Lb7/d0;-><init>(Landroid/content/Context;Lb7/k4;Landroid/os/Bundle;Lb7/b0;Landroid/os/Looper;Lb7/f0;Landroidx/media3/exoplayer/offline/u;)V

    .line 682
    .line 683
    .line 684
    new-instance v1, Landroid/os/Handler;

    .line 685
    .line 686
    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 687
    .line 688
    .line 689
    new-instance v2, Lb7/z;

    .line 690
    .line 691
    const/4 v3, 0x0

    .line 692
    invoke-direct {v2, v6, v0, v3}, Lb7/z;-><init>(Lb7/f0;Lb7/d0;I)V

    .line 693
    .line 694
    .line 695
    invoke-static {v1, v2}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 696
    .line 697
    .line 698
    new-instance v0, La9/m;

    .line 699
    .line 700
    invoke-direct {v0, v3, v6}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    sget-object v1, Lcb/r;->a:Lcb/r;

    .line 704
    .line 705
    invoke-virtual {v6, v0, v1}, Lcb/p;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :catchall_0
    move-exception v0

    .line 710
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 711
    throw v0
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final onDestroy()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/cnl/kikoeru/MainService;->h:Lb7/v1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lb7/v1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    :try_start_1
    sget-object v2, Lb7/v1;->c:Ljava/util/HashMap;

    .line 9
    .line 10
    iget-object v3, v0, Lb7/v1;->a:Lb7/c2;

    .line 11
    .line 12
    iget-object v3, v3, Lb7/c2;->i:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    :try_start_2
    iget-object v0, v0, Lb7/v1;->a:Lb7/c2;

    .line 19
    .line 20
    invoke-virtual {v0}, Lb7/c2;->q()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 26
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 27
    :catch_0
    :goto_0
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/cnl/kikoeru/MainService;->h:Lb7/v1;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->g()V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
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

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 9

    .line 1
    const/4 p2, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_8

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->b()Lb7/m;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    sget-object v2, Lb7/v1;->b:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    sget-object v3, Lb7/v1;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lb7/v1;

    .line 41
    .line 42
    iget-object v5, v4, Lb7/v1;->a:Lb7/c2;

    .line 43
    .line 44
    iget-object v5, v5, Lb7/c2;->b:Landroid/net/Uri;

    .line 45
    .line 46
    sget v6, Lp4/c0;->a:I

    .line 47
    .line 48
    invoke-static {v5, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    monitor-exit v2

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    monitor-exit v2

    .line 60
    move-object v4, v1

    .line 61
    :goto_0
    move-object v5, v4

    .line 62
    goto :goto_2

    .line 63
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    throw p1

    .line 65
    :cond_3
    move-object v5, v1

    .line 66
    :goto_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const-string p3, "android.intent.action.MEDIA_BUTTON"

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-eqz p3, :cond_8

    .line 80
    .line 81
    if-nez v5, :cond_7

    .line 82
    .line 83
    const-string p3, "android.media.session.MediaController"

    .line 84
    .line 85
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_6

    .line 90
    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 v1, 0x1c

    .line 94
    .line 95
    if-lt v0, v1, :cond_4

    .line 96
    .line 97
    const/4 v0, -0x1

    .line 98
    invoke-static {v0, v0, p3}, Lb5/z;->n(IILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    sget-object p3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 102
    .line 103
    iget-object v5, p0, Lcom/cnl/kikoeru/MainService;->h:Lb7/v1;

    .line 104
    .line 105
    if-nez v5, :cond_5

    .line 106
    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_5
    invoke-virtual {p0, v5}, Lcom/cnl/kikoeru/MainService;->a(Lb7/v1;)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    const-string p2, "packageName should be nonempty"

    .line 116
    .line 117
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_7
    :goto_3
    iget-object p3, v5, Lb7/v1;->a:Lb7/c2;

    .line 122
    .line 123
    iget-object v0, p3, Lb7/c2;->l:Landroid/os/Handler;

    .line 124
    .line 125
    new-instance v1, Lb5/h;

    .line 126
    .line 127
    const/4 v2, 0x7

    .line 128
    invoke-direct {v1, v2, p3, p1}, Lb5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 132
    .line 133
    .line 134
    return p2

    .line 135
    :cond_8
    if-eqz v5, :cond_f

    .line 136
    .line 137
    const-string p3, "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION"

    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p3

    .line 147
    if-eqz p3, :cond_f

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    if-eqz p3, :cond_9

    .line 154
    .line 155
    const-string v0, "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION"

    .line 156
    .line 157
    invoke-virtual {p3, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    goto :goto_4

    .line 162
    :cond_9
    move-object p3, v1

    .line 163
    :goto_4
    instance-of v0, p3, Ljava/lang/String;

    .line 164
    .line 165
    if-eqz v0, :cond_a

    .line 166
    .line 167
    check-cast p3, Ljava/lang/String;

    .line 168
    .line 169
    move-object v6, p3

    .line 170
    goto :goto_5

    .line 171
    :cond_a
    move-object v6, v1

    .line 172
    :goto_5
    if-nez v6, :cond_b

    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_b
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    if-eqz p1, :cond_c

    .line 180
    .line 181
    const-string p3, "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS"

    .line 182
    .line 183
    invoke-virtual {p1, p3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :cond_c
    instance-of p1, v1, Landroid/os/Bundle;

    .line 188
    .line 189
    if-eqz p1, :cond_d

    .line 190
    .line 191
    check-cast v1, Landroid/os/Bundle;

    .line 192
    .line 193
    :goto_6
    move-object v7, v1

    .line 194
    goto :goto_7

    .line 195
    :cond_d
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :goto_7
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4, v5}, Lb7/p1;->a(Lb7/v1;)Lb7/d0;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    if-nez v8, :cond_e

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_e
    new-instance p1, Landroid/os/Handler;

    .line 210
    .line 211
    invoke-virtual {v5}, Lb7/v1;->a()Lm4/y0;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    check-cast p3, Lv4/v;

    .line 216
    .line 217
    iget-object p3, p3, Lv4/v;->t:Landroid/os/Looper;

    .line 218
    .line 219
    invoke-direct {p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 220
    .line 221
    .line 222
    new-instance v3, Lb7/e;

    .line 223
    .line 224
    invoke-direct/range {v3 .. v8}, Lb7/e;-><init>(Lb7/p1;Lb7/v1;Ljava/lang/String;Landroid/os/Bundle;Lb7/d0;)V

    .line 225
    .line 226
    .line 227
    invoke-static {p1, v3}, Lp4/c0;->R(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 228
    .line 229
    .line 230
    :cond_f
    :goto_8
    return p2
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/cnl/kikoeru/MainService;->c()Lb7/p1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-boolean p1, p1, Lb7/p1;->j:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
