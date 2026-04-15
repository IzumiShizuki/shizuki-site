.class public final Lzd/d;
.super Lce/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final j:Lzd/d;

.field public static final k:Lwd/a;


# instance fields
.field public final a:Lce/e;

.field public b:I

.field public c:Lzd/b;

.field public d:Lzd/c;

.field public e:Lzd/c;

.field public f:Lzd/c;

.field public g:Lzd/c;

.field public h:B

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lzd/d;->k:Lwd/a;

    .line 9
    .line 10
    new-instance v0, Lzd/d;

    .line 11
    .line 12
    invoke-direct {v0}, Lzd/d;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lzd/d;->j:Lzd/d;

    .line 16
    .line 17
    sget-object v1, Lzd/b;->g:Lzd/b;

    .line 18
    .line 19
    iput-object v1, v0, Lzd/d;->c:Lzd/b;

    .line 20
    .line 21
    sget-object v1, Lzd/c;->g:Lzd/c;

    .line 22
    .line 23
    iput-object v1, v0, Lzd/d;->d:Lzd/c;

    .line 24
    .line 25
    iput-object v1, v0, Lzd/d;->e:Lzd/c;

    .line 26
    .line 27
    iput-object v1, v0, Lzd/d;->f:Lzd/c;

    .line 28
    .line 29
    iput-object v1, v0, Lzd/d;->g:Lzd/c;

    .line 30
    .line 31
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lzd/d;->h:B

    .line 3
    iput v0, p0, Lzd/d;->i:I

    .line 4
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lzd/d;->a:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;Lce/i;)V
    .locals 7

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lzd/d;->h:B

    .line 7
    iput v0, p0, Lzd/d;->i:I

    .line 8
    sget-object v0, Lzd/b;->g:Lzd/b;

    .line 9
    iput-object v0, p0, Lzd/d;->c:Lzd/b;

    .line 10
    sget-object v0, Lzd/c;->g:Lzd/c;

    .line 11
    iput-object v0, p0, Lzd/d;->d:Lzd/c;

    .line 12
    iput-object v0, p0, Lzd/d;->e:Lzd/c;

    .line 13
    iput-object v0, p0, Lzd/d;->f:Lzd/c;

    .line 14
    iput-object v0, p0, Lzd/d;->g:Lzd/c;

    .line 15
    new-instance v0, Lce/d;

    invoke-direct {v0}, Lce/d;-><init>()V

    const/4 v1, 0x1

    .line 16
    invoke-static {v0, v1}, Lce/g;->u(Ljava/io/OutputStream;I)Lce/g;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-nez v3, :cond_11

    .line 17
    :try_start_0
    invoke-virtual {p1}, Lce/f;->n()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-eq v4, v5, :cond_e

    const/16 v5, 0x12

    if-eq v4, v5, :cond_b

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_8

    const/16 v5, 0x22

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2a

    if-eq v4, v5, :cond_2

    .line 18
    invoke-virtual {p1, v4, v2}, Lce/f;->q(ILce/g;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    .line 19
    :cond_2
    iget v4, p0, Lzd/d;->b:I

    const/16 v5, 0x10

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_3

    .line 20
    iget-object v4, p0, Lzd/d;->g:Lzd/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-static {v4}, Lzd/c;->i(Lzd/c;)Lzd/a;

    move-result-object v6

    .line 22
    :cond_3
    sget-object v4, Lzd/c;->h:Lwd/a;

    invoke-virtual {p1, v4, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v4

    check-cast v4, Lzd/c;

    iput-object v4, p0, Lzd/d;->g:Lzd/c;

    if-eqz v6, :cond_4

    .line 23
    invoke-virtual {v6, v4}, Lzd/a;->i(Lzd/c;)V

    .line 24
    invoke-virtual {v6}, Lzd/a;->g()Lzd/c;

    move-result-object v4

    iput-object v4, p0, Lzd/d;->g:Lzd/c;

    .line 25
    :cond_4
    iget v4, p0, Lzd/d;->b:I

    or-int/2addr v4, v5

    iput v4, p0, Lzd/d;->b:I

    goto :goto_0

    .line 26
    :cond_5
    iget v4, p0, Lzd/d;->b:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_6

    .line 27
    iget-object v4, p0, Lzd/d;->f:Lzd/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    invoke-static {v4}, Lzd/c;->i(Lzd/c;)Lzd/a;

    move-result-object v6

    .line 29
    :cond_6
    sget-object v4, Lzd/c;->h:Lwd/a;

    invoke-virtual {p1, v4, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v4

    check-cast v4, Lzd/c;

    iput-object v4, p0, Lzd/d;->f:Lzd/c;

    if-eqz v6, :cond_7

    .line 30
    invoke-virtual {v6, v4}, Lzd/a;->i(Lzd/c;)V

    .line 31
    invoke-virtual {v6}, Lzd/a;->g()Lzd/c;

    move-result-object v4

    iput-object v4, p0, Lzd/d;->f:Lzd/c;

    .line 32
    :cond_7
    iget v4, p0, Lzd/d;->b:I

    or-int/2addr v4, v5

    iput v4, p0, Lzd/d;->b:I

    goto/16 :goto_0

    .line 33
    :cond_8
    iget v4, p0, Lzd/d;->b:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_9

    .line 34
    iget-object v4, p0, Lzd/d;->e:Lzd/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-static {v4}, Lzd/c;->i(Lzd/c;)Lzd/a;

    move-result-object v6

    .line 36
    :cond_9
    sget-object v4, Lzd/c;->h:Lwd/a;

    invoke-virtual {p1, v4, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v4

    check-cast v4, Lzd/c;

    iput-object v4, p0, Lzd/d;->e:Lzd/c;

    if-eqz v6, :cond_a

    .line 37
    invoke-virtual {v6, v4}, Lzd/a;->i(Lzd/c;)V

    .line 38
    invoke-virtual {v6}, Lzd/a;->g()Lzd/c;

    move-result-object v4

    iput-object v4, p0, Lzd/d;->e:Lzd/c;

    .line 39
    :cond_a
    iget v4, p0, Lzd/d;->b:I

    or-int/2addr v4, v5

    iput v4, p0, Lzd/d;->b:I

    goto/16 :goto_0

    .line 40
    :cond_b
    iget v4, p0, Lzd/d;->b:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_c

    .line 41
    iget-object v4, p0, Lzd/d;->d:Lzd/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    invoke-static {v4}, Lzd/c;->i(Lzd/c;)Lzd/a;

    move-result-object v6

    .line 43
    :cond_c
    sget-object v4, Lzd/c;->h:Lwd/a;

    invoke-virtual {p1, v4, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v4

    check-cast v4, Lzd/c;

    iput-object v4, p0, Lzd/d;->d:Lzd/c;

    if-eqz v6, :cond_d

    .line 44
    invoke-virtual {v6, v4}, Lzd/a;->i(Lzd/c;)V

    .line 45
    invoke-virtual {v6}, Lzd/a;->g()Lzd/c;

    move-result-object v4

    iput-object v4, p0, Lzd/d;->d:Lzd/c;

    .line 46
    :cond_d
    iget v4, p0, Lzd/d;->b:I

    or-int/2addr v4, v5

    iput v4, p0, Lzd/d;->b:I

    goto/16 :goto_0

    .line 47
    :cond_e
    iget v4, p0, Lzd/d;->b:I

    and-int/2addr v4, v1

    if-ne v4, v1, :cond_f

    .line 48
    iget-object v4, p0, Lzd/d;->c:Lzd/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    new-instance v6, Lzd/a;

    const/4 v5, 0x0

    .line 50
    invoke-direct {v6, v5}, Lzd/a;-><init>(I)V

    .line 51
    invoke-virtual {v6, v4}, Lzd/a;->h(Lzd/b;)V

    .line 52
    :cond_f
    sget-object v4, Lzd/b;->h:Lwd/a;

    invoke-virtual {p1, v4, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v4

    check-cast v4, Lzd/b;

    iput-object v4, p0, Lzd/d;->c:Lzd/b;

    if-eqz v6, :cond_10

    .line 53
    invoke-virtual {v6, v4}, Lzd/a;->h(Lzd/b;)V

    .line 54
    invoke-virtual {v6}, Lzd/a;->f()Lzd/b;

    move-result-object v4

    iput-object v4, p0, Lzd/d;->c:Lzd/b;

    .line 55
    :cond_10
    iget v4, p0, Lzd/d;->b:I

    or-int/2addr v4, v1

    iput v4, p0, Lzd/d;->b:I
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 56
    :goto_1
    :try_start_1
    new-instance p2, Lce/s;

    .line 57
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 58
    iput-object p0, p2, Lce/s;->a:Lce/b;

    .line 59
    throw p2

    .line 60
    :goto_2
    iput-object p0, p1, Lce/s;->a:Lce/b;

    .line 61
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :goto_3
    :try_start_2
    invoke-virtual {v2}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    :catch_2
    invoke-virtual {v0}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lzd/d;->a:Lce/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lzd/d;->a:Lce/e;

    .line 64
    throw p1

    .line 65
    :goto_4
    throw p1

    .line 66
    :cond_11
    :try_start_3
    invoke-virtual {v2}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    :catch_3
    invoke-virtual {v0}, Lce/d;->i()Lce/e;

    move-result-object p1

    iput-object p1, p0, Lzd/d;->a:Lce/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lzd/d;->a:Lce/e;

    .line 68
    throw p1
.end method

.method public constructor <init>(Lwd/q;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 70
    iput-byte v0, p0, Lzd/d;->h:B

    .line 71
    iput v0, p0, Lzd/d;->i:I

    .line 72
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 73
    iput-object p1, p0, Lzd/d;->a:Lce/e;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lzd/d;->h:B

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
    iput-byte v1, p0, Lzd/d;->h:B

    .line 8
    .line 9
    return v1
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

.method public final c()I
    .locals 4

    .line 1
    iget v0, p0, Lzd/d;->i:I

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
    iget v0, p0, Lzd/d;->b:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lzd/d;->c:Lzd/b;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lce/g;->g(ILce/b;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lzd/d;->b:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lzd/d;->d:Lzd/c;

    .line 28
    .line 29
    invoke-static {v2, v1}, Lce/g;->g(ILce/b;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lzd/d;->b:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget-object v3, p0, Lzd/d;->e:Lzd/c;

    .line 42
    .line 43
    invoke-static {v1, v3}, Lce/g;->g(ILce/b;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_3
    iget v1, p0, Lzd/d;->b:I

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lzd/d;->f:Lzd/c;

    .line 56
    .line 57
    invoke-static {v2, v1}, Lce/g;->g(ILce/b;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_4
    iget v1, p0, Lzd/d;->b:I

    .line 63
    .line 64
    const/16 v2, 0x10

    .line 65
    .line 66
    and-int/2addr v1, v2

    .line 67
    if-ne v1, v2, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    iget-object v2, p0, Lzd/d;->g:Lzd/c;

    .line 71
    .line 72
    invoke-static {v1, v2}, Lce/g;->g(ILce/b;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v0, v1

    .line 77
    :cond_5
    iget-object v1, p0, Lzd/d;->a:Lce/e;

    .line 78
    .line 79
    invoke-virtual {v1}, Lce/e;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v1, v0

    .line 84
    iput v1, p0, Lzd/d;->i:I

    .line 85
    .line 86
    return v1
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
    invoke-static {}, Lwd/q;->i()Lwd/q;

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
    invoke-static {}, Lwd/q;->i()Lwd/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lwd/q;->k(Lzd/d;)V

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
    .locals 3

    .line 1
    invoke-virtual {p0}, Lzd/d;->c()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lzd/d;->b:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lzd/d;->c:Lzd/b;

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lce/g;->H(ILce/b;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lzd/d;->b:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lzd/d;->d:Lzd/c;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lce/g;->H(ILce/b;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lzd/d;->b:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    iget-object v2, p0, Lzd/d;->e:Lzd/c;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v2}, Lce/g;->H(ILce/b;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget v0, p0, Lzd/d;->b:I

    .line 39
    .line 40
    const/16 v2, 0x8

    .line 41
    .line 42
    and-int/2addr v0, v2

    .line 43
    if-ne v0, v2, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, Lzd/d;->f:Lzd/c;

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0}, Lce/g;->H(ILce/b;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget v0, p0, Lzd/d;->b:I

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    and-int/2addr v0, v1

    .line 55
    if-ne v0, v1, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x5

    .line 58
    iget-object v1, p0, Lzd/d;->g:Lzd/c;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Lce/g;->H(ILce/b;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget-object v0, p0, Lzd/d;->a:Lce/e;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 66
    .line 67
    .line 68
    return-void
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

.method public final i()Z
    .locals 2

    .line 1
    iget v0, p0, Lzd/d;->b:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
