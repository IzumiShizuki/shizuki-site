.class public Lcom/tencent/bugly/proguard/T;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field private static a:Lcom/tencent/bugly/proguard/T;


# instance fields
.field private final b:Lcom/tencent/bugly/proguard/J;

.field private final c:Landroid/content/Context;

.field public d:Lcom/tencent/bugly/proguard/P;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private f:J

.field private g:J

.field private h:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/lang/Object;

.field private k:J

.field private l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/T;->e:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/T;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/bugly/proguard/T;->i:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/Object;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/bugly/proguard/T;->j:Ljava/lang/Object;

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/T;->k:J

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lcom/tencent/bugly/proguard/T;->l:I

    .line 38
    .line 39
    iput-object p1, p0, Lcom/tencent/bugly/proguard/T;->c:Landroid/content/Context;

    .line 40
    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/J;->a()Lcom/tencent/bugly/proguard/J;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    .line 46
    .line 47
    return-void
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
.end method

.method public static declared-synchronized a()Lcom/tencent/bugly/proguard/T;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/T;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/T;->a:Lcom/tencent/bugly/proguard/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/T;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/T;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/T;->a:Lcom/tencent/bugly/proguard/T;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/T;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/T;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/tencent/bugly/proguard/T;->a:Lcom/tencent/bugly/proguard/T;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/T;->a:Lcom/tencent/bugly/proguard/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/T;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/T;->j:Ljava/lang/Object;

    return-object p0
.end method

.method private a(Ljava/lang/Runnable;J)V
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 71
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "[UploadManager] Upload task should not be null"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 72
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v0

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const-string v2, "[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)"

    .line 73
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-string v2, "BUGLY_SYNC_UPLOAD"

    .line 74
    invoke-static {p1, v2}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;

    move-result-object v2

    if-nez v2, :cond_1

    .line 75
    new-array p2, v0, [Ljava/lang/Object;

    const-string p3, "[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue."

    invoke-static {p3, p2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 76
    invoke-direct {p0, p1, v1}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;Z)Z

    return-void

    .line 77
    :cond_1
    :try_start_0
    invoke-virtual {v2, p2, p3}, Ljava/lang/Thread;->join(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    .line 78
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-array p3, v1, [Ljava/lang/Object;

    aput-object p2, p3, v0

    const-string p2, "[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue."

    .line 79
    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 80
    invoke-direct {p0, p1, v1}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;Z)Z

    .line 81
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/T;->c(I)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;ZZJ)V
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 82
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "[UploadManager] Upload task should not be null"

    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 83
    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 84
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v0

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const-string v1, "[UploadManager] Add upload task (pid=%d | tid=%d)"

    .line 85
    invoke-static {v1, v3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    .line 86
    invoke-direct {p0, p1, p4, p5}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;J)V

    return-void

    .line 87
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;Z)Z

    .line 88
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/T;->c(I)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;Z)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 63
    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "[UploadManager] Upload task should not be null"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    :cond_0
    const-string v1, "[UploadManager] Add upload task to queue (pid=%d | tid=%d)"

    const/4 v2, 0x1

    .line 64
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v3, v5, v0

    aput-object v4, v5, v2

    .line 65
    invoke-static {v1, v5}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 66
    iget-object v1, p0, Lcom/tencent/bugly/proguard/T;->j:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p2, :cond_1

    .line 67
    :try_start_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/T;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 68
    :cond_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/T;->i:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 69
    :goto_0
    monitor-exit v1

    return v2

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v0

    const-string p1, "[UploadManager] Failed to add upload task to queue: %s"

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/T;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/T;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/T;->l:I

    return v0
.end method

