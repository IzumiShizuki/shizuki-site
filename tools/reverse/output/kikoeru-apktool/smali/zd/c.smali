.class public final Lzd/c;
.super Lce/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final g:Lzd/c;

.field public static final h:Lwd/a;


# instance fields
.field public final a:Lce/e;

.field public b:I

.field public c:I

.field public d:I

.field public e:B

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lzd/c;->h:Lwd/a;

    .line 9
    .line 10
    new-instance v0, Lzd/c;

    .line 11
    .line 12
    invoke-direct {v0}, Lzd/c;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lzd/c;->g:Lzd/c;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lzd/c;->c:I

    .line 19
    .line 20
    iput v1, v0, Lzd/c;->d:I

    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput-byte v0, p0, Lzd/c;->e:B

    .line 3
    iput v0, p0, Lzd/c;->f:I

    .line 4
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lzd/c;->a:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;)V
    .locals 6

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lzd/c;->e:B

    .line 7
    iput v0, p0, Lzd/c;->f:I

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lzd/c;->c:I

    .line 9
    iput v0, p0, Lzd/c;->d:I

    .line 10
    new-instance v1, Lce/d;

    invoke-direct {v1}, Lce/d;-><init>()V

    const/4 v2, 0x1

    .line 11
    invoke-static {v1, v2}, Lce/g;->u(Ljava/io/OutputStream;I)Lce/g;

    move-result-object v3

    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 12
    :try_start_0
    invoke-virtual {p1}, Lce/f;->n()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v5, 0x8

    if-eq v4, v5, :cond_3

    const/16 v5, 0x10

    if-eq v4, v5, :cond_2

    .line 13
    invoke-virtual {p1, v4, v3}, Lce/f;->q(ILce/g;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    .line 14
    :cond_2
    iget v4, p0, Lzd/c;->b:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lzd/c;->b:I

    .line 15
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v4

    .line 16
    iput v4, p0, Lzd/c;->d:I

    goto :goto_0

    .line 17
    :cond_3
    iget v4, p0, Lzd/c;->b:I

    or-int/2addr v4, v2

    iput v4, p0, Lzd/c;->b:I

    .line 18
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v4

    .line 19
    iput v4, p0, Lzd/c;->c:I
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 20
    :goto_1
    :try_start_1
    new-instance v0, Lce/s;

    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 22
    iput-object p0, v0, Lce/s;->a:Lce/b;

    .line 23
    throw v0

    .line 24
    :goto_2
    iput-object p0, p1, Lce/s;->a:Lce/b;

    .line 25
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :goto_3
    :try_start_2
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    :catch_2
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, p0, Lzd/c;->a:Lce/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, p0, Lzd/c;->a:Lce/e;

    .line 28
    throw p1

    .line 29
    :goto_4
    throw p1

    .line 30
    :cond_4
    :try_start_3
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 31
    :catch_3
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p1

    iput-object p1, p0, Lzd/c;->a:Lce/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, p0, Lzd/c;->a:Lce/e;

    .line 32
    throw p1
.end method

.method public constructor <init>(Lzd/a;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 34
    iput-byte v0, p0, Lzd/c;->e:B

    .line 35
    iput v0, p0, Lzd/c;->f:I

    .line 36
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 37
    iput-object p1, p0, Lzd/c;->a:Lce/e;

    return-void
.end method

.method public static i(Lzd/c;)Lzd/a;
    .locals 2

    .line 1
    new-instance v0, Lzd/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lzd/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lzd/a;->i(Lzd/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lzd/c;->e:B

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
    iput-byte v1, p0, Lzd/c;->e:B

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
    .locals 3

    .line 1
    iget v0, p0, Lzd/c;->f:I

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
    iget v0, p0, Lzd/c;->b:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lzd/c;->c:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lce/g;->e(II)I

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
    iget v1, p0, Lzd/c;->b:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lzd/c;->d:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Lce/g;->e(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget-object v1, p0, Lzd/c;->a:Lce/e;

    .line 35
    .line 36
    invoke-virtual {v1}, Lce/e;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    iput v1, p0, Lzd/c;->f:I

    .line 42
    .line 43
    return v1
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

.method public final d()Lce/k;
    .locals 2

    .line 1
    new-instance v0, Lzd/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lzd/a;-><init>(I)V

    .line 5
    .line 6
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

.method public final e()Lce/k;
    .locals 1

    .line 1
    invoke-static {p0}, Lzd/c;->i(Lzd/c;)Lzd/a;

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

.method public final f(Lce/g;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzd/c;->c()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lzd/c;->b:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lzd/c;->c:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lce/g;->F(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lzd/c;->b:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lzd/c;->d:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lce/g;->F(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lzd/c;->a:Lce/e;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 29
    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method
