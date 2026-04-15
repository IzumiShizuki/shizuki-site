.class public final Landroidx/media3/exoplayer/offline/w;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Landroidx/media3/exoplayer/offline/s;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ls4/m;

.field public final c:Lt4/f;

.field public final d:Lt4/m;

.field public e:Landroidx/media3/exoplayer/offline/l;

.field public volatile f:Landroidx/media3/exoplayer/offline/v;

.field public volatile g:Z


# direct methods
.method public constructor <init>(Lm4/i0;Lt4/e;Ljava/util/concurrent/Executor;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/w;->a:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    iget-object p1, p1, Lm4/i0;->b:Lm4/d0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 17
    .line 18
    iget-object v1, p1, Lm4/d0;->a:Landroid/net/Uri;

    .line 19
    .line 20
    iget-object v11, p1, Lm4/d0;->f:Ljava/lang/String;

    .line 21
    .line 22
    const-string p1, "The uri must be set."

    .line 23
    .line 24
    invoke-static {v1, p1}, Lp4/c;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ls4/m;

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    const-wide/16 v7, 0x0

    .line 34
    .line 35
    const-wide/16 v9, -0x1

    .line 36
    .line 37
    const/4 v12, 0x4

    .line 38
    invoke-direct/range {v0 .. v12}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Landroidx/media3/exoplayer/offline/w;->b:Ls4/m;

    .line 42
    .line 43
    invoke-virtual {p2}, Lt4/e;->a()Lt4/f;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/w;->c:Lt4/f;

    .line 48
    .line 49
    new-instance v1, Landroidx/media3/exoplayer/offline/g;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-direct {v1, v2, p0}, Landroidx/media3/exoplayer/offline/g;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lt4/m;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-direct {v2, p1, v0, v3, v1}, Lt4/m;-><init>(Lt4/f;Ls4/m;[BLt4/l;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Landroidx/media3/exoplayer/offline/w;->d:Lt4/m;

    .line 62
    .line 63
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Landroidx/media3/exoplayer/offline/l;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/w;->e:Landroidx/media3/exoplayer/offline/l;

    .line 2
    .line 3
    :try_start_0
    iget-boolean p1, p0, Landroidx/media3/exoplayer/offline/w;->g:Z

    .line 4
    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    new-instance p1, Landroidx/media3/exoplayer/offline/v;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/offline/v;-><init>(Landroidx/media3/exoplayer/offline/w;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/w;->f:Landroidx/media3/exoplayer/offline/v;

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/w;->a:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/w;->f:Landroidx/media3/exoplayer/offline/v;

    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :try_start_1
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/w;->f:Landroidx/media3/exoplayer/offline/v;

    .line 22
    .line 23
    invoke-virtual {p1}, Lp4/t;->get()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    instance-of v0, p1, Ljava/io/IOException;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    check-cast p1, Ljava/io/IOException;

    .line 42
    .line 43
    throw p1

    .line 44
    :cond_0
    sget v0, Lp4/c0;->a:I

    .line 45
    .line 46
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/media3/exoplayer/offline/w;->f:Landroidx/media3/exoplayer/offline/v;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lp4/t;->b()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :goto_1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/w;->f:Landroidx/media3/exoplayer/offline/v;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lp4/t;->b()V

    .line 62
    .line 63
    .line 64
    throw p1
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

.method public final cancel()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/media3/exoplayer/offline/w;->g:Z

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/offline/w;->f:Landroidx/media3/exoplayer/offline/v;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lp4/t;->cancel(Z)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/w;->c:Lt4/f;

    .line 2
    .line 3
    iget-object v1, v0, Lt4/f;->a:Lt4/b;

    .line 4
    .line 5
    iget-object v0, v0, Lt4/f;->e:Lt4/j;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/offline/w;->b:Ls4/m;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lt4/j;->a(Ls4/m;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v1, Lt4/y;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lt4/y;->m(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
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
