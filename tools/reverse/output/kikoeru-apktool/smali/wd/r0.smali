.class public final Lwd/r0;
.super Lce/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final h:Lwd/r0;

.field public static final i:Lwd/a;


# instance fields
.field public final a:Lce/e;

.field public b:I

.field public c:Lwd/q0;

.field public d:Lwd/t0;

.field public e:I

.field public f:B

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwd/r0;->i:Lwd/a;

    .line 9
    .line 10
    new-instance v0, Lwd/r0;

    .line 11
    .line 12
    invoke-direct {v0}, Lwd/r0;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lwd/r0;->h:Lwd/r0;

    .line 16
    .line 17
    sget-object v1, Lwd/q0;->d:Lwd/q0;

    .line 18
    .line 19
    iput-object v1, v0, Lwd/r0;->c:Lwd/q0;

    .line 20
    .line 21
    sget-object v1, Lwd/t0;->t:Lwd/t0;

    .line 22
    .line 23
    iput-object v1, v0, Lwd/r0;->d:Lwd/t0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput v1, v0, Lwd/r0;->e:I

    .line 27
    .line 28
    return-void
    .line 29
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lwd/r0;->f:B

    .line 3
    iput v0, p0, Lwd/r0;->g:I

    .line 4
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lwd/r0;->a:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;Lce/i;)V
    .locals 9

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lwd/r0;->f:B

    .line 7
    iput v0, p0, Lwd/r0;->g:I

    .line 8
    sget-object v0, Lwd/q0;->d:Lwd/q0;

    iput-object v0, p0, Lwd/r0;->c:Lwd/q0;

    .line 9
    sget-object v1, Lwd/t0;->t:Lwd/t0;

    .line 10
    iput-object v1, p0, Lwd/r0;->d:Lwd/t0;

    const/4 v1, 0x0

    .line 11
    iput v1, p0, Lwd/r0;->e:I

    .line 12
    new-instance v2, Lce/d;

    invoke-direct {v2}, Lce/d;-><init>()V

    const/4 v3, 0x1

    .line 13
    invoke-static {v2, v3}, Lce/g;->u(Ljava/io/OutputStream;I)Lce/g;

    move-result-object v4

    :cond_0
    :goto_0
    if-nez v1, :cond_c

    .line 14
    :try_start_0
    invoke-virtual {p1}, Lce/f;->n()I

    move-result v5

    if-eqz v5, :cond_1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eq v5, v6, :cond_6

    const/16 v6, 0x12

    if-eq v5, v6, :cond_3

    const/16 v6, 0x18

    if-eq v5, v6, :cond_2

    .line 15
    invoke-virtual {p1, v5, v4}, Lce/f;->q(ILce/g;)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    .line 16
    :cond_2
    iget v5, p0, Lwd/r0;->b:I

    or-int/lit8 v5, v5, 0x4

    iput v5, p0, Lwd/r0;->b:I

    .line 17
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v5

    .line 18
    iput v5, p0, Lwd/r0;->e:I

    goto :goto_0

    .line 19
    :cond_3
    iget v5, p0, Lwd/r0;->b:I

    and-int/2addr v5, v8

    if-ne v5, v8, :cond_4

    .line 20
    iget-object v5, p0, Lwd/r0;->d:Lwd/t0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {v5}, Lwd/t0;->r(Lwd/t0;)Lwd/s0;

    move-result-object v7

    .line 22
    :cond_4
    sget-object v5, Lwd/t0;->u:Lwd/a;

    invoke-virtual {p1, v5, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v5

    check-cast v5, Lwd/t0;

    iput-object v5, p0, Lwd/r0;->d:Lwd/t0;

    if-eqz v7, :cond_5

    .line 23
    invoke-virtual {v7, v5}, Lwd/s0;->i(Lwd/t0;)Lwd/s0;

    .line 24
    invoke-virtual {v7}, Lwd/s0;->g()Lwd/t0;

    move-result-object v5

    iput-object v5, p0, Lwd/r0;->d:Lwd/t0;

    .line 25
    :cond_5
    iget v5, p0, Lwd/r0;->b:I

    or-int/2addr v5, v8

    iput v5, p0, Lwd/r0;->b:I

    goto :goto_0

    .line 26
    :cond_6
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v6

    if-eqz v6, :cond_a

    if-eq v6, v3, :cond_9

    if-eq v6, v8, :cond_8

    const/4 v8, 0x3

    if-eq v6, v8, :cond_7

    goto :goto_1

    .line 27
    :cond_7
    sget-object v7, Lwd/q0;->e:Lwd/q0;

    goto :goto_1

    :cond_8
    move-object v7, v0

    goto :goto_1

    .line 28
    :cond_9
    sget-object v7, Lwd/q0;->c:Lwd/q0;

    goto :goto_1

    .line 29
    :cond_a
    sget-object v7, Lwd/q0;->b:Lwd/q0;

    :goto_1
    if-nez v7, :cond_b

    .line 30
    invoke-virtual {v4, v5}, Lce/g;->O(I)V

    .line 31
    invoke-virtual {v4, v6}, Lce/g;->O(I)V

    goto :goto_0

    .line 32
    :cond_b
    iget v5, p0, Lwd/r0;->b:I

    or-int/2addr v5, v3

    iput v5, p0, Lwd/r0;->b:I

    .line 33
    iput-object v7, p0, Lwd/r0;->c:Lwd/q0;
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 34
    :goto_2
    :try_start_1
    new-instance p2, Lce/s;

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 36
    iput-object p0, p2, Lce/s;->a:Lce/b;

    .line 37
    throw p2

    .line 38
    :goto_3
    iput-object p0, p1, Lce/s;->a:Lce/b;

    .line 39
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    :goto_4
    :try_start_2
    invoke-virtual {v4}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 41
    :catch_2
    invoke-virtual {v2}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/r0;->a:Lce/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v2}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/r0;->a:Lce/e;

    .line 42
    throw p1

    .line 43
    :goto_5
    throw p1

    .line 44
    :cond_c
    :try_start_3
    invoke-virtual {v4}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 45
    :catch_3
    invoke-virtual {v2}, Lce/d;->i()Lce/e;

    move-result-object p1

    iput-object p1, p0, Lwd/r0;->a:Lce/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v2}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/r0;->a:Lce/e;

    .line 46
    throw p1
