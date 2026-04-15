.class public final Li2/y0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Li2/z0;


# direct methods
.method public synthetic constructor <init>(Li2/z0;I)V
    .locals 0

    .line 1
    iput p2, p0, Li2/y0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Li2/y0;->c:Li2/z0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Li2/y0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li2/y0;->c:Li2/z0;

    .line 7
    .line 8
    iget-object v1, v0, Li2/z0;->f:Li2/n0;

    .line 9
    .line 10
    invoke-virtual {v1}, Li2/n0;->a()Li2/g1;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v2, v2, Li2/g1;->s:Li2/g1;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Li2/q0;->l:Lg2/q0;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    :cond_0
    iget-object v2, v1, Li2/n0;->a:Li2/j0;

    .line 23
    .line 24
    invoke-static {v2}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lj2/v;

    .line 29
    .line 30
    invoke-virtual {v2}, Lj2/v;->getPlacementScope()Lg2/f1;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    iget-object v3, v0, Li2/z0;->H:Lic/k;

    .line 35
    .line 36
    iget-object v4, v0, Li2/z0;->I:Lt1/b;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Li2/n0;->a()Li2/g1;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-wide v5, v0, Li2/z0;->J:J

    .line 45
    .line 46
    iget v0, v0, Li2/z0;->K:F

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v1}, Lg2/f1;->b(Lg2/f1;Lg2/g1;)V

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, Lg2/g1;->e:J

    .line 55
    .line 56
    invoke-static {v5, v6, v2, v3}, Lf3/j;->d(JJ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3, v0, v4}, Li2/g1;->d0(JFLt1/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    if-nez v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, Li2/n0;->a()Li2/g1;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-wide v3, v0, Li2/z0;->J:J

    .line 71
    .line 72
    iget v0, v0, Li2/z0;->K:F

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v1}, Lg2/f1;->b(Lg2/f1;Lg2/g1;)V

    .line 78
    .line 79
    .line 80
    iget-wide v5, v1, Lg2/g1;->e:J

    .line 81
    .line 82
    invoke-static {v3, v4, v5, v6}, Lf3/j;->d(JJ)J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-virtual {v1, v2, v3, v0, v4}, Lg2/g1;->Y(JFLic/k;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {v1}, Li2/n0;->a()Li2/g1;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-wide v4, v0, Li2/z0;->J:J

    .line 96
    .line 97
    iget v0, v0, Li2/z0;->K:F

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v1}, Lg2/f1;->b(Lg2/f1;Lg2/g1;)V

    .line 103
    .line 104
    .line 105
    iget-wide v6, v1, Lg2/g1;->e:J

    .line 106
    .line 107
    invoke-static {v4, v5, v6, v7}, Lf3/j;->d(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    invoke-virtual {v1, v4, v5, v0, v3}, Lg2/g1;->Y(JFLic/k;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_0
    iget-object v0, p0, Li2/y0;->c:Li2/z0;

    .line 118
    .line 119
    iget-object v1, v0, Li2/z0;->f:Li2/n0;

    .line 120
    .line 121
    invoke-virtual {v1}, Li2/n0;->a()Li2/g1;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget-wide v2, v0, Li2/z0;->C:J

    .line 126
    .line 127
    invoke-interface {v1, v2, v3}, Lg2/u0;->v(J)Lg2/g1;

    .line 128
    .line 129
    .line 130
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_1
    iget-object v0, p0, Li2/y0;->c:Li2/z0;

    .line 134
    .line 135
    iget-object v1, v0, Li2/z0;->f:Li2/n0;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    iput v2, v1, Li2/n0;->i:I

    .line 139
    .line 140
    iget-object v3, v1, Li2/n0;->a:Li2/j0;

    .line 141
    .line 142
    invoke-virtual {v3}, Li2/j0;->z()Lz0/e;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget-object v4, v3, Lz0/e;->a:[Ljava/lang/Object;

    .line 147
    .line 148
    iget v3, v3, Lz0/e;->c:I

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    :goto_1
    const v6, 0x7fffffff

    .line 152
    .line 153
    .line 154
    if-ge v5, v3, :cond_5

    .line 155
    .line 156
    aget-object v7, v4, v5

    .line 157
    .line 158
    check-cast v7, Li2/j0;

    .line 159
    .line 160
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 161
    .line 162
    iget-object v7, v7, Li2/n0;->p:Li2/z0;

    .line 163
    .line 164
    iget v8, v7, Li2/z0;->i:I

    .line 165
    .line 166
    iput v8, v7, Li2/z0;->h:I

    .line 167
    .line 168
    iput v6, v7, Li2/z0;->i:I

    .line 169
    .line 170
    iput-boolean v2, v7, Li2/z0;->u:Z

    .line 171
    .line 172
    iget-object v6, v7, Li2/z0;->l:Li2/h0;

    .line 173
    .line 174
    sget-object v8, Li2/h0;->b:Li2/h0;

    .line 175
    .line 176
    if-ne v6, v8, :cond_4

    .line 177
    .line 178
    sget-object v6, Li2/h0;->c:Li2/h0;

    .line 179
    .line 180
    iput-object v6, v7, Li2/z0;->l:Li2/h0;

    .line 181
    .line 182
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    iget-object v3, v1, Li2/n0;->a:Li2/j0;

    .line 186
    .line 187
    iget-object v1, v1, Li2/n0;->a:Li2/j0;

    .line 188
    .line 189
    invoke-virtual {v3}, Li2/j0;->z()Lz0/e;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    iget-object v4, v3, Lz0/e;->a:[Ljava/lang/Object;

    .line 194
    .line 195
    iget v3, v3, Lz0/e;->c:I

    .line 196
    .line 197
    const/4 v5, 0x0

    .line 198
    :goto_2
    if-ge v5, v3, :cond_6

    .line 199
    .line 200
    aget-object v7, v4, v5

    .line 201
    .line 202
    check-cast v7, Li2/j0;

    .line 203
    .line 204
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 205
    .line 206
    iget-object v7, v7, Li2/n0;->p:Li2/z0;

    .line 207
    .line 208
    iget-object v7, v7, Li2/z0;->y:Li2/k0;

    .line 209
    .line 210
    iput-boolean v2, v7, Li2/k0;->d:Z

    .line 211
    .line 212
    add-int/lit8 v5, v5, 0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_6
    invoke-virtual {v0}, Li2/z0;->d()Li2/u;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Li2/g1;->u0()Lg2/w0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {v0}, Lg2/w0;->j()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Li2/j0;->z()Lz0/e;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v3, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 231
    .line 232
    iget v0, v0, Lz0/e;->c:I

    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    :goto_3
    if-ge v4, v0, :cond_9

    .line 236
    .line 237
    aget-object v5, v3, v4

    .line 238
    .line 239
    check-cast v5, Li2/j0;

    .line 240
    .line 241
    iget-object v7, v5, Li2/j0;->G:Li2/n0;

    .line 242
    .line 243
    iget-object v8, v7, Li2/n0;->p:Li2/z0;

    .line 244
    .line 245
    iget v8, v8, Li2/z0;->h:I

    .line 246
    .line 247
    invoke-virtual {v5}, Li2/j0;->w()I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-eq v8, v9, :cond_8

    .line 252
    .line 253
    invoke-virtual {v1}, Li2/j0;->P()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Li2/j0;->C()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5}, Li2/j0;->w()I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    if-ne v5, v6, :cond_8

    .line 264
    .line 265
    iget-boolean v5, v7, Li2/n0;->c:Z

    .line 266
    .line 267
    if-eqz v5, :cond_7

    .line 268
    .line 269
    iget-object v5, v7, Li2/n0;->q:Li2/v0;

    .line 270
    .line 271
    invoke-static {v5}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v2}, Li2/v0;->l0(Z)V

    .line 275
    .line 276
    .line 277
    :cond_7
    iget-object v5, v7, Li2/n0;->p:Li2/z0;

    .line 278
    .line 279
    invoke-virtual {v5}, Li2/z0;->o0()V

    .line 280
    .line 281
    .line 282
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_9
    invoke-virtual {v1}, Li2/j0;->z()Lz0/e;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 290
    .line 291
    iget v0, v0, Lz0/e;->c:I

    .line 292
    .line 293
    :goto_4
    if-ge v2, v0, :cond_a

    .line 294
    .line 295
    aget-object v3, v1, v2

    .line 296
    .line 297
    check-cast v3, Li2/j0;

    .line 298
    .line 299
    iget-object v3, v3, Li2/j0;->G:Li2/n0;

    .line 300
    .line 301
    iget-object v3, v3, Li2/n0;->p:Li2/z0;

    .line 302
    .line 303
    iget-object v3, v3, Li2/z0;->y:Li2/k0;

    .line 304
    .line 305
    iget-boolean v4, v3, Li2/k0;->d:Z

    .line 306
    .line 307
    iput-boolean v4, v3, Li2/k0;->e:Z

    .line 308
    .line 309
    add-int/lit8 v2, v2, 0x1

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_a
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
