.class public final Lwd/y0;
.super Lce/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final m:Lwd/y0;

.field public static final n:Lwd/a;


# instance fields
.field public final b:Lce/e;

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Lwd/x0;

.field public h:Ljava/util/List;

.field public i:Ljava/util/List;

.field public j:I

.field public k:B

.field public l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwd/y0;->n:Lwd/a;

    .line 9
    .line 10
    new-instance v0, Lwd/y0;

    .line 11
    .line 12
    invoke-direct {v0}, Lwd/y0;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lwd/y0;->m:Lwd/y0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lwd/y0;->d:I

    .line 19
    .line 20
    iput v1, v0, Lwd/y0;->e:I

    .line 21
    .line 22
    iput-boolean v1, v0, Lwd/y0;->f:Z

    .line 23
    .line 24
    sget-object v1, Lwd/x0;->d:Lwd/x0;

    .line 25
    .line 26
    iput-object v1, v0, Lwd/y0;->g:Lwd/x0;

    .line 27
    .line 28
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 29
    .line 30
    iput-object v1, v0, Lwd/y0;->h:Ljava/util/List;

    .line 31
    .line 32
    iput-object v1, v0, Lwd/y0;->i:Ljava/util/List;

    .line 33
    .line 34
    return-void
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

    .line 7
    invoke-direct {p0}, Lce/m;-><init>()V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lwd/y0;->j:I

    .line 9
    iput-byte v0, p0, Lwd/y0;->k:B

    .line 10
    iput v0, p0, Lwd/y0;->l:I

    .line 11
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lwd/y0;->b:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;Lce/i;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 12
    invoke-direct {v1}, Lce/m;-><init>()V

    const/4 v3, -0x1

    .line 13
    iput v3, v1, Lwd/y0;->j:I

    .line 14
    iput-byte v3, v1, Lwd/y0;->k:B

    .line 15
    iput v3, v1, Lwd/y0;->l:I

    const/4 v3, 0x0

    .line 16
    iput v3, v1, Lwd/y0;->d:I

    .line 17
    iput v3, v1, Lwd/y0;->e:I

    .line 18
    iput-boolean v3, v1, Lwd/y0;->f:Z

    .line 19
    sget-object v4, Lwd/x0;->d:Lwd/x0;

    iput-object v4, v1, Lwd/y0;->g:Lwd/x0;

    .line 20
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v5, v1, Lwd/y0;->h:Ljava/util/List;

    .line 21
    iput-object v5, v1, Lwd/y0;->i:Ljava/util/List;

    .line 22
    new-instance v5, Lce/d;

    invoke-direct {v5}, Lce/d;-><init>()V

    const/4 v6, 0x1

    .line 23
    invoke-static {v5, v6}, Lce/g;->u(Ljava/io/OutputStream;I)Lce/g;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    :cond_0
    :goto_0
    const/16 v10, 0x10

    const/16 v11, 0x20

    if-nez v8, :cond_14

    .line 24
    :try_start_0
    invoke-virtual {v0}, Lce/f;->n()I

    move-result v12

    if-eqz v12, :cond_1

    const/16 v13, 0x8

    if-eq v12, v13, :cond_11

    const/4 v14, 0x2

    if-eq v12, v10, :cond_10

    const/16 v15, 0x18

    if-eq v12, v15, :cond_e

    if-eq v12, v11, :cond_9

    const/16 v13, 0x2a

    if-eq v12, v13, :cond_7

    const/16 v13, 0x30

    if-eq v12, v13, :cond_5

    const/16 v13, 0x32

    if-eq v12, v13, :cond_2

    .line 25
    invoke-virtual {v1, v0, v7, v2, v12}, Lce/m;->n(Lce/f;Lce/g;Lce/i;I)Z

    move-result v10

    if-nez v10, :cond_0

    :cond_1
    const/4 v8, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    goto/16 :goto_5

    .line 26
    :cond_2
    invoke-virtual {v0}, Lce/f;->k()I

    move-result v12

    .line 27
    invoke-virtual {v0, v12}, Lce/f;->d(I)I

    move-result v12

    and-int/lit8 v13, v9, 0x20

    if-eq v13, v11, :cond_3

    .line 28
    invoke-virtual {v0}, Lce/f;->b()I

    move-result v13

    if-lez v13, :cond_3

    .line 29
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, v1, Lwd/y0;->i:Ljava/util/List;

    or-int/lit8 v9, v9, 0x20

    .line 30
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lce/f;->b()I

    move-result v13

    if-lez v13, :cond_4

    .line 31
    iget-object v13, v1, Lwd/y0;->i:Ljava/util/List;

    .line 32
    invoke-virtual {v0}, Lce/f;->k()I

    move-result v14

    .line 33
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_4
    invoke-virtual {v0, v12}, Lce/f;->c(I)V

    goto :goto_0

    :cond_5
    and-int/lit8 v12, v9, 0x20

    if-eq v12, v11, :cond_6

    .line 35
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lwd/y0;->i:Ljava/util/List;

    or-int/lit8 v9, v9, 0x20

    .line 36
    :cond_6
    iget-object v12, v1, Lwd/y0;->i:Ljava/util/List;

    .line 37
    invoke-virtual {v0}, Lce/f;->k()I

    move-result v13

    .line 38
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    and-int/lit8 v12, v9, 0x10

    if-eq v12, v10, :cond_8

    .line 39
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lwd/y0;->h:Ljava/util/List;

    or-int/lit8 v9, v9, 0x10

    .line 40
    :cond_8
    iget-object v12, v1, Lwd/y0;->h:Ljava/util/List;

    sget-object v13, Lwd/t0;->u:Lwd/a;

    invoke-virtual {v0, v13, v2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 41
    :cond_9
    invoke-virtual {v0}, Lce/f;->k()I

    move-result v15

    if-eqz v15, :cond_c

    if-eq v15, v6, :cond_b

    if-eq v15, v14, :cond_a

    const/4 v14, 0x0

    goto :goto_2

    :cond_a
    move-object v14, v4

    goto :goto_2

    .line 42
    :cond_b
    sget-object v14, Lwd/x0;->c:Lwd/x0;

    goto :goto_2

    .line 43
    :cond_c
    sget-object v14, Lwd/x0;->b:Lwd/x0;

    :goto_2
    if-nez v14, :cond_d

    .line 44
    invoke-virtual {v7, v12}, Lce/g;->O(I)V

    .line 45
    invoke-virtual {v7, v15}, Lce/g;->O(I)V

    goto/16 :goto_0

    .line 46
    :cond_d
    iget v12, v1, Lwd/y0;->c:I

    or-int/2addr v12, v13

    iput v12, v1, Lwd/y0;->c:I

    .line 47
    iput-object v14, v1, Lwd/y0;->g:Lwd/x0;

    goto/16 :goto_0

    .line 48
    :cond_e
    iget v12, v1, Lwd/y0;->c:I

    or-int/lit8 v12, v12, 0x4

    iput v12, v1, Lwd/y0;->c:I

    .line 49
    invoke-virtual {v0}, Lce/f;->l()J

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmp-long v16, v12, v14

    if-eqz v16, :cond_f

    const/4 v12, 0x1

    goto :goto_3

    :cond_f
    const/4 v12, 0x0

    .line 50
    :goto_3
    iput-boolean v12, v1, Lwd/y0;->f:Z

    goto/16 :goto_0

    .line 51
    :cond_10
    iget v12, v1, Lwd/y0;->c:I

    or-int/2addr v12, v14

    iput v12, v1, Lwd/y0;->c:I

    .line 52
    invoke-virtual {v0}, Lce/f;->k()I

    move-result v12

    .line 53
    iput v12, v1, Lwd/y0;->e:I

    goto/16 :goto_0

    .line 54
    :cond_11
    iget v12, v1, Lwd/y0;->c:I

    or-int/2addr v12, v6

    iput v12, v1, Lwd/y0;->c:I

    .line 55
    invoke-virtual {v0}, Lce/f;->k()I

    move-result v12

    .line 56
    iput v12, v1, Lwd/y0;->d:I
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 57
    :goto_4
    :try_start_1
    new-instance v2, Lce/s;

    .line 58
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 59
    iput-object v1, v2, Lce/s;->a:Lce/b;

    .line 60
    throw v2

    .line 61
    :goto_5
    iput-object v1, v0, Lce/s;->a:Lce/b;

    .line 62
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    and-int/lit8 v2, v9, 0x10

    if-ne v2, v10, :cond_12

    .line 63
    iget-object v2, v1, Lwd/y0;->h:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lwd/y0;->h:Ljava/util/List;

    :cond_12
    and-int/lit8 v2, v9, 0x20

    if-ne v2, v11, :cond_13

    .line 64
    iget-object v2, v1, Lwd/y0;->i:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lwd/y0;->i:Ljava/util/List;

    .line 65
    :cond_13
    :try_start_2
    invoke-virtual {v7}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    :catch_2
    invoke-virtual {v5}, Lce/d;->i()Lce/e;

    move-result-object v2

    iput-object v2, v1, Lwd/y0;->b:Lce/e;

    goto :goto_7

    :catchall_1
    move-exception v0

    invoke-virtual {v5}, Lce/d;->i()Lce/e;

    move-result-object v2

    iput-object v2, v1, Lwd/y0;->b:Lce/e;

    .line 67
    throw v0

    .line 68
    :goto_7
    invoke-virtual {v1}, Lce/m;->m()V

    .line 69
    throw v0

    :cond_14
    and-int/lit8 v0, v9, 0x10

    if-ne v0, v10, :cond_15

    .line 70
    iget-object v0, v1, Lwd/y0;->h:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lwd/y0;->h:Ljava/util/List;

    :cond_15
    and-int/lit8 v0, v9, 0x20

    if-ne v0, v11, :cond_16

    .line 71
    iget-object v0, v1, Lwd/y0;->i:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lwd/y0;->i:Ljava/util/List;

    .line 72
    :cond_16
    :try_start_3
    invoke-virtual {v7}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 73
    :catch_3
    invoke-virtual {v5}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, v1, Lwd/y0;->b:Lce/e;

    goto :goto_8

    :catchall_2
    move-exception v0

    invoke-virtual {v5}, Lce/d;->i()Lce/e;

    move-result-object v2

    iput-object v2, v1, Lwd/y0;->b:Lce/e;

    .line 74
    throw v0

    .line 75
    :goto_8
    invoke-virtual {v1}, Lce/m;->m()V

    return-void
.end method

.method public constructor <init>(Lwd/w0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lce/m;-><init>(Lce/l;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lwd/y0;->j:I

    .line 3
    iput-byte v0, p0, Lwd/y0;->k:B

    .line 4
    iput v0, p0, Lwd/y0;->l:I

    .line 5
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 6
    iput-object p1, p0, Lwd/y0;->b:Lce/e;

    return-void
.end method


# virtual methods
.method public final a()Lce/b;
    .locals 1

    .line 1
    sget-object v0, Lwd/y0;->m:Lwd/y0;

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
    .locals 4

    .line 1
    iget-byte v0, p0, Lwd/y0;->k:B

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
    iget v0, p0, Lwd/y0;->c:I

    .line 12
    .line 13
    and-int/lit8 v3, v0, 0x1

    .line 14
    .line 15
    if-ne v3, v1, :cond_6

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    and-int/2addr v0, v3

    .line 19
    if-ne v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v3, p0, Lwd/y0;->h:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v0, v3, :cond_3

    .line 29
    .line 30
    iget-object v3, p0, Lwd/y0;->h:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lwd/t0;

    .line 37
    .line 38
    invoke-virtual {v3}, Lwd/t0;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    iput-byte v2, p0, Lwd/y0;->k:B

    .line 45
    .line 46
    return v2

    .line 47
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {p0}, Lce/m;->i()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    iput-byte v2, p0, Lwd/y0;->k:B

    .line 57
    .line 58
    return v2

    .line 59
    :cond_4
    iput-byte v1, p0, Lwd/y0;->k:B

    .line 60
    .line 61
    return v1

    .line 62
    :cond_5
    iput-byte v2, p0, Lwd/y0;->k:B

    .line 63
    .line 64
    return v2

    .line 65
    :cond_6
    iput-byte v2, p0, Lwd/y0;->k:B

    .line 66
    .line 67
    return v2
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
    .locals 5

    .line 1
    iget v0, p0, Lwd/y0;->l:I

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
    iget v0, p0, Lwd/y0;->c:I

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
    iget v0, p0, Lwd/y0;->d:I

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
    iget v3, p0, Lwd/y0;->c:I

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    and-int/2addr v3, v4

    .line 26
    if-ne v3, v4, :cond_2

    .line 27
    .line 28
    iget v3, p0, Lwd/y0;->e:I

    .line 29
    .line 30
    invoke-static {v4, v3}, Lce/g;->e(II)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    add-int/2addr v0, v3

    .line 35
    :cond_2
    iget v3, p0, Lwd/y0;->c:I

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    and-int/2addr v3, v4

    .line 39
    if-ne v3, v4, :cond_3

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    invoke-static {v3}, Lce/g;->k(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr v3, v1

    .line 47
    add-int/2addr v0, v3

    .line 48
    :cond_3
    iget v1, p0, Lwd/y0;->c:I

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
    iget-object v1, p0, Lwd/y0;->g:Lwd/x0;

    .line 56
    .line 57
    iget v1, v1, Lwd/x0;->a:I

    .line 58
    .line 59
    invoke-static {v4, v1}, Lce/g;->d(II)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    add-int/2addr v0, v1

    .line 64
    :cond_4
    const/4 v1, 0x0

    .line 65
    :goto_1
    iget-object v3, p0, Lwd/y0;->h:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ge v1, v3, :cond_5

    .line 72
    .line 73
    iget-object v3, p0, Lwd/y0;->h:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lce/b;

    .line 80
    .line 81
    const/4 v4, 0x5

    .line 82
    invoke-static {v4, v3}, Lce/g;->g(ILce/b;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/2addr v0, v3

    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    const/4 v1, 0x0

    .line 91
    :goto_2
    iget-object v3, p0, Lwd/y0;->i:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-ge v2, v3, :cond_6

    .line 98
    .line 99
    iget-object v3, p0, Lwd/y0;->i:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-static {v3}, Lce/g;->f(I)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    add-int/2addr v1, v3

    .line 116
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    add-int/2addr v0, v1

    .line 120
    iget-object v2, p0, Lwd/y0;->i:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    invoke-static {v1}, Lce/g;->f(I)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    add-int/2addr v0, v2

    .line 135
    :cond_7
    iput v1, p0, Lwd/y0;->j:I

    .line 136
    .line 137
    invoke-virtual {p0}, Lce/m;->j()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr v1, v0

    .line 142
    iget-object v0, p0, Lwd/y0;->b:Lce/e;

    .line 143
    .line 144
    invoke-virtual {v0}, Lce/e;->size()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    add-int/2addr v0, v1

    .line 149
    iput v0, p0, Lwd/y0;->l:I

    .line 150
    .line 151
    return v0
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
    invoke-static {}, Lwd/w0;->h()Lwd/w0;

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
    invoke-static {}, Lwd/w0;->h()Lwd/w0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lwd/w0;->i(Lwd/y0;)V

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
    invoke-virtual {p0}, Lwd/y0;->c()I

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
    iget v1, p0, Lwd/y0;->c:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    and-int/2addr v1, v2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lwd/y0;->d:I

    .line 16
    .line 17
    invoke-virtual {p1, v2, v1}, Lce/g;->F(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lwd/y0;->c:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    and-int/2addr v1, v2

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget v1, p0, Lwd/y0;->e:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Lce/g;->F(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v1, p0, Lwd/y0;->c:I

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    and-int/2addr v1, v2

    .line 35
    const/4 v3, 0x0

    .line 36
    if-ne v1, v2, :cond_2

    .line 37
    .line 38
    iget-boolean v1, p0, Lwd/y0;->f:Z

    .line 39
    .line 40
    const/4 v4, 0x3

    .line 41
    invoke-virtual {p1, v4, v3}, Lce/g;->Q(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v1}, Lce/g;->J(I)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v1, p0, Lwd/y0;->c:I

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    and-int/2addr v1, v4

    .line 52
    if-ne v1, v4, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, Lwd/y0;->g:Lwd/x0;

    .line 55
    .line 56
    iget v1, v1, Lwd/x0;->a:I

    .line 57
    .line 58
    invoke-virtual {p1, v2, v1}, Lce/g;->E(II)V

    .line 59
    .line 60
    .line 61
    :cond_3
    const/4 v1, 0x0

    .line 62
    :goto_0
    iget-object v2, p0, Lwd/y0;->h:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-ge v1, v2, :cond_4

    .line 69
    .line 70
    iget-object v2, p0, Lwd/y0;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lce/b;

    .line 77
    .line 78
    const/4 v4, 0x5

    .line 79
    invoke-virtual {p1, v4, v2}, Lce/g;->H(ILce/b;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    iget-object v1, p0, Lwd/y0;->i:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-lez v1, :cond_5

    .line 92
    .line 93
    const/16 v1, 0x32

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lce/g;->O(I)V

    .line 96
    .line 97
    .line 98
    iget v1, p0, Lwd/y0;->j:I

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lce/g;->O(I)V

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_1
    iget-object v1, p0, Lwd/y0;->i:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-ge v3, v1, :cond_6

    .line 110
    .line 111
    iget-object v1, p0, Lwd/y0;->i:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {p1, v1}, Lce/g;->G(I)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    const/16 v1, 0x3e8

    .line 130
    .line 131
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/offline/u;->e1(ILce/g;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lwd/y0;->b:Lce/e;

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 137
    .line 138
    .line 139
    return-void
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