.end method

.method public constructor <init>(Lwd/p0;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 48
    iput-byte v0, p0, Lwd/r0;->f:B

    .line 49
    iput v0, p0, Lwd/r0;->g:I

    .line 50
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 51
    iput-object p1, p0, Lwd/r0;->a:Lce/e;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lwd/r0;->f:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v0, p0, Lwd/r0;->b:I

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    and-int/2addr v0, v3

    .line 15
    if-ne v0, v3, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lwd/r0;->d:Lwd/t0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lwd/t0;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iput-byte v2, p0, Lwd/r0;->f:B

    .line 26
    .line 27
    return v2

    .line 28
    :cond_2
    iput-byte v1, p0, Lwd/r0;->f:B

    .line 29
    .line 30
    return v1
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

.method public final c()I
    .locals 3

    .line 1
    iget v0, p0, Lwd/r0;->g:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lwd/r0;->b:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lwd/r0;->c:Lwd/q0;

    .line 14
    .line 15
    iget v0, v0, Lwd/q0;->a:I

    .line 16
    .line 17
    invoke-static {v1, v0}, Lce/g;->d(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget v1, p0, Lwd/r0;->b:I

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    and-int/2addr v1, v2

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lwd/r0;->d:Lwd/t0;

    .line 30
    .line 31
    invoke-static {v2, v1}, Lce/g;->g(ILce/b;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v0, v1

    .line 36
    :cond_2
    iget v1, p0, Lwd/r0;->b:I

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    and-int/2addr v1, v2

    .line 40
    if-ne v1, v2, :cond_3

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    iget v2, p0, Lwd/r0;->e:I

    .line 44
    .line 45
    invoke-static {v1, v2}, Lce/g;->e(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    :cond_3
    iget-object v1, p0, Lwd/r0;->a:Lce/e;

    .line 51
    .line 52
    invoke-virtual {v1}, Lce/e;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    iput v1, p0, Lwd/r0;->g:I

    .line 58
    .line 59
    return v1
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

.method public final d()Lce/k;
    .locals 1

    .line 1
    invoke-static {}, Lwd/p0;->g()Lwd/p0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final e()Lce/k;
    .locals 1

    .line 1
    invoke-static {}, Lwd/p0;->g()Lwd/p0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lwd/p0;->h(Lwd/r0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final f(Lce/g;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lwd/r0;->c()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lwd/r0;->b:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lwd/r0;->c:Lwd/q0;

    .line 11
    .line 12
    iget v0, v0, Lwd/q0;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Lce/g;->E(II)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v0, p0, Lwd/r0;->b:I

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    and-int/2addr v0, v1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lwd/r0;->d:Lwd/t0;

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Lce/g;->H(ILce/b;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget v0, p0, Lwd/r0;->b:I

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    and-int/2addr v0, v1

    .line 32
    if-ne v0, v1, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    iget v1, p0, Lwd/r0;->e:I

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lce/g;->F(II)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lwd/r0;->a:Lce/e;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 43
    .line 44
    .line 45
    return-void
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
.end method
