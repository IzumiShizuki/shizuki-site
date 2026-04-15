.class public final Lug/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field public final a:Lxg/g;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    .line 1
    sget-object v0, Llh/l;->a:Llh/u;

    .line 2
    .line 3
    sget-object v1, Llh/y;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1}, Lg5/w;->w(Ljava/io/File;)Llh/y;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v1, "fileSystem"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lyg/c;->l:Lyg/c;

    .line 15
    .line 16
    const-string v2, "taskRunner"

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lxg/g;

    .line 25
    .line 26
    invoke-direct {v2, v0, p1, v1}, Lxg/g;-><init>(Llh/l;Llh/y;Lyg/c;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lug/f;->a:Lxg/g;

    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final b(Lb7/b1;)V
    .locals 5

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lug/f;->a:Lxg/g;

    .line 7
    .line 8
    iget-object p1, p1, Lb7/b1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lug/t;

    .line 11
    .line 12
    invoke-static {p1}, Lud/s;->r(Lug/t;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    const-string v1, "key"

    .line 18
    .line 19
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lxg/g;->n()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lxg/g;->b()V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lxg/g;->L(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lxg/g;->i:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lxg/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Lxg/g;->D(Lxg/c;)V

    .line 44
    .line 45
    .line 46
    iget-wide v1, v0, Lxg/g;->g:J

    .line 47
    .line 48
    iget-wide v3, v0, Lxg/g;->c:J

    .line 49
    .line 50
    cmp-long p1, v1, v3

    .line 51
    .line 52
    if-gtz p1, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, v0, Lxg/g;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    :goto_0
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p1
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

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lug/f;->a:Lxg/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxg/g;->close()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lug/f;->a:Lxg/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxg/g;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final declared-synchronized g()V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    monitor-exit p0

    .line 3
    return-void
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
