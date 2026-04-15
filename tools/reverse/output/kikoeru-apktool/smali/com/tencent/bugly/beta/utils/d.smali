.class public Lcom/tencent/bugly/beta/utils/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:J

.field d:Lcom/tencent/bugly/beta/utils/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/bugly/beta/utils/d;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p2, p0, Lcom/tencent/bugly/beta/utils/d;->b:J

    .line 10
    .line 11
    iput-wide p4, p0, Lcom/tencent/bugly/beta/utils/d;->c:J

    .line 12
    .line 13
    return-void
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

.method private declared-synchronized b(J)Ljava/lang/String;
    .locals 5

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    monitor-exit p0

    return-object v1

    .line 3
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4
    :try_start_2
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    iget-wide v3, p0, Lcom/tencent/bugly/beta/utils/d;->b:J

    invoke-virtual {v2, v3, v4}, Lcom/tencent/bugly/beta/utils/a;->b(J)Z

    .line 5
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    invoke-virtual {v2, p1, p2}, Lcom/tencent/bugly/beta/utils/a;->b(J)Z

    .line 6
    :goto_0
    iget-object p1, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/beta/utils/a;->b()B

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    invoke-virtual {p1}, Lcom/tencent/bugly/beta/utils/a;->a()Z

    .line 8
    new-instance p1, Lcom/tencent/bugly/beta/utils/a;

    iget-object p2, p0, Lcom/tencent/bugly/beta/utils/d;->a:Ljava/lang/String;

    invoke-direct {p1, p2}, Lcom/tencent/bugly/beta/utils/a;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    int-to-char p1, p1

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 10
    :goto_1
    :try_start_3
    iput-object v1, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 12
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method private b()Z
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/beta/utils/d;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v0, p0, Lcom/tencent/bugly/beta/utils/d;->c:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized c()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/d;->b()Z

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_2
    new-instance v0, Lcom/tencent/bugly/beta/utils/a;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/tencent/bugly/beta/utils/d;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {v0, v2}, Lcom/tencent/bugly/beta/utils/a;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    move-exception v0

    .line 28
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return v1

    .line 33
    :cond_1
    :goto_0
    monitor-exit p0

    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 37
    throw v0
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
.method public declared-synchronized a(J)Ljava/lang/String;
    .locals 4

    monitor-enter p0

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-ltz v3, :cond_2

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/bugly/beta/utils/d;->c:J

    cmp-long v3, p1, v0

    if-ltz v3, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;

    if-nez v0, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/tencent/bugly/beta/utils/d;->c()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 7
    :cond_1
    :try_start_1
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/beta/utils/d;->b(J)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_2
    :goto_1
    monitor-exit p0

    return-object v2
.end method

.method public declared-synchronized a()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 2
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lcom/tencent/bugly/beta/utils/a;->a()Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/beta/utils/d;->d:Lcom/tencent/bugly/beta/utils/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
