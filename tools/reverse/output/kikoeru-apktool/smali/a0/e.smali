.class public final La0/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb0/i1;


# instance fields
.field public final synthetic a:La0/g0;


# direct methods
.method public constructor <init>(La0/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La0/e;->a:La0/g0;

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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    iget-object v0, p0, La0/e;->a:La0/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La0/t;->o:Lu/e1;

    .line 8
    .line 9
    sget-object v2, Lu/e1;->a:Lu/e1;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, La0/t;->c()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide v2, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v0, v2

    .line 27
    :goto_0
    long-to-int v1, v0

    .line 28
    return v1

    .line 29
    :cond_0
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, La0/t;->c()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const/16 v2, 0x20

    .line 38
    .line 39
    shr-long/2addr v0, v2

    .line 40
    goto :goto_0
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

.method public final b()F
    .locals 2

    .line 1
    iget-object v0, p0, La0/e;->a:La0/g0;

    .line 2
    .line 3
    iget-object v1, v0, La0/g0;->d:La0/v;

    .line 4
    .line 5
    iget-object v1, v1, La0/v;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lx0/b1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lx0/b1;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v0, v0, La0/g0;->d:La0/v;

    .line 14
    .line 15
    iget-object v0, v0, La0/v;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx0/b1;

    .line 18
    .line 19
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    mul-int/lit16 v1, v1, 0x1f4

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    int-to-float v0, v1

    .line 27
    return v0
    .line 28
    .line 29
.end method

.method public final c()I
    .locals 2

    .line 1
    iget-object v0, p0, La0/e;->a:La0/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v1, v1, La0/t;->l:I

    .line 8
    .line 9
    neg-int v1, v1

    .line 10
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, La0/t;->p:I

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    return v1
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

.method public final d()F
    .locals 3

    .line 1
    iget-object v0, p0, La0/e;->a:La0/g0;

    .line 2
    .line 3
    iget-object v1, v0, La0/g0;->d:La0/v;

    .line 4
    .line 5
    iget-object v1, v1, La0/v;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lx0/b1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lx0/b1;->e()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, v0, La0/g0;->d:La0/v;

    .line 14
    .line 15
    iget-object v2, v2, La0/v;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lx0/b1;

    .line 18
    .line 19
    invoke-virtual {v2}, Lx0/b1;->e()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0}, La0/g0;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    mul-int/lit16 v1, v1, 0x1f4

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    int-to-float v0, v1

    .line 33
    const/16 v1, 0x64

    .line 34
    .line 35
    int-to-float v1, v1

    .line 36
    add-float/2addr v0, v1

    .line 37
    return v0

    .line 38
    :cond_0
    mul-int/lit16 v1, v1, 0x1f4

    .line 39
    .line 40
    add-int/2addr v1, v2

    .line 41
    int-to-float v0, v1

    .line 42
    return v0
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

.method public final e()Lq2/b;
    .locals 3

    .line 1
    new-instance v0, Lq2/b;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2}, Lq2/b;-><init>(II)V

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

.method public final f(ILb0/l1;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La0/g0;->w:Landroidx/media3/exoplayer/offline/u;

    .line 2
    .line 3
    iget-object v0, p0, La0/e;->a:La0/g0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, La0/d0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, p1, v2}, La0/d0;-><init>(La0/g0;ILyb/c;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Ls/v0;->a:Ls/v0;

    .line 15
    .line 16
    invoke-virtual {v0, p1, v1, p2}, La0/g0;->b(Ls/v0;Lic/n;Lac/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 21
    .line 22
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 23
    .line 24
    if-ne p1, v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, p2

    .line 28
    :goto_0
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    return-object p2
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
