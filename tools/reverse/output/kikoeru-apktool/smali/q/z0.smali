.class public final Lq/z0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lq/x0;


# instance fields
.field public final a:Lt1/b;

.field public final synthetic b:Lq/b1;


# direct methods
.method public constructor <init>(Lq/b1;Lt1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq/z0;->b:Lq/b1;

    .line 5
    .line 6
    iput-object p2, p0, Lq/z0;->a:Lt1/b;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final b(Li2/l0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lq/z0;->b:Lq/b1;

    .line 2
    .line 3
    iget-object v1, v0, Lq/b1;->p:Lb0/d0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lb0/d0;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, v0, Lq/b1;->o:Lq/q1;

    .line 18
    .line 19
    iget-object v1, v1, Lq/q1;->g:Lg2/c0;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {v0}, Li2/f;->x(Li2/m;)Li2/g1;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    invoke-interface {v1, v2, v3, v4}, Lg2/c0;->o(Lg2/c0;J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    shr-long v3, v1, v3

    .line 36
    .line 37
    long-to-int v4, v3

    .line 38
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const-wide v4, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v1, v4

    .line 48
    long-to-int v2, v1

    .line 49
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-object v2, v0, Lq/b1;->q:Lic/n;

    .line 54
    .line 55
    invoke-virtual {p1}, Li2/l0;->getLayoutDirection()Lf3/m;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v5, p1, Li2/l0;->a:Ls1/b;

    .line 60
    .line 61
    invoke-static {v0}, Li2/f;->y(Li2/m;)Li2/j0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v0, v0, Li2/j0;->y:Lf3/c;

    .line 66
    .line 67
    invoke-interface {v2, v4, v0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lq1/e0;

    .line 72
    .line 73
    iget-object v2, p0, Lq/z0;->a:Lt1/b;

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    iget-object v4, v5, Ls1/b;->b:Lc7/e1;

    .line 78
    .line 79
    invoke-virtual {v4}, Lc7/e1;->D()J

    .line 80
    .line 81
    .line 82
    move-result-wide v6

    .line 83
    invoke-virtual {v4}, Lc7/e1;->z()Lq1/o;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-interface {v8}, Lq1/o;->f()V

    .line 88
    .line 89
    .line 90
    :try_start_0
    iget-object v8, v4, Lc7/e1;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Lr/y1;

    .line 93
    .line 94
    iget-object v8, v8, Lr/y1;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v8, Lc7/e1;

    .line 97
    .line 98
    invoke-virtual {v8}, Lc7/e1;->z()Lq1/o;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-interface {v8, v0}, Lq1/o;->n(Lq1/e0;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v5, Ls1/b;->b:Lc7/e1;

    .line 106
    .line 107
    iget-object v0, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lr/y1;

    .line 110
    .line 111
    invoke-virtual {v0, v3, v1}, Lr/y1;->i0(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    :try_start_1
    invoke-static {p1, v2}, Lu3/x0;->k(Ls1/d;Lt1/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    .line 116
    .line 117
    :try_start_2
    iget-object p1, v5, Ls1/b;->b:Lc7/e1;

    .line 118
    .line 119
    iget-object p1, p1, Lc7/e1;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Lr/y1;

    .line 122
    .line 123
    neg-float v0, v3

    .line 124
    neg-float v1, v1

    .line 125
    invoke-virtual {p1, v0, v1}, Lr/y1;->i0(FF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v6, v7}, Lq/t0;->L(Lc7/e1;J)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catchall_0
    move-exception p1

    .line 133
    goto :goto_0

    .line 134
    :catchall_1
    move-exception p1

    .line 135
    :try_start_3
    iget-object v0, v5, Ls1/b;->b:Lc7/e1;

    .line 136
    .line 137
    iget-object v0, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lr/y1;

    .line 140
    .line 141
    neg-float v2, v3

    .line 142
    neg-float v1, v1

    .line 143
    invoke-virtual {v0, v2, v1}, Lr/y1;->i0(FF)V

    .line 144
    .line 145
    .line 146
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 147
    :goto_0
    invoke-static {v4, v6, v7}, Lq/t0;->L(Lc7/e1;J)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_0
    iget-object v0, v5, Ls1/b;->b:Lc7/e1;

    .line 152
    .line 153
    iget-object v0, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lr/y1;

    .line 156
    .line 157
    invoke-virtual {v0, v3, v1}, Lr/y1;->i0(FF)V

    .line 158
    .line 159
    .line 160
    :try_start_4
    invoke-static {p1, v2}, Lu3/x0;->k(Ls1/d;Lt1/b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 161
    .line 162
    .line 163
    iget-object p1, v5, Ls1/b;->b:Lc7/e1;

    .line 164
    .line 165
    iget-object p1, p1, Lc7/e1;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, Lr/y1;

    .line 168
    .line 169
    neg-float v0, v3

    .line 170
    neg-float v1, v1

    .line 171
    invoke-virtual {p1, v0, v1}, Lr/y1;->i0(FF)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :catchall_2
    move-exception p1

    .line 176
    iget-object v0, v5, Ls1/b;->b:Lc7/e1;

    .line 177
    .line 178
    iget-object v0, v0, Lc7/e1;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Lr/y1;

    .line 181
    .line 182
    neg-float v2, v3

    .line 183
    neg-float v1, v1

    .line 184
    invoke-virtual {v0, v2, v1}, Lr/y1;->i0(FF)V

    .line 185
    .line 186
    .line 187
    throw p1

    .line 188
    :cond_1
    const-string p1, "root"

    .line 189
    .line 190
    invoke-static {p1}, Ljc/l;->k(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const/4 p1, 0x0

    .line 194
    throw p1

    .line 195
    :cond_2
    return-void
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

.method public final e()F
    .locals 1

    .line 1
    iget-object v0, p0, Lq/z0;->b:Lq/b1;

    .line 2
    .line 3
    iget-object v0, v0, Lq/b1;->r:Lx0/a1;

    .line 4
    .line 5
    invoke-virtual {v0}, Lx0/a1;->e()F

    .line 6
    .line 7
    .line 8
    move-result v0

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
