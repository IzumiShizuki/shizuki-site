.class public final Li2/x0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Li2/j0;

.field public final b:Lc7/e1;

.field public c:Z

.field public d:Z

.field public final e:Landroidx/media3/exoplayer/offline/u;

.field public final f:Lz0/e;

.field public final g:J

.field public final h:Lz0/e;

.field public i:Lf3/a;


# direct methods
.method public constructor <init>(Li2/j0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/x0;->a:Li2/j0;

    .line 5
    .line 6
    new-instance p1, Lc7/e1;

    .line 7
    .line 8
    const/16 v0, 0xf

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lc7/e1;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Li2/x0;->b:Lc7/e1;

    .line 14
    .line 15
    new-instance p1, Landroidx/media3/exoplayer/offline/u;

    .line 16
    .line 17
    const/16 v0, 0x17

    .line 18
    .line 19
    invoke-direct {p1, v0}, Landroidx/media3/exoplayer/offline/u;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Li2/x0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 23
    .line 24
    new-instance p1, Lz0/e;

    .line 25
    .line 26
    const/16 v0, 0x10

    .line 27
    .line 28
    new-array v1, v0, [Li2/j0;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Li2/x0;->f:Lz0/e;

    .line 34
    .line 35
    const-wide/16 v1, 0x1

    .line 36
    .line 37
    iput-wide v1, p0, Li2/x0;->g:J

    .line 38
    .line 39
    new-instance p1, Lz0/e;

    .line 40
    .line 41
    new-array v0, v0, [Li2/w0;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Li2/x0;->h:Lz0/e;

    .line 47
    .line 48
    return-void
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

.method public static b(Li2/j0;Lf3/a;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Li2/j0;->h:Li2/j0;

    .line 2
    .line 3
    iget-object v1, p0, Li2/j0;->G:Li2/n0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v1, Li2/n0;->q:Li2/v0;

    .line 14
    .line 15
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-wide v3, p1, Lf3/a;->a:J

    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, Li2/v0;->s0(J)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    iget-object p1, v1, Li2/n0;->q:Li2/v0;

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object v1, p1, Li2/v0;->n:Lf3/a;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-wide v0, v1, Lf3/a;->a:J

    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Li2/v0;->s0(J)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    :goto_1
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Li2/j0;->h:Li2/j0;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    invoke-static {v0, v2, v3}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_4
    invoke-virtual {p0}, Li2/j0;->t()Li2/h0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget-object v4, Li2/h0;->a:Li2/h0;

    .line 70
    .line 71
    if-ne v1, v4, :cond_5

    .line 72
    .line 73
    invoke-static {v0, v2, v3}, Li2/j0;->W(Li2/j0;ZI)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_5
    invoke-virtual {p0}, Li2/j0;->t()Li2/h0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v1, Li2/h0;->b:Li2/h0;

    .line 82
    .line 83
    if-ne p0, v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Li2/j0;->V(Z)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return p1
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

.method public static c(Li2/j0;Lf3/a;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Li2/j0;->Q(Lf3/a;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, Li2/j0;->R(Li2/j0;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    :goto_0
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Li2/j0;->s()Li2/h0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Li2/h0;->a:Li2/h0;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x3

    .line 30
    invoke-static {v0, v3, p0}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :cond_1
    invoke-virtual {p0}, Li2/j0;->s()Li2/h0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v1, Li2/h0;->b:Li2/h0;

    .line 39
    .line 40
    if-ne p0, v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Li2/j0;->X(Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return p1
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

.method public static h(Li2/j0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-boolean v0, v0, Li2/n0;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Li2/j0;->t()Li2/h0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Li2/h0;->c:Li2/h0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Li2/j0;->G:Li2/n0;

    .line 17
    .line 18
    iget-object p0, p0, Li2/n0;->q:Li2/v0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Li2/v0;->s:Li2/k0;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Li2/k0;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ne p0, v2, :cond_1

    .line 31
    .line 32
    :cond_0
    return v2

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
    .line 35
    .line 36
.end method

.method public static i(Li2/j0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Li2/j0;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Li2/j0;->s()Li2/h0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Li2/h0;->c:Li2/h0;

    .line 12
    .line 13
    if-ne v0, v1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 16
    .line 17
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 18
    .line 19
    iget-object v0, v0, Li2/z0;->y:Li2/k0;

    .line 20
    .line 21
    invoke-virtual {v0}, Li2/k0;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, v0, Li2/j0;->G:Li2/n0;

    .line 34
    .line 35
    iget-object v0, v0, Li2/n0;->d:Li2/f0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    sget-object v1, Li2/f0;->a:Li2/f0;

    .line 40
    .line 41
    if-ne v0, v1, :cond_4

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Li2/j0;->J()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 59
    return p0
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


# virtual methods
.method public final a(Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Li2/x0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, v1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lz0/e;

    .line 9
    .line 10
    iget-object v2, p0, Li2/x0;->a:Li2/j0;

    .line 11
    .line 12
    iget v3, v2, Li2/j0;->P:I

    .line 13
    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lz0/e;->g()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-boolean v0, v2, Li2/j0;->O:Z

    .line 23
    .line 24
    :cond_0
    iget-object p1, v1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lz0/e;

    .line 27
    .line 28
    iget v2, p1, Lz0/e;->c:I

    .line 29
    .line 30
    if-eqz v2, :cond_6

    .line 31
    .line 32
    sget-object v3, Li2/m1;->b:Li2/m1;

    .line 33
    .line 34
    iget-object v4, p1, Lz0/e;->a:[Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static {v4, v3, v5, v2}, Lvb/l;->L0([Ljava/lang/Object;Ljava/util/Comparator;II)V

    .line 38
    .line 39
    .line 40
    iget v2, p1, Lz0/e;->c:I

    .line 41
    .line 42
    iget-object v3, v1, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, [Li2/j0;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    array-length v4, v3

    .line 49
    if-ge v4, v2, :cond_2

    .line 50
    .line 51
    :cond_1
    const/16 v3, 0x10

    .line 52
    .line 53
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    new-array v3, v3, [Li2/j0;

    .line 58
    .line 59
    :cond_2
    const/4 v4, 0x0

    .line 60
    iput-object v4, v1, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 61
    .line 62
    :goto_0
    if-ge v5, v2, :cond_3

    .line 63
    .line 64
    iget-object v6, p1, Lz0/e;->a:[Ljava/lang/Object;

    .line 65
    .line 66
    aget-object v6, v6, v5

    .line 67
    .line 68
    aput-object v6, v3, v5

    .line 69
    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {p1}, Lz0/e;->g()V

    .line 74
    .line 75
    .line 76
    sub-int/2addr v2, v0

    .line 77
    :goto_1
    const/4 p1, -0x1

    .line 78
    if-ge p1, v2, :cond_5

    .line 79
    .line 80
    aget-object p1, v3, v2

    .line 81
    .line 82
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-boolean v0, p1, Li2/j0;->O:Z

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-static {p1}, Landroidx/media3/exoplayer/offline/u;->T0(Li2/j0;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    aput-object v4, v3, v2

    .line 93
    .line 94
    add-int/lit8 v2, v2, -0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    iput-object v3, v1, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 98
    .line 99
    :cond_6
    return-void
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public final d()V
    .locals 8

    .line 1
    iget-object v0, p0, Li2/x0;->h:Lz0/e;

    .line 2
    .line 3
    iget v1, v0, Lz0/e;->c:I

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    iget-object v2, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v4, v2, v3

    .line 13
    .line 14
    check-cast v4, Li2/w0;

    .line 15
    .line 16
    iget-object v5, v4, Li2/w0;->a:Li2/j0;

    .line 17
    .line 18
    iget-boolean v6, v4, Li2/w0;->c:Z

    .line 19
    .line 20
    iget-object v7, v4, Li2/w0;->a:Li2/j0;

    .line 21
    .line 22
    invoke-virtual {v5}, Li2/j0;->I()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_1

    .line 27
    .line 28
    iget-boolean v4, v4, Li2/w0;->b:Z

    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v7, v6, v5}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v7, v6, v5}, Li2/j0;->W(Li2/j0;ZI)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v0}, Lz0/e;->g()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
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

.method public final e(Li2/j0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Li2/j0;->z()Lz0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lz0/e;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lz0/e;->c:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_2

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Li2/j0;

    .line 15
    .line 16
    invoke-virtual {v2}, Li2/j0;->K()Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v3, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, Li2/j0;->Q:Z

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    iget-object v3, p0, Li2/x0;->b:Lc7/e1;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Lc7/e1;->p(Li2/j0;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2}, Li2/j0;->L()V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0, v2}, Li2/x0;->e(Li2/j0;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
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

.method public final f(Li2/j0;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li2/x0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "forceMeasureTheSubtree should be executed during the measureAndLayout pass"

    .line 6
    .line 7
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Li2/j0;->G:Li2/n0;

    .line 13
    .line 14
    iget-boolean v0, v0, Li2/n0;->e:Z

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, Li2/j0;->r()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "node not yet measured"

    .line 24
    .line 25
    invoke-static {v0}, Lf2/a;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    invoke-virtual {p0, p1, p2}, Li2/x0;->g(Li2/j0;Z)V

    .line 29
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
.end method

.method public final g(Li2/j0;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Li2/j0;->z()Lz0/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v0, v0, Lz0/e;->c:I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, v0, :cond_8

    .line 12
    .line 13
    aget-object v4, v1, v3

    .line 14
    .line 15
    check-cast v4, Li2/j0;

    .line 16
    .line 17
    sget-object v5, Li2/h0;->a:Li2/h0;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, Li2/j0;->s()Li2/h0;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    if-eq v7, v5, :cond_1

    .line 27
    .line 28
    iget-object v7, v4, Li2/j0;->G:Li2/n0;

    .line 29
    .line 30
    iget-object v7, v7, Li2/n0;->p:Li2/z0;

    .line 31
    .line 32
    iget-object v7, v7, Li2/z0;->y:Li2/k0;

    .line 33
    .line 34
    invoke-virtual {v7}, Li2/k0;->e()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    if-eqz p2, :cond_7

    .line 42
    .line 43
    invoke-virtual {v4}, Li2/j0;->t()Li2/h0;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    if-eq v7, v5, :cond_1

    .line 48
    .line 49
    iget-object v5, v4, Li2/j0;->G:Li2/n0;

    .line 50
    .line 51
    iget-object v5, v5, Li2/n0;->q:Li2/v0;

    .line 52
    .line 53
    if-eqz v5, :cond_7

    .line 54
    .line 55
    iget-object v5, v5, Li2/v0;->s:Li2/k0;

    .line 56
    .line 57
    if-eqz v5, :cond_7

    .line 58
    .line 59
    invoke-virtual {v5}, Li2/k0;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-ne v5, v6, :cond_7

    .line 64
    .line 65
    :cond_1
    :goto_1
    invoke-static {v4}, Li2/f;->s(Li2/j0;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-object v7, v4, Li2/j0;->G:Li2/n0;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    if-nez p2, :cond_3

    .line 74
    .line 75
    iget-boolean v5, v7, Li2/n0;->e:Z

    .line 76
    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    iget-object v5, p0, Li2/x0;->b:Lc7/e1;

    .line 80
    .line 81
    invoke-virtual {v5, v4}, Lc7/e1;->p(Li2/j0;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0, v4, v6, v2}, Li2/x0;->m(Li2/j0;ZZ)Z

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    invoke-virtual {p0, v4, v6}, Li2/x0;->f(Li2/j0;Z)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_2
    if-eqz p2, :cond_4

    .line 95
    .line 96
    iget-boolean v5, v7, Li2/n0;->e:Z

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-virtual {v4}, Li2/j0;->r()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    :goto_3
    if-eqz v5, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0, v4, p2, v2}, Li2/x0;->m(Li2/j0;ZZ)Z

    .line 106
    .line 107
    .line 108
    :cond_5
    if-eqz p2, :cond_6

    .line 109
    .line 110
    iget-boolean v5, v7, Li2/n0;->e:Z

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    invoke-virtual {v4}, Li2/j0;->r()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    :goto_4
    if-nez v5, :cond_7

    .line 118
    .line 119
    invoke-virtual {p0, v4, p2}, Li2/x0;->g(Li2/j0;Z)V

    .line 120
    .line 121
    .line 122
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_8
    if-eqz p2, :cond_9

    .line 126
    .line 127
    iget-object v0, p1, Li2/j0;->G:Li2/n0;

    .line 128
    .line 129
    iget-boolean v0, v0, Li2/n0;->e:Z

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_9
    invoke-virtual {p1}, Li2/j0;->r()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    :goto_5
    if-eqz v0, :cond_a

    .line 137
    .line 138
    invoke-virtual {p0, p1, p2, v2}, Li2/x0;->m(Li2/j0;ZZ)Z

    .line 139
    .line 140
    .line 141
    :cond_a
    return-void
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

.method public final j(Lj2/t;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Li2/x0;->b:Lc7/e1;

    .line 4
    .line 5
    iget-object v2, v1, Li2/x0;->a:Li2/j0;

    .line 6
    .line 7
    invoke-virtual {v2}, Li2/j0;->I()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    const-string v3, "performMeasureAndLayout called with unattached root"

    .line 14
    .line 15
    invoke-static {v3}, Lf2/a;->a(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v2}, Li2/j0;->J()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    const-string v3, "performMeasureAndLayout called with unplaced root"

    .line 25
    .line 26
    invoke-static {v3}, Lf2/a;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean v3, v1, Li2/x0;->c:Z

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    const-string v3, "performMeasureAndLayout called during measure layout"

    .line 34
    .line 35
    invoke-static {v3}, Lf2/a;->a(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v3, v1, Li2/x0;->i:Lf3/a;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    iput-boolean v5, v1, Li2/x0;->c:Z

    .line 45
    .line 46
    iput-boolean v5, v1, Li2/x0;->d:Z

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v0}, Lc7/e1;->J()Z

    .line 49
    .line 50
    .line 51
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object v6, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lb0/c1;

    .line 55
    .line 56
    if-eqz v3, :cond_b

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    :cond_3
    :goto_0
    :try_start_1
    iget-object v7, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lb0/c1;

    .line 62
    .line 63
    iget-object v8, v0, Lc7/e1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lb0/c1;

    .line 66
    .line 67
    iget-object v9, v6, Lb0/c1;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Li2/z1;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-nez v9, :cond_5

    .line 76
    .line 77
    iget-object v7, v6, Lb0/c1;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v7, Li2/z1;

    .line 80
    .line 81
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Li2/j0;

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Lb0/c1;->C(Li2/j0;)Z

    .line 88
    .line 89
    .line 90
    iget-object v8, v7, Li2/j0;->h:Li2/j0;

    .line 91
    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    const/4 v8, 0x1

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    const/4 v8, 0x0

    .line 97
    :goto_1
    const/4 v9, 0x0

    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto :goto_5

    .line 101
    :cond_5
    iget-object v9, v8, Lb0/c1;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v9, Li2/z1;

    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_6

    .line 110
    .line 111
    iget-object v7, v8, Lb0/c1;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v7, Li2/z1;

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    check-cast v7, Li2/j0;

    .line 120
    .line 121
    invoke-virtual {v8, v7}, Lb0/c1;->C(Li2/j0;)Z

    .line 122
    .line 123
    .line 124
    iget-object v8, v7, Li2/j0;->h:Li2/j0;

    .line 125
    .line 126
    if-eqz v8, :cond_7

    .line 127
    .line 128
    const/4 v8, 0x1

    .line 129
    :goto_2
    const/4 v9, 0x1

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    iget-object v8, v7, Lb0/c1;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v8, Li2/z1;

    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-nez v8, :cond_a

    .line 140
    .line 141
    iget-object v8, v7, Lb0/c1;->b:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v8, Li2/z1;

    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    check-cast v8, Li2/j0;

    .line 150
    .line 151
    invoke-virtual {v7, v8}, Lb0/c1;->C(Li2/j0;)Z

    .line 152
    .line 153
    .line 154
    move-object v7, v8

    .line 155
    :cond_7
    const/4 v8, 0x0

    .line 156
    goto :goto_2

    .line 157
    :goto_3
    invoke-virtual {v1, v7, v8, v9}, Li2/x0;->m(Li2/j0;ZZ)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-nez v9, :cond_9

    .line 162
    .line 163
    iget-object v9, v7, Li2/j0;->G:Li2/n0;

    .line 164
    .line 165
    iget-boolean v9, v9, Li2/n0;->f:Z

    .line 166
    .line 167
    if-eqz v9, :cond_8

    .line 168
    .line 169
    sget-object v9, Li2/w;->b:Li2/w;

    .line 170
    .line 171
    invoke-virtual {v0, v7, v9}, Lc7/e1;->i(Li2/j0;Li2/w;)V

    .line 172
    .line 173
    .line 174
    :cond_8
    invoke-virtual {v7}, Li2/j0;->p()Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    if-eqz v9, :cond_9

    .line 179
    .line 180
    sget-object v9, Li2/w;->d:Li2/w;

    .line 181
    .line 182
    invoke-virtual {v0, v7, v9}, Lc7/e1;->i(Li2/j0;Li2/w;)V

    .line 183
    .line 184
    .line 185
    :cond_9
    if-ne v7, v2, :cond_3

    .line 186
    .line 187
    if-eqz v8, :cond_3

    .line 188
    .line 189
    const/4 v3, 0x1

    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_a
    if-eqz p1, :cond_c

    .line 193
    .line 194
    invoke-virtual/range {p1 .. p1}, Lj2/t;->b()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_b
    const/4 v3, 0x0

    .line 199
    :cond_c
    :goto_4
    iput-boolean v4, v1, Li2/x0;->c:Z

    .line 200
    .line 201
    iput-boolean v4, v1, Li2/x0;->d:Z

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :goto_5
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    :catchall_1
    move-exception v0

    .line 206
    iput-boolean v4, v1, Li2/x0;->c:Z

    .line 207
    .line 208
    iput-boolean v4, v1, Li2/x0;->d:Z

    .line 209
    .line 210
    throw v0

    .line 211
    :cond_d
    const/4 v3, 0x0

    .line 212
    :goto_6
    iget-object v0, v1, Li2/x0;->f:Lz0/e;

    .line 213
    .line 214
    iget-object v2, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 215
    .line 216
    iget v6, v0, Lz0/e;->c:I

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    :goto_7
    if-ge v7, v6, :cond_19

    .line 220
    .line 221
    aget-object v8, v2, v7

    .line 222
    .line 223
    check-cast v8, Li2/j0;

    .line 224
    .line 225
    iget-object v8, v8, Li2/j0;->F:Li2/d1;

    .line 226
    .line 227
    iget-object v9, v8, Li2/d1;->c:Li2/u;

    .line 228
    .line 229
    const/16 v10, 0x80

    .line 230
    .line 231
    invoke-static {v10}, Li2/h1;->g(I)Z

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    if-eqz v11, :cond_e

    .line 236
    .line 237
    iget-object v12, v9, Li2/u;->R:Li2/a2;

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_e
    iget-object v12, v9, Li2/u;->R:Li2/a2;

    .line 241
    .line 242
    iget-object v12, v12, Lj1/p;->e:Lj1/p;

    .line 243
    .line 244
    if-nez v12, :cond_f

    .line 245
    .line 246
    goto/16 :goto_f

    .line 247
    .line 248
    :cond_f
    :goto_8
    sget-object v13, Li2/g1;->M:Lq1/i0;

    .line 249
    .line 250
    invoke-virtual {v9, v11}, Li2/g1;->O0(Z)Lj1/p;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    :goto_9
    if-eqz v9, :cond_18

    .line 255
    .line 256
    iget v11, v9, Lj1/p;->d:I

    .line 257
    .line 258
    and-int/2addr v11, v10

    .line 259
    if-eqz v11, :cond_18

    .line 260
    .line 261
    iget v11, v9, Lj1/p;->c:I

    .line 262
    .line 263
    and-int/2addr v11, v10

    .line 264
    if-eqz v11, :cond_17

    .line 265
    .line 266
    move-object v13, v9

    .line 267
    const/4 v14, 0x0

    .line 268
    :goto_a
    if-eqz v13, :cond_17

    .line 269
    .line 270
    instance-of v15, v13, Li2/y;

    .line 271
    .line 272
    if-eqz v15, :cond_10

    .line 273
    .line 274
    check-cast v13, Li2/y;

    .line 275
    .line 276
    iget-object v15, v8, Li2/d1;->c:Li2/u;

    .line 277
    .line 278
    invoke-interface {v13, v15}, Li2/y;->B(Lg2/c0;)V

    .line 279
    .line 280
    .line 281
    goto :goto_e

    .line 282
    :cond_10
    iget v15, v13, Lj1/p;->c:I

    .line 283
    .line 284
    and-int/2addr v15, v10

    .line 285
    if-eqz v15, :cond_16

    .line 286
    .line 287
    instance-of v15, v13, Li2/n;

    .line 288
    .line 289
    if-eqz v15, :cond_16

    .line 290
    .line 291
    move-object v15, v13

    .line 292
    check-cast v15, Li2/n;

    .line 293
    .line 294
    iget-object v15, v15, Li2/n;->p:Lj1/p;

    .line 295
    .line 296
    :goto_b
    if-eqz v15, :cond_15

    .line 297
    .line 298
    iget v11, v15, Lj1/p;->c:I

    .line 299
    .line 300
    and-int/2addr v11, v10

    .line 301
    if-eqz v11, :cond_14

    .line 302
    .line 303
    add-int/lit8 v4, v4, 0x1

    .line 304
    .line 305
    if-ne v4, v5, :cond_11

    .line 306
    .line 307
    move-object v13, v15

    .line 308
    goto :goto_c

    .line 309
    :cond_11
    if-nez v14, :cond_12

    .line 310
    .line 311
    new-instance v14, Lz0/e;

    .line 312
    .line 313
    const/16 v11, 0x10

    .line 314
    .line 315
    new-array v11, v11, [Lj1/p;

    .line 316
    .line 317
    invoke-direct {v14, v11}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_12
    if-eqz v13, :cond_13

    .line 321
    .line 322
    invoke-virtual {v14, v13}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    :cond_13
    invoke-virtual {v14, v15}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    :cond_14
    :goto_c
    iget-object v15, v15, Lj1/p;->f:Lj1/p;

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_15
    if-ne v4, v5, :cond_16

    .line 333
    .line 334
    :goto_d
    const/4 v4, 0x0

    .line 335
    goto :goto_a

    .line 336
    :cond_16
    :goto_e
    invoke-static {v14}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    goto :goto_d

    .line 341
    :cond_17
    if-eq v9, v12, :cond_18

    .line 342
    .line 343
    iget-object v9, v9, Lj1/p;->f:Lj1/p;

    .line 344
    .line 345
    const/4 v4, 0x0

    .line 346
    goto :goto_9

    .line 347
    :cond_18
    :goto_f
    add-int/lit8 v7, v7, 0x1

    .line 348
    .line 349
    const/4 v4, 0x0

    .line 350
    goto/16 :goto_7

    .line 351
    .line 352
    :cond_19
    invoke-virtual {v0}, Lz0/e;->g()V

    .line 353
    .line 354
    .line 355
    return v3
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public final k(Li2/j0;J)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v4, v0, Li2/j0;->Q:Z

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v4, v1, Li2/x0;->a:Li2/j0;

    .line 13
    .line 14
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    const-string v5, "measureAndLayout called on root"

    .line 21
    .line 22
    invoke-static {v5}, Lf2/a;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {v4}, Li2/j0;->I()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_2

    .line 30
    .line 31
    const-string v5, "performMeasureAndLayout called with unattached root"

    .line 32
    .line 33
    invoke-static {v5}, Lf2/a;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {v4}, Li2/j0;->J()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_3

    .line 41
    .line 42
    const-string v4, "performMeasureAndLayout called with unplaced root"

    .line 43
    .line 44
    invoke-static {v4}, Lf2/a;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-boolean v4, v1, Li2/x0;->c:Z

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    const-string v4, "performMeasureAndLayout called during measure layout"

    .line 52
    .line 53
    invoke-static {v4}, Lf2/a;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iget-object v4, v1, Li2/x0;->i:Lf3/a;

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    const/4 v6, 0x0

    .line 60
    if-eqz v4, :cond_8

    .line 61
    .line 62
    iput-boolean v5, v1, Li2/x0;->c:Z

    .line 63
    .line 64
    iput-boolean v6, v1, Li2/x0;->d:Z

    .line 65
    .line 66
    :try_start_0
    iget-object v4, v1, Li2/x0;->b:Lc7/e1;

    .line 67
    .line 68
    iget-object v7, v4, Lc7/e1;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, Lb0/c1;

    .line 71
    .line 72
    invoke-virtual {v7, v0}, Lb0/c1;->C(Li2/j0;)Z

    .line 73
    .line 74
    .line 75
    iget-object v7, v4, Lc7/e1;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v7, Lb0/c1;

    .line 78
    .line 79
    invoke-virtual {v7, v0}, Lb0/c1;->C(Li2/j0;)Z

    .line 80
    .line 81
    .line 82
    iget-object v4, v4, Lc7/e1;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Lb0/c1;

    .line 85
    .line 86
    invoke-virtual {v4, v0}, Lb0/c1;->C(Li2/j0;)Z

    .line 87
    .line 88
    .line 89
    new-instance v4, Lf3/a;

    .line 90
    .line 91
    invoke-direct {v4, v2, v3}, Lf3/a;-><init>(J)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v4}, Li2/x0;->b(Li2/j0;Lf3/a;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_5

    .line 99
    .line 100
    iget-object v4, v0, Li2/j0;->G:Li2/n0;

    .line 101
    .line 102
    iget-boolean v4, v4, Li2/n0;->f:Z

    .line 103
    .line 104
    if-eqz v4, :cond_6

    .line 105
    .line 106
    :cond_5
    invoke-virtual {v0}, Li2/j0;->K()Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-static {v4, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    invoke-virtual {v0}, Li2/j0;->L()V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto :goto_1

    .line 124
    :cond_6
    :goto_0
    invoke-virtual/range {p0 .. p1}, Li2/x0;->e(Li2/j0;)V

    .line 125
    .line 126
    .line 127
    new-instance v4, Lf3/a;

    .line 128
    .line 129
    invoke-direct {v4, v2, v3}, Lf3/a;-><init>(J)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v4}, Li2/x0;->c(Li2/j0;Lf3/a;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Li2/j0;->p()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_7

    .line 140
    .line 141
    invoke-virtual {v0}, Li2/j0;->J()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_7

    .line 146
    .line 147
    invoke-virtual {v0}, Li2/j0;->U()V

    .line 148
    .line 149
    .line 150
    iget-object v2, v1, Li2/x0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget v3, v0, Li2/j0;->P:I

    .line 156
    .line 157
    if-lez v3, :cond_7

    .line 158
    .line 159
    iget-object v2, v2, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Lz0/e;

    .line 162
    .line 163
    invoke-virtual {v2, v0}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iput-boolean v5, v0, Li2/j0;->O:Z

    .line 167
    .line 168
    :cond_7
    invoke-virtual {v1}, Li2/x0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    .line 171
    iput-boolean v6, v1, Li2/x0;->c:Z

    .line 172
    .line 173
    iput-boolean v6, v1, Li2/x0;->d:Z

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    iput-boolean v6, v1, Li2/x0;->c:Z

    .line 179
    .line 180
    iput-boolean v6, v1, Li2/x0;->d:Z

    .line 181
    .line 182
    throw v0

    .line 183
    :cond_8
    :goto_2
    iget-object v0, v1, Li2/x0;->f:Lz0/e;

    .line 184
    .line 185
    iget-object v2, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 186
    .line 187
    iget v3, v0, Lz0/e;->c:I

    .line 188
    .line 189
    const/4 v4, 0x0

    .line 190
    :goto_3
    if-ge v4, v3, :cond_14

    .line 191
    .line 192
    aget-object v7, v2, v4

    .line 193
    .line 194
    check-cast v7, Li2/j0;

    .line 195
    .line 196
    iget-object v7, v7, Li2/j0;->F:Li2/d1;

    .line 197
    .line 198
    iget-object v8, v7, Li2/d1;->c:Li2/u;

    .line 199
    .line 200
    const/16 v9, 0x80

    .line 201
    .line 202
    invoke-static {v9}, Li2/h1;->g(I)Z

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    if-eqz v10, :cond_9

    .line 207
    .line 208
    iget-object v11, v8, Li2/u;->R:Li2/a2;

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_9
    iget-object v11, v8, Li2/u;->R:Li2/a2;

    .line 212
    .line 213
    iget-object v11, v11, Lj1/p;->e:Lj1/p;

    .line 214
    .line 215
    if-nez v11, :cond_a

    .line 216
    .line 217
    goto/16 :goto_b

    .line 218
    .line 219
    :cond_a
    :goto_4
    sget-object v12, Li2/g1;->M:Lq1/i0;

    .line 220
    .line 221
    invoke-virtual {v8, v10}, Li2/g1;->O0(Z)Lj1/p;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    :goto_5
    if-eqz v8, :cond_13

    .line 226
    .line 227
    iget v10, v8, Lj1/p;->d:I

    .line 228
    .line 229
    and-int/2addr v10, v9

    .line 230
    if-eqz v10, :cond_13

    .line 231
    .line 232
    iget v10, v8, Lj1/p;->c:I

    .line 233
    .line 234
    and-int/2addr v10, v9

    .line 235
    if-eqz v10, :cond_12

    .line 236
    .line 237
    const/4 v10, 0x0

    .line 238
    move-object v12, v8

    .line 239
    move-object v13, v10

    .line 240
    :goto_6
    if-eqz v12, :cond_12

    .line 241
    .line 242
    instance-of v14, v12, Li2/y;

    .line 243
    .line 244
    if-eqz v14, :cond_b

    .line 245
    .line 246
    check-cast v12, Li2/y;

    .line 247
    .line 248
    iget-object v14, v7, Li2/d1;->c:Li2/u;

    .line 249
    .line 250
    invoke-interface {v12, v14}, Li2/y;->B(Lg2/c0;)V

    .line 251
    .line 252
    .line 253
    goto :goto_a

    .line 254
    :cond_b
    iget v14, v12, Lj1/p;->c:I

    .line 255
    .line 256
    and-int/2addr v14, v9

    .line 257
    if-eqz v14, :cond_11

    .line 258
    .line 259
    instance-of v14, v12, Li2/n;

    .line 260
    .line 261
    if-eqz v14, :cond_11

    .line 262
    .line 263
    move-object v14, v12

    .line 264
    check-cast v14, Li2/n;

    .line 265
    .line 266
    iget-object v14, v14, Li2/n;->p:Lj1/p;

    .line 267
    .line 268
    const/4 v15, 0x0

    .line 269
    :goto_7
    if-eqz v14, :cond_10

    .line 270
    .line 271
    iget v6, v14, Lj1/p;->c:I

    .line 272
    .line 273
    and-int/2addr v6, v9

    .line 274
    if-eqz v6, :cond_f

    .line 275
    .line 276
    add-int/lit8 v15, v15, 0x1

    .line 277
    .line 278
    if-ne v15, v5, :cond_c

    .line 279
    .line 280
    move-object v12, v14

    .line 281
    goto :goto_8

    .line 282
    :cond_c
    if-nez v13, :cond_d

    .line 283
    .line 284
    new-instance v13, Lz0/e;

    .line 285
    .line 286
    const/16 v6, 0x10

    .line 287
    .line 288
    new-array v6, v6, [Lj1/p;

    .line 289
    .line 290
    invoke-direct {v13, v6}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_d
    if-eqz v12, :cond_e

    .line 294
    .line 295
    invoke-virtual {v13, v12}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    move-object v12, v10

    .line 299
    :cond_e
    invoke-virtual {v13, v14}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_f
    :goto_8
    iget-object v14, v14, Lj1/p;->f:Lj1/p;

    .line 303
    .line 304
    const/4 v6, 0x0

    .line 305
    goto :goto_7

    .line 306
    :cond_10
    if-ne v15, v5, :cond_11

    .line 307
    .line 308
    :goto_9
    const/4 v6, 0x0

    .line 309
    goto :goto_6

    .line 310
    :cond_11
    :goto_a
    invoke-static {v13}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    goto :goto_9

    .line 315
    :cond_12
    if-eq v8, v11, :cond_13

    .line 316
    .line 317
    iget-object v8, v8, Lj1/p;->f:Lj1/p;

    .line 318
    .line 319
    const/4 v6, 0x0

    .line 320
    goto :goto_5

    .line 321
    :cond_13
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 322
    .line 323
    const/4 v6, 0x0

    .line 324
    goto/16 :goto_3

    .line 325
    .line 326
    :cond_14
    invoke-virtual {v0}, Lz0/e;->g()V

    .line 327
    .line 328
    .line 329
    return-void
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Li2/x0;->b:Lc7/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc7/e1;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, Li2/x0;->a:Li2/j0;

    .line 10
    .line 11
    invoke-virtual {v1}, Li2/j0;->I()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v2, "performMeasureAndLayout called with unattached root"

    .line 18
    .line 19
    invoke-static {v2}, Lf2/a;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, Li2/j0;->J()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "performMeasureAndLayout called with unplaced root"

    .line 29
    .line 30
    invoke-static {v2}, Lf2/a;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean v2, p0, Li2/x0;->c:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    const-string v2, "performMeasureAndLayout called during measure layout"

    .line 38
    .line 39
    invoke-static {v2}, Lf2/a;->a(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v2, p0, Li2/x0;->i:Lf3/a;

    .line 43
    .line 44
    if-eqz v2, :cond_5

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    iput-boolean v2, p0, Li2/x0;->c:Z

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    iput-boolean v3, p0, Li2/x0;->d:Z

    .line 51
    .line 52
    :try_start_0
    iget-object v4, v0, Lc7/e1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lb0/c1;

    .line 55
    .line 56
    iget-object v4, v4, Lb0/c1;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Li2/z1;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    iget-object v0, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lb0/c1;

    .line 69
    .line 70
    iget-object v0, v0, Lb0/c1;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Li2/z1;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    iget-object v0, v1, Li2/j0;->h:Li2/j0;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0, v1, v2}, Li2/x0;->o(Li2/j0;Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {p0, v1}, Li2/x0;->n(Li2/j0;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_0
    invoke-virtual {p0, v1, v3}, Li2/x0;->o(Li2/j0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    .line 96
    iput-boolean v3, p0, Li2/x0;->c:Z

    .line 97
    .line 98
    iput-boolean v3, p0, Li2/x0;->d:Z

    .line 99
    .line 100
    return-void

    .line 101
    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    iput-boolean v3, p0, Li2/x0;->c:Z

    .line 104
    .line 105
    iput-boolean v3, p0, Li2/x0;->d:Z

    .line 106
    .line 107
    throw v0

    .line 108
    :cond_5
    return-void
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

.method public final m(Li2/j0;ZZ)Z
    .locals 5

    .line 1
    iget-boolean v0, p1, Li2/j0;->Q:Z

    .line 2
    .line 3
    iget-object v1, p1, Li2/j0;->G:Li2/n0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Li2/j0;->J()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v1, Li2/n0;->p:Li2/z0;

    .line 17
    .line 18
    iget-boolean v0, v0, Li2/z0;->u:Z

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-static {p1}, Li2/x0;->i(Li2/j0;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Li2/j0;->K()Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v0, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-static {p1}, Li2/x0;->h(Li2/j0;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, v1, Li2/n0;->p:Li2/z0;

    .line 47
    .line 48
    iget-object v0, v0, Li2/z0;->y:Li2/k0;

    .line 49
    .line 50
    invoke-virtual {v0}, Li2/k0;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    iget-object v0, v1, Li2/n0;->q:Li2/v0;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Li2/v0;->s:Li2/k0;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Li2/k0;->e()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-ne v0, v3, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    return v2

    .line 72
    :cond_2
    :goto_1
    iget-object v0, p0, Li2/x0;->a:Li2/j0;

    .line 73
    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    iget-object v4, p0, Li2/x0;->i:Lf3/a;

    .line 77
    .line 78
    invoke-static {v4}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const/4 v4, 0x0

    .line 83
    :goto_2
    if-eqz p2, :cond_6

    .line 84
    .line 85
    iget-boolean p2, v1, Li2/n0;->e:Z

    .line 86
    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    invoke-static {p1, v4}, Li2/x0;->b(Li2/j0;Lf3/a;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :cond_4
    if-eqz p3, :cond_f

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    iget-boolean p2, v1, Li2/n0;->f:Z

    .line 98
    .line 99
    if-eqz p2, :cond_f

    .line 100
    .line 101
    :cond_5
    invoke-virtual {p1}, Li2/j0;->K()Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-static {p2, p3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_f

    .line 112
    .line 113
    invoke-virtual {p1}, Li2/j0;->L()V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_6
    invoke-virtual {p1}, Li2/j0;->r()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    invoke-static {p1, v4}, Li2/x0;->c(Li2/j0;Lf3/a;)Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    goto :goto_3

    .line 129
    :cond_7
    const/4 p2, 0x0

    .line 130
    :goto_3
    if-eqz p3, :cond_e

    .line 131
    .line 132
    invoke-virtual {p1}, Li2/j0;->p()Z

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    if-eqz p3, :cond_e

    .line 137
    .line 138
    if-eq p1, v0, :cond_8

    .line 139
    .line 140
    invoke-virtual {p1}, Li2/j0;->v()Li2/j0;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    if-eqz p3, :cond_e

    .line 145
    .line 146
    invoke-virtual {p3}, Li2/j0;->J()Z

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    if-ne p3, v3, :cond_e

    .line 151
    .line 152
    iget-object p3, v1, Li2/n0;->p:Li2/z0;

    .line 153
    .line 154
    iget-boolean p3, p3, Li2/z0;->u:Z

    .line 155
    .line 156
    if-eqz p3, :cond_e

    .line 157
    .line 158
    :cond_8
    if-ne p1, v0, :cond_c

    .line 159
    .line 160
    iget-object p3, p1, Li2/j0;->C:Li2/h0;

    .line 161
    .line 162
    sget-object v0, Li2/h0;->c:Li2/h0;

    .line 163
    .line 164
    if-ne p3, v0, :cond_9

    .line 165
    .line 166
    invoke-virtual {p1}, Li2/j0;->f()V

    .line 167
    .line 168
    .line 169
    :cond_9
    invoke-virtual {p1}, Li2/j0;->v()Li2/j0;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    if-eqz p3, :cond_a

    .line 174
    .line 175
    iget-object p3, p3, Li2/j0;->F:Li2/d1;

    .line 176
    .line 177
    iget-object p3, p3, Li2/d1;->c:Li2/u;

    .line 178
    .line 179
    if-eqz p3, :cond_a

    .line 180
    .line 181
    iget-object p3, p3, Li2/q0;->l:Lg2/q0;

    .line 182
    .line 183
    if-nez p3, :cond_b

    .line 184
    .line 185
    :cond_a
    invoke-static {p1}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    check-cast p3, Lj2/v;

    .line 190
    .line 191
    invoke-virtual {p3}, Lj2/v;->getPlacementScope()Lg2/f1;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    :cond_b
    iget-object v0, v1, Li2/n0;->p:Li2/z0;

    .line 196
    .line 197
    invoke-static {p3, v0, v2, v2}, Lg2/f1;->k(Lg2/f1;Lg2/g1;II)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_c
    invoke-virtual {p1}, Li2/j0;->U()V

    .line 202
    .line 203
    .line 204
    :goto_4
    iget-object p3, p0, Li2/x0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 205
    .line 206
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    iget v0, p1, Li2/j0;->P:I

    .line 210
    .line 211
    if-lez v0, :cond_d

    .line 212
    .line 213
    iget-object p3, p3, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p3, Lz0/e;

    .line 216
    .line 217
    invoke-virtual {p3, p1}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iput-boolean v3, p1, Li2/j0;->O:Z

    .line 221
    .line 222
    :cond_d
    invoke-static {p1}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    check-cast p3, Lj2/v;

    .line 227
    .line 228
    invoke-virtual {p3}, Lj2/v;->getRectManager()Lr2/b;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    invoke-virtual {p3, p1}, Lr2/b;->e(Li2/j0;)V

    .line 233
    .line 234
    .line 235
    :cond_e
    move v2, p2

    .line 236
    :cond_f
    :goto_5
    invoke-virtual {p0}, Li2/x0;->d()V

    .line 237
    .line 238
    .line 239
    return v2
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
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public final n(Li2/j0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Li2/j0;->z()Lz0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, Lz0/e;->a:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p1, p1, Lz0/e;->c:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p1, :cond_3

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Li2/j0;

    .line 15
    .line 16
    invoke-virtual {v2}, Li2/j0;->s()Li2/h0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Li2/h0;->a:Li2/h0;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    iget-object v3, v2, Li2/j0;->G:Li2/n0;

    .line 25
    .line 26
    iget-object v3, v3, Li2/n0;->p:Li2/z0;

    .line 27
    .line 28
    iget-object v3, v3, Li2/z0;->y:Li2/k0;

    .line 29
    .line 30
    invoke-virtual {v3}, Li2/k0;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    :cond_0
    invoke-static {v2}, Li2/f;->s(Li2/j0;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-virtual {p0, v2, v3}, Li2/x0;->o(Li2/j0;Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p0, v2}, Li2/x0;->n(Li2/j0;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
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

.method public final o(Li2/j0;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Li2/j0;->Q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Li2/x0;->a:Li2/j0;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Li2/x0;->i:Lf3/a;

    .line 11
    .line 12
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-static {p1, v0}, Li2/x0;->b(Li2/j0;Lf3/a;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    invoke-static {p1, v0}, Li2/x0;->c(Li2/j0;Lf3/a;)Z

    .line 24
    .line 25
    .line 26
    return-void
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

.method public final p(Li2/j0;Z)Z
    .locals 4

    .line 1
    iget-object v0, p1, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->d:Li2/f0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_6

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    if-eq v0, v3, :cond_5

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    if-ne v0, v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1}, Li2/j0;->r()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p2, p1, Li2/j0;->G:Li2/n0;

    .line 34
    .line 35
    iget-object p2, p2, Li2/n0;->p:Li2/z0;

    .line 36
    .line 37
    iput-boolean v2, p2, Li2/z0;->v:Z

    .line 38
    .line 39
    iget-boolean p2, p1, Li2/j0;->Q:Z

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p1}, Li2/j0;->J()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {p1}, Li2/x0;->i(Li2/j0;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_6

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p1}, Li2/j0;->v()Li2/j0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p2}, Li2/j0;->r()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object p2, p0, Li2/x0;->b:Lc7/e1;

    .line 70
    .line 71
    sget-object v0, Li2/w;->c:Li2/w;

    .line 72
    .line 73
    invoke-virtual {p2, p1, v0}, Lc7/e1;->i(Li2/j0;Li2/w;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-boolean p1, p0, Li2/x0;->d:Z

    .line 77
    .line 78
    if-nez p1, :cond_6

    .line 79
    .line 80
    return v2

    .line 81
    :cond_4
    new-instance p1, Lce/j0;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_5
    new-instance v0, Li2/w0;

    .line 88
    .line 89
    invoke-direct {v0, p1, v1, p2}, Li2/w0;-><init>(Li2/j0;ZZ)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Li2/x0;->h:Lz0/e;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_6
    :goto_1
    return v1
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

.method public final q(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/x0;->i:Lf3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-wide v0, v0, Lf3/a;->a:J

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lf3/a;->b(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    if-nez v0, :cond_4

    .line 14
    .line 15
    iget-boolean v0, p0, Li2/x0;->c:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v0, "updateRootConstraints called while measuring"

    .line 20
    .line 21
    invoke-static {v0}, Lf2/a;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    new-instance v0, Lf3/a;

    .line 25
    .line 26
    invoke-direct {v0, p1, p2}, Lf3/a;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Li2/x0;->i:Lf3/a;

    .line 30
    .line 31
    iget-object p1, p0, Li2/x0;->a:Li2/j0;

    .line 32
    .line 33
    iget-object p2, p1, Li2/j0;->h:Li2/j0;

    .line 34
    .line 35
    iget-object v0, p1, Li2/j0;->G:Li2/n0;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    iput-boolean v1, v0, Li2/n0;->e:Z

    .line 41
    .line 42
    :cond_2
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 43
    .line 44
    iput-boolean v1, v0, Li2/z0;->v:Z

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    sget-object p2, Li2/w;->a:Li2/w;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    sget-object p2, Li2/w;->c:Li2/w;

    .line 52
    .line 53
    :goto_1
    iget-object v0, p0, Li2/x0;->b:Lc7/e1;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2}, Lc7/e1;->i(Li2/j0;Li2/w;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-void
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
