.class public final Landroidx/media3/exoplayer/offline/x;
.super Lp4/t;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic h:Lt4/f;

.field public final synthetic i:Ls4/m;

.field public final synthetic j:Landroidx/media3/exoplayer/offline/b0;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/offline/b0;Lt4/f;Ls4/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/offline/x;->j:Landroidx/media3/exoplayer/offline/b0;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/media3/exoplayer/offline/x;->h:Lt4/f;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/media3/exoplayer/offline/x;->i:Ls4/m;

    .line 6
    .line 7
    invoke-direct {p0}, Lp4/t;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
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
.method public final d()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/offline/x;->j:Landroidx/media3/exoplayer/offline/b0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/b0;->b:Ln5/q;

    .line 4
    .line 5
    new-instance v1, Ls4/d0;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/exoplayer/offline/x;->h:Lt4/f;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ls4/d0;-><init>(Ls4/h;)V

    .line 10
    .line 11
    .line 12
    sget-object v3, Lj5/u;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    iput-wide v3, v1, Ls4/d0;->b:J

    .line 20
    .line 21
    new-instance v3, Ls4/k;

    .line 22
    .line 23
    iget-object v4, p0, Landroidx/media3/exoplayer/offline/x;->i:Ls4/m;

    .line 24
    .line 25
    invoke-direct {v3, v1, v4}, Ls4/k;-><init>(Ls4/h;Ls4/m;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v3}, Ls4/k;->b()V

    .line 29
    .line 30
    .line 31
    iget-object v1, v2, Lt4/f;->i:Landroid/net/Uri;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1, v3}, Ln5/q;->F0(Landroid/net/Uri;Ls4/k;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-static {v3}, Lp4/c0;->g(Ljava/io/Closeable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v0, Landroidx/media3/exoplayer/offline/t;

    .line 47
    .line 48
    return-object v0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    invoke-static {v3}, Lp4/c0;->g(Ljava/io/Closeable;)V

    .line 51
    .line 52
    .line 53
    throw v0
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
