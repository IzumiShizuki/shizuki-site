.class public final Lq/l;
.super Lq/y0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public o:Lr/j1;

.field public p:Lx0/w0;

.field public q:Lq/m;

.field public r:J


# virtual methods
.method public final g(Lg2/x0;Lg2/u0;J)Lg2/w0;
    .locals 7

    .line 1
    invoke-interface {p2, p3, p4}, Lg2/u0;->v(J)Lg2/g1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lg2/y;->O()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const-wide v0, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/16 p4, 0x20

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget p3, p2, Lg2/g1;->a:I

    .line 19
    .line 20
    iget v2, p2, Lg2/g1;->b:I

    .line 21
    .line 22
    int-to-long v3, p3

    .line 23
    shl-long/2addr v3, p4

    .line 24
    int-to-long v5, v2

    .line 25
    and-long/2addr v5, v0

    .line 26
    or-long/2addr v3, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p3, p0, Lq/l;->o:Lr/j1;

    .line 29
    .line 30
    if-nez p3, :cond_1

    .line 31
    .line 32
    iget p3, p2, Lg2/g1;->a:I

    .line 33
    .line 34
    iget v2, p2, Lg2/g1;->b:I

    .line 35
    .line 36
    int-to-long v3, p3

    .line 37
    shl-long/2addr v3, p4

    .line 38
    int-to-long v5, v2

    .line 39
    and-long/2addr v5, v0

    .line 40
    or-long/2addr v3, v5

    .line 41
    iput-wide v3, p0, Lq/l;->r:J

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget v2, p2, Lg2/g1;->a:I

    .line 45
    .line 46
    iget v3, p2, Lg2/g1;->b:I

    .line 47
    .line 48
    int-to-long v4, v2

    .line 49
    shl-long/2addr v4, p4

    .line 50
    int-to-long v2, v3

    .line 51
    and-long/2addr v2, v0

    .line 52
    or-long/2addr v2, v4

    .line 53
    new-instance v4, Lq/k;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-direct {v4, p0, v2, v3, v5}, Lq/k;-><init>(Lq/l;JI)V

    .line 57
    .line 58
    .line 59
    new-instance v5, Lq/k;

    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    invoke-direct {v5, p0, v2, v3, v6}, Lq/k;-><init>(Lq/l;JI)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3, v4, v5}, Lr/j1;->a(Lic/k;Lic/k;)Lr/i1;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    iget-object v2, p0, Lq/l;->q:Lq/m;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Lr/i1;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Lf3/l;

    .line 79
    .line 80
    iget-wide v3, v2, Lf3/l;->a:J

    .line 81
    .line 82
    invoke-virtual {p3}, Lr/i1;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    check-cast p3, Lf3/l;

    .line 87
    .line 88
    iget-wide v5, p3, Lf3/l;->a:J

    .line 89
    .line 90
    iput-wide v5, p0, Lq/l;->r:J

    .line 91
    .line 92
    :goto_0
    shr-long p3, v3, p4

    .line 93
    .line 94
    long-to-int p4, p3

    .line 95
    and-long/2addr v0, v3

    .line 96
    long-to-int p3, v0

    .line 97
    new-instance v0, Lq/j;

    .line 98
    .line 99
    invoke-direct {v0, p0, p2, v3, v4}, Lq/j;-><init>(Lq/l;Lg2/g1;J)V

    .line 100
    .line 101
    .line 102
    sget-object p2, Lvb/s;->a:Lvb/s;

    .line 103
    .line 104
    invoke-interface {p1, p4, p3, p2, v0}, Lg2/x0;->b0(IILjava/util/Map;Lic/k;)Lg2/w0;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final v0()V
    .locals 2

    .line 1
    sget-wide v0, Landroidx/compose/animation/a;->a:J

    .line 2
    .line 3
    iput-wide v0, p0, Lq/l;->r:J

    .line 4
    .line 5
    return-void
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
