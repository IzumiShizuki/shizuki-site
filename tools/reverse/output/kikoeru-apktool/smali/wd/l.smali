.class public final Lwd/l;
.super Lce/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final g:Lwd/l;

.field public static final h:Lwd/a;


# instance fields
.field public final a:Lce/e;

.field public b:I

.field public c:I

.field public d:Lce/w;

.field public e:B

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwd/a;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lwd/l;->h:Lwd/a;

    .line 8
    .line 9
    new-instance v0, Lwd/l;

    .line 10
    .line 11
    invoke-direct {v0}, Lwd/l;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lwd/l;->g:Lwd/l;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Lwd/l;->c:I

    .line 18
    .line 19
    sget-object v1, Lce/e;->a:Lce/w;

    .line 20
    .line 21
    iput-object v1, v0, Lwd/l;->d:Lce/w;

    .line 22
    .line 23
    return-void
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
    iput-byte v0, p0, Lwd/l;->e:B

    .line 3
    iput v0, p0, Lwd/l;->f:I

    .line 4
    sget-object v0, Lce/e;->a:Lce/w;

    iput-object v0, p0, Lwd/l;->a:Lce/e;

    return-void
.end method

.method public constructor <init>(Lce/f;)V
    .locals 6

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 6
    iput-byte v0, p0, Lwd/l;->e:B

    .line 7
    iput v0, p0, Lwd/l;->f:I

    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lwd/l;->c:I

    .line 9
    sget-object v1, Lce/e;->a:Lce/w;

    iput-object v1, p0, Lwd/l;->d:Lce/w;

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

    const/16 v5, 0x12

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
    iget v4, p0, Lwd/l;->b:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lwd/l;->b:I

    .line 15
    invoke-virtual {p1}, Lce/f;->e()Lce/w;

    move-result-object v4

    iput-object v4, p0, Lwd/l;->d:Lce/w;

    goto :goto_0

    .line 16
    :cond_3
    iget v4, p0, Lwd/l;->b:I

    or-int/2addr v4, v2

    iput v4, p0, Lwd/l;->b:I

    .line 17
    invoke-virtual {p1}, Lce/f;->k()I

    move-result v4

    .line 18
    iput v4, p0, Lwd/l;->c:I
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 19
    :goto_1
    :try_start_1
    new-instance v0, Lce/s;

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lce/s;-><init>(Ljava/lang/String;)V

    .line 21
    iput-object p0, v0, Lce/s;->a:Lce/b;

    .line 22
    throw v0

    .line 23
    :goto_2
    iput-object p0, p1, Lce/s;->a:Lce/b;

    .line 24
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :goto_3
    :try_start_2
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 26
    :catch_2
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, p0, Lwd/l;->a:Lce/e;

    goto :goto_4

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, p0, Lwd/l;->a:Lce/e;

    .line 27
    throw p1

    .line 28
    :goto_4
    throw p1

    .line 29
    :cond_4
    :try_start_3
    invoke-virtual {v3}, Lce/g;->m()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 30
    :catch_3
    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object p1

    iput-object p1, p0, Lwd/l;->a:Lce/e;

    return-void

    :catchall_2
    move-exception p1

    invoke-virtual {v1}, Lce/d;->i()Lce/e;

    move-result-object v0

    iput-object v0, p0, Lwd/l;->a:Lce/e;

    .line 31
    throw p1
.end method

.method public constructor <init>(Lwd/b;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 33
    iput-byte v0, p0, Lwd/l;->e:B

    .line 34
    iput v0, p0, Lwd/l;->f:I

    .line 35
    iget-object p1, p1, Lce/k;->a:Lce/e;

    .line 36
    iput-object p1, p0, Lwd/l;->a:Lce/e;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lwd/l;->e:B

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
    iget v0, p0, Lwd/l;->b:I

    .line 12
    .line 13
    and-int/lit8 v3, v0, 0x1

    .line 14
    .line 15
    if-ne v3, v1, :cond_3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    and-int/2addr v0, v3

    .line 19
    if-ne v0, v3, :cond_2

    .line 20
    .line 21
    iput-byte v1, p0, Lwd/l;->e:B

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    iput-byte v2, p0, Lwd/l;->e:B

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iput-byte v2, p0, Lwd/l;->e:B

    .line 28
    .line 29
    return v2
.end method

.method public final c()I
    .locals 4

    .line 1
    iget v0, p0, Lwd/l;->f:I

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
    iget v0, p0, Lwd/l;->b:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lwd/l;->c:I

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
    iget v1, p0, Lwd/l;->b:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lwd/l;->d:Lce/w;

    .line 28
    .line 29
    invoke-static {v2}, Lce/g;->k(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1}, Lce/w;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v3}, Lce/g;->i(I)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v1}, Lce/w;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/2addr v1, v3

    .line 46
    add-int/2addr v1, v2

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_2
    iget-object v1, p0, Lwd/l;->a:Lce/e;

    .line 49
    .line 50
    invoke-virtual {v1}, Lce/e;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    add-int/2addr v1, v0

    .line 55
    iput v1, p0, Lwd/l;->f:I

    .line 56
    .line 57
    return v1
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
    new-instance v0, Lwd/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lwd/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lce/e;->a:Lce/w;

    .line 8
    .line 9
    iput-object v1, v0, Lwd/b;->e:Ljava/lang/Object;

    .line 10
    .line 11
    return-object v0
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
    .locals 2

    .line 1
    new-instance v0, Lwd/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lwd/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lce/e;->a:Lce/w;

    .line 8
    .line 9
    iput-object v1, v0, Lwd/b;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lwd/b;->i(Lwd/l;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
    invoke-virtual {p0}, Lwd/l;->c()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lwd/l;->b:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lwd/l;->c:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lce/g;->F(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lwd/l;->b:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lwd/l;->d:Lce/w;

    .line 22
    .line 23
    invoke-virtual {p1, v1, v1}, Lce/g;->Q(II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lce/w;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1, v1}, Lce/g;->O(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lwd/l;->a:Lce/e;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lce/g;->K(Lce/e;)V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method
