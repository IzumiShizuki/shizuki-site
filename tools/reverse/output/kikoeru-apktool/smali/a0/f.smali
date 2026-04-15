.class public final La0/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb0/r;


# instance fields
.field public final a:La0/g0;


# direct methods
.method public constructor <init>(La0/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La0/f;->a:La0/g0;

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
    .locals 1

    .line 1
    iget-object v0, p0, La0/f;->a:La0/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, La0/t;->n:I

    .line 8
    .line 9
    return v0
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

.method public final b()I
    .locals 2

    .line 1
    invoke-virtual {p0}, La0/f;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iget-object v1, p0, La0/f;->a:La0/g0;

    .line 8
    .line 9
    invoke-virtual {v1}, La0/g0;->g()La0/t;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La0/t;->k:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v1}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La0/u;

    .line 20
    .line 21
    iget v1, v1, La0/u;->a:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
    .line 28
    .line 29
.end method

.method public final c()I
    .locals 5

    .line 1
    iget-object v0, p0, La0/f;->a:La0/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La0/t;->k:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, v1, La0/t;->o:Lu/e1;

    .line 22
    .line 23
    sget-object v3, Lu/e1;->a:Lu/e1;

    .line 24
    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, La0/t;->c()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    const-wide v3, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v1, v3

    .line 37
    :goto_0
    long-to-int v2, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v1}, La0/t;->c()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    const/16 v3, 0x20

    .line 44
    .line 45
    shr-long/2addr v1, v3

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Landroid/support/v4/media/session/b;->c0(La0/t;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x1

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    div-int/2addr v2, v0

    .line 60
    if-ge v2, v1, :cond_3

    .line 61
    .line 62
    :goto_2
    return v1

    .line 63
    :cond_3
    return v2
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

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, La0/f;->a:La0/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, La0/g0;->g()La0/t;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La0/t;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    return v0
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

.method public final e()I
    .locals 2

    .line 1
    iget-object v0, p0, La0/f;->a:La0/g0;

    .line 2
    .line 3
    iget-object v0, v0, La0/g0;->d:La0/v;

    .line 4
    .line 5
    iget-object v0, v0, La0/v;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lx0/b1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
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
