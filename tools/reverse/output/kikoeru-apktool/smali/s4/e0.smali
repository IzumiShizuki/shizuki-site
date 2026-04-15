.class public final Ls4/e0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls4/h;


# instance fields
.field public final a:Ls4/h;

.field public final b:Lt4/d;

.field public c:Z

.field public d:J


# direct methods
.method public constructor <init>(Ls4/h;Lt4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls4/e0;->a:Ls4/h;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Ls4/e0;->b:Lt4/d;

    .line 13
    .line 14
    return-void
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
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Ls4/e0;->b:Lt4/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Ls4/e0;->a:Ls4/h;

    .line 5
    .line 6
    invoke-interface {v2}, Ls4/h;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    iget-boolean v2, p0, Ls4/e0;->c:Z

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iput-boolean v1, p0, Ls4/e0;->c:Z

    .line 14
    .line 15
    iget-object v1, v0, Lt4/d;->d:Ls4/m;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lt4/d;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    new-instance v1, Lt4/c;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    :goto_0
    return-void

    .line 32
    :catchall_0
    move-exception v2

    .line 33
    iget-boolean v3, p0, Ls4/e0;->c:Z

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    iput-boolean v1, p0, Ls4/e0;->c:Z

    .line 38
    .line 39
    iget-object v1, v0, Lt4/d;->d:Ls4/m;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Lt4/d;->a()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catch_1
    move-exception v0

    .line 49
    new-instance v1, Lt4/c;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_3
    :goto_1
    throw v2
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

.method public final f(Ls4/m;)J
    .locals 9

    .line 1
    iget-object v0, p0, Ls4/e0;->a:Ls4/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ls4/h;->f(Ls4/m;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Ls4/e0;->d:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v4, v0, v2

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return-wide v2

    .line 16
    :cond_0
    iget-wide v4, p1, Ls4/m;->g:J

    .line 17
    .line 18
    const-wide/16 v6, -0x1

    .line 19
    .line 20
    cmp-long v8, v4, v6

    .line 21
    .line 22
    if-nez v8, :cond_1

    .line 23
    .line 24
    cmp-long v4, v0, v6

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v2, v3, v0, v1}, Ls4/m;->c(JJ)Ls4/m;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    iget v0, p1, Ls4/m;->i:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    iput-boolean v1, p0, Ls4/e0;->c:Z

    .line 36
    .line 37
    iget-object v1, p0, Ls4/e0;->b:Lt4/d;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v4, p1, Ls4/m;->h:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-wide v4, p1, Ls4/m;->g:J

    .line 48
    .line 49
    cmp-long v8, v4, v6

    .line 50
    .line 51
    if-nez v8, :cond_2

    .line 52
    .line 53
    and-int/lit8 v4, v0, 0x2

    .line 54
    .line 55
    const/4 v5, 0x2

    .line 56
    if-ne v4, v5, :cond_2

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    iput-object p1, v1, Lt4/d;->d:Ls4/m;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iput-object p1, v1, Lt4/d;->d:Ls4/m;

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    and-int/2addr v0, v4

    .line 66
    if-ne v0, v4, :cond_3

    .line 67
    .line 68
    iget-wide v4, v1, Lt4/d;->b:J

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    const-wide v4, 0x7fffffffffffffffL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    :goto_0
    iput-wide v4, v1, Lt4/d;->e:J

    .line 77
    .line 78
    iput-wide v2, v1, Lt4/d;->i:J

    .line 79
    .line 80
    :try_start_0
    invoke-virtual {v1, p1}, Lt4/d;->b(Ls4/m;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    :goto_1
    iget-wide v0, p0, Ls4/e0;->d:J

    .line 84
    .line 85
    return-wide v0

    .line 86
    :catch_0
    move-exception p1

    .line 87
    new-instance v0, Lt4/c;

    .line 88
    .line 89
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw v0
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

.method public final p()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/e0;->a:Ls4/h;

    .line 2
    .line 3
    invoke-interface {v0}, Ls4/h;->p()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
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
.end method

.method public final read([BII)I
    .locals 9

    .line 1
    iget-wide v0, p0, Ls4/e0;->d:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-nez v4, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object v0, p0, Ls4/e0;->a:Ls4/h;

    .line 12
    .line 13
    invoke-interface {v0, p1, p2, p3}, Lm4/i;->read([BII)I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-lez p3, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, Ls4/e0;->b:Lt4/d;

    .line 20
    .line 21
    iget-object v1, v0, Lt4/d;->d:Ls4/m;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_1
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-ge v2, p3, :cond_3

    .line 28
    .line 29
    :try_start_0
    iget-wide v3, v0, Lt4/d;->h:J

    .line 30
    .line 31
    iget-wide v5, v0, Lt4/d;->e:J

    .line 32
    .line 33
    cmp-long v7, v3, v5

    .line 34
    .line 35
    if-nez v7, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Lt4/d;->a()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lt4/d;->b(Ls4/m;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    sub-int v3, p3, v2

    .line 47
    .line 48
    int-to-long v3, v3

    .line 49
    iget-wide v5, v0, Lt4/d;->e:J

    .line 50
    .line 51
    iget-wide v7, v0, Lt4/d;->h:J

    .line 52
    .line 53
    sub-long/2addr v5, v7

    .line 54
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    long-to-int v4, v3

    .line 59
    iget-object v3, v0, Lt4/d;->g:Ljava/io/OutputStream;

    .line 60
    .line 61
    sget v5, Lp4/c0;->a:I

    .line 62
    .line 63
    add-int v5, p2, v2

    .line 64
    .line 65
    invoke-virtual {v3, p1, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 66
    .line 67
    .line 68
    add-int/2addr v2, v4

    .line 69
    iget-wide v5, v0, Lt4/d;->h:J

    .line 70
    .line 71
    int-to-long v3, v4

    .line 72
    add-long/2addr v5, v3

    .line 73
    iput-wide v5, v0, Lt4/d;->h:J

    .line 74
    .line 75
    iget-wide v5, v0, Lt4/d;->i:J

    .line 76
    .line 77
    add-long/2addr v5, v3

    .line 78
    iput-wide v5, v0, Lt4/d;->i:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :goto_2
    new-instance p2, Lt4/c;

    .line 82
    .line 83
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw p2

    .line 87
    :cond_3
    :goto_3
    iget-wide p1, p0, Ls4/e0;->d:J

    .line 88
    .line 89
    const-wide/16 v0, -0x1

    .line 90
    .line 91
    cmp-long v2, p1, v0

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    int-to-long v0, p3

    .line 96
    sub-long/2addr p1, v0

    .line 97
    iput-wide p1, p0, Ls4/e0;->d:J

    .line 98
    .line 99
    :cond_4
    return p3
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

.method public final t(Ls4/f0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls4/e0;->a:Ls4/h;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ls4/h;->t(Ls4/f0;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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
.end method

.method public final w()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Ls4/e0;->a:Ls4/h;

    .line 2
    .line 3
    invoke-interface {v0}, Ls4/h;->w()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
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
.end method
