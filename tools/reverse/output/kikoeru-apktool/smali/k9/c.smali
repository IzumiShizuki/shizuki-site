.class public final Lk9/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lk9/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk9/c;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 4
    iput-object v0, p0, Lk9/c;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lk9/c;->c:I

    return-void
.end method

.method public constructor <init>(ILkf/a;Llf/f;Lyb/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lk9/c;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p3, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 15
    iput p1, p0, Lk9/c;->c:I

    .line 16
    iput-object p2, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 17
    iput-object p4, p0, Lk9/c;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7/n;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk9/c;->a:I

    .line 6
    iget-object p1, p1, Lb7/n;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 9
    const-string v0, "notification"

    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 11
    invoke-static {p1}, Lp4/c;->j(Ljava/lang/Object;)V

    iput-object p1, p0, Lk9/c;->b:Ljava/lang/Object;

    const p1, 0x7f0500a5

    .line 12
    iput p1, p0, Lk9/c;->c:I

    return-void
.end method

.method public constructor <init>(Lcom/cnl/kikoeru/MainService;Lb7/c3;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lk9/c;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 20
    const-string p2, "notification"

    .line 21
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    .line 22
    invoke-static {p1}, Lp4/c;->j(Ljava/lang/Object;)V

    iput-object p1, p0, Lk9/c;->b:Ljava/lang/Object;

    const p1, 0x7f0500a5

    .line 23
    iput p1, p0, Lk9/c;->c:I

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Looper;
    .locals 5

    .line 1
    iget-object v0, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/os/Looper;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lk9/c;->c:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Landroid/os/HandlerThread;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Landroid/os/HandlerThread;

    .line 28
    .line 29
    const-string v3, "ExoPlayer:Playback"

    .line 30
    .line 31
    const/16 v4, -0x10

    .line 32
    .line 33
    invoke-direct {v1, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/os/HandlerThread;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    iget v1, p0, Lk9/c;->c:I

    .line 55
    .line 56
    add-int/2addr v1, v2

    .line 57
    iput v1, p0, Lk9/c;->c:I

    .line 58
    .line 59
    iget-object v1, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Landroid/os/Looper;

    .line 62
    .line 63
    monitor-exit v0

    .line 64
    return-object v1

    .line 65
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    throw v1
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

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk9/c;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lk9/c;->c:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Lp4/c;->i(Z)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lk9/c;->c:I

    .line 16
    .line 17
    sub-int/2addr v1, v2

    .line 18
    iput v1, p0, Lk9/c;->c:I

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/os/HandlerThread;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, Lk9/c;->e:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v1, p0, Lk9/c;->b:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v1
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