.method private c(I)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    new-array p1, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v0, "[UploadManager] Number of task to execute should >= 0"

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/W;->c()Lcom/tencent/bugly/proguard/W;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, Lcom/tencent/bugly/proguard/T;->j:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v4

    .line 29
    const-string v5, "[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)"

    .line 30
    .line 31
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const/4 v8, 0x2

    .line 48
    new-array v9, v8, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object v6, v9, v0

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    aput-object v7, v9, v6

    .line 54
    .line 55
    invoke-static {v5, v9}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    iget-object v5, p0, Lcom/tencent/bugly/proguard/T;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    iget-object v7, p0, Lcom/tencent/bugly/proguard/T;->i:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 67
    .line 68
    .line 69
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    if-nez v5, :cond_1

    .line 71
    .line 72
    if-nez v7, :cond_1

    .line 73
    .line 74
    const-string p1, "[UploadManager] There is no upload task in queue."

    .line 75
    .line 76
    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    monitor-exit v4

    .line 82
    return-void

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto/16 :goto_c

    .line 85
    .line 86
    :cond_1
    if-nez p1, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    if-ge p1, v5, :cond_3

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    add-int v9, v5, v7

    .line 94
    .line 95
    if-ge p1, v9, :cond_4

    .line 96
    .line 97
    sub-int v7, p1, v5

    .line 98
    .line 99
    :cond_4
    :goto_0
    move p1, v5

    .line 100
    :goto_1
    if-eqz v1, :cond_5

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/W;->d()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_6

    .line 107
    .line 108
    :cond_5
    const/4 v7, 0x0

    .line 109
    :cond_6
    const/4 v5, 0x0

    .line 110
    :goto_2
    if-ge v5, p1, :cond_8

    .line 111
    .line 112
    iget-object v9, p0, Lcom/tencent/bugly/proguard/T;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/util/concurrent/LinkedBlockingQueue;->peek()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    check-cast v9, Ljava/lang/Runnable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    .line 120
    if-nez v9, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    :try_start_2
    invoke-virtual {v2, v9}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v9, p0, Lcom/tencent/bugly/proguard/T;->h:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 127
    .line 128
    invoke-virtual {v9}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :catchall_1
    move-exception v9

    .line 133
    const-string v10, "[UploadManager] Failed to add upload task to temp urgent queue: %s"

    .line 134
    .line 135
    :try_start_3
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    new-array v11, v6, [Ljava/lang/Object;

    .line 140
    .line 141
    aput-object v9, v11, v0

    .line 142
    .line 143
    invoke-static {v10, v11}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    :goto_4
    const/4 v5, 0x0

    .line 150
    :goto_5
    if-ge v5, v7, :cond_a

    .line 151
    .line 152
    iget-object v9, p0, Lcom/tencent/bugly/proguard/T;->i:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/util/concurrent/LinkedBlockingQueue;->peek()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    check-cast v9, Ljava/lang/Runnable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 159
    .line 160
    if-nez v9, :cond_9

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_9
    :try_start_4
    invoke-virtual {v3, v9}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iget-object v9, p0, Lcom/tencent/bugly/proguard/T;->i:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 167
    .line 168
    invoke-virtual {v9}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :catchall_2
    move-exception v9

    .line 173
    const-string v10, "[UploadManager] Failed to add upload task to temp urgent queue: %s"

    .line 174
    .line 175
    :try_start_5
    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    new-array v11, v6, [Ljava/lang/Object;

    .line 180
    .line 181
    aput-object v9, v11, v0

    .line 182
    .line 183
    invoke-static {v10, v11}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_a
    :goto_7
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 190
    const/4 v4, 0x3

    .line 191
    if-lez p1, :cond_b

    .line 192
    .line 193
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    new-array v11, v4, [Ljava/lang/Object;

    .line 214
    .line 215
    aput-object v5, v11, v0

    .line 216
    .line 217
    aput-object v9, v11, v6

    .line 218
    .line 219
    aput-object v10, v11, v8

    .line 220
    .line 221
    const-string v5, "[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)"

    .line 222
    .line 223
    invoke-static {v5, v11}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    :cond_b
    const/4 v5, 0x0

    .line 227
    :goto_8
    if-ge v5, p1, :cond_f

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    check-cast v9, Ljava/lang/Runnable;

    .line 234
    .line 235
    if-nez v9, :cond_c

    .line 236
    .line 237
    goto :goto_b

    .line 238
    :cond_c
    iget-object v10, p0, Lcom/tencent/bugly/proguard/T;->j:Ljava/lang/Object;

    .line 239
    .line 240
    monitor-enter v10

    .line 241
    :try_start_6
    iget v11, p0, Lcom/tencent/bugly/proguard/T;->l:I

    .line 242
    .line 243
    if-lt v11, v8, :cond_d

    .line 244
    .line 245
    if-eqz v1, :cond_d

    .line 246
    .line 247
    invoke-virtual {v1, v9}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    .line 248
    .line 249
    .line 250
    monitor-exit v10

    .line 251
    goto :goto_9

    .line 252
    :catchall_3
    move-exception p1

    .line 253
    goto :goto_a

    .line 254
    :cond_d
    monitor-exit v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 255
    new-array v10, v6, [Ljava/lang/Object;

    .line 256
    .line 257
    const-string v11, "BUGLY_ASYNC_UPLOAD"

    .line 258
    .line 259
    aput-object v11, v10, v0

    .line 260
    .line 261
    const-string v11, "[UploadManager] Create and start a new thread to execute a upload task: %s"

    .line 262
    .line 263
    invoke-static {v11, v10}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    new-instance v10, Lcb/t;

    .line 267
    .line 268
    const/4 v11, 0x4

    .line 269
    invoke-direct {v10, v11, p0, v9, v0}, Lcb/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 270
    .line 271
    .line 272
    const-string v11, "BUGLY_ASYNC_UPLOAD"

    .line 273
    .line 274
    invoke-static {v10, v11}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    if-eqz v10, :cond_e

    .line 279
    .line 280
    iget-object v10, p0, Lcom/tencent/bugly/proguard/T;->j:Ljava/lang/Object;

    .line 281
    .line 282
    monitor-enter v10

    .line 283
    :try_start_7
    iget v9, p0, Lcom/tencent/bugly/proguard/T;->l:I

    .line 284
    .line 285
    add-int/2addr v9, v6

    .line 286
    iput v9, p0, Lcom/tencent/bugly/proguard/T;->l:I

    .line 287
    .line 288
    monitor-exit v10

    .line 289
    goto :goto_9

    .line 290
    :catchall_4
    move-exception p1

    .line 291
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 292
    throw p1

    .line 293
    :cond_e
    new-array v10, v0, [Ljava/lang/Object;

    .line 294
    .line 295
    const-string v11, "[UploadManager] Failed to start a thread to execute asynchronous upload task, will try again next time."

    .line 296
    .line 297
    invoke-static {v11, v10}, Lcom/tencent/bugly/proguard/X;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    invoke-direct {p0, v9, v6}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;Z)Z

    .line 301
    .line 302
    .line 303
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :goto_a
    :try_start_8
    monitor-exit v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 307
    throw p1

    .line 308
    :cond_f
    :goto_b
    if-lez v7, :cond_10

    .line 309
    .line 310
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    new-array v4, v4, [Ljava/lang/Object;

    .line 331
    .line 332
    aput-object p1, v4, v0

    .line 333
    .line 334
    aput-object v2, v4, v6

    .line 335
    .line 336
    aput-object v5, v4, v8

    .line 337
    .line 338
    const-string p1, "[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)"

    .line 339
    .line 340
    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :cond_10
    if-eqz v1, :cond_11

    .line 344
    .line 345
    new-instance p1, Lc4/i;

    .line 346
    .line 347
    invoke-direct {p1, v7, v3}, Lc4/i;-><init>(ILjava/util/concurrent/LinkedBlockingQueue;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, p1}, Lcom/tencent/bugly/proguard/W;->a(Ljava/lang/Runnable;)Z

    .line 351
    .line 352
    .line 353
    :cond_11
    return-void

    .line 354
    :goto_c
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 355
    throw p1
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
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
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
.end method


# virtual methods
.method public a(Z)J
    .locals 11

    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/ca;->b()J

    move-result-wide v0

    const/4 v2, 0x3

    if-eqz p1, :cond_0

    const/4 v3, 0x5

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    .line 18
    :goto_0
    iget-object v4, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    invoke-virtual {v4, v3}, Lcom/tencent/bugly/proguard/J;->a(I)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 19
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_3

    const-wide/16 v6, 0x0

    .line 20
    :try_start_0
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/L;

    .line 21
    iget-wide v8, p1, Lcom/tencent/bugly/proguard/L;->e:J

    cmp-long v10, v8, v0

    if-ltz v10, :cond_2

    .line 22
    iget-object v0, p1, Lcom/tencent/bugly/proguard/L;->g:[B

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ca;->b([B)J

    move-result-wide v6

    if-ne v3, v2, :cond_1

    .line 23
    iput-wide v6, p0, Lcom/tencent/bugly/proguard/T;->f:J

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 24
    :cond_1
    iput-wide v6, p0, Lcom/tencent/bugly/proguard/T;->g:J

    .line 25
    :goto_1
    invoke-interface {v4, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 26
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    .line 27
    :cond_2
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_5

    .line 28
    iget-object p1, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    invoke-virtual {p1, v4}, Lcom/tencent/bugly/proguard/J;->a(Ljava/util/List;)V

    goto :goto_4

    :cond_3
    if-eqz p1, :cond_4

    .line 29
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/T;->g:J

    goto :goto_4

    :cond_4
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/T;->f:J

    :cond_5
    :goto_4
    const-wide/16 v0, 0x400

    .line 30
    div-long v0, v6, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v5

    const-string p1, "[UploadManager] Local network consume: %d KB"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-wide v6
.end method

.method public a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;IIZLjava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/P;",
            "IIZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 11
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/U;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/T;->c:Landroid/content/Context;

    const/4 v8, 0x1

    const/4 v11, 0x0

    move v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v12, p10

    invoke-direct/range {v0 .. v12}, Lcom/tencent/bugly/proguard/U;-><init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;ZIIZLjava/util/Map;)V

    move-object p2, v0

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    const/16 p4, 0x0

    move-object p1, p0

    move/from16 p3, p9

    move-wide/from16 p5, v0

    .line 12
    invoke-direct/range {p1 .. p6}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;ZZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 13
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;JZ)V
    .locals 10

    .line 6
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/U;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/T;->c:Landroid/content/Context;

    const/4 v8, 0x1

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/tencent/bugly/proguard/U;-><init>(Landroid/content/Context;II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;ZZ)V

    move-object p2, v0

    const/4 p3, 0x1

    const/4 p4, 0x1

    move-object p1, p0

    move-wide/from16 p5, p7

    .line 7
    invoke-direct/range {p1 .. p6}, Lcom/tencent/bugly/proguard/T;->a(Ljava/lang/Runnable;ZZJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 8
    invoke-static {p1}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;ZLjava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/proguard/P;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v9, p7

    move-object/from16 v10, p8

    .line 15
    invoke-virtual/range {v0 .. v10}, Lcom/tencent/bugly/proguard/T;->a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;IIZLjava/util/Map;)V

    return-void
.end method

.method public declared-synchronized a(IJ)V
    .locals 5

    monitor-enter p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    .line 42
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/T;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    new-instance v2, Lcom/tencent/bugly/proguard/L;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/L;-><init>()V

    .line 44
    iput p1, v2, Lcom/tencent/bugly/proguard/L;->b:I

    .line 45
    iput-wide p2, v2, Lcom/tencent/bugly/proguard/L;->e:J

    const-string v3, ""

    .line 46
    iput-object v3, v2, Lcom/tencent/bugly/proguard/L;->c:Ljava/lang/String;

    const-string v3, ""

    .line 47
    iput-object v3, v2, Lcom/tencent/bugly/proguard/L;->d:Ljava/lang/String;

    .line 48
    new-array v3, v1, [B

    iput-object v3, v2, Lcom/tencent/bugly/proguard/L;->g:[B

    .line 49
    iget-object v3, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    invoke-virtual {v3, p1}, Lcom/tencent/bugly/proguard/J;->b(I)V

    .line 50
    iget-object v3, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    invoke-virtual {v3, v2}, Lcom/tencent/bugly/proguard/J;->c(Lcom/tencent/bugly/proguard/L;)Z

    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 52
    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/ca;->a(J)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p1, p3, v1

    aput-object p2, p3, v0

    const-string p1, "[UploadManager] Uploading(ID:%d) time: %s"

    .line 53
    invoke-static {p1, p3}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 54
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "[UploadManager] Unknown uploading ID: %d"

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(ILcom/tencent/bugly/proguard/pa;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;JZ)V
    .locals 10

    .line 10
    iget v2, p2, Lcom/tencent/bugly/proguard/pa;->i:I

    invoke-static {p2}, Lcom/tencent/bugly/proguard/M;->a(Ljava/lang/Object;)[B

    move-result-object v3

    move-object v0, p0

    move v1, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-wide/from16 v7, p6

    move/from16 v9, p8

    invoke-virtual/range {v0 .. v9}, Lcom/tencent/bugly/proguard/T;->a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;JZ)V

    return-void
.end method

.method public a(ILcom/tencent/bugly/proguard/pa;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;Z)V
    .locals 11

    .line 16
    iget v2, p2, Lcom/tencent/bugly/proguard/pa;->i:I

    invoke-static {p2}, Lcom/tencent/bugly/proguard/M;->a(Ljava/lang/Object;)[B

    move-result-object v3

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v9, p6

    invoke-virtual/range {v0 .. v10}, Lcom/tencent/bugly/proguard/T;->a(II[BLjava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/P;IIZLjava/util/Map;)V

    return-void
.end method

.method public declared-synchronized a(JZ)V
    .locals 4

    monitor-enter p0

    if-eqz p3, :cond_0

    const/4 v0, 0x5

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    .line 31
    :goto_0
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/L;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/L;-><init>()V

    .line 32
    iput v0, v1, Lcom/tencent/bugly/proguard/L;->b:I

    .line 33
    invoke-static {}, Lcom/tencent/bugly/proguard/ca;->b()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/L;->e:J

    const-string v2, ""

    .line 34
    iput-object v2, v1, Lcom/tencent/bugly/proguard/L;->c:Ljava/lang/String;

    const-string v2, ""

    .line 35
    iput-object v2, v1, Lcom/tencent/bugly/proguard/L;->d:Ljava/lang/String;

    .line 36
    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/ca;->b(J)[B

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/L;->g:[B

    .line 37
    iget-object v2, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    invoke-virtual {v2, v0}, Lcom/tencent/bugly/proguard/J;->b(I)V

    .line 38
    iget-object v0, p0, Lcom/tencent/bugly/proguard/T;->b:Lcom/tencent/bugly/proguard/J;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/J;->c(Lcom/tencent/bugly/proguard/L;)Z

    if-eqz p3, :cond_1

    .line 39
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/T;->g:J

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 40
    :cond_1
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/T;->f:J

    :goto_1
    const-wide/16 v0, 0x400

    .line 41
    div-long/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    const-string p1, "[UploadManager] Network total consume: %d KB"

    invoke-static {p1, p2}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(I)Z
    .locals 7

    .line 55
    sget-boolean v0, Lcom/tencent/bugly/b;->c:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 56
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Uploading frequency will not be checked if SDK is in debug mode."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1

    .line 57
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/T;->b(I)J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    .line 58
    div-long v5, v3, v5

    .line 59
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v2

    aput-object p1, v5, v1

    const-string p1, "[UploadManager] Time interval is %d seconds since last uploading(ID: %d)."

    .line 60
    invoke-static {p1, v5}, Lcom/tencent/bugly/proguard/X;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const-wide/16 v5, 0x7530

    cmp-long p1, v3, v5

    if-gez p1, :cond_1

    const-wide/16 v3, 0x1e

    .line 61
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "[UploadManager] Data only be uploaded once in %d seconds."

    .line 62
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v2

    :cond_1
    return v1
.end method

.method public declared-synchronized b(I)J
    .locals 2

    monitor-enter p0

    if-ltz p1, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/T;->e:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 4
    :cond_0
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "[UploadManager] Unknown upload ID: %d"

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/X;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
