.class public final Lwd/v0;
.super Lce/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final p:Lwd/v0;

.field public static final q:Lwd/a;


# instance fields
.field public final b:Lce/e;

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/util/List;

.field public g:Lwd/t0;

.field public h:I

.field public i:Lwd/t0;

.field public j:I

.field public k:Ljava/util/List;

.field public l:Ljava/util/List;

.field public m:Ljava/util/List;

.field public n:B

.field public o:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lwd/v0;->q:Lwd/a;

    .line 9
    .line 10
    new-instance v0, Lwd/v0;

    .line 11
    .line 12
    invoke-direct {v0}, Lwd/v0;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lwd/v0;->p:Lwd/v0;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    iput v1, v0, Lwd/v0;->d:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput v1, v0, Lwd/v0;->e:I

    .line 22
    .line 23
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    iput-object v2, v0, Lwd/v0;->f:Ljava/util/List;

    .line 26
    .line 27
    sget-object v3, Lwd/t0;->t:Lwd/t0;

    .line 28
    .line 29
    iput-object v3, v0, Lwd/v0;->g:Lwd/t0;

    .line 30
    .line 31
    iput v1, v0, Lwd/v0;->h:I

    .line 32
    .line 33
    iput-object v3, v0, Lwd/v0;->i:Lwd/t0;

    .line 34
    .line 35
    iput v1, v0, Lwd/v0;->j:I

    .line 36
    .line 37
    iput-object v2, v0, Lwd/v0;->k:Ljava/util/List;

    .line 38
    .line 39
    iput-object v2, v0, Lwd/v0;->l:Ljava/util/List;

    .line 40
    .line 41
    iput-object v2, v0, Lwd/v0;->m:Ljava/util/List;

    .line 42
    .line 43
    return-void
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
    iput-byte v0, p0, Lwd/v0;->n:B

    .line 8
    iput v0, p0, Lwd/v0;->o:I

    .line 9
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lwd/v0;->b:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;Lce/i;)V
    .locals 12

    .line 10
    invoke-direct {p0}, Lce/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput-byte v0, p0, Lwd/v0;->n:B

    .line 12
    iput v0, p0, Lwd/v0;->o:I

    const/4 v0, 0x6

    .line 13
    iput v0, p0, Lwd/v0;->d:I

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lwd/v0;->e:I

    .line 15
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lwd/v0;->f:Ljava/util/List;

    .line 16
    sget-object v2, Lwd/t0;->t:Lwd/t0;

    .line 17
    iput-object v2, p0, Lwd/v0;->g:Lwd/t0;

    .line 18
    iput v0, p0, Lwd/v0;->h:I

    .line 19
    iput-object v2, p0, Lwd/v0;->i:Lwd/t0;

    .line 20
    iput v0, p0, Lwd/v0;->j:I

    .line 21
    iput-object v1, p0, Lwd/v0;->k:Ljava/util/List;

    .line 22
    iput-object v1, p0, Lwd/v0;->l:Ljava/util/List;

    .line 23
    iput-object v1, p0, Lwd/v0;->m:Ljava/util/List;

    .line 24
    new-instance v1, Lce/d;

    invoke-direct {v1}, Lce/d;-><init>()V

    const/4 v2, 0x1

    .line 25
    invoke-static {v1, v2}, Lce/g;->u(Ljava/io/OutputStream;I)Lce/g;

    move-result-object v3

    const/4 v4, 0x0

    :cond_0
    :goto_0
    const/16 v5, 0x80

    const/16 v6, 0x200

    const/4 v7, 0x4

    const/16 v8, 0x100

    if-nez v0, :cond_f

    .line 26
    :try_start_0
    invoke-virtual {p1}, Lce/f;->n()I

    move-result v9

    const/4 v10, 0x0

    sparse-switch v9, :sswitch_data_0

    .line 27
    invoke-virtual {p0, p1, v3, p2, v9}, Lce/m;->n(Lce/f;Lce/g;Lce/i;I)Z

    move-result v5

    if-nez v5, :cond_0

    :sswitch_0
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :sswitch_1
    and-int/lit16 v9, v4, 0x200

    if-eq v9, v6, :cond_1

    .line 28
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lwd/v0;->m:Ljava/util/List;

    or-int/lit16 v4, v4, 0x200

    .line 29
    :cond_1
    iget-object v9, p0, Lwd/v0;->m:Ljava/util/List;

    sget-object v10, Lwd/l;->h:Lwd/a;

    invoke-virtual {p1, v10, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :sswitch_2
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v9

    .line 31
    invoke-virtual {p1, v9}, Lce/f;->d(I)I

    move-result v9

    and-int/lit16 v10, v4, 0x100

    if-eq v10, v8, :cond_2

    .line 32
    invoke-virtual {p1}, Lce/f;->b()I

    move-result v10

    if-lez v10, :cond_2

    .line 33
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lwd/v0;->l:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 34
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lce/f;->b()I

    move-result v10

    if-lez v10, :cond_3

    .line 35
    iget-object v10, p0, Lwd/v0;->l:Ljava/util/List;

    .line 36
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v11

    .line 37
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 38
    :cond_3
    invoke-virtual {p1, v9}, Lce/f;->c(I)V

    goto :goto_0

    :sswitch_3
    and-int/lit16 v9, v4, 0x100

    if-eq v9, v8, :cond_4

    .line 39
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lwd/v0;->l:Ljava/util/List;

    or-int/lit16 v4, v4, 0x100

    .line 40
    :cond_4
    iget-object v9, p0, Lwd/v0;->l:Ljava/util/List;

    .line 41
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v10

    .line 42
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :sswitch_4
    and-int/lit16 v9, v4, 0x80

    if-eq v9, v5, :cond_5

    .line 43
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lwd/v0;->k:Ljava/util/List;

    or-int/lit16 v4, v4, 0x80

    .line 44
    :cond_5
    iget-object v9, p0, Lwd/v0;->k:Ljava/util/List;

    sget-object v10, Lwd/h;->h:Lwd/a;

    invoke-virtual {p1, v10, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 45
    :sswitch_5
    iget v9, p0, Lwd/v0;->c:I

    or-int/lit8 v9, v9, 0x20

    iput v9, p0, Lwd/v0;->c:I

    .line 46
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v9

    .line 47
    iput v9, p0, Lwd/v0;->j:I

    goto/16 :goto_0

    .line 48
    :sswitch_6
    iget v9, p0, Lwd/v0;->c:I

    const/16 v11, 0x10

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_6

    .line 49
    iget-object v9, p0, Lwd/v0;->i:Lwd/t0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-static {v9}, Lwd/t0;->r(Lwd/t0;)Lwd/s0;

    move-result-object v10

    .line 51
    :cond_6
    sget-object v9, Lwd/t0;->u:Lwd/a;

    invoke-virtual {p1, v9, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v9

    check-cast v9, Lwd/t0;

    iput-object v9, p0, Lwd/v0;->i:Lwd/t0;

    if-eqz v10, :cond_7

    .line 52
    invoke-virtual {v10, v9}, Lwd/s0;->i(Lwd/t0;)Lwd/s0;

    .line 53
    invoke-virtual {v10}, Lwd/s0;->g()Lwd/t0;

    move-result-object v9

    iput-object v9, p0, Lwd/v0;->i:Lwd/t0;

    .line 54
    :cond_7
    iget v9, p0, Lwd/v0;->c:I

    or-int/2addr v9, v11

    iput v9, p0, Lwd/v0;->c:I

    goto/16 :goto_0

    .line 55
    :sswitch_7
    iget v9, p0, Lwd/v0;->c:I

    or-int/lit8 v9, v9, 0x8

    iput v9, p0, Lwd/v0;->c:I

    .line 56
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v9

    .line 57
    iput v9, p0, Lwd/v0;->h:I

    goto/16 :goto_0

    .line 58
    :sswitch_8
    iget v9, p0, Lwd/v0;->c:I

    and-int/2addr v9, v7

    if-ne v9, v7, :cond_8

    .line 59
    iget-object v9, p0, Lwd/v0;->g:Lwd/t0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-static {v9}, Lwd/t0;->r(Lwd/t0;)Lwd/s0;

    move-result-object v10

    .line 61
    :cond_8
    sget-object v9, Lwd/t0;->u:Lwd/a;

    invoke-virtual {p1, v9, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v9

    check-cast v9, Lwd/t0;

    iput-object v9, p0, Lwd/v0;->g:Lwd/t0;

    if-eqz v10, :cond_9

    .line 62
    invoke-virtual {v10, v9}, Lwd/s0;->i(Lwd/t0;)Lwd/s0;

    .line 63
    invoke-virtual {v10}, Lwd/s0;->g()Lwd/t0;

    move-result-object v9

    iput-object v9, p0, Lwd/v0;->g:Lwd/t0;

    .line 64
    :cond_9
    iget v9, p0, Lwd/v0;->c:I

    or-int/2addr v9, v7

    iput v9, p0, Lwd/v0;->c:I

    goto/16 :goto_0

    :sswitch_9
    and-int/lit8 v9, v4, 0x4

    if-eq v9, v7, :cond_a

    .line 65
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, p0, Lwd/v0;->f:Ljava/util/List;

    or-int/lit8 v4, v4, 0x4

    .line 66
    :cond_a
    iget-object v9, p0, Lwd/v0;->f:Ljava/util/List;

    sget-object v10, Lwd/y0;->n:Lwd/a;

    invoke-virtual {p1, v10, p2}, Lce/f;->g(Lce/y;Lce/i;)Lce/b;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 67
    :sswitch_a
    iget v9, p0, Lwd/v0;->c:I

    or-int/lit8 v9, v9, 0x2

    iput v9, p0, Lwd/v0;->c:I

    .line 68
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v9

    .line 69
    iput v9, p0, Lwd/v0;->e:I

    goto/16 :goto_0

    .line 70
    :sswitch_b
    iget v9, p0, Lwd/v0;->c:I

    or-int/2addr v9, v2

    iput v9, p0, Lwd/v0;->c:I

    .line 71
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v9

    .line 72
    iput v9, p0, Lwd/v0;->d:I
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 73
    :goto_2
    :try_start_1
    new-instance p2, Lce/s;

    .line 74
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 75
    iput-object p0, p2, Lce/s;->a:Lce/b;

    .line 76
    throw p2

    .line 77
    :goto_3
    iput-object p0, p1, Lce/s;->a:Lce/b;

    .line 78
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    and-int/lit8 p2, v4, 0x4

    if-ne p2, v7, :cond_b

    .line 79
    iget-object p2, p0, Lwd/v0;->f:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->f:Ljava/util/List;

    :cond_b
    and-int/lit16 p2, v4, 0x80

    if-ne p2, v5, :cond_c

    .line 80
    iget-object p2, p0, Lwd/v0;->k:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->k:Ljava/util/List;

    :cond_c
    and-int/lit16 p2, v4, 0x100

    if-ne p2, v8, :cond_d

    .line 81
    iget-object p2, p0, Lwd/v0;->l:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->l:Ljava/util/List;

    :cond_d
    and-int/lit16 p2, v4, 0x200

    if-ne p2, v6, :cond_e

    .line 82
    iget-object p2, p0, Lwd/v0;->m:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->m:Ljava/util/List;

    .line 83
    :cond_e
    :try_start_2
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    :catch_2
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->b:Lce/e;

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->b:Lce/e;

    .line 85
    throw p1

    .line 86
    :goto_5
    invoke-virtual {p0}, Lce/m;->m()V

    .line 87
    throw p1

    :cond_f
    and-int/lit8 p1, v4, 0x4

    if-ne p1, v7, :cond_10

    .line 88
    iget-object p1, p0, Lwd/v0;->f:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwd/v0;->f:Ljava/util/List;

    :cond_10
    and-int/lit16 p1, v4, 0x80

    if-ne p1, v5, :cond_11

    .line 89
    iget-object p1, p0, Lwd/v0;->k:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwd/v0;->k:Ljava/util/List;

    :cond_11
    and-int/lit16 p1, v4, 0x100

    if-ne p1, v8, :cond_12

    .line 90
    iget-object p1, p0, Lwd/v0;->l:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwd/v0;->l:Ljava/util/List;

    :cond_12
    and-int/lit16 p1, v4, 0x200

    if-ne p1, v6, :cond_13

    .line 91
    iget-object p1, p0, Lwd/v0;->m:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwd/v0;->m:Ljava/util/List;

    .line 92
    :cond_13
    :try_start_3
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 93
    :catch_3
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p1

    iput-object p1, p0, Lwd/v0;->b:Lce/e;

    goto :goto_6

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p2

    iput-object p2, p0, Lwd/v0;->b:Lce/e;

    .line 94
    throw p1

    .line 95
    :goto_6
    invoke-virtual {p0}, Lce/m;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_b
        0x10 -> :sswitch_a
        0x1a -> :sswitch_9
        0x22 -> :sswitch_8
        0x28 -> :sswitch_7
        0x32 -> :sswitch_6
        0x38 -> :sswitch_5
        0x42 -> :sswitch_4
        0xf8 -> :sswitch_3
        0xfa -> :sswitch_2
        0x102 -> :sswitch_1
    .end sparse-switch
.end method

.method public constructor <init>(Lwd/u0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lce/m;-><init>(Lce/l;)V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lwd/v0;->n:B

    .line 3
    iput v0, p0, Lwd/v0;->o:I

    .line 4
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 5
    iput-object p1, p0, Lwd/v0;->b:Lce/e;

    return-void
.end method


# virtual methods
.method public final a()Lce/b;
    .locals 1

    .line 1
    sget-object v0, Lwd/v0;->p:Lwd/v0;

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
    iget-byte v0, p0, Lwd/v0;->n:B

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
    iget v0, p0, Lwd/v0;->c:I

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    and-int/2addr v0, v3

    .line 15
    if-ne v0, v3, :cond_b

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :goto_0
    iget-object v3, p0, Lwd/v0;->f:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v0, v3, :cond_3

    .line 25
    .line 26
    iget-object v3, p0, Lwd/v0;->f:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lwd/y0;

    .line 33
    .line 34
    invoke-virtual {v3}, Lwd/y0;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 41
    .line 42
    return v2

    .line 43
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget v0, p0, Lwd/v0;->c:I

    .line 47
    .line 48
    const/4 v3, 0x4

    .line 49
    and-int/2addr v0, v3

    .line 50
    if-ne v0, v3, :cond_4

    .line 51
    .line 52
    iget-object v0, p0, Lwd/v0;->g:Lwd/t0;

    .line 53
    .line 54
    invoke-virtual {v0}, Lwd/t0;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 61
    .line 62
    return v2

    .line 63
    :cond_4
    iget v0, p0, Lwd/v0;->c:I

    .line 64
    .line 65
    const/16 v3, 0x10

    .line 66
    .line 67
    and-int/2addr v0, v3

    .line 68
    if-ne v0, v3, :cond_5

    .line 69
    .line 70
    iget-object v0, p0, Lwd/v0;->i:Lwd/t0;

    .line 71
    .line 72
    invoke-virtual {v0}, Lwd/t0;->b()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 79
    .line 80
    return v2

    .line 81
    :cond_5
    const/4 v0, 0x0

    .line 82
    :goto_1
    iget-object v3, p0, Lwd/v0;->k:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-ge v0, v3, :cond_7

    .line 89
    .line 90
    iget-object v3, p0, Lwd/v0;->k:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lwd/h;

    .line 97
    .line 98
    invoke-virtual {v3}, Lwd/h;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_6

    .line 103
    .line 104
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 105
    .line 106
    return v2

    .line 107
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    const/4 v0, 0x0

    .line 111
    :goto_2
    iget-object v3, p0, Lwd/v0;->m:Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-ge v0, v3, :cond_9

    .line 118
    .line 119
    iget-object v3, p0, Lwd/v0;->m:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Lwd/l;

    .line 126
    .line 127
    invoke-virtual {v3}, Lwd/l;->b()Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-nez v3, :cond_8

    .line 132
    .line 133
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 134
    .line 135
    return v2

    .line 136
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_9
    invoke-virtual {p0}, Lce/m;->i()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_a

    .line 144
    .line 145
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 146
    .line 147
    return v2

    .line 148
    :cond_a
    iput-byte v1, p0, Lwd/v0;->n:B

    .line 149
    .line 150
    return v1

    .line 151
    :cond_b
    iput-byte v2, p0, Lwd/v0;->n:B

    .line 152
    .line 153
    return v2
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
    .locals 7

    .line 1
    iget v0, p0, Lwd/v0;->o:I

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
    iget v0, p0, Lwd/v0;->c:I

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
    iget v0, p0, Lwd/v0;->d:I

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
    iget v1, p0, Lwd/v0;->c:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lwd/v0;->e:I

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
    const/4 v1, 0x0

    .line 36
    :goto_1
    iget-object v4, p0, Lwd/v0;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ge v1, v4, :cond_3

    .line 43
    .line 44
    iget-object v4, p0, Lwd/v0;->f:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lce/b;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    invoke-static {v5, v4}, Lce/g;->g(ILce/b;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    add-int/2addr v0, v4

    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget v1, p0, Lwd/v0;->c:I

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    and-int/2addr v1, v4

    .line 65
    if-ne v1, v4, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lwd/v0;->g:Lwd/t0;

    .line 68
    .line 69
    invoke-static {v4, v1}, Lce/g;->g(ILce/b;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v0, v1

    .line 74
    :cond_4
    iget v1, p0, Lwd/v0;->c:I

    .line 75
    .line 76
    const/16 v4, 0x8

    .line 77
    .line 78
    and-int/2addr v1, v4

    .line 79
    if-ne v1, v4, :cond_5

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    iget v5, p0, Lwd/v0;->h:I

    .line 83
    .line 84
    invoke-static {v1, v5}, Lce/g;->e(II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    add-int/2addr v0, v1

    .line 89
    :cond_5
    iget v1, p0, Lwd/v0;->c:I

    .line 90
    .line 91
    const/16 v5, 0x10

    .line 92
    .line 93
    and-int/2addr v1, v5

    .line 94
    if-ne v1, v5, :cond_6

    .line 95
    .line 96
    const/4 v1, 0x6

    .line 97
    iget-object v5, p0, Lwd/v0;->i:Lwd/t0;

    .line 98
    .line 99
    invoke-static {v1, v5}, Lce/g;->g(ILce/b;)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    :cond_6
    iget v1, p0, Lwd/v0;->c:I

    .line 105
    .line 106
    const/16 v5, 0x20

    .line 107
    .line 108
    and-int/2addr v1, v5

    .line 109
    if-ne v1, v5, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x7

    .line 112
    iget v6, p0, Lwd/v0;->j:I

    .line 113
    .line 114
    invoke-static {v1, v6}, Lce/g;->e(II)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    add-int/2addr v0, v1

    .line 119
    :cond_7
    const/4 v1, 0x0

    .line 120
    :goto_2
    iget-object v6, p0, Lwd/v0;->k:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-ge v1, v6, :cond_8

    .line 127
    .line 128
    iget-object v6, p0, Lwd/v0;->k:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, Lce/b;

    .line 135
    .line 136
    invoke-static {v4, v6}, Lce/g;->g(ILce/b;)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    add-int/2addr v0, v6

    .line 141
    add-int/lit8 v1, v1, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    const/4 v1, 0x0

    .line 145
    const/4 v4, 0x0

    .line 146
    :goto_3
    iget-object v6, p0, Lwd/v0;->l:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-ge v1, v6, :cond_9

    .line 153
    .line 154
    iget-object v6, p0, Lwd/v0;->l:Ljava/util/List;

    .line 155
    .line 156
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-static {v6}, Lce/g;->f(I)I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    add-int/2addr v4, v6

    .line 171
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_9
    add-int/2addr v0, v4

    .line 175
    iget-object v1, p0, Lwd/v0;->l:Ljava/util/List;

    .line 176
    .line 177
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    mul-int/lit8 v1, v1, 0x2

    .line 182
    .line 183
    add-int/2addr v1, v0

    .line 184
    :goto_4
    iget-object v0, p0, Lwd/v0;->m:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-ge v2, v0, :cond_a

    .line 191
    .line 192
    iget-object v0, p0, Lwd/v0;->m:Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Lce/b;

    .line 199
    .line 200
    invoke-static {v5, v0}, Lce/g;->g(ILce/b;)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    add-int/2addr v1, v0

    .line 205
    add-int/lit8 v2, v2, 0x1

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_a
    invoke-virtual {p0}, Lce/m;->j()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    add-int/2addr v0, v1

    .line 213
    iget-object v1, p0, Lwd/v0;->b:Lce/e;

    .line 214
    .line 215
    invoke-virtual {v1}, Lce/e;->size()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    add-int/2addr v1, v0

    .line 220
    iput v1, p0, Lwd/v0;->o:I

    .line 221
    .line 222
    return v1
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
    invoke-static {}, Lwd/u0;->h()Lwd/u0;

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
    invoke-static {}, Lwd/u0;->h()Lwd/u0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lwd/u0;->i(Lwd/v0;)V

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
    .locals 6

    .line 1
    invoke-virtual {p0}, Lwd/v0;->c()I

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
    iget v1, p0, Lwd/v0;->c:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    and-int/2addr v1, v2

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lwd/v0;->d:I

    .line 16
    .line 17
    invoke-virtual {p1, v2, v1}, Lce/g;->F(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v1, p0, Lwd/v0;->c:I

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    and-int/2addr v1, v2

    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    iget v1, p0, Lwd/v0;->e:I

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Lce/g;->F(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_0
    iget-object v3, p0, Lwd/v0;->f:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ge v2, v3, :cond_2

    .line 40
    .line 41
    iget-object v3, p0, Lwd/v0;->f:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lce/b;

    .line 48
    .line 49
    const/4 v4, 0x3

    .line 50
    invoke-virtual {p1, v4, v3}, Lce/g;->H(ILce/b;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget v2, p0, Lwd/v0;->c:I

    .line 57
    .line 58
    const/4 v3, 0x4

    .line 59
    and-int/2addr v2, v3

    .line 60
    if-ne v2, v3, :cond_3

    .line 61
    .line 62
    iget-object v2, p0, Lwd/v0;->g:Lwd/t0;

    .line 63
    .line 64
    invoke-virtual {p1, v3, v2}, Lce/g;->H(ILce/b;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    iget v2, p0, Lwd/v0;->c:I

    .line 68
    .line 69
    const/16 v3, 0x8

    .line 70
    .line 71
    and-int/2addr v2, v3

    .line 72
    if-ne v2, v3, :cond_4

    .line 73
    .line 74
    const/4 v2, 0x5

    .line 75
    iget v4, p0, Lwd/v0;->h:I

    .line 76
    .line 77
    invoke-virtual {p1, v2, v4}, Lce/g;->F(II)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget v2, p0, Lwd/v0;->c:I

    .line 81
    .line 82
    const/16 v4, 0x10

    .line 83
    .line 84
    and-int/2addr v2, v4

    .line 85
    if-ne v2, v4, :cond_5

    .line 86
    .line 87
    const/4 v2, 0x6

    .line 88
    iget-object v4, p0, Lwd/v0;->i:Lwd/t0;

    .line 89
    .line 90
    invoke-virtual {p1, v2, v4}, Lce/g;->H(ILce/b;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    iget v2, p0, Lwd/v0;->c:I

    .line 94
    .line 95
    const/16 v4, 0x20

    .line 96
    .line 97
    and-int/2addr v2, v4

    .line 98
    if-ne v2, v4, :cond_6

    .line 99
    .line 100
    const/4 v2, 0x7

    .line 101
    iget v5, p0, Lwd/v0;->j:I

    .line 102
    .line 103
    invoke-virtual {p1, v2, v5}, Lce/g;->F(II)V

    .line 104
    .line 105
    .line 106
    :cond_6
    const/4 v2, 0x0

    .line 107
    :goto_1
    iget-object v5, p0, Lwd/v0;->k:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-ge v2, v5, :cond_7

    .line 114
    .line 115
    iget-object v5, p0, Lwd/v0;->k:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    check-cast v5, Lce/b;

    .line 122
    .line 123
    invoke-virtual {p1, v3, v5}, Lce/g;->H(ILce/b;)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    const/4 v2, 0x0

    .line 130
    :goto_2
    iget-object v3, p0, Lwd/v0;->l:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-ge v2, v3, :cond_8

    .line 137
    .line 138
    iget-object v3, p0, Lwd/v0;->l:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    const/16 v5, 0x1f

    .line 151
    .line 152
    invoke-virtual {p1, v5, v3}, Lce/g;->F(II)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    :goto_3
    iget-object v2, p0, Lwd/v0;->m:Ljava/util/List;

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-ge v1, v2, :cond_9

    .line 165
    .line 166
    iget-object v2, p0, Lwd/v0;->m:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Lce/b;

    .line 173
    .line 174
    invoke-virtual {p1, v4, v2}, Lce/g;->H(ILce/b;)V

    .line 175
    .line 176
    .line 177
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_9
    const/16 v1, 0xc8

    .line 181
    .line 182
    invoke-virtual {v0, v1, p1}, Landroidx/media3/exoplayer/offline/u;->e1(ILce/g;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lwd/v0;->b:Lce/e;

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 188
    .line 189
    .line 190
    return-void
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
