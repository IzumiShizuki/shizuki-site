.class public final Lbh/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llh/f0;


# instance fields
.field public final a:Llh/p;

.field public b:Z

.field public final synthetic c:Lbh/h;


# direct methods
.method public constructor <init>(Lbh/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbh/c;->c:Lbh/h;

    .line 5
    .line 6
    new-instance v0, Llh/p;

    .line 7
    .line 8
    iget-object p1, p1, Lbh/h;->c:Ltc/b0;

    .line 9
    .line 10
    iget-object p1, p1, Ltc/b0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Llh/a0;

    .line 13
    .line 14
    iget-object p1, p1, Llh/a0;->a:Llh/f0;

    .line 15
    .line 16
    invoke-interface {p1}, Llh/f0;->a()Llh/j0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Llh/p;-><init>(Llh/j0;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lbh/c;->a:Llh/p;

    .line 24
    .line 25
    return-void
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
.method public final H(Llh/f;J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lbh/c;->b:Z

    .line 2
    .line 3
    const-string v1, "closed"

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, p2, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lbh/c;->c:Lbh/h;

    .line 15
    .line 16
    iget-object v0, v0, Lbh/h;->c:Ltc/b0;

    .line 17
    .line 18
    iget-object v0, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Llh/a0;

    .line 21
    .line 22
    iget-boolean v2, v0, Llh/a0;->c:Z

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Llh/a0;->b:Llh/f;

    .line 27
    .line 28
    invoke-virtual {v1, p2, p3}, Llh/f;->g0(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Llh/a0;->b()Llh/g;

    .line 32
    .line 33
    .line 34
    const-string v1, "\r\n"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, p2, p3}, Llh/a0;->H(Llh/f;J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
    .line 58
.end method

.method public final a()Llh/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lbh/c;->a:Llh/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lbh/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lbh/c;->b:Z

    .line 10
    .line 11
    iget-object v0, p0, Lbh/c;->c:Lbh/h;

    .line 12
    .line 13
    iget-object v0, v0, Lbh/h;->c:Ltc/b0;

    .line 14
    .line 15
    iget-object v0, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Llh/a0;

    .line 18
    .line 19
    const-string v1, "0\r\n\r\n"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Llh/a0;->E(Ljava/lang/String;)Llh/g;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lbh/c;->a:Llh/p;

    .line 25
    .line 26
    iget-object v1, v0, Llh/p;->e:Llh/j0;

    .line 27
    .line 28
    sget-object v2, Llh/j0;->d:Llh/i0;

    .line 29
    .line 30
    iput-object v2, v0, Llh/p;->e:Llh/j0;

    .line 31
    .line 32
    invoke-virtual {v1}, Llh/j0;->a()Llh/j0;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Llh/j0;->b()Llh/j0;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lbh/c;->c:Lbh/h;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iput v1, v0, Lbh/h;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw v0
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

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lbh/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lbh/c;->c:Lbh/h;

    .line 9
    .line 10
    iget-object v0, v0, Lbh/h;->c:Ltc/b0;

    .line 11
    .line 12
    iget-object v0, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Llh/a0;

    .line 15
    .line 16
    invoke-virtual {v0}, Llh/a0;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
