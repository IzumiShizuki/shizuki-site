.class public final Li2/c0;
.super Li2/g1;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final V:Lp4/p;


# instance fields
.field public R:Li2/z;

.field public S:Lf3/a;

.field public T:Li2/a0;

.field public U:Lg2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lq1/h0;->h()Lp4/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lq1/q;->f:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lp4/p;->i(J)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lp4/p;->o(F)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Lp4/p;->p(I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Li2/c0;->V:Lp4/p;

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Li2/j0;Li2/z;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Li2/g1;-><init>(Li2/j0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Li2/c0;->R:Li2/z;

    .line 5
    .line 6
    iget-object p1, p1, Li2/j0;->h:Li2/j0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Li2/a0;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Li2/a0;-><init>(Li2/c0;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, Li2/c0;->T:Li2/a0;

    .line 19
    .line 20
    move-object p1, p2

    .line 21
    check-cast p1, Lj1/p;

    .line 22
    .line 23
    iget-object p1, p1, Lj1/p;->a:Lj1/p;

    .line 24
    .line 25
    iget p1, p1, Lj1/p;->c:I

    .line 26
    .line 27
    and-int/lit16 p1, p1, 0x200

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    new-instance v0, Lg2/i;

    .line 32
    .line 33
    check-cast p2, Lq/e1;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, Lg2/i;-><init>(Li2/c0;Lq/e1;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-object v0, p0, Li2/c0;->U:Lg2/i;

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
.end method


# virtual methods
.method public final H0()V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c0;->T:Li2/a0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li2/a0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Li2/a0;-><init>(Li2/c0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li2/c0;->T:Li2/a0;

    .line 11
    .line 12
    :cond_0
    return-void
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

.method public final K0()Li2/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c0;->T:Li2/a0;

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

.method public final L(I)I
    .locals 7

    .line 1
    iget-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lg2/i;->b:Lq/e1;

    .line 6
    .line 7
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 8
    .line 9
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v1, Lj1/p;->a:Lj1/p;

    .line 13
    .line 14
    iget-object v3, v3, Lj1/p;->h:Li2/g1;

    .line 15
    .line 16
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Li2/g1;->K0()Li2/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Li2/r0;->s0()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    new-instance v3, Lg2/q;

    .line 33
    .line 34
    sget-object v4, Li2/j1;->b:Li2/j1;

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    sget-object v6, Li2/i1;->a:Li2/i1;

    .line 38
    .line 39
    invoke-direct {v3, v2, v6, v4, v5}, Lg2/q;-><init>(Lg2/u0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/16 v4, 0xd

    .line 44
    .line 45
    invoke-static {p1, v2, v4}, Lf3/b;->b(III)J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    new-instance p1, Lg2/f;

    .line 50
    .line 51
    invoke-virtual {v0}, Lg2/i;->getLayoutDirection()Lf3/m;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {p1, v0, v2}, Lg2/f;-><init>(Lg2/d;Lf3/m;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1, v3, v4, v5}, Lq/e1;->C0(Lg2/g;Lg2/u0;J)Lg2/w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Lg2/w0;->b()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_0
    invoke-interface {v2, p1}, Lg2/u0;->L(I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_1
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 73
    .line 74
    iget-object v1, p0, Li2/g1;->r:Li2/g1;

    .line 75
    .line 76
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, p0, v1, p1}, Li2/z;->b(Li2/q0;Lg2/u0;I)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1
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

.method public final M0()Lj1/p;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 2
    .line 3
    check-cast v0, Lj1/p;

    .line 4
    .line 5
    iget-object v0, v0, Lj1/p;->a:Lj1/p;

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

.method public final Y(JFLic/k;)V
    .locals 6

    .line 1
    iget-boolean v1, p0, Li2/g1;->p:Z

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Li2/c0;->K0()Li2/r0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v1, v1, Li2/r0;->p:J

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move v3, p3

    .line 17
    move-object v4, p4

    .line 18
    invoke-virtual/range {v0 .. v5}, Li2/g1;->c1(JFLic/k;Lt1/b;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v5, 0x0

    .line 23
    move-object v0, p0

    .line 24
    move-wide v1, p1

    .line 25
    move v3, p3

    .line 26
    move-object v4, p4

    .line 27
    invoke-virtual/range {v0 .. v5}, Li2/g1;->c1(JFLic/k;Lt1/b;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Li2/c0;->o1()V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final b(I)I
    .locals 7

    .line 1
    iget-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lg2/i;->b:Lq/e1;

    .line 6
    .line 7
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 8
    .line 9
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v1, Lj1/p;->a:Lj1/p;

    .line 13
    .line 14
    iget-object v3, v3, Lj1/p;->h:Li2/g1;

    .line 15
    .line 16
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Li2/g1;->K0()Li2/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Li2/r0;->s0()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    new-instance v3, Lg2/q;

    .line 33
    .line 34
    sget-object v4, Li2/j1;->b:Li2/j1;

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    sget-object v6, Li2/i1;->b:Li2/i1;

    .line 38
    .line 39
    invoke-direct {v3, v2, v6, v4, v5}, Lg2/q;-><init>(Lg2/u0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/16 v4, 0xd

    .line 44
    .line 45
    invoke-static {p1, v2, v4}, Lf3/b;->b(III)J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    new-instance p1, Lg2/f;

    .line 50
    .line 51
    invoke-virtual {v0}, Lg2/i;->getLayoutDirection()Lf3/m;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {p1, v0, v2}, Lg2/f;-><init>(Lg2/d;Lf3/m;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1, v3, v4, v5}, Lq/e1;->C0(Lg2/g;Lg2/u0;J)Lg2/w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Lg2/w0;->b()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_0
    invoke-interface {v2, p1}, Lg2/u0;->b(I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_1
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 73
    .line 74
    iget-object v1, p0, Li2/g1;->r:Li2/g1;

    .line 75
    .line 76
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, p0, v1, p1}, Li2/z;->c(Li2/q0;Lg2/u0;I)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1
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

.method public final b1(Lq1/o;Lt1/b;)V
    .locals 9

    .line 1
    iget-object v0, p0, Li2/g1;->r:Li2/g1;

    .line 2
    .line 3
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Li2/g1;->F0(Lq1/o;Lt1/b;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Li2/g1;->o:Li2/j0;

    .line 10
    .line 11
    invoke-static {p2}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lj2/v;

    .line 16
    .line 17
    invoke-virtual {p2}, Lj2/v;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Li2/g1;->r:Li2/g1;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-wide v0, p0, Lg2/g1;->c:J

    .line 28
    .line 29
    iget-wide v2, p2, Lg2/g1;->c:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Lf3/l;->b(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-wide v0, p2, Li2/g1;->B:J

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Lf3/j;->b(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :cond_0
    iget-wide v0, p0, Lg2/g1;->c:J

    .line 48
    .line 49
    const/16 p2, 0x20

    .line 50
    .line 51
    shr-long v2, v0, p2

    .line 52
    .line 53
    long-to-int p2, v2

    .line 54
    int-to-float p2, p2

    .line 55
    const/high16 v2, 0x3f000000    # 0.5f

    .line 56
    .line 57
    sub-float v6, p2, v2

    .line 58
    .line 59
    const-wide v3, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v0, v3

    .line 65
    long-to-int p2, v0

    .line 66
    int-to-float p2, p2

    .line 67
    sub-float v7, p2, v2

    .line 68
    .line 69
    const/high16 v4, 0x3f000000    # 0.5f

    .line 70
    .line 71
    const/high16 v5, 0x3f000000    # 0.5f

    .line 72
    .line 73
    sget-object v8, Li2/c0;->V:Lp4/p;

    .line 74
    .line 75
    move-object v3, p1

    .line 76
    invoke-interface/range {v3 .. v8}, Lq1/o;->j(FFFFLp4/p;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
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
.end method

.method public final d0(JFLt1/b;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Li2/g1;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Li2/c0;->K0()Li2/r0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-wide v1, p1, Li2/r0;->p:J

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move v3, p3

    .line 17
    move-object v5, p4

    .line 18
    invoke-virtual/range {v0 .. v5}, Li2/g1;->c1(JFLic/k;Lt1/b;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v3, p3

    .line 23
    move-object v5, p4

    .line 24
    const/4 v9, 0x0

    .line 25
    move-wide v6, p1

    .line 26
    move v8, v3

    .line 27
    move-object v10, v5

    .line 28
    move-object v5, p0

    .line 29
    invoke-virtual/range {v5 .. v10}, Li2/g1;->c1(JFLic/k;Lt1/b;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0}, Li2/c0;->o1()V

    .line 33
    .line 34
    .line 35
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final m(I)I
    .locals 7

    .line 1
    iget-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lg2/i;->b:Lq/e1;

    .line 6
    .line 7
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 8
    .line 9
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v1, Lj1/p;->a:Lj1/p;

    .line 13
    .line 14
    iget-object v3, v3, Lj1/p;->h:Li2/g1;

    .line 15
    .line 16
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Li2/g1;->K0()Li2/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Li2/r0;->s0()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    new-instance v3, Lg2/q;

    .line 33
    .line 34
    sget-object v4, Li2/j1;->a:Li2/j1;

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    sget-object v6, Li2/i1;->a:Li2/i1;

    .line 38
    .line 39
    invoke-direct {v3, v2, v6, v4, v5}, Lg2/q;-><init>(Lg2/u0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v4, 0x7

    .line 44
    invoke-static {v2, p1, v4}, Lf3/b;->b(III)J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    new-instance p1, Lg2/f;

    .line 49
    .line 50
    invoke-virtual {v0}, Lg2/i;->getLayoutDirection()Lf3/m;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {p1, v0, v2}, Lg2/f;-><init>(Lg2/d;Lf3/m;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1, v3, v4, v5}, Lq/e1;->C0(Lg2/g;Lg2/u0;J)Lg2/w0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Lg2/w0;->h()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    :cond_0
    invoke-interface {v2, p1}, Lg2/u0;->m(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1

    .line 71
    :cond_1
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 72
    .line 73
    iget-object v1, p0, Li2/g1;->r:Li2/g1;

    .line 74
    .line 75
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, p0, v1, p1}, Li2/z;->f(Li2/q0;Lg2/u0;I)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1
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

.method public final n0(Lg2/t;)I
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c0;->T:Li2/a0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Li2/r0;->t:Lo/f0;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lo/f0;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lo/f0;->c:[I

    .line 14
    .line 15
    aget p1, v0, p1

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/high16 p1, -0x80000000

    .line 19
    .line 20
    return p1

    .line 21
    :cond_1
    invoke-static {p0, p1}, Li2/f;->c(Li2/q0;Lg2/t;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1
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

.method public final o1()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Li2/q0;->j:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Li2/g1;->Y0()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    iget-object v2, p0, Li2/c0;->T:Li2/a0;

    .line 15
    .line 16
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, v0, Lg2/i;->c:Z

    .line 20
    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    iget-wide v2, p0, Lg2/g1;->c:J

    .line 24
    .line 25
    iget-object v0, p0, Li2/c0;->T:Li2/a0;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Li2/r0;->C0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    new-instance v0, Lf3/l;

    .line 35
    .line 36
    invoke-direct {v0, v5, v6}, Lf3/l;-><init>(J)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, v4

    .line 41
    :goto_0
    invoke-static {v2, v3, v0}, Lf3/l;->a(JLjava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Li2/g1;->r:Li2/g1;

    .line 48
    .line 49
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-wide v2, v0, Lg2/g1;->c:J

    .line 53
    .line 54
    iget-object v0, p0, Li2/g1;->r:Li2/g1;

    .line 55
    .line 56
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Li2/g1;->K0()Li2/r0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0}, Li2/r0;->C0()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    new-instance v0, Lf3/l;

    .line 70
    .line 71
    invoke-direct {v0, v4, v5}, Lf3/l;-><init>(J)V

    .line 72
    .line 73
    .line 74
    move-object v4, v0

    .line 75
    :cond_2
    invoke-static {v2, v3, v4}, Lf3/l;->a(JLjava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/4 v0, 0x0

    .line 84
    :goto_1
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 85
    .line 86
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-boolean v0, v2, Li2/g1;->p:Z

    .line 90
    .line 91
    :cond_4
    invoke-virtual {p0}, Li2/g1;->u0()Lg2/w0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Lg2/w0;->j()V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Li2/g1;->r:Li2/g1;

    .line 99
    .line 100
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-boolean v1, v0, Li2/g1;->p:Z

    .line 104
    .line 105
    return-void
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
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

.method public final p1(Li2/z;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lj1/p;

    .line 11
    .line 12
    iget-object v0, v0, Lj1/p;->a:Lj1/p;

    .line 13
    .line 14
    iget v0, v0, Lj1/p;->c:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    move-object v0, p1

    .line 21
    check-cast v0, Lq/e1;

    .line 22
    .line 23
    iget-object v1, p0, Li2/c0;->U:Lg2/i;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iput-object v0, v1, Lg2/i;->b:Lq/e1;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Lg2/i;

    .line 31
    .line 32
    invoke-direct {v1, p0, v0}, Lg2/i;-><init>(Li2/c0;Lq/e1;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iput-object v1, p0, Li2/c0;->U:Lg2/i;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 40
    .line 41
    :cond_2
    :goto_1
    iput-object p1, p0, Li2/c0;->R:Li2/z;

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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final t(I)I
    .locals 7

    .line 1
    iget-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lg2/i;->b:Lq/e1;

    .line 6
    .line 7
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 8
    .line 9
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v1, Lj1/p;->a:Lj1/p;

    .line 13
    .line 14
    iget-object v3, v3, Lj1/p;->h:Li2/g1;

    .line 15
    .line 16
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Li2/g1;->K0()Li2/r0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Li2/r0;->s0()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    new-instance v3, Lg2/q;

    .line 33
    .line 34
    sget-object v4, Li2/j1;->a:Li2/j1;

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    sget-object v6, Li2/i1;->b:Li2/i1;

    .line 38
    .line 39
    invoke-direct {v3, v2, v6, v4, v5}, Lg2/q;-><init>(Lg2/u0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v4, 0x7

    .line 44
    invoke-static {v2, p1, v4}, Lf3/b;->b(III)J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    new-instance p1, Lg2/f;

    .line 49
    .line 50
    invoke-virtual {v0}, Lg2/i;->getLayoutDirection()Lf3/m;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {p1, v0, v2}, Lg2/f;-><init>(Lg2/d;Lf3/m;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1, v3, v4, v5}, Lq/e1;->C0(Lg2/g;Lg2/u0;J)Lg2/w0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Lg2/w0;->h()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    :cond_0
    invoke-interface {v2, p1}, Lg2/u0;->t(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1

    .line 71
    :cond_1
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 72
    .line 73
    iget-object v1, p0, Li2/g1;->r:Li2/g1;

    .line 74
    .line 75
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, p0, v1, p1}, Li2/z;->d(Li2/q0;Lg2/u0;I)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1
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

.method public final v(J)Lg2/g1;
    .locals 7

    .line 1
    iget-boolean v0, p0, Li2/g1;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Li2/c0;->S:Lf3/a;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-wide p1, p1, Lf3/a;->a:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p2, "Lookahead constraints cannot be null in approach pass."

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lg2/g1;->k0(J)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Li2/c0;->U:Lg2/i;

    .line 24
    .line 25
    if-eqz v0, :cond_8

    .line 26
    .line 27
    iget-object v1, v0, Lg2/i;->b:Lq/e1;

    .line 28
    .line 29
    iget-object v2, v0, Lg2/i;->a:Li2/c0;

    .line 30
    .line 31
    iget-object v2, v2, Li2/c0;->T:Li2/a0;

    .line 32
    .line 33
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Li2/r0;->u0()Lg2/w0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v2}, Lg2/w0;->h()I

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Lg2/w0;->b()I

    .line 44
    .line 45
    .line 46
    iget-object v2, v1, Lq/e1;->o:Lq/h1;

    .line 47
    .line 48
    invoke-virtual {v2}, Lq/h1;->g()Lq/g1;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lq/g1;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x1

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget-object v2, v1, Lq/e1;->o:Lq/h1;

    .line 61
    .line 62
    invoke-virtual {v2}, Lq/h1;->g()Lq/g1;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v2, v2, Lq/g1;->b:Lq/q1;

    .line 67
    .line 68
    invoke-virtual {v2}, Lq/q1;->g()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget-object v2, p0, Li2/c0;->S:Lf3/a;

    .line 76
    .line 77
    invoke-static {v2}, Lq/t0;->M(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    iget-wide v5, v2, Lf3/a;->a:J

    .line 85
    .line 86
    cmp-long v2, p1, v5

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    :goto_1
    const/4 v2, 0x1

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const/4 v2, 0x0

    .line 93
    :goto_2
    iput-boolean v2, v0, Lg2/i;->c:Z

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 98
    .line 99
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-boolean v4, v2, Li2/g1;->q:Z

    .line 103
    .line 104
    :cond_5
    iget-object v2, p0, Li2/g1;->r:Li2/g1;

    .line 105
    .line 106
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0, v2, p1, p2}, Lq/e1;->C0(Lg2/g;Lg2/u0;J)Lg2/w0;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p2, p0, Li2/g1;->r:Li2/g1;

    .line 114
    .line 115
    invoke-static {p2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iput-boolean v3, p2, Li2/g1;->q:Z

    .line 119
    .line 120
    invoke-interface {p1}, Lg2/w0;->h()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    iget-object v1, p0, Li2/c0;->T:Li2/a0;

    .line 125
    .line 126
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget v1, v1, Lg2/g1;->a:I

    .line 130
    .line 131
    if-ne p2, v1, :cond_6

    .line 132
    .line 133
    invoke-interface {p1}, Lg2/w0;->b()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    iget-object v1, p0, Li2/c0;->T:Li2/a0;

    .line 138
    .line 139
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget v1, v1, Lg2/g1;->b:I

    .line 143
    .line 144
    if-ne p2, v1, :cond_6

    .line 145
    .line 146
    const/4 v3, 0x1

    .line 147
    :cond_6
    iget-boolean p2, v0, Lg2/i;->c:Z

    .line 148
    .line 149
    if-nez p2, :cond_9

    .line 150
    .line 151
    iget-object p2, p0, Li2/g1;->r:Li2/g1;

    .line 152
    .line 153
    invoke-static {p2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-wide v0, p2, Lg2/g1;->c:J

    .line 157
    .line 158
    iget-object p2, p0, Li2/g1;->r:Li2/g1;

    .line 159
    .line 160
    invoke-static {p2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Li2/g1;->K0()Li2/r0;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-eqz p2, :cond_7

    .line 168
    .line 169
    invoke-virtual {p2}, Li2/r0;->C0()J

    .line 170
    .line 171
    .line 172
    move-result-wide v4

    .line 173
    new-instance p2, Lf3/l;

    .line 174
    .line 175
    invoke-direct {p2, v4, v5}, Lf3/l;-><init>(J)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_7
    const/4 p2, 0x0

    .line 180
    :goto_3
    invoke-static {v0, v1, p2}, Lf3/l;->a(JLjava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_9

    .line 185
    .line 186
    if-nez v3, :cond_9

    .line 187
    .line 188
    new-instance p2, Li2/b0;

    .line 189
    .line 190
    invoke-direct {p2, p1, p0}, Li2/b0;-><init>(Lg2/w0;Li2/c0;)V

    .line 191
    .line 192
    .line 193
    move-object p1, p2

    .line 194
    goto :goto_4

    .line 195
    :cond_8
    iget-object v0, p0, Li2/c0;->R:Li2/z;

    .line 196
    .line 197
    iget-object v1, p0, Li2/g1;->r:Li2/g1;

    .line 198
    .line 199
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v0, p0, v1, p1, p2}, Li2/z;->g(Lg2/x0;Lg2/u0;J)Lg2/w0;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    :cond_9
    :goto_4
    invoke-virtual {p0, p1}, Li2/g1;->f1(Lg2/w0;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, Li2/g1;->X0()V

    .line 210
    .line 211
    .line 212
    return-object p0
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
