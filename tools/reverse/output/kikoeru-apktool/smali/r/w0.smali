.class public final Lr/w0;
.super Landroidx/lifecycle/q;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final r:Lr/l;

.field public static final s:Lr/l;


# instance fields
.field public final b:Lx0/e1;

.field public final c:Lx0/e1;

.field public d:Ljava/lang/Object;

.field public e:Lr/q1;

.field public f:J

.field public final g:Lb0/d0;

.field public final h:Lx0/a1;

.field public i:Lhf/k;

.field public final j:Lrf/c;

.field public final k:Lr/m0;

.field public l:J

.field public final m:Lo/g0;

.field public n:Lr/p0;

.field public final o:Lr/q0;

.field public p:F

.field public final q:Lr/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lr/l;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr/w0;->r:Lr/l;

    .line 8
    .line 9
    new-instance v0, Lr/l;

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lr/l;-><init>(F)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lr/w0;->s:Lr/l;

    .line 17
    .line 18
    return-void
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

.method public constructor <init>(Le7/j;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-direct {p0, v0}, Landroidx/lifecycle/q;-><init>(I)V

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lr/w0;->b:Lx0/e1;

    .line 10
    .line 11
    invoke-static {p1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lr/w0;->c:Lx0/e1;

    .line 16
    .line 17
    iput-object p1, p0, Lr/w0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, Lb0/d0;

    .line 20
    .line 21
    const/16 v0, 0x1d

    .line 22
    .line 23
    invoke-direct {p1, v0, p0}, Lb0/d0;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lr/w0;->g:Lb0/d0;

    .line 27
    .line 28
    new-instance p1, Lx0/a1;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, v0}, Lx0/a1;-><init>(F)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lr/w0;->h:Lx0/a1;

    .line 35
    .line 36
    new-instance p1, Lrf/c;

    .line 37
    .line 38
    invoke-direct {p1}, Lrf/c;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lr/w0;->j:Lrf/c;

    .line 42
    .line 43
    new-instance p1, Lr/m0;

    .line 44
    .line 45
    invoke-direct {p1}, Lr/m0;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lr/w0;->k:Lr/m0;

    .line 49
    .line 50
    const-wide/high16 v0, -0x8000000000000000L

    .line 51
    .line 52
    iput-wide v0, p0, Lr/w0;->l:J

    .line 53
    .line 54
    new-instance p1, Lo/g0;

    .line 55
    .line 56
    invoke-direct {p1}, Lo/g0;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lr/w0;->m:Lo/g0;

    .line 60
    .line 61
    new-instance p1, Lr/q0;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    invoke-direct {p1, p0, v0}, Lr/q0;-><init>(Lr/w0;I)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lr/w0;->o:Lr/q0;

    .line 68
    .line 69
    new-instance p1, Lr/q0;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p1, p0, v0}, Lr/q0;-><init>(Lr/w0;I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lr/w0;->q:Lr/q0;

    .line 76
    .line 77
    return-void
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

.method public static final B1(Lr/w0;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lr/w0;->e:Lr/q1;

    .line 2
    .line 3
    iget-object v1, p0, Lr/w0;->h:Lx0/a1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v2, p0, Lr/w0;->n:Lr/p0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v2, :cond_4

    .line 12
    .line 13
    iget-wide v4, p0, Lr/w0;->f:J

    .line 14
    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    cmp-long v2, v4, v6

    .line 18
    .line 19
    if-lez v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/high16 v4, 0x3f800000    # 1.0f

    .line 26
    .line 27
    cmpg-float v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, p0, Lr/w0;->c:Lx0/e1;

    .line 33
    .line 34
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v4, p0, Lr/w0;->b:Lx0/e1;

    .line 39
    .line 40
    invoke-virtual {v4}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v2, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance v2, Lr/p0;

    .line 52
    .line 53
    invoke-direct {v2}, Lr/p0;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iput v4, v2, Lr/p0;->d:F

    .line 61
    .line 62
    iget-wide v4, p0, Lr/w0;->f:J

    .line 63
    .line 64
    iput-wide v4, v2, Lr/p0;->g:J

    .line 65
    .line 66
    long-to-double v4, v4

    .line 67
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    float-to-double v6, v6

    .line 72
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 73
    .line 74
    sub-double/2addr v8, v6

    .line 75
    mul-double v8, v8, v4

    .line 76
    .line 77
    invoke-static {v8, v9}, Llc/b;->S(D)J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iput-wide v4, v2, Lr/p0;->h:J

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget-object v5, v2, Lr/p0;->e:Lr/l;

    .line 89
    .line 90
    invoke-virtual {v5, v1, v4}, Lr/l;->e(FI)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    :goto_0
    move-object v2, v3

    .line 95
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 96
    .line 97
    iget-wide v4, p0, Lr/w0;->f:J

    .line 98
    .line 99
    iput-wide v4, v2, Lr/p0;->g:J

    .line 100
    .line 101
    iget-object v1, p0, Lr/w0;->m:Lo/g0;

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Lr/q1;->m(Lr/p0;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    iput-object v3, p0, Lr/w0;->n:Lr/p0;

    .line 110
    .line 111
    return-void
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
.end method

.method public static final C1(Lr/w0;Lr/p0;J)V
    .locals 8

    .line 1
    iget-wide v0, p1, Lr/p0;->a:J

    .line 2
    .line 3
    iget-object v5, p1, Lr/p0;->e:Lr/l;

    .line 4
    .line 5
    add-long v3, v0, p2

    .line 6
    .line 7
    iput-wide v3, p1, Lr/p0;->a:J

    .line 8
    .line 9
    iget-wide p2, p1, Lr/p0;->h:J

    .line 10
    .line 11
    const/high16 p0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    cmp-long v0, v3, p2

    .line 14
    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    iput p0, p1, Lr/p0;->d:F

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v2, p1, Lr/p0;->b:Lr/b2;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object p2, p1, Lr/p0;->f:Lr/l;

    .line 26
    .line 27
    if-nez p2, :cond_1

    .line 28
    .line 29
    sget-object p2, Lr/w0;->r:Lr/l;

    .line 30
    .line 31
    :cond_1
    move-object v7, p2

    .line 32
    sget-object v6, Lr/w0;->s:Lr/l;

    .line 33
    .line 34
    invoke-interface/range {v2 .. v7}, Lr/x1;->g(JLr/p;Lr/p;Lr/p;)Lr/p;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lr/l;

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Lr/l;->a(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    const/4 p3, 0x0

    .line 45
    invoke-static {p2, p3, p0}, Lnh/b;->j(FFF)F

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput p0, p1, Lr/p0;->d:F

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {v5, v0}, Lr/l;->a(I)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    long-to-float v1, v3

    .line 57
    long-to-float p2, p2

    .line 58
    div-float/2addr v1, p2

    .line 59
    const/4 p2, 0x1

    .line 60
    int-to-float p2, p2

    .line 61
    sub-float/2addr p2, v1

    .line 62
    mul-float p2, p2, v0

    .line 63
    .line 64
    mul-float v1, v1, p0

    .line 65
    .line 66
    add-float/2addr v1, p2

    .line 67
    iput v1, p1, Lr/p0;->d:F

    .line 68
    .line 69
    return-void
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

.method public static final D1(Lr/w0;Lac/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lr/s0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lr/s0;

    .line 10
    .line 11
    iget v1, v0, Lr/s0;->g:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lr/s0;->g:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lr/s0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lr/s0;-><init>(Lr/w0;Lac/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lac/c;->b:Lyb/h;

    .line 29
    .line 30
    iget-object v1, v0, Lr/s0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    iget v2, v0, Lr/s0;->g:I

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    const-wide/high16 v5, -0x8000000000000000L

    .line 37
    .line 38
    sget-object v7, Lub/a0;->a:Lub/a0;

    .line 39
    .line 40
    sget-object v8, Lzb/a;->a:Lzb/a;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-eq v2, v4, :cond_2

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    :goto_1
    iget-object p0, v0, Lr/s0;->d:Lr/w0;

    .line 58
    .line 59
    invoke-static {v1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {v1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lr/w0;->m:Lo/g0;

    .line 67
    .line 68
    invoke-virtual {v1}, Lo/g0;->g()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    iget-object v1, p0, Lr/w0;->n:Lr/p0;

    .line 75
    .line 76
    if-nez v1, :cond_4

    .line 77
    .line 78
    return-object v7

    .line 79
    :cond_4
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lr/d;->n(Lyb/h;)F

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v2, 0x0

    .line 87
    cmpg-float v1, v1, v2

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, Lr/w0;->H1()V

    .line 92
    .line 93
    .line 94
    iput-wide v5, p0, Lr/w0;->l:J

    .line 95
    .line 96
    return-object v7

    .line 97
    :cond_5
    iget-wide v1, p0, Lr/w0;->l:J

    .line 98
    .line 99
    cmp-long v9, v1, v5

    .line 100
    .line 101
    if-nez v9, :cond_6

    .line 102
    .line 103
    iget-object v1, p0, Lr/w0;->o:Lr/q0;

    .line 104
    .line 105
    iput-object p0, v0, Lr/s0;->d:Lr/w0;

    .line 106
    .line 107
    iput v4, v0, Lr/s0;->g:I

    .line 108
    .line 109
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lx0/v;->s(Lyb/h;)Lx0/s0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-interface {p1, v1, v0}, Lx0/s0;->k(Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v8, :cond_6

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    :goto_2
    iget-object p1, p0, Lr/w0;->m:Lo/g0;

    .line 124
    .line 125
    invoke-virtual {p1}, Lo/g0;->h()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_8

    .line 130
    .line 131
    iget-object p1, p0, Lr/w0;->n:Lr/p0;

    .line 132
    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    iput-wide v5, p0, Lr/w0;->l:J

    .line 137
    .line 138
    return-object v7

    .line 139
    :cond_8
    :goto_3
    iput-object p0, v0, Lr/s0;->d:Lr/w0;

    .line 140
    .line 141
    iput v3, v0, Lr/s0;->g:I

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lr/w0;->G1(Lac/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v8, :cond_6

    .line 148
    .line 149
    :goto_4
    return-object v8
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

.method public static final E1(Lr/w0;Lac/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lr/u0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lr/u0;

    .line 10
    .line 11
    iget v1, v0, Lr/u0;->h:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lr/u0;->h:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lr/u0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lr/u0;-><init>(Lr/w0;Lac/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lr/u0;->f:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Lr/u0;->h:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lr/u0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Lr/u0;->d:Lr/w0;

    .line 45
    .line 46
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    iget-object p0, v0, Lr/u0;->e:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v1, v0, Lr/u0;->d:Lr/w0;

    .line 61
    .line 62
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object p1, p0

    .line 66
    move-object p0, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lr/w0;->b:Lx0/e1;

    .line 72
    .line 73
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v1, p0, Lr/w0;->j:Lrf/c;

    .line 78
    .line 79
    iput-object p0, v0, Lr/u0;->d:Lr/w0;

    .line 80
    .line 81
    iput-object p1, v0, Lr/u0;->e:Ljava/lang/Object;

    .line 82
    .line 83
    iput v3, v0, Lr/u0;->h:I

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Lrf/c;->g(Lyb/c;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-ne v1, v4, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    iput-object p0, v0, Lr/u0;->d:Lr/w0;

    .line 93
    .line 94
    iput-object p1, v0, Lr/u0;->e:Ljava/lang/Object;

    .line 95
    .line 96
    iput v2, v0, Lr/u0;->h:I

    .line 97
    .line 98
    new-instance v1, Lhf/k;

    .line 99
    .line 100
    invoke-static {v0}, Lud/s;->p(Lyb/c;)Lyb/c;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {v1, v3, v0}, Lhf/k;-><init>(ILyb/c;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lhf/k;->r()V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lr/w0;->i:Lhf/k;

    .line 111
    .line 112
    iget-object v0, p0, Lr/w0;->j:Lrf/c;

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    invoke-virtual {v0, v2}, Lrf/c;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lhf/k;->q()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-ne v0, v4, :cond_5

    .line 123
    .line 124
    :goto_2
    return-object v4

    .line 125
    :cond_5
    move-object v5, v0

    .line 126
    move-object v0, p0

    .line 127
    move-object p0, p1

    .line 128
    move-object p1, v5

    .line 129
    :goto_3
    invoke-static {p1, p0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    sget-object p0, Lub/a0;->a:Lub/a0;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_6
    const-wide/high16 p0, -0x8000000000000000L

    .line 139
    .line 140
    iput-wide p0, v0, Lr/w0;->l:J

    .line 141
    .line 142
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 143
    .line 144
    const-string p1, "targetState while waiting for composition"

    .line 145
    .line 146
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p0
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

.method public static final F1(Lr/w0;Lac/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lr/v0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lr/v0;

    .line 10
    .line 11
    iget v1, v0, Lr/v0;->h:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lr/v0;->h:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lr/v0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lr/v0;-><init>(Lr/w0;Lac/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lr/v0;->f:Ljava/lang/Object;

    .line 29
    .line 30
    iget v1, v0, Lr/v0;->h:I

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const/4 v3, 0x1

    .line 34
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Lr/v0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Lr/v0;->d:Lr/w0;

    .line 45
    .line 46
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    iget-object p0, v0, Lr/v0;->e:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v1, v0, Lr/v0;->d:Lr/w0;

    .line 61
    .line 62
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lr/w0;->b:Lx0/e1;

    .line 70
    .line 71
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object v1, p0, Lr/w0;->j:Lrf/c;

    .line 76
    .line 77
    iput-object p0, v0, Lr/v0;->d:Lr/w0;

    .line 78
    .line 79
    iput-object p1, v0, Lr/v0;->e:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, v0, Lr/v0;->h:I

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Lrf/c;->g(Lyb/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-ne v1, v4, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v1, p0

    .line 91
    move-object p0, p1

    .line 92
    :goto_1
    iget-object p1, v1, Lr/w0;->d:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object v5, v1, Lr/w0;->j:Lrf/c;

    .line 95
    .line 96
    invoke-static {p0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    const/4 v6, 0x0

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Lrf/c;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    iput-object v1, v0, Lr/v0;->d:Lr/w0;

    .line 108
    .line 109
    iput-object p0, v0, Lr/v0;->e:Ljava/lang/Object;

    .line 110
    .line 111
    iput v2, v0, Lr/v0;->h:I

    .line 112
    .line 113
    new-instance p1, Lhf/k;

    .line 114
    .line 115
    invoke-static {v0}, Lud/s;->p(Lyb/c;)Lyb/c;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-direct {p1, v3, v0}, Lhf/k;-><init>(ILyb/c;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lhf/k;->r()V

    .line 123
    .line 124
    .line 125
    iput-object p1, v1, Lr/w0;->i:Lhf/k;

    .line 126
    .line 127
    invoke-virtual {v5, v6}, Lrf/c;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lhf/k;->q()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v4, :cond_6

    .line 135
    .line 136
    :goto_2
    return-object v4

    .line 137
    :cond_6
    move-object v0, v1

    .line 138
    :goto_3
    invoke-static {p1, p0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    :goto_4
    sget-object p0, Lub/a0;->a:Lub/a0;

    .line 145
    .line 146
    return-object p0

    .line 147
    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    .line 148
    .line 149
    iput-wide v1, v0, Lr/w0;->l:J

    .line 150
    .line 151
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 152
    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v2, "snapTo() was canceled because state was changed to "

    .line 156
    .line 157
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string p1, " instead of "

    .line 164
    .line 165
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0
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


# virtual methods
.method public final A1()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lr/w0;->e:Lr/q1;

    .line 3
    .line 4
    sget-object v0, Lr/t1;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lh1/y;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lh1/y;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public final G1(Lac/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p1}, Lyb/c;->s()Lyb/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr/d;->n(Lyb/h;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 11
    .line 12
    cmpg-float v1, v0, v1

    .line 13
    .line 14
    if-gtz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lr/w0;->H1()V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_0
    iput v0, p0, Lr/w0;->p:F

    .line 21
    .line 22
    invoke-interface {p1}, Lyb/c;->s()Lyb/h;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lx0/v;->s(Lyb/h;)Lx0/s0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lr/w0;->q:Lr/q0;

    .line 31
    .line 32
    invoke-interface {v0, v1, p1}, Lx0/s0;->k(Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 37
    .line 38
    if-ne p1, v0, :cond_1

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    return-object v2
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

.method public final H1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/w0;->e:Lr/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lr/q1;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lr/w0;->m:Lo/g0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lo/g0;->c()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lr/w0;->n:Lr/p0;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lr/w0;->n:Lr/p0;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lr/w0;->K1(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lr/w0;->J1()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
    .line 29
.end method

.method public final I1(FLjava/lang/Object;Lac/i;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p1

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Expecting fraction between 0 and 1. Got "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lr/n0;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v5, p0, Lr/w0;->e:Lr/q1;

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    move-object v4, p0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v0, p0, Lr/w0;->b:Lx0/e1;

    .line 37
    .line 38
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v1, Lr/t0;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v4, p0

    .line 46
    move v6, p1

    .line 47
    move-object v2, p2

    .line 48
    invoke-direct/range {v1 .. v7}, Lr/t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr/w0;Lr/q1;FLyb/c;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v4, Lr/w0;->k:Lr/m0;

    .line 52
    .line 53
    invoke-static {p1, v1, p3}, Lr/m0;->a(Lr/m0;Lic/k;Lyb/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 58
    .line 59
    if-ne p1, p2, :cond_2

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_2
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 63
    .line 64
    return-object p1
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

.method public final J1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lr/w0;->e:Lr/q1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lr/w0;->h:Lx0/a1;

    .line 7
    .line 8
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    float-to-double v1, v1

    .line 13
    iget-object v3, v0, Lr/q1;->l:Lx0/c0;

    .line 14
    .line 15
    invoke-virtual {v3}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    long-to-double v3, v3

    .line 26
    mul-double v1, v1, v3

    .line 27
    .line 28
    invoke-static {v1, v2}, Llc/b;->S(D)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0, v1, v2}, Lr/q1;->l(J)V

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
.end method

.method public final K1(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/w0;->h:Lx0/a1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx0/a1;->f(F)V

    .line 4
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

.method public final b1()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/w0;->c:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

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

.method public final g1()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/w0;->b:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

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

.method public final x1(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/w0;->c:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 4
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

.method public final z1(Lr/q1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/w0;->e:Lr/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lr/w0;->e:Lr/q1;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", new instance: "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lr/n0;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iput-object p1, p0, Lr/w0;->e:Lr/q1;

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
