.class public final Lwd/b1;
.super Lce/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final n:Lwd/b1;

.field public static final o:Lwd/a;


# instance fields
.field public final b:Lce/e;

.field public c:I

.field public d:I

.field public e:I

.field public f:Lwd/t0;

.field public g:I

.field public h:Lwd/t0;

.field public i:I

.field public j:Ljava/util/List;

.field public k:Lwd/e;

.field public l:B

.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwd/b1;->o:Lwd/a;

    .line 9
    .line 10
    new-instance v0, Lwd/b1;

    .line 11
    .line 12
    invoke-direct {v0}, Lwd/b1;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lwd/b1;->n:Lwd/b1;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lwd/b1;->d:I

    .line 19
    .line 20
    iput v1, v0, Lwd/b1;->e:I

    .line 21
    .line 22
    sget-object v2, Lwd/t0;->t:Lwd/t0;

    .line 23
    .line 24
    iput-object v2, v0, Lwd/b1;->f:Lwd/t0;

    .line 25
    .line 26
    iput v1, v0, Lwd/b1;->g:I

    .line 27
    .line 28
    iput-object v2, v0, Lwd/b1;->h:Lwd/t0;

    .line 29
    .line 30
    iput v1, v0, Lwd/b1;->i:I

    .line 31
    .line 32
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iput-object v1, v0, Lwd/b1;->j:Ljava/util/List;

    .line 35
    .line 36
    sget-object v1, Lwd/e;->p:Lwd/e;

    .line 37
    .line 38
    iput-object v1, v0, Lwd/b1;->k:Lwd/e;

    .line 39
    .line 40
    return-void
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

    .line 6
    invoke-direct {p0}, Lce/m;-><init>()V

    const/4 v0, -0x1

    .line 7
    iput-byte v0, p0, Lwd/b1;->l:B

    .line 8
    iput v0, p0, Lwd/b1;->m:I

    .line 9
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lwd/b1;->b:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;Lce/i;)V
    .locals 11

    .line 10
    invoke-direct {p0}, Lce/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lwd/b1;->l:B

    .line 12
    iput v0, p0, Lwd/b1;->m:I

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lwd/b1;->d:I

    .line 14
    iput v0, p0, Lwd/b1;->e:I

    .line 15
    sget-object v1, Lwd/t0;->t:Lwd/t0;

    .line 16
    iput-object v1, p0, Lwd/b1;->f:Lwd/t0;

    .line 17
    iput v0, p0, Lwd/b1;->g:I

    .line 18
    iput-object v1, p0, Lwd/b1;->h:Lwd/t0;

    .line 19
    iput v0, p0, Lwd/b1;->i:I

    .line 20
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lwd/b1;->j:Ljava/util/List;

    .line 21
    sget-object v1, Lwd/e;->p:Lwd/e;

    .line 22
    iput-object v1, p0, Lwd/b1;->k:Lwd/e;

    .line 23
    new-instance v1, Lce/d;

    invoke-direct {v1}, Lce/d;-><init>()V

    const/4 v2, 0x1

    .line 24
    invoke-static {v1, v2}, Lce/g;->u(Ljava/io/OutputStream;I)Lce/g;

    move-result-object v3

    const/4 v4, 0x0

    :cond_0
    :goto_0
    const/16 v5, 0x40

    if-nez v0, :cond_12

    .line 25
    :try_start_0
    invoke-virtual {p1}, Lce/f;->n()I

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x8

    if-eq v6, v7, :cond_10

    const/16 v8, 0x10

    if-eq v6, v8, :cond_f

    const/16 v9, 0x1a

    const/4 v10, 0x0

    if-eq v6, v9, :cond_c

    const/16 v9, 0x22

    if-eq v6, v9, :cond_9

    const/16 v8, 0x28

    if-eq v6, v8, :cond_8

    const/16 v7, 0x30

    if-eq v6, v7, :cond_7

    const/16 v7, 0x3a

    if-eq v6, v7, :cond_5

    const/16 v7, 0x42

    if-eq v6, v7, :cond_2

    .line 26
    invoke-virtual {p0, p1, v3, p2, v6}, Lce/m;->n(Lce/f;Lce/g;Lce/i;I)Z

    move-result v5

    if-nez v5, :cond_0

    :cond_1
    const/4 v0, 0x1

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

    .line 27
    :cond_2
    iget v6, p0, Lwd/b1;->c:I

    and-int/2addr v6, v5

    if-ne v6, v5, :cond_3

    .line 28
    iget-object v6, p0, Lwd/b1;->k:Lwd/e;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-static {v6}, Lwd/e;->j(Lwd/e;)Lwd/c;

    move-result-object v10

    .line 30
    :cond_3
    sget-object v6, Lwd/e;->q:Lwd/a;

    invoke-virtual {p1, v6, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v6

    check-cast v6, Lwd/e;

    iput-object v6, p0, Lwd/b1;->k:Lwd/e;

    if-eqz v10, :cond_4

    .line 31
    invoke-virtual {v10, v6}, Lwd/c;->h(Lwd/e;)V

    .line 32
    invoke-virtual {v10}, Lwd/c;->f()Lwd/e;

    move-result-object v6

    iput-object v6, p0, Lwd/b1;->k:Lwd/e;

    .line 33
    :cond_4
    iget v6, p0, Lwd/b1;->c:I

    or-int/2addr v6, v5

    iput v6, p0, Lwd/b1;->c:I

    goto :goto_0

    :cond_5
    and-int/lit8 v6, v4, 0x40

    if-eq v6, v5, :cond_6

    .line 34
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lwd/b1;->j:Ljava/util/List;

    const/16 v4, 0x40

    .line 35
    :cond_6
    iget-object v6, p0, Lwd/b1;->j:Ljava/util/List;

    sget-object v7, Lwd/h;->h:Lwd/a;

    invoke-virtual {p1, v7, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 36
    :cond_7
    iget v6, p0, Lwd/b1;->c:I

    or-int/lit8 v6, v6, 0x20

    iput v6, p0, Lwd/b1;->c:I

    .line 37
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v6

    .line 38
    iput v6, p0, Lwd/b1;->i:I

    goto/16 :goto_0

    .line 39
    :cond_8
    iget v6, p0, Lwd/b1;->c:I

    or-int/2addr v6, v7

    iput v6, p0, Lwd/b1;->c:I

    .line 40
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v6

    .line 41
    iput v6, p0, Lwd/b1;->g:I

    goto/16 :goto_0

    .line 42
    :cond_9
    iget v6, p0, Lwd/b1;->c:I

    and-int/2addr v6, v8

    if-ne v6, v8, :cond_a

    .line 43
    iget-object v6, p0, Lwd/b1;->h:Lwd/t0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {v6}, Lwd/t0;->r(Lwd/t0;)Lwd/s0;

    move-result-object v10

    .line 45
    :cond_a
    sget-object v6, Lwd/t0;->u:Lwd/a;

    invoke-virtual {p1, v6, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v6

    check-cast v6, Lwd/t0;

    iput-object v6, p0, Lwd/b1;->h:Lwd/t0;

    if-eqz v10, :cond_b

    .line 46
    invoke-virtual {v10, v6}, Lwd/s0;->i(Lwd/t0;)Lwd/s0;

    .line 47
    invoke-virtual {v10}, Lwd/s0;->g()Lwd/t0;

    move-result-object v6

    iput-object v6, p0, Lwd/b1;->h:Lwd/t0;

    .line 48
    :cond_b
    iget v6, p0, Lwd/b1;->c:I

    or-int/2addr v6, v8

    iput v6, p0, Lwd/b1;->c:I

    goto/16 :goto_0

    .line 49
    :cond_c
    iget v6, p0, Lwd/b1;->c:I

    const/4 v7, 0x4

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_d

    .line 50
    iget-object v6, p0, Lwd/b1;->f:Lwd/t0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-static {v6}, Lwd/t0;->r(Lwd/t0;)Lwd/s0;

    move-result-object v10

    .line 52
    :cond_d
    sget-object v6, Lwd/t0;->u:Lwd/a;

    invoke-virtual {p1, v6, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v6

    check-cast v6, Lwd/t0;

    iput-object v6, p0, Lwd/b1;->f:Lwd/t0;

    if-eqz v10, :cond_e

    .line 53
    invoke-virtual {v10, v6}, Lwd/s0;->i(Lwd/t0;)Lwd/s0;

    .line 54
    invoke-virtual {v10}, Lwd/s0;->g()Lwd/t0;

    move-result-object v6

    iput-object v6, p0, Lwd/b1;->f:Lwd/t0;

    .line 55
    :cond_e
    iget v6, p0, Lwd/b1;->c:I

    or-int/2addr v6, v7

    iput v6, p0, Lwd/b1;->c:I

    goto/16 :goto_0

    .line 56
    :cond_f
    iget v6, p0, Lwd/b1;->c:I

    or-int/lit8 v6, v6, 0x2

    iput v6, p0, Lwd/b1;->c:I

    .line 57
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v6

    .line 58
    iput v6, p0, Lwd/b1;->e:I

    goto/16 :goto_0

    .line 59
    :cond_10
    iget v6, p0, Lwd/b1;->c:I

    or-int/2addr v6, v2

    iput v6, p0, Lwd/b1;->c:I

    .line 60
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v6

    .line 61
    iput v6, p0, Lwd/b1;->d:I
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 62
    :goto_1
    :try_start_1
    new-instance p2, Lce/s;

    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 64
    iput-object p0, p2, Lce/s;->a:Lce/b;

    .line 65
    throw p2

    .line 66
    :goto_2
    iput-object p0, p1, Lce/s;->a:Lce/b;

    .line 67
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    and-int/lit8 p2, v4, 0x40

    if-ne p2, v5, :cond_11

    .line 68
    iget-object p2, p0, Lwd/b1;->j:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lwd/b1;->j:Ljava/util/List;

    .line 69
    :cond_11
    :try_start_2
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    :catch_2
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/b1;->b:Lce/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/b1;->b:Lce/e;

    .line 71
    throw p1

    .line 72
    :goto_4
    invoke-virtual {p0}, Lce/m;->m()V

    .line 73
    throw p1

    :cond_12
    and-int/lit8 p1, v4, 0x40

    if-ne p1, v5, :cond_13

    .line 74
    iget-object p1, p0, Lwd/b1;->j:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwd/b1;->j:Ljava/util/List;

    .line 75
    :cond_13
    :try_start_3
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 76
    :catch_3
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p1

    iput-object p1, p0, Lwd/b1;->b:Lce/e;

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/b1;->b:Lce/e;

    .line 77
    throw p1

    .line 78
    :goto_5
    invoke-virtual {p0}, Lce/m;->m()V

    return-void
.end method

.method public constructor <init>(Lwd/a1;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lce/m;-><init>(Lce/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lwd/b1;->l:B

    .line 3
    iput v0, p0, Lwd/b1;->m:I

    .line 4
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 5
    iput-object p1, p0, Lwd/b1;->b:Lce/e;

    return-void
.end method


# virtual methods
.method public final a()Lce/b;
    .locals 1

    .line 1
    sget-object v0, Lwd/b1;->n:Lwd/b1;

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

.method public final b()Z
    .locals 5

    .line 1
    iget-byte v0, p0, Lwd/b1;->l:B

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
    iget v0, p0, Lwd/b1;->c:I

    .line 12
    .line 13
    and-int/lit8 v3, v0, 0x2

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-ne v3, v4, :cond_8

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    and-int/2addr v0, v3

    .line 20
    if-ne v0, v3, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lwd/b1;->f:Lwd/t0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lwd/t0;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iput-byte v2, p0, Lwd/b1;->l:B

    .line 31
    .line 32
    return v2

    .line 33
    :cond_2
    iget v0, p0, Lwd/b1;->c:I

    .line 34
    .line 35
    const/16 v3, 0x10

    .line 36
    .line 37
    and-int/2addr v0, v3

    .line 38
    if-ne v0, v3, :cond_3

    .line 39
    .line 40
    iget-object v0, p0, Lwd/b1;->h:Lwd/t0;

    .line 41
    .line 42
    invoke-virtual {v0}, Lwd/t0;->b()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    iput-byte v2, p0, Lwd/b1;->l:B

    .line 49
    .line 50
    return v2

    .line 51
    :cond_3
    const/4 v0, 0x0

    .line 52
    :goto_0
    iget-object v3, p0, Lwd/b1;->j:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-ge v0, v3, :cond_5

    .line 59
    .line 60
    iget-object v3, p0, Lwd/b1;->j:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lwd/h;

    .line 67
    .line 68
    invoke-virtual {v3}, Lwd/h;->b()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    iput-byte v2, p0, Lwd/b1;->l:B

    .line 75
    .line 76
    return v2

    .line 77
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    iget v0, p0, Lwd/b1;->c:I

    .line 81
    .line 82
    const/16 v3, 0x40

    .line 83
    .line 84
    and-int/2addr v0, v3

    .line 85
    if-ne v0, v3, :cond_6

    .line 86
    .line 87
    iget-object v0, p0, Lwd/b1;->k:Lwd/e;

    .line 88
    .line 89
    invoke-virtual {v0}, Lwd/e;->b()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    iput-byte v2, p0, Lwd/b1;->l:B

    .line 96
    .line 97
    return v2

    .line 98
    :cond_6
    invoke-virtual {p0}, Lce/m;->i()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    iput-byte v2, p0, Lwd/b1;->l:B

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    iput-byte v1, p0, Lwd/b1;->l:B

    .line 108
    .line 109
    return v1

    .line 110
    :cond_8
    iput-byte v2, p0, Lwd/b1;->l:B

    .line 111
    .line 112
    return v2
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final c()I
    .locals 5

    .line 1
    iget v0, p0, Lwd/b1;->m:I

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
    iget v0, p0, Lwd/b1;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lwd/b1;->d:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lce/g;->e(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget v1, p0, Lwd/b1;->c:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lwd/b1;->e:I

    .line 29
    .line 30
    invoke-static {v3, v1}, Lce/g;->e(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Lwd/b1;->c:I

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    and-int/2addr v1, v3

    .line 39
    if-ne v1, v3, :cond_3

    .line 40
    .line 41
    const/4 v1, 0x3

    .line 42
    iget-object v4, p0, Lwd/b1;->f:Lwd/t0;

    .line 43
    .line 44
    invoke-static {v1, v4}, Lce/g;->g(ILce/b;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    :cond_3
    iget v1, p0, Lwd/b1;->c:I

    .line 50
    .line 51
    const/16 v4, 0x10

    .line 52
    .line 53
    and-int/2addr v1, v4

    .line 54
    if-ne v1, v4, :cond_4

    .line 55
    .line 56
    iget-object v1, p0, Lwd/b1;->h:Lwd/t0;

    .line 57
    .line 58
    invoke-static {v3, v1}, Lce/g;->g(ILce/b;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v0, v1

    .line 63
    :cond_4
    iget v1, p0, Lwd/b1;->c:I

    .line 64
    .line 65
    const/16 v3, 0x8

    .line 66
    .line 67
    and-int/2addr v1, v3

    .line 68
    if-ne v1, v3, :cond_5

    .line 69
    .line 70
    const/4 v1, 0x5

    .line 71
    iget v4, p0, Lwd/b1;->g:I

    .line 72
    .line 73
    invoke-static {v1, v4}, Lce/g;->e(II)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/2addr v0, v1

    .line 78
    :cond_5
    iget v1, p0, Lwd/b1;->c:I

    .line 79
    .line 80
    const/16 v4, 0x20

    .line 81
    .line 82
    and-int/2addr v1, v4

    .line 83
    if-ne v1, v4, :cond_6

    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    iget v4, p0, Lwd/b1;->i:I

    .line 87
    .line 88
    invoke-static {v1, v4}, Lce/g;->e(II)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/2addr v0, v1

    .line 93
    :cond_6
    :goto_1
    iget-object v1, p0, Lwd/b1;->j:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-ge v2, v1, :cond_7

    .line 100
    .line 101
    iget-object v1, p0, Lwd/b1;->j:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Lce/b;

    .line 108
    .line 109
    const/4 v4, 0x7

    .line 110
    invoke-static {v4, v1}, Lce/g;->g(ILce/b;)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v0, v1

    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_7
    iget v1, p0, Lwd/b1;->c:I

    .line 119
    .line 120
    const/16 v2, 0x40

    .line 121
    .line 122
    and-int/2addr v1, v2

    .line 123
    if-ne v1, v2, :cond_8

    .line 124
    .line 125
    iget-object v1, p0, Lwd/b1;->k:Lwd/e;

    .line 126
    .line 127
    invoke-static {v3, v1}, Lce/g;->g(ILce/b;)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-int/2addr v0, v1

    .line 132
    :cond_8
    invoke-virtual {p0}, Lce/m;->j()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    add-int/2addr v1, v0

    .line 137
    iget-object v0, p0, Lwd/b1;->b:Lce/e;

    .line 138
    .line 139
    invoke-virtual {v0}, Lce/e;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/2addr v0, v1

    .line 144
    iput v0, p0, Lwd/b1;->m:I

    .line 145
    .line 146
    return v0
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
.end method

.method public final d()Lce/k;
    .locals 1

    .line 1
    invoke-static {}, Lwd/a1;->h()Lwd/a1;

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
    invoke-static {}, Lwd/a1;->h()Lwd/a1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lwd/a1;->i(Lwd/b1;)V

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
    .locals 5

    .line 1
    invoke-virtual {p0}, Lwd/b1;->c()I

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/media3/exoplayer/offline/u;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/offline/u;-><init>(Lce/m;)V

    .line 7
    .line 8
    .line 9
    iget v1, p0, Lwd/b1;->c:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    and-int/2addr v1, v2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lwd/b1;->d:I

    .line 16
    .line 17
    invoke-virtual {p1, v2, v1}, Lce/g;->F(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lwd/b1;->c:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    and-int/2addr v1, v2

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget v1, p0, Lwd/b1;->e:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Lce/g;->F(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v1, p0, Lwd/b1;->c:I

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    iget-object v3, p0, Lwd/b1;->f:Lwd/t0;

    .line 39
    .line 40
    invoke-virtual {p1, v1, v3}, Lce/g;->H(ILce/b;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget v1, p0, Lwd/b1;->c:I

    .line 44
    .line 45
    const/16 v3, 0x10

    .line 46
    .line 47
    and-int/2addr v1, v3

    .line 48
    if-ne v1, v3, :cond_3

    .line 49
    .line 50
    iget-object v1, p0, Lwd/b1;->h:Lwd/t0;

    .line 51
    .line 52
    invoke-virtual {p1, v2, v1}, Lce/g;->H(ILce/b;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    iget v1, p0, Lwd/b1;->c:I

    .line 56
    .line 57
    const/16 v2, 0x8

    .line 58
    .line 59
    and-int/2addr v1, v2

    .line 60
    if-ne v1, v2, :cond_4

    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    iget v3, p0, Lwd/b1;->g:I

    .line 64
    .line 65
    invoke-virtual {p1, v1, v3}, Lce/g;->F(II)V

    .line 66
    .line 67
    .line 68
    :cond_4
    iget v1, p0, Lwd/b1;->c:I

    .line 69
    .line 70
    const/16 v3, 0x20

    .line 71
    .line 72
    and-int/2addr v1, v3

    .line 73
    if-ne v1, v3, :cond_5

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    iget v3, p0, Lwd/b1;->i:I

    .line 77
    .line 78
    invoke-virtual {p1, v1, v3}, Lce/g;->F(II)V

    .line 79
    .line 80
    .line 81
    :cond_5
    const/4 v1, 0x0

    .line 82
    :goto_0
    iget-object v3, p0, Lwd/b1;->j:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v1, v3, :cond_6

    .line 89
    .line 90
    iget-object v3, p0, Lwd/b1;->j:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lce/b;

    .line 97
    .line 98
    const/4 v4, 0x7

    .line 99
    invoke-virtual {p1, v4, v3}, Lce/g;->H(ILce/b;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    iget v1, p0, Lwd/b1;->c:I

    .line 106
    .line 107
    const/16 v3, 0x40

    .line 108
    .line 109
    and-int/2addr v1, v3

    .line 110
    if-ne v1, v3, :cond_7

    .line 111
    .line 112
    iget-object v1, p0, Lwd/b1;->k:Lwd/e;

    .line 113
    .line 114
    invoke-virtual {p1, v2, v1}, Lce/g;->H(ILce/b;)V

    .line 115
    .line 116
    .line 117
    :cond_7
    const/16 v1, 0xc8

    .line 118
    .line 119
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/offline/u;->e1(ILce/g;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lwd/b1;->b:Lce/e;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 125
    .line 126
    .line 127
    return-void
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final p()Lwd/a1;
    .locals 1

    .line 1
    invoke-static {}, Lwd/a1;->h()Lwd/a1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lwd/a1;->i(Lwd/b1;)V

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
