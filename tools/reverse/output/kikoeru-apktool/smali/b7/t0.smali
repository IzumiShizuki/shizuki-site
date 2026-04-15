.class public Lb7/t0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb7/c0;


# instance fields
.field public A:Lb7/v3;

.field public B:Lb7/t3;

.field public C:Landroid/os/Bundle;

.field public final a:Lb7/d0;

.field public final b:Lb7/d4;

.field public final c:Lb7/i1;

.field public final d:Landroid/content/Context;

.field public final e:Lb7/k4;

.field public final f:Landroid/os/Bundle;

.field public final g:Lb7/k0;

.field public final h:Lp4/n;

.field public final i:Landroidx/media3/exoplayer/offline/u;

.field public final j:Lo/f;

.field public k:Lb7/k4;

.field public l:Lb7/s0;

.field public m:Z

.field public n:Lb7/v3;

.field public o:Lya/i0;

.field public p:Lya/i0;

.field public q:Lya/a1;

.field public r:Lya/a1;

.field public s:Lb7/f4;

.field public t:Lm4/u0;

.field public u:Lm4/u0;

.field public v:Lm4/u0;

.field public w:Lb7/t;

.field public x:Landroid/media/session/MediaController;

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb7/d0;Lb7/k4;Landroid/os/Bundle;Landroid/os/Looper;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lb7/v3;->F:Lb7/v3;

    .line 5
    .line 6
    iput-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 7
    .line 8
    sget-object v0, Lp4/u;->c:Lp4/u;

    .line 9
    .line 10
    sget-object v0, Lb7/f4;->b:Lb7/f4;

    .line 11
    .line 12
    iput-object v0, p0, Lb7/t0;->s:Lb7/f4;

    .line 13
    .line 14
    sget-object v0, Lya/a1;->e:Lya/a1;

    .line 15
    .line 16
    iput-object v0, p0, Lb7/t0;->o:Lya/i0;

    .line 17
    .line 18
    iput-object v0, p0, Lb7/t0;->p:Lya/i0;

    .line 19
    .line 20
    iput-object v0, p0, Lb7/t0;->q:Lya/a1;

    .line 21
    .line 22
    iput-object v0, p0, Lb7/t0;->r:Lya/a1;

    .line 23
    .line 24
    sget-object v0, Lm4/u0;->b:Lm4/u0;

    .line 25
    .line 26
    iput-object v0, p0, Lb7/t0;->t:Lm4/u0;

    .line 27
    .line 28
    iput-object v0, p0, Lb7/t0;->u:Lm4/u0;

    .line 29
    .line 30
    invoke-static {v0, v0}, Lb7/t0;->b(Lm4/u0;Lm4/u0;)Lm4/u0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lb7/t0;->v:Lm4/u0;

    .line 35
    .line 36
    new-instance v0, Lp4/n;

    .line 37
    .line 38
    new-instance v1, Lb5/a;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v1, v2, p0}, Lb5/a;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v2, Lp4/v;->a:Lp4/v;

    .line 45
    .line 46
    invoke-direct {v0, p5, v2, v1}, Lp4/n;-><init>(Landroid/os/Looper;Lp4/v;Lp4/l;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lb7/t0;->h:Lp4/n;

    .line 50
    .line 51
    iput-object p2, p0, Lb7/t0;->a:Lb7/d0;

    .line 52
    .line 53
    const-string p2, "token must not be null"

    .line 54
    .line 55
    invoke-static {p3, p2}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lb7/t0;->d:Landroid/content/Context;

    .line 59
    .line 60
    new-instance p1, Lb7/d4;

    .line 61
    .line 62
    invoke-direct {p1}, Lb7/d4;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lb7/t0;->b:Lb7/d4;

    .line 66
    .line 67
    new-instance p1, Lb7/i1;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Lb7/i1;-><init>(Lb7/t0;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lb7/t0;->c:Lb7/i1;

    .line 73
    .line 74
    new-instance p1, Lo/f;

    .line 75
    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-direct {p1, p2}, Lo/f;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lb7/t0;->j:Lo/f;

    .line 81
    .line 82
    iput-object p3, p0, Lb7/t0;->e:Lb7/k4;

    .line 83
    .line 84
    iput-object p4, p0, Lb7/t0;->f:Landroid/os/Bundle;

    .line 85
    .line 86
    new-instance p1, Lb7/k0;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Lb7/k0;-><init>(Lb7/t0;)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lb7/t0;->g:Lb7/k0;

    .line 92
    .line 93
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 94
    .line 95
    iput-object p1, p0, Lb7/t0;->C:Landroid/os/Bundle;

    .line 96
    .line 97
    iget-object p1, p3, Lb7/k4;->a:Lb7/j4;

    .line 98
    .line 99
    invoke-interface {p1}, Lb7/j4;->b()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_0

    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    goto :goto_0

    .line 107
    :cond_0
    new-instance p1, Lb7/s0;

    .line 108
    .line 109
    invoke-direct {p1, p0, p4}, Lb7/s0;-><init>(Lb7/t0;Landroid/os/Bundle;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    iput-object p1, p0, Lb7/t0;->l:Lb7/s0;

    .line 113
    .line 114
    new-instance p1, Landroidx/media3/exoplayer/offline/u;

    .line 115
    .line 116
    invoke-direct {p1, p0, p5}, Landroidx/media3/exoplayer/offline/u;-><init>(Lb7/t0;Landroid/os/Looper;)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Lb7/t0;->i:Landroidx/media3/exoplayer/offline/u;

    .line 120
    .line 121
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    iput-wide p1, p0, Lb7/t0;->y:J

    .line 127
    .line 128
    iput-wide p1, p0, Lb7/t0;->z:J

    .line 129
    .line 130
    return-void
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
.end method

.method public static b(Lm4/u0;Lm4/u0;)Lm4/u0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lb7/s3;->g(Lm4/u0;Lm4/u0;)Lm4/u0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 p1, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lm4/u0;->a(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lk5/d;

    .line 15
    .line 16
    invoke-direct {v0}, Lk5/d;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lm4/u0;->a:Lm4/o;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lk5/d;->b(Lm4/o;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lk5/d;->a(I)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lm4/u0;

    .line 28
    .line 29
    invoke-virtual {v0}, Lk5/d;->d()Lm4/o;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lm4/u0;-><init>(Lm4/o;)V

    .line 34
    .line 35
    .line 36
    return-object p0
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

.method public static f(Lb7/v3;)I
    .locals 1

    .line 1
    iget-object p0, p0, Lb7/v3;->c:Lb7/h4;

    .line 2
    .line 3
    iget-object p0, p0, Lb7/h4;->a:Lm4/x0;

    .line 4
    .line 5
    iget p0, p0, Lm4/x0;->b:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    :cond_0
    return p0
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

.method public static j(Lb7/v3;Lm4/i1;Lm4/x0;Lb7/h4;I)Lb7/v3;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lb7/v3;->a:Lm4/r0;

    .line 4
    .line 5
    iget v2, v0, Lb7/v3;->b:I

    .line 6
    .line 7
    iget-object v3, v0, Lb7/v3;->c:Lb7/h4;

    .line 8
    .line 9
    iget-object v7, v0, Lb7/v3;->g:Lm4/s0;

    .line 10
    .line 11
    iget v8, v0, Lb7/v3;->h:I

    .line 12
    .line 13
    iget-boolean v9, v0, Lb7/v3;->i:Z

    .line 14
    .line 15
    iget v12, v0, Lb7/v3;->k:I

    .line 16
    .line 17
    iget-object v10, v0, Lb7/v3;->l:Lm4/u1;

    .line 18
    .line 19
    iget-object v13, v0, Lb7/v3;->m:Lm4/l0;

    .line 20
    .line 21
    iget v14, v0, Lb7/v3;->n:F

    .line 22
    .line 23
    iget-object v15, v0, Lb7/v3;->o:Lm4/d;

    .line 24
    .line 25
    iget-object v4, v0, Lb7/v3;->p:Lo4/c;

    .line 26
    .line 27
    iget-object v5, v0, Lb7/v3;->q:Lm4/k;

    .line 28
    .line 29
    iget v6, v0, Lb7/v3;->r:I

    .line 30
    .line 31
    iget-boolean v11, v0, Lb7/v3;->s:Z

    .line 32
    .line 33
    move-object/from16 v16, v1

    .line 34
    .line 35
    iget-boolean v1, v0, Lb7/v3;->t:Z

    .line 36
    .line 37
    move/from16 v20, v1

    .line 38
    .line 39
    iget v1, v0, Lb7/v3;->u:I

    .line 40
    .line 41
    move/from16 v21, v1

    .line 42
    .line 43
    iget-boolean v1, v0, Lb7/v3;->v:Z

    .line 44
    .line 45
    move/from16 v24, v1

    .line 46
    .line 47
    iget-boolean v1, v0, Lb7/v3;->w:Z

    .line 48
    .line 49
    move/from16 v25, v1

    .line 50
    .line 51
    iget v1, v0, Lb7/v3;->x:I

    .line 52
    .line 53
    move/from16 v22, v1

    .line 54
    .line 55
    iget v1, v0, Lb7/v3;->y:I

    .line 56
    .line 57
    move/from16 v23, v1

    .line 58
    .line 59
    iget-object v1, v0, Lb7/v3;->z:Lm4/l0;

    .line 60
    .line 61
    move-object/from16 v26, v1

    .line 62
    .line 63
    move/from16 v17, v2

    .line 64
    .line 65
    iget-wide v1, v0, Lb7/v3;->A:J

    .line 66
    .line 67
    move-wide/from16 v27, v1

    .line 68
    .line 69
    iget-wide v1, v0, Lb7/v3;->B:J

    .line 70
    .line 71
    move-wide/from16 v29, v1

    .line 72
    .line 73
    iget-wide v1, v0, Lb7/v3;->C:J

    .line 74
    .line 75
    move-wide/from16 v31, v1

    .line 76
    .line 77
    iget-object v1, v0, Lb7/v3;->D:Lm4/q1;

    .line 78
    .line 79
    iget-object v0, v0, Lb7/v3;->E:Lm4/o1;

    .line 80
    .line 81
    iget-object v2, v3, Lb7/h4;->a:Lm4/x0;

    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lm4/i1;->p()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_1

    .line 88
    .line 89
    move-object/from16 v3, p3

    .line 90
    .line 91
    move-object/from16 v34, v0

    .line 92
    .line 93
    iget-object v0, v3, Lb7/h4;->a:Lm4/x0;

    .line 94
    .line 95
    iget v0, v0, Lm4/x0;->b:I

    .line 96
    .line 97
    move-object/from16 v33, v1

    .line 98
    .line 99
    invoke-virtual/range {p1 .. p1}, Lm4/i1;->o()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-ge v0, v1, :cond_0

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    const/4 v0, 0x0

    .line 107
    goto :goto_1

    .line 108
    :cond_1
    move-object/from16 v3, p3

    .line 109
    .line 110
    move-object/from16 v34, v0

    .line 111
    .line 112
    move-object/from16 v33, v1

    .line 113
    .line 114
    :goto_0
    const/4 v0, 0x1

    .line 115
    :goto_1
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Lb7/v3;

    .line 119
    .line 120
    move/from16 v18, v6

    .line 121
    .line 122
    move/from16 v19, v11

    .line 123
    .line 124
    move-object/from16 v1, v16

    .line 125
    .line 126
    move-object/from16 v11, p1

    .line 127
    .line 128
    move/from16 v6, p4

    .line 129
    .line 130
    move-object/from16 v16, v4

    .line 131
    .line 132
    move-object v4, v2

    .line 133
    move/from16 v2, v17

    .line 134
    .line 135
    move-object/from16 v17, v5

    .line 136
    .line 137
    move-object/from16 v5, p2

    .line 138
    .line 139
    invoke-direct/range {v0 .. v34}, Lb7/v3;-><init>(Lm4/r0;ILb7/h4;Lm4/x0;Lm4/x0;ILm4/s0;IZLm4/u1;Lm4/i1;ILm4/l0;FLm4/d;Lo4/c;Lm4/k;IZZIIIZZLm4/l0;JJJLm4/q1;Lm4/o1;)V

    .line 140
    .line 141
    .line 142
    return-object v0
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
.end method

.method public static m(Lya/a1;Ljava/util/List;Landroid/os/Bundle;Lb7/f4;Lm4/u0;)Lya/a1;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, Lb7/b;->c(Ljava/util/List;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p3, 0x0

    .line 19
    const/4 v0, 0x1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x6

    .line 23
    const/4 v1, 0x7

    .line 24
    filled-new-array {p1, v1}, [I

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v1, p4, Lm4/u0;->a:Lm4/o;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Lm4/o;->a([I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 p1, 0x0

    .line 39
    :goto_0
    const-string v1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    const/16 p2, 0x8

    .line 48
    .line 49
    const/16 v1, 0x9

    .line 50
    .line 51
    filled-new-array {p2, v1}, [I

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-object p4, p4, Lm4/u0;->a:Lm4/o;

    .line 56
    .line 57
    invoke-virtual {p4, p2}, Lm4/o;->a([I)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_2

    .line 62
    .line 63
    const/4 p3, 0x1

    .line 64
    :cond_2
    invoke-static {p0, p1, p3}, Lb7/b;->e(Ljava/util/List;ZZ)Lya/a1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
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
.end method

.method public static n(Ljava/util/List;Ljava/util/List;Lb7/f4;Lm4/u0;Landroid/os/Bundle;)Lya/a1;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p3, p4}, Lb7/b;->f(Ljava/util/List;Lm4/u0;Landroid/os/Bundle;)Lya/a1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-static {p0, p2, p3}, Lb7/b;->c(Ljava/util/List;Lb7/f4;Lm4/u0;)Lya/a1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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
.end method


# virtual methods
.method public final B()Lm4/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->a:Lm4/r0;

    .line 4
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

.method public final C()J
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 4
    .line 5
    iget-boolean v1, v0, Lb7/h4;->b:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lb7/t0;->M()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v0, v0, Lb7/h4;->a:Lm4/x0;

    .line 15
    .line 16
    iget-wide v0, v0, Lm4/x0;->g:J

    .line 17
    .line 18
    return-wide v0
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

.method public final D()Lm4/q1;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->D:Lm4/q1;

    .line 4
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

.method public final F()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 4
    .line 5
    iget-object v0, v0, Lb7/h4;->a:Lm4/x0;

    .line 6
    .line 7
    iget v0, v0, Lm4/x0;->h:I

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

.method public final G()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    invoke-static {v0}, Lb7/t0;->f(Lb7/v3;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final H()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget v0, v0, Lb7/v3;->x:I

    .line 4
    .line 5
    return v0
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

.method public final J()Lm4/i1;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->j:Lm4/i1;

    .line 4
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

.method public final K(IJLjava/util/List;)V
    .locals 8

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lb7/t0;->h(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Lb7/n0;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move v4, p1

    .line 14
    move-wide v5, p2

    .line 15
    move-object v3, p4

    .line 16
    invoke-direct/range {v1 .. v6}, Lb7/n0;-><init>(Lb7/t0;Ljava/util/List;IJ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lb7/t0;->e(Lb7/r0;)V

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    invoke-virtual/range {v2 .. v7}, Lb7/t0;->p(Ljava/util/List;IJZ)V

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

.method public final M()J
    .locals 7

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-wide v1, p0, Lb7/t0;->y:J

    .line 4
    .line 5
    iget-wide v3, p0, Lb7/t0;->z:J

    .line 6
    .line 7
    iget-object v5, p0, Lb7/t0;->a:Lb7/d0;

    .line 8
    .line 9
    iget-wide v5, v5, Lb7/d0;->e:J

    .line 10
    .line 11
    invoke-static/range {v0 .. v6}, Lb7/s3;->f(Lb7/v3;JJJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lb7/t0;->y:J

    .line 16
    .line 17
    return-wide v0
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

.method public final N()Lm4/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->v:Lm4/u0;

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

.method public final O()Lb7/f4;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->s:Lb7/f4;

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

.method public final P()Lya/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->q:Lya/a1;

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

.method public final Q()V
    .locals 8

    .line 1
    iget-object v0, p0, Lb7/t0;->e:Lb7/k4;

    .line 2
    .line 3
    iget-object v1, v0, Lb7/k4;->a:Lb7/j4;

    .line 4
    .line 5
    iget-object v2, v0, Lb7/k4;->a:Lb7/j4;

    .line 6
    .line 7
    invoke-interface {v1}, Lb7/j4;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v3, "MCImplBase"

    .line 12
    .line 13
    iget-object v4, p0, Lb7/t0;->a:Lb7/d0;

    .line 14
    .line 15
    iget-object v5, p0, Lb7/t0;->d:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v6, p0, Lb7/t0;->f:Landroid/os/Bundle;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lb7/t0;->l:Lb7/s0;

    .line 23
    .line 24
    invoke-interface {v2}, Lb7/j4;->g()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    check-cast v0, Landroid/os/IBinder;

    .line 32
    .line 33
    sget v1, Lb7/q3;->k:I

    .line 34
    .line 35
    const-string v1, "androidx.media3.session.IMediaSession"

    .line 36
    .line 37
    invoke-interface {v0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    instance-of v2, v1, Lb7/t;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    check-cast v1, Lb7/t;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v1, Lb7/s;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, v1, Lb7/s;->e:Landroid/os/IBinder;

    .line 56
    .line 57
    :goto_0
    iget-object v0, p0, Lb7/t0;->b:Lb7/d4;

    .line 58
    .line 59
    invoke-virtual {v0}, Lb7/d4;->j()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    new-instance v2, Lb7/i;

    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-direct {v2, v5, v7, v6}, Lb7/i;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    iget-object v5, p0, Lb7/t0;->c:Lb7/i1;

    .line 80
    .line 81
    invoke-virtual {v2}, Lb7/i;->b()Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v1, v5, v0, v2}, Lb7/t;->H(Lb7/r;ILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catch_0
    move-exception v0

    .line 90
    const-string v1, "Failed to call connection request."

    .line 91
    .line 92
    invoke-static {v3, v1, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_1
    new-instance v1, Lb7/s0;

    .line 97
    .line 98
    invoke-direct {v1, p0, v6}, Lb7/s0;-><init>(Lb7/t0;Landroid/os/Bundle;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, Lb7/t0;->l:Lb7/s0;

    .line 102
    .line 103
    sget v1, Lp4/c0;->a:I

    .line 104
    .line 105
    const/16 v6, 0x1d

    .line 106
    .line 107
    if-lt v1, v6, :cond_2

    .line 108
    .line 109
    const/16 v1, 0x1001

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    const/4 v1, 0x1

    .line 113
    :goto_1
    new-instance v6, Landroid/content/Intent;

    .line 114
    .line 115
    const-string v7, "androidx.media3.session.MediaSessionService"

    .line 116
    .line 117
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v2}, Lb7/j4;->e()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-interface {v2}, Lb7/j4;->h()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v6, v7, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    iget-object v2, p0, Lb7/t0;->l:Lb7/s0;

    .line 132
    .line 133
    invoke-virtual {v5, v6, v2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_3

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v2, "bind to "

    .line 142
    .line 143
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v0, " failed"

    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v3, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_2
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    new-instance v0, La9/m;

    .line 165
    .line 166
    const/4 v1, 0x5

    .line 167
    invoke-direct {v0, v1, v4}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4, v0}, Lb7/d0;->e(Ljava/lang/Runnable;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    return-void
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

.method public final R(Lb7/e4;)Lcb/y;
    .locals 4

    .line 1
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 2
    .line 3
    new-instance v0, Lb7/i0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lb7/i0;-><init>(Lb7/t0;Lb7/e4;)V

    .line 6
    .line 7
    .line 8
    iget v1, p1, Lb7/e4;->a:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-static {v1}, Lp4/c;->c(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lb7/t0;->s:Lb7/f4;

    .line 20
    .line 21
    iget-object v1, v1, Lb7/f4;->a:Lya/m0;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lya/d0;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v3, "Controller isn\'t allowed to call custom session command:"

    .line 32
    .line 33
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Lb7/e4;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v1, "MCImplBase"

    .line 46
    .line 47
    invoke-static {v1, p1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-object p1, p0, Lb7/t0;->w:Lb7/t;

    .line 53
    .line 54
    :goto_1
    invoke-virtual {p0, p1, v0, v2}, Lb7/t0;->d(Lb7/t;Lb7/r0;Z)Lcb/y;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
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

.method public final S(Lm4/w0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->h:Lp4/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp4/n;->a(Ljava/lang/Object;)V

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

.method public final T()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->w:Lb7/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final U()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->f:Landroid/os/Bundle;

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

.method public final V(Ljava/util/List;)V
    .locals 8

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lb7/t0;->h(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lb7/i0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, v1, p0, p1}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lb7/t0;->e(Lb7/r0;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, -0x1

    .line 20
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    move-object v2, p0

    .line 27
    move-object v3, p1

    .line 28
    invoke-virtual/range {v2 .. v7}, Lb7/t0;->p(Ljava/util/List;IJZ)V

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

.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lb7/t0;->w:Lb7/t;

    .line 2
    .line 3
    iget-boolean v1, p0, Lb7/t0;->m:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lb7/t0;->m:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iput-object v2, p0, Lb7/t0;->k:Lb7/k4;

    .line 14
    .line 15
    iget-object v3, p0, Lb7/t0;->i:Landroidx/media3/exoplayer/offline/u;

    .line 16
    .line 17
    iget-object v4, v3, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {v4, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    :try_start_0
    iget-object v1, v3, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lb7/t0;

    .line 30
    .line 31
    iget-object v3, v1, Lb7/t0;->w:Lb7/t;

    .line 32
    .line 33
    iget-object v1, v1, Lb7/t0;->c:Lb7/i1;

    .line 34
    .line 35
    invoke-interface {v3, v1}, Lb7/t;->w0(Lb7/r;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    const-string v1, "MCImplBase"

    .line 40
    .line 41
    const-string v3, "Error in sending flushCommandQueue"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v4, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lb7/t0;->w:Lb7/t;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lb7/t0;->b:Lb7/d4;

    .line 54
    .line 55
    invoke-virtual {v1}, Lb7/d4;->j()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :try_start_1
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget-object v4, p0, Lb7/t0;->g:Lb7/k0;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    invoke-interface {v3, v4, v5}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lb7/t0;->c:Lb7/i1;

    .line 70
    .line 71
    invoke-interface {v0, v3, v1}, Lb7/t;->Q(Lb7/r;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 72
    .line 73
    .line 74
    :catch_1
    :cond_2
    iget-object v0, p0, Lb7/t0;->h:Lp4/n;

    .line 75
    .line 76
    invoke-virtual {v0}, Lp4/n;->d()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lb7/t0;->b:Lb7/d4;

    .line 80
    .line 81
    new-instance v1, La9/m;

    .line 82
    .line 83
    const/4 v3, 0x6

    .line 84
    invoke-direct {v1, v3, p0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v3, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 88
    .line 89
    monitor-enter v3

    .line 90
    :try_start_2
    invoke-static {v2}, Lp4/c0;->n(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iput-object v2, v0, Lb7/d4;->g:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v1, v0, Lb7/d4;->f:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v1, v0, Lb7/d4;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lo/e;

    .line 101
    .line 102
    invoke-virtual {v1}, Lo/u0;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0}, Lb7/d4;->a()V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    new-instance v1, La9/m;

    .line 115
    .line 116
    const/16 v4, 0x8

    .line 117
    .line 118
    invoke-direct {v1, v4, v0}, La9/m;-><init>(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const-wide/16 v4, 0x7530

    .line 122
    .line 123
    invoke-virtual {v2, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 124
    .line 125
    .line 126
    :goto_1
    monitor-exit v3

    .line 127
    :goto_2
    return-void

    .line 128
    :goto_3
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    throw v0
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

.method public final c()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lb7/t0;->h(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v1, Lb7/l0;

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    invoke-direct {v1, p0, v2}, Lb7/l0;-><init>(Lb7/t0;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lb7/t0;->e(Lb7/r0;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lb7/t0;->n:Lb7/v3;

    .line 19
    .line 20
    iget v2, v1, Lb7/v3;->y:I

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, v1, Lb7/v3;->j:Lm4/i1;

    .line 26
    .line 27
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v0, v2}, Lb7/v3;->c(ILm4/r0;)Lb7/v3;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    move-object v3, p0

    .line 44
    invoke-virtual/range {v3 .. v8}, Lb7/t0;->s(Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    return-void
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

.method public final d(Lb7/t;Lb7/r0;Z)Lcb/y;
    .locals 5

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lb7/t0;->b:Lb7/d4;

    .line 4
    .line 5
    new-instance v1, Lb7/i4;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lb7/i4;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, Lb7/d4;->d:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v2

    .line 14
    :try_start_0
    invoke-virtual {v0}, Lb7/d4;->j()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    new-instance v4, Lb7/c4;

    .line 19
    .line 20
    invoke-direct {v4, v3, v1}, Lb7/c4;-><init>(ILb7/i4;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v1, v0, Lb7/d4;->b:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v4}, Lb7/c4;->m()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v0, v0, Lb7/d4;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lo/e;

    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1, v4}, Lo/u0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iget-object p3, p0, Lb7/t0;->j:Lo/f;

    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p3, v0}, Lo/f;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    :try_start_1
    invoke-interface {p2, p1, v3}, Lb7/r0;->d(Lb7/t;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    .line 58
    .line 59
    return-object v4

    .line 60
    :catch_0
    move-exception p1

    .line 61
    const-string p2, "MCImplBase"

    .line 62
    .line 63
    const-string p3, "Cannot connect to the service or the session is gone"

    .line 64
    .line 65
    invoke-static {p2, p3, p1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lb7/t0;->j:Lo/f;

    .line 69
    .line 70
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p1, p2}, Lo/f;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lb7/t0;->b:Lb7/d4;

    .line 78
    .line 79
    new-instance p2, Lb7/i4;

    .line 80
    .line 81
    const/16 p3, -0x64

    .line 82
    .line 83
    invoke-direct {p2, p3}, Lb7/i4;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v3, p2}, Lb7/d4;->l(ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object v4

    .line 90
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    throw p1

    .line 92
    :cond_2
    new-instance p1, Lb7/i4;

    .line 93
    .line 94
    const/4 p2, -0x4

    .line 95
    invoke-direct {p1, p2}, Lb7/i4;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1}, Lg8/a;->Q(Ljava/lang/Object;)Lcb/v;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
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

.method public final e(Lb7/r0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/t0;->i:Landroidx/media3/exoplayer/offline/u;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lb7/t0;

    .line 10
    .line 11
    iget-object v0, v0, Lb7/t0;->w:Lb7/t;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lb7/t0;->w:Lb7/t;

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1, v2}, Lb7/t0;->d(Lb7/t;Lb7/r0;Z)Lcb/y;

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final g(Lm4/i1;IJ)Lb7/q0;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lm4/i1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lm4/h1;

    .line 9
    .line 10
    invoke-direct {v0}, Lm4/h1;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lm4/f1;

    .line 14
    .line 15
    invoke-direct {v1}, Lm4/f1;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    if-eq p2, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lm4/i1;->o()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lt p2, v2, :cond_2

    .line 26
    .line 27
    :cond_1
    iget-object p2, p0, Lb7/t0;->n:Lb7/v3;

    .line 28
    .line 29
    iget-boolean p2, p2, Lb7/v3;->i:Z

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lm4/i1;->a(Z)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    const-wide/16 p3, 0x0

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0, p3, p4}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    iget-wide p3, p3, Lm4/h1;->l:J

    .line 42
    .line 43
    invoke-static {p3, p4}, Lp4/c0;->c0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    :cond_2
    invoke-static {p3, p4}, Lp4/c0;->N(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p3

    .line 51
    invoke-virtual {p1}, Lm4/i1;->o()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {p2, v2}, Lp4/c;->f(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, v0}, Lm4/i1;->n(ILm4/h1;)V

    .line 59
    .line 60
    .line 61
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long p2, p3, v2

    .line 67
    .line 68
    if-nez p2, :cond_3

    .line 69
    .line 70
    iget-wide p3, v0, Lm4/h1;->l:J

    .line 71
    .line 72
    cmp-long p2, p3, v2

    .line 73
    .line 74
    if-nez p2, :cond_3

    .line 75
    .line 76
    :goto_0
    const/4 p1, 0x0

    .line 77
    return-object p1

    .line 78
    :cond_3
    iget p2, v0, Lm4/h1;->n:I

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-virtual {p1, p2, v1, v2}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 82
    .line 83
    .line 84
    :goto_1
    iget v3, v0, Lm4/h1;->o:I

    .line 85
    .line 86
    if-ge p2, v3, :cond_4

    .line 87
    .line 88
    iget-wide v3, v1, Lm4/f1;->e:J

    .line 89
    .line 90
    cmp-long v5, v3, p3

    .line 91
    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    add-int/lit8 v3, p2, 0x1

    .line 95
    .line 96
    invoke-virtual {p1, v3, v1, v2}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget-wide v4, v4, Lm4/f1;->e:J

    .line 101
    .line 102
    cmp-long v6, v4, p3

    .line 103
    .line 104
    if-gtz v6, :cond_4

    .line 105
    .line 106
    move p2, v3

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-virtual {p1, p2, v1, v2}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 109
    .line 110
    .line 111
    iget-wide v0, v1, Lm4/f1;->e:J

    .line 112
    .line 113
    sub-long/2addr p3, v0

    .line 114
    new-instance p1, Lb7/q0;

    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    invoke-direct {p1, p2, v0, p3, p4}, Lb7/q0;-><init>(IZJ)V

    .line 118
    .line 119
    .line 120
    return-object p1
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

.method public final h(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/t0;->v:Lm4/u0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm4/u0;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "MCImplBase"

    .line 10
    .line 11
    const-string v1, "Controller isn\'t allowed to call command= "

    .line 12
    .line 13
    invoke-static {p1, v1, v0}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    return p1
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

.method public final i()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget v0, v0, Lb7/v3;->y:I

    .line 4
    .line 5
    return v0
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

.method public final k()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lb7/t0;->h(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v0, "MCImplBase"

    .line 9
    .line 10
    const-string v1, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground."

    .line 11
    .line 12
    invoke-static {v0, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget v1, Lp4/c0;->a:I

    .line 17
    .line 18
    const/16 v2, 0x1f

    .line 19
    .line 20
    if-lt v1, v2, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lb7/t0;->x:Landroid/media/session/MediaController;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/media/session/MediaController;->getTransportControls()Landroid/media/session/MediaController$TransportControls;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-virtual {v1, v2, v3}, Landroid/media/session/MediaController$TransportControls;->sendCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance v1, Lb7/l0;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v1, p0, v2}, Lb7/l0;-><init>(Lb7/t0;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lb7/t0;->e(Lb7/r0;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lb7/t0;->n:Lb7/v3;

    .line 46
    .line 47
    iget v1, v3, Lb7/v3;->x:I

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    if-ne v1, v2, :cond_2

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move v10, v1

    .line 56
    :goto_0
    iget-boolean v4, v3, Lb7/v3;->t:Z

    .line 57
    .line 58
    if-ne v4, v0, :cond_3

    .line 59
    .line 60
    if-ne v1, v10, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    iget-wide v4, p0, Lb7/t0;->y:J

    .line 64
    .line 65
    iget-wide v6, p0, Lb7/t0;->z:J

    .line 66
    .line 67
    iget-object v1, p0, Lb7/t0;->a:Lb7/d0;

    .line 68
    .line 69
    iget-wide v8, v1, Lb7/d0;->e:J

    .line 70
    .line 71
    invoke-static/range {v3 .. v9}, Lb7/s3;->f(Lb7/v3;JJJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v3

    .line 75
    iput-wide v3, p0, Lb7/t0;->y:J

    .line 76
    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    iput-wide v3, p0, Lb7/t0;->z:J

    .line 82
    .line 83
    iget-object v1, p0, Lb7/t0;->n:Lb7/v3;

    .line 84
    .line 85
    invoke-virtual {v1, v2, v10, v0}, Lb7/v3;->b(IIZ)Lb7/v3;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v5, 0x0

    .line 96
    move-object v3, p0

    .line 97
    invoke-virtual/range {v3 .. v8}, Lb7/t0;->s(Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void
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

.method public final l(Lb7/v3;Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7/t0;->h:Lp4/n;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance v1, Lb7/h0;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-direct {v1, p2, p3, v2}, Lb7/h0;-><init>(Lb7/v3;Ljava/lang/Integer;I)V

    .line 9
    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-virtual {v0, p3, v1}, Lp4/n;->c(ILp4/k;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-eqz p5, :cond_1

    .line 16
    .line 17
    new-instance p3, Lb7/h0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p3, p2, p5, v1}, Lb7/h0;-><init>(Lb7/v3;Ljava/lang/Integer;I)V

    .line 21
    .line 22
    .line 23
    const/16 p5, 0xb

    .line 24
    .line 25
    invoke-virtual {v0, p5, p3}, Lp4/n;->c(ILp4/k;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p2}, Lb7/v3;->k()Lm4/i0;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    if-eqz p6, :cond_2

    .line 33
    .line 34
    new-instance p5, Lb7/i0;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p5, v1, p3, p6}, Lb7/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 p3, 0x1

    .line 41
    invoke-virtual {v0, p3, p5}, Lp4/n;->c(ILp4/k;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object p3, p1, Lb7/v3;->a:Lm4/r0;

    .line 45
    .line 46
    iget-object p5, p2, Lb7/v3;->a:Lm4/r0;

    .line 47
    .line 48
    if-eq p3, p5, :cond_4

    .line 49
    .line 50
    if-eqz p3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p3, p5}, Lm4/r0;->a(Lm4/r0;)Z

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    new-instance p3, Lb7/j0;

    .line 60
    .line 61
    const/4 p6, 0x0

    .line 62
    invoke-direct {p3, p6, p5}, Lb7/j0;-><init>(ILm4/r0;)V

    .line 63
    .line 64
    .line 65
    const/16 p6, 0xa

    .line 66
    .line 67
    invoke-virtual {v0, p6, p3}, Lp4/n;->c(ILp4/k;)V

    .line 68
    .line 69
    .line 70
    if-eqz p5, :cond_4

    .line 71
    .line 72
    new-instance p3, Lb7/j0;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-direct {p3, v1, p5}, Lb7/j0;-><init>(ILm4/r0;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p6, p3}, Lp4/n;->c(ILp4/k;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    :goto_0
    iget-object p3, p1, Lb7/v3;->D:Lm4/q1;

    .line 82
    .line 83
    iget-object p5, p2, Lb7/v3;->D:Lm4/q1;

    .line 84
    .line 85
    invoke-virtual {p3, p5}, Lm4/q1;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    if-nez p3, :cond_5

    .line 90
    .line 91
    new-instance p3, Lb7/g0;

    .line 92
    .line 93
    const/16 p5, 0xf

    .line 94
    .line 95
    invoke-direct {p3, p2, p5}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 96
    .line 97
    .line 98
    const/4 p5, 0x2

    .line 99
    invoke-virtual {v0, p5, p3}, Lp4/n;->c(ILp4/k;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    iget-object p3, p1, Lb7/v3;->z:Lm4/l0;

    .line 103
    .line 104
    iget-object p5, p2, Lb7/v3;->z:Lm4/l0;

    .line 105
    .line 106
    invoke-virtual {p3, p5}, Lm4/l0;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-nez p3, :cond_6

    .line 111
    .line 112
    new-instance p3, Lb7/g0;

    .line 113
    .line 114
    const/16 p5, 0x10

    .line 115
    .line 116
    invoke-direct {p3, p2, p5}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 117
    .line 118
    .line 119
    const/16 p5, 0xe

    .line 120
    .line 121
    invoke-virtual {v0, p5, p3}, Lp4/n;->c(ILp4/k;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    iget-boolean p3, p1, Lb7/v3;->w:Z

    .line 125
    .line 126
    iget-boolean p5, p2, Lb7/v3;->w:Z

    .line 127
    .line 128
    if-eq p3, p5, :cond_7

    .line 129
    .line 130
    new-instance p3, Lb7/g0;

    .line 131
    .line 132
    const/16 p5, 0x11

    .line 133
    .line 134
    invoke-direct {p3, p2, p5}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 135
    .line 136
    .line 137
    const/4 p5, 0x3

    .line 138
    invoke-virtual {v0, p5, p3}, Lp4/n;->c(ILp4/k;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    iget p3, p1, Lb7/v3;->y:I

    .line 142
    .line 143
    iget p5, p2, Lb7/v3;->y:I

    .line 144
    .line 145
    if-eq p3, p5, :cond_8

    .line 146
    .line 147
    new-instance p3, Lb7/g0;

    .line 148
    .line 149
    const/16 p5, 0x12

    .line 150
    .line 151
    invoke-direct {p3, p2, p5}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 152
    .line 153
    .line 154
    const/4 p5, 0x4

    .line 155
    invoke-virtual {v0, p5, p3}, Lp4/n;->c(ILp4/k;)V

    .line 156
    .line 157
    .line 158
    :cond_8
    if-eqz p4, :cond_9

    .line 159
    .line 160
    new-instance p3, Lb7/h0;

    .line 161
    .line 162
    const/4 p5, 0x1

    .line 163
    invoke-direct {p3, p2, p4, p5}, Lb7/h0;-><init>(Lb7/v3;Ljava/lang/Integer;I)V

    .line 164
    .line 165
    .line 166
    const/4 p4, 0x5

    .line 167
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    iget p3, p1, Lb7/v3;->x:I

    .line 171
    .line 172
    iget p4, p2, Lb7/v3;->x:I

    .line 173
    .line 174
    if-eq p3, p4, :cond_a

    .line 175
    .line 176
    new-instance p3, Lb7/g0;

    .line 177
    .line 178
    const/16 p4, 0x13

    .line 179
    .line 180
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 181
    .line 182
    .line 183
    const/4 p4, 0x6

    .line 184
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 185
    .line 186
    .line 187
    :cond_a
    iget-boolean p3, p1, Lb7/v3;->v:Z

    .line 188
    .line 189
    iget-boolean p4, p2, Lb7/v3;->v:Z

    .line 190
    .line 191
    if-eq p3, p4, :cond_b

    .line 192
    .line 193
    new-instance p3, Lb7/g0;

    .line 194
    .line 195
    const/16 p4, 0x14

    .line 196
    .line 197
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 198
    .line 199
    .line 200
    const/4 p4, 0x7

    .line 201
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 202
    .line 203
    .line 204
    :cond_b
    iget-object p3, p1, Lb7/v3;->g:Lm4/s0;

    .line 205
    .line 206
    iget-object p4, p2, Lb7/v3;->g:Lm4/s0;

    .line 207
    .line 208
    invoke-virtual {p3, p4}, Lm4/s0;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p3

    .line 212
    if-nez p3, :cond_c

    .line 213
    .line 214
    new-instance p3, Lb7/g0;

    .line 215
    .line 216
    const/4 p4, 0x0

    .line 217
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 218
    .line 219
    .line 220
    const/16 p4, 0xc

    .line 221
    .line 222
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 223
    .line 224
    .line 225
    :cond_c
    iget p3, p1, Lb7/v3;->h:I

    .line 226
    .line 227
    iget p4, p2, Lb7/v3;->h:I

    .line 228
    .line 229
    if-eq p3, p4, :cond_d

    .line 230
    .line 231
    new-instance p3, Lb7/g0;

    .line 232
    .line 233
    const/4 p4, 0x1

    .line 234
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 235
    .line 236
    .line 237
    const/16 p4, 0x8

    .line 238
    .line 239
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 240
    .line 241
    .line 242
    :cond_d
    iget-boolean p3, p1, Lb7/v3;->i:Z

    .line 243
    .line 244
    iget-boolean p4, p2, Lb7/v3;->i:Z

    .line 245
    .line 246
    if-eq p3, p4, :cond_e

    .line 247
    .line 248
    new-instance p3, Lb7/g0;

    .line 249
    .line 250
    const/4 p4, 0x2

    .line 251
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 252
    .line 253
    .line 254
    const/16 p4, 0x9

    .line 255
    .line 256
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 257
    .line 258
    .line 259
    :cond_e
    iget-object p3, p1, Lb7/v3;->m:Lm4/l0;

    .line 260
    .line 261
    iget-object p4, p2, Lb7/v3;->m:Lm4/l0;

    .line 262
    .line 263
    invoke-virtual {p3, p4}, Lm4/l0;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    if-nez p3, :cond_f

    .line 268
    .line 269
    new-instance p3, Lb7/g0;

    .line 270
    .line 271
    const/4 p4, 0x3

    .line 272
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 273
    .line 274
    .line 275
    const/16 p4, 0xf

    .line 276
    .line 277
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 278
    .line 279
    .line 280
    :cond_f
    iget p3, p1, Lb7/v3;->n:F

    .line 281
    .line 282
    iget p4, p2, Lb7/v3;->n:F

    .line 283
    .line 284
    cmpl-float p3, p3, p4

    .line 285
    .line 286
    if-eqz p3, :cond_10

    .line 287
    .line 288
    new-instance p3, Lb7/g0;

    .line 289
    .line 290
    const/4 p4, 0x4

    .line 291
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 292
    .line 293
    .line 294
    const/16 p4, 0x16

    .line 295
    .line 296
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 297
    .line 298
    .line 299
    :cond_10
    iget-object p3, p1, Lb7/v3;->o:Lm4/d;

    .line 300
    .line 301
    iget-object p4, p2, Lb7/v3;->o:Lm4/d;

    .line 302
    .line 303
    invoke-virtual {p3, p4}, Lm4/d;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result p3

    .line 307
    if-nez p3, :cond_11

    .line 308
    .line 309
    new-instance p3, Lb7/g0;

    .line 310
    .line 311
    const/4 p4, 0x5

    .line 312
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 313
    .line 314
    .line 315
    const/16 p4, 0x14

    .line 316
    .line 317
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 318
    .line 319
    .line 320
    :cond_11
    iget-object p3, p1, Lb7/v3;->p:Lo4/c;

    .line 321
    .line 322
    iget-object p3, p3, Lo4/c;->a:Lya/i0;

    .line 323
    .line 324
    iget-object p4, p2, Lb7/v3;->p:Lo4/c;

    .line 325
    .line 326
    iget-object p4, p4, Lo4/c;->a:Lya/i0;

    .line 327
    .line 328
    invoke-virtual {p3, p4}, Lya/i0;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result p3

    .line 332
    if-nez p3, :cond_12

    .line 333
    .line 334
    new-instance p3, Lb7/g0;

    .line 335
    .line 336
    const/4 p4, 0x6

    .line 337
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 338
    .line 339
    .line 340
    const/16 p4, 0x1b

    .line 341
    .line 342
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 343
    .line 344
    .line 345
    new-instance p3, Lb7/g0;

    .line 346
    .line 347
    const/4 p5, 0x7

    .line 348
    invoke-direct {p3, p2, p5}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 352
    .line 353
    .line 354
    :cond_12
    iget-object p3, p1, Lb7/v3;->q:Lm4/k;

    .line 355
    .line 356
    iget-object p4, p2, Lb7/v3;->q:Lm4/k;

    .line 357
    .line 358
    invoke-virtual {p3, p4}, Lm4/k;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p3

    .line 362
    if-nez p3, :cond_13

    .line 363
    .line 364
    new-instance p3, Lb7/g0;

    .line 365
    .line 366
    const/16 p4, 0x8

    .line 367
    .line 368
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 369
    .line 370
    .line 371
    const/16 p4, 0x1d

    .line 372
    .line 373
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 374
    .line 375
    .line 376
    :cond_13
    iget p3, p1, Lb7/v3;->r:I

    .line 377
    .line 378
    iget p4, p2, Lb7/v3;->r:I

    .line 379
    .line 380
    if-ne p3, p4, :cond_14

    .line 381
    .line 382
    iget-boolean p3, p1, Lb7/v3;->s:Z

    .line 383
    .line 384
    iget-boolean p4, p2, Lb7/v3;->s:Z

    .line 385
    .line 386
    if-eq p3, p4, :cond_15

    .line 387
    .line 388
    :cond_14
    new-instance p3, Lb7/g0;

    .line 389
    .line 390
    const/16 p4, 0x9

    .line 391
    .line 392
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 393
    .line 394
    .line 395
    const/16 p4, 0x1e

    .line 396
    .line 397
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 398
    .line 399
    .line 400
    :cond_15
    iget-object p3, p1, Lb7/v3;->l:Lm4/u1;

    .line 401
    .line 402
    iget-object p4, p2, Lb7/v3;->l:Lm4/u1;

    .line 403
    .line 404
    invoke-virtual {p3, p4}, Lm4/u1;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result p3

    .line 408
    if-nez p3, :cond_16

    .line 409
    .line 410
    new-instance p3, Lb7/g0;

    .line 411
    .line 412
    const/16 p4, 0xa

    .line 413
    .line 414
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 415
    .line 416
    .line 417
    const/16 p4, 0x19

    .line 418
    .line 419
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 420
    .line 421
    .line 422
    :cond_16
    iget-wide p3, p1, Lb7/v3;->A:J

    .line 423
    .line 424
    iget-wide p5, p2, Lb7/v3;->A:J

    .line 425
    .line 426
    cmp-long v1, p3, p5

    .line 427
    .line 428
    if-eqz v1, :cond_17

    .line 429
    .line 430
    new-instance p3, Lb7/g0;

    .line 431
    .line 432
    const/16 p4, 0xb

    .line 433
    .line 434
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 435
    .line 436
    .line 437
    const/16 p4, 0x10

    .line 438
    .line 439
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 440
    .line 441
    .line 442
    :cond_17
    iget-wide p3, p1, Lb7/v3;->B:J

    .line 443
    .line 444
    iget-wide p5, p2, Lb7/v3;->B:J

    .line 445
    .line 446
    cmp-long v1, p3, p5

    .line 447
    .line 448
    if-eqz v1, :cond_18

    .line 449
    .line 450
    new-instance p3, Lb7/g0;

    .line 451
    .line 452
    const/16 p4, 0xc

    .line 453
    .line 454
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 455
    .line 456
    .line 457
    const/16 p4, 0x11

    .line 458
    .line 459
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 460
    .line 461
    .line 462
    :cond_18
    iget-wide p3, p1, Lb7/v3;->C:J

    .line 463
    .line 464
    iget-wide p5, p2, Lb7/v3;->C:J

    .line 465
    .line 466
    cmp-long v1, p3, p5

    .line 467
    .line 468
    if-eqz v1, :cond_19

    .line 469
    .line 470
    new-instance p3, Lb7/g0;

    .line 471
    .line 472
    const/16 p4, 0xd

    .line 473
    .line 474
    invoke-direct {p3, p2, p4}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 475
    .line 476
    .line 477
    const/16 p4, 0x12

    .line 478
    .line 479
    invoke-virtual {v0, p4, p3}, Lp4/n;->c(ILp4/k;)V

    .line 480
    .line 481
    .line 482
    :cond_19
    iget-object p1, p1, Lb7/v3;->E:Lm4/o1;

    .line 483
    .line 484
    iget-object p3, p2, Lb7/v3;->E:Lm4/o1;

    .line 485
    .line 486
    invoke-virtual {p1, p3}, Lm4/o1;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result p1

    .line 490
    if-nez p1, :cond_1a

    .line 491
    .line 492
    new-instance p1, Lb7/g0;

    .line 493
    .line 494
    const/16 p3, 0xe

    .line 495
    .line 496
    invoke-direct {p1, p2, p3}, Lb7/g0;-><init>(Lb7/v3;I)V

    .line 497
    .line 498
    .line 499
    const/16 p2, 0x13

    .line 500
    .line 501
    invoke-virtual {v0, p2, p1}, Lp4/n;->c(ILp4/k;)V

    .line 502
    .line 503
    .line 504
    :cond_1a
    invoke-virtual {v0}, Lp4/n;->b()V

    .line 505
    .line 506
    .line 507
    return-void
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
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 4
    .line 5
    iget-boolean v0, v0, Lb7/h4;->b:Z

    .line 6
    .line 7
    return v0
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

.method public final p(Ljava/util/List;IJZ)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    const/4 v11, 0x0

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-ge v11, v6, :cond_0

    .line 28
    .line 29
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    move-object v8, v6

    .line 34
    check-cast v8, Lm4/i0;

    .line 35
    .line 36
    sget-object v6, Lb7/x;->a:Lya/m0;

    .line 37
    .line 38
    new-instance v6, Lm4/h1;

    .line 39
    .line 40
    invoke-direct {v6}, Lm4/h1;-><init>()V

    .line 41
    .line 42
    .line 43
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide/16 v25, 0x0

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    move/from16 v23, v11

    .line 52
    .line 53
    const-wide/16 v10, 0x0

    .line 54
    .line 55
    const-wide/16 v12, 0x0

    .line 56
    .line 57
    const-wide/16 v14, 0x0

    .line 58
    .line 59
    const/16 v16, 0x1

    .line 60
    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    const-wide/16 v19, 0x0

    .line 66
    .line 67
    move/from16 v24, v23

    .line 68
    .line 69
    invoke-virtual/range {v6 .. v26}, Lm4/h1;->b(Ljava/lang/Object;Lm4/i0;Ljava/lang/Object;JJJZZLm4/c0;JJIIJ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    new-instance v8, Lm4/f1;

    .line 76
    .line 77
    invoke-direct {v8}, Lm4/f1;-><init>()V

    .line 78
    .line 79
    .line 80
    sget-object v16, Lm4/b;->f:Lm4/b;

    .line 81
    .line 82
    const/16 v17, 0x1

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    move/from16 v11, v23

    .line 91
    .line 92
    invoke-virtual/range {v8 .. v17}, Lm4/f1;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLm4/b;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    add-int/lit8 v11, v23, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    new-instance v6, Lm4/g1;

    .line 102
    .line 103
    new-instance v8, Lya/f0;

    .line 104
    .line 105
    const/4 v9, 0x4

    .line 106
    invoke-direct {v8, v9}, Lya/c0;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8, v3}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8}, Lya/f0;->f()Lya/a1;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    new-instance v10, Lya/f0;

    .line 117
    .line 118
    invoke-direct {v10, v9}, Lya/c0;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10, v4}, Lya/c0;->c(Ljava/lang/Iterable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Lya/f0;->f()Lya/a1;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    new-array v10, v3, [I

    .line 133
    .line 134
    const/4 v11, 0x0

    .line 135
    :goto_1
    if-ge v11, v3, :cond_1

    .line 136
    .line 137
    aput v11, v10, v11

    .line 138
    .line 139
    add-int/lit8 v11, v11, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    invoke-direct {v6, v8, v4, v10}, Lm4/g1;-><init>(Lya/a1;Lya/a1;[I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6}, Lm4/i1;->p()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    iget-object v4, v6, Lm4/g1;->e:Lya/i0;

    .line 150
    .line 151
    if-nez v3, :cond_3

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-ge v2, v3, :cond_2

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_2
    new-instance v1, Lm4/t;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :cond_3
    :goto_2
    const/4 v3, -0x1

    .line 167
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    const/4 v8, 0x1

    .line 173
    if-eqz p5, :cond_4

    .line 174
    .line 175
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 176
    .line 177
    iget-boolean v2, v2, Lb7/v3;->i:Z

    .line 178
    .line 179
    invoke-virtual {v6, v2}, Lm4/g1;->a(Z)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    move v14, v2

    .line 184
    move-wide v4, v10

    .line 185
    :goto_3
    const/4 v2, 0x0

    .line 186
    goto :goto_4

    .line 187
    :cond_4
    if-ne v2, v3, :cond_6

    .line 188
    .line 189
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 190
    .line 191
    iget-object v2, v2, Lb7/v3;->c:Lb7/h4;

    .line 192
    .line 193
    iget-object v2, v2, Lb7/h4;->a:Lm4/x0;

    .line 194
    .line 195
    iget v12, v2, Lm4/x0;->b:I

    .line 196
    .line 197
    iget-wide v13, v2, Lm4/x0;->f:J

    .line 198
    .line 199
    invoke-virtual {v6}, Lm4/i1;->p()Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-nez v2, :cond_5

    .line 204
    .line 205
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-lt v12, v2, :cond_5

    .line 210
    .line 211
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 212
    .line 213
    iget-boolean v2, v2, Lb7/v3;->i:Z

    .line 214
    .line 215
    invoke-virtual {v6, v2}, Lm4/g1;->a(Z)I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    move v14, v2

    .line 220
    move-wide v4, v10

    .line 221
    const/4 v2, 0x1

    .line 222
    goto :goto_4

    .line 223
    :cond_5
    move-wide v4, v13

    .line 224
    const/4 v2, 0x0

    .line 225
    move v14, v12

    .line 226
    goto :goto_4

    .line 227
    :cond_6
    move-wide/from16 v4, p3

    .line 228
    .line 229
    move v14, v2

    .line 230
    goto :goto_3

    .line 231
    :goto_4
    invoke-virtual {v0, v6, v14, v4, v5}, Lb7/t0;->g(Lm4/i1;IJ)Lb7/q0;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    if-nez v12, :cond_b

    .line 236
    .line 237
    new-instance v12, Lm4/x0;

    .line 238
    .line 239
    const-wide/16 v24, 0x0

    .line 240
    .line 241
    cmp-long v1, v4, v10

    .line 242
    .line 243
    if-nez v1, :cond_7

    .line 244
    .line 245
    move-wide/from16 v18, v24

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_7
    move-wide/from16 v18, v4

    .line 249
    .line 250
    :goto_5
    if-nez v1, :cond_8

    .line 251
    .line 252
    move-wide/from16 v20, v24

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_8
    move-wide/from16 v20, v4

    .line 256
    .line 257
    :goto_6
    const/16 v22, -0x1

    .line 258
    .line 259
    const/16 v23, -0x1

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v15, 0x0

    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    move/from16 v17, v14

    .line 266
    .line 267
    invoke-direct/range {v12 .. v23}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 268
    .line 269
    .line 270
    new-instance v15, Lb7/h4;

    .line 271
    .line 272
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 273
    .line 274
    .line 275
    move-result-wide v18

    .line 276
    if-nez v1, :cond_9

    .line 277
    .line 278
    move-wide/from16 v22, v24

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_9
    move-wide/from16 v22, v4

    .line 282
    .line 283
    :goto_7
    if-nez v1, :cond_a

    .line 284
    .line 285
    move-wide/from16 v31, v24

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_a
    move-wide/from16 v31, v4

    .line 289
    .line 290
    :goto_8
    const/16 v17, 0x0

    .line 291
    .line 292
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    const/16 v24, 0x0

    .line 298
    .line 299
    const-wide/16 v25, 0x0

    .line 300
    .line 301
    const-wide v27, -0x7fffffffffffffffL    # -4.9E-324

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    const-wide v29, -0x7fffffffffffffffL    # -4.9E-324

    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    move-object/from16 v16, v12

    .line 312
    .line 313
    invoke-direct/range {v15 .. v32}, Lb7/h4;-><init>(Lm4/x0;ZJJJIJJJJ)V

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_b
    iget-wide v4, v12, Lb7/q0;->a:J

    .line 318
    .line 319
    new-instance v16, Lm4/x0;

    .line 320
    .line 321
    invoke-interface {v1, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    move-object v15, v1

    .line 326
    check-cast v15, Lm4/i0;

    .line 327
    .line 328
    iget v1, v12, Lb7/q0;->b:I

    .line 329
    .line 330
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 331
    .line 332
    .line 333
    move-result-wide v18

    .line 334
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v20

    .line 338
    const/16 v22, -0x1

    .line 339
    .line 340
    const/16 v23, -0x1

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    move-object/from16 v12, v16

    .line 344
    .line 345
    const/16 v16, 0x0

    .line 346
    .line 347
    move/from16 v17, v1

    .line 348
    .line 349
    invoke-direct/range {v12 .. v23}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 350
    .line 351
    .line 352
    new-instance v15, Lb7/h4;

    .line 353
    .line 354
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 355
    .line 356
    .line 357
    move-result-wide v18

    .line 358
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 359
    .line 360
    .line 361
    move-result-wide v22

    .line 362
    const-wide v29, -0x7fffffffffffffffL    # -4.9E-324

    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 368
    .line 369
    .line 370
    move-result-wide v31

    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    const/16 v24, 0x0

    .line 379
    .line 380
    const-wide/16 v25, 0x0

    .line 381
    .line 382
    const-wide v27, -0x7fffffffffffffffL    # -4.9E-324

    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    move-object/from16 v16, v12

    .line 388
    .line 389
    invoke-direct/range {v15 .. v32}, Lb7/h4;-><init>(Lm4/x0;ZJJJIJJJJ)V

    .line 390
    .line 391
    .line 392
    :goto_9
    iget-object v1, v0, Lb7/t0;->n:Lb7/v3;

    .line 393
    .line 394
    invoke-static {v1, v6, v12, v15, v9}, Lb7/t0;->j(Lb7/v3;Lm4/i1;Lm4/x0;Lb7/h4;I)Lb7/v3;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    iget v4, v1, Lb7/v3;->y:I

    .line 399
    .line 400
    if-eq v14, v3, :cond_e

    .line 401
    .line 402
    if-eq v4, v8, :cond_e

    .line 403
    .line 404
    invoke-virtual {v6}, Lm4/i1;->p()Z

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    if-nez v3, :cond_d

    .line 409
    .line 410
    if-eqz v2, :cond_c

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_c
    const/4 v4, 0x2

    .line 414
    goto :goto_b

    .line 415
    :cond_d
    :goto_a
    const/4 v4, 0x4

    .line 416
    :cond_e
    :goto_b
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 417
    .line 418
    iget-object v2, v2, Lb7/v3;->a:Lm4/r0;

    .line 419
    .line 420
    invoke-virtual {v1, v4, v2}, Lb7/v3;->c(ILm4/r0;)Lb7/v3;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 425
    .line 426
    iget-object v2, v2, Lb7/v3;->j:Lm4/i1;

    .line 427
    .line 428
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    const/4 v3, 0x0

    .line 433
    if-nez v2, :cond_f

    .line 434
    .line 435
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    move-object v4, v2

    .line 440
    goto :goto_c

    .line 441
    :cond_f
    move-object v4, v3

    .line 442
    :goto_c
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 443
    .line 444
    iget-object v2, v2, Lb7/v3;->j:Lm4/i1;

    .line 445
    .line 446
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-eqz v2, :cond_11

    .line 451
    .line 452
    iget-object v2, v1, Lb7/v3;->j:Lm4/i1;

    .line 453
    .line 454
    invoke-virtual {v2}, Lm4/i1;->p()Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-nez v2, :cond_10

    .line 459
    .line 460
    goto :goto_e

    .line 461
    :cond_10
    :goto_d
    move-object v5, v3

    .line 462
    goto :goto_f

    .line 463
    :cond_11
    :goto_e
    const/4 v2, 0x3

    .line 464
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    goto :goto_d

    .line 469
    :goto_f
    const/4 v3, 0x0

    .line 470
    move-object v2, v7

    .line 471
    invoke-virtual/range {v0 .. v5}, Lb7/t0;->s(Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 472
    .line 473
    .line 474
    return-void
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 4
    .line 5
    iget-wide v0, v0, Lb7/h4;->g:J

    .line 6
    .line 7
    return-wide v0
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

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-boolean v0, v0, Lb7/v3;->t:Z

    .line 4
    .line 5
    return v0
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

.method public final s(Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 7

    .line 1
    iget-object v1, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iput-object p1, p0, Lb7/t0;->n:Lb7/v3;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    move-object v6, p5

    .line 11
    invoke-virtual/range {v0 .. v6}, Lb7/t0;->l(Lb7/v3;Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public final t(Lm4/i0;J)V
    .locals 7

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lb7/t0;->h(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lb7/m0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2, p3}, Lb7/m0;-><init>(Lb7/t0;Lm4/i0;J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lb7/t0;->e(Lb7/r0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, -0x1

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v1, p0

    .line 25
    move-wide v4, p2

    .line 26
    invoke-virtual/range {v1 .. v6}, Lb7/t0;->p(Ljava/util/List;IJZ)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final u()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 4
    .line 5
    iget-object v0, v0, Lb7/h4;->a:Lm4/x0;

    .line 6
    .line 7
    iget v0, v0, Lm4/x0;->e:I

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

.method public final v()V
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {v0, v1}, Lb7/t0;->h(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v1, Lb7/l0;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, v0, v2}, Lb7/l0;-><init>(Lb7/t0;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lb7/t0;->e(Lb7/r0;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lb7/t0;->n:Lb7/v3;

    .line 21
    .line 22
    invoke-static {v1}, Lb7/t0;->f(Lb7/v3;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget-object v1, v0, Lb7/t0;->n:Lb7/v3;

    .line 27
    .line 28
    iget-object v1, v1, Lb7/v3;->j:Lm4/i1;

    .line 29
    .line 30
    invoke-virtual {v1}, Lm4/i1;->p()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Lm4/i1;->o()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-ge v4, v2, :cond_11

    .line 41
    .line 42
    :cond_1
    invoke-virtual {v0}, Lb7/t0;->o()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    goto/16 :goto_e

    .line 49
    .line 50
    :cond_2
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 51
    .line 52
    iget v3, v2, Lb7/v3;->y:I

    .line 53
    .line 54
    const/4 v15, 0x1

    .line 55
    if-ne v3, v15, :cond_3

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const/4 v3, 0x2

    .line 60
    :goto_0
    iget-object v5, v2, Lb7/v3;->a:Lm4/r0;

    .line 61
    .line 62
    invoke-virtual {v2, v3, v5}, Lb7/v3;->c(ILm4/r0;)Lb7/v3;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1, v4, v5, v6}, Lb7/t0;->g(Lm4/i1;IJ)Lb7/q0;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const/4 v7, 0x0

    .line 76
    const-wide/16 v8, 0x0

    .line 77
    .line 78
    if-nez v3, :cond_8

    .line 79
    .line 80
    new-instance v17, Lm4/x0;

    .line 81
    .line 82
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    cmp-long v16, v5, v1

    .line 88
    .line 89
    move-wide v1, v8

    .line 90
    if-nez v16, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move-wide v8, v5

    .line 94
    :goto_1
    if-nez v16, :cond_5

    .line 95
    .line 96
    move-wide v10, v1

    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move-wide v10, v5

    .line 99
    :goto_2
    const/4 v12, -0x1

    .line 100
    const/4 v13, -0x1

    .line 101
    const/4 v3, 0x0

    .line 102
    move-wide/from16 v18, v5

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    const/4 v6, 0x0

    .line 106
    const/16 v20, 0x0

    .line 107
    .line 108
    move v7, v4

    .line 109
    move-object/from16 v2, v17

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-direct/range {v2 .. v13}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 113
    .line 114
    .line 115
    iget-object v2, v0, Lb7/t0;->n:Lb7/v3;

    .line 116
    .line 117
    iget-object v3, v2, Lb7/v3;->j:Lm4/i1;

    .line 118
    .line 119
    move/from16 v4, v16

    .line 120
    .line 121
    new-instance v16, Lb7/h4;

    .line 122
    .line 123
    iget-object v5, v0, Lb7/t0;->n:Lb7/v3;

    .line 124
    .line 125
    iget-object v5, v5, Lb7/v3;->c:Lb7/h4;

    .line 126
    .line 127
    iget-boolean v5, v5, Lb7/h4;->b:Z

    .line 128
    .line 129
    move-wide/from16 v6, v18

    .line 130
    .line 131
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 132
    .line 133
    .line 134
    move-result-wide v19

    .line 135
    iget-object v8, v0, Lb7/t0;->n:Lb7/v3;

    .line 136
    .line 137
    iget-object v8, v8, Lb7/v3;->c:Lb7/h4;

    .line 138
    .line 139
    iget-wide v9, v8, Lb7/h4;->d:J

    .line 140
    .line 141
    if-nez v4, :cond_6

    .line 142
    .line 143
    const-wide/16 v23, 0x0

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    move-wide/from16 v23, v6

    .line 147
    .line 148
    :goto_3
    iget-wide v11, v8, Lb7/h4;->h:J

    .line 149
    .line 150
    iget-wide v6, v8, Lb7/h4;->i:J

    .line 151
    .line 152
    if-nez v4, :cond_7

    .line 153
    .line 154
    const-wide/16 v32, 0x0

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_7
    const-wide v32, -0x7fffffffffffffffL    # -4.9E-324

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    :goto_4
    const/16 v25, 0x0

    .line 163
    .line 164
    const-wide/16 v26, 0x0

    .line 165
    .line 166
    move/from16 v18, v5

    .line 167
    .line 168
    move-wide/from16 v30, v6

    .line 169
    .line 170
    move-wide/from16 v21, v9

    .line 171
    .line 172
    move-wide/from16 v28, v11

    .line 173
    .line 174
    invoke-direct/range {v16 .. v33}, Lb7/h4;-><init>(Lm4/x0;ZJJJIJJJJ)V

    .line 175
    .line 176
    .line 177
    move-object/from16 v5, v16

    .line 178
    .line 179
    move-object/from16 v4, v17

    .line 180
    .line 181
    invoke-static {v2, v3, v4, v5, v15}, Lb7/t0;->j(Lb7/v3;Lm4/i1;Lm4/x0;Lb7/h4;I)Lb7/v3;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    :goto_5
    const/16 v28, 0x2

    .line 186
    .line 187
    :goto_6
    move-object v1, v2

    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_8
    const/4 v4, 0x0

    .line 191
    iget-object v5, v2, Lb7/v3;->c:Lb7/h4;

    .line 192
    .line 193
    iget-object v6, v5, Lb7/h4;->a:Lm4/x0;

    .line 194
    .line 195
    iget-object v5, v5, Lb7/h4;->a:Lm4/x0;

    .line 196
    .line 197
    iget v6, v6, Lm4/x0;->e:I

    .line 198
    .line 199
    iget v7, v3, Lb7/q0;->b:I

    .line 200
    .line 201
    new-instance v8, Lm4/f1;

    .line 202
    .line 203
    invoke-direct {v8}, Lm4/f1;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v6, v8, v4}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 207
    .line 208
    .line 209
    new-instance v9, Lm4/f1;

    .line 210
    .line 211
    invoke-direct {v9}, Lm4/f1;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v7, v9, v4}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 215
    .line 216
    .line 217
    if-eq v6, v7, :cond_9

    .line 218
    .line 219
    const/4 v10, 0x1

    .line 220
    goto :goto_7

    .line 221
    :cond_9
    const/4 v10, 0x0

    .line 222
    :goto_7
    iget-wide v11, v3, Lb7/q0;->a:J

    .line 223
    .line 224
    invoke-virtual {v0}, Lb7/t0;->M()J

    .line 225
    .line 226
    .line 227
    move-result-wide v16

    .line 228
    invoke-static/range {v16 .. v17}, Lp4/c0;->N(J)J

    .line 229
    .line 230
    .line 231
    move-result-wide v16

    .line 232
    const/4 v3, 0x2

    .line 233
    iget-wide v14, v8, Lm4/f1;->e:J

    .line 234
    .line 235
    sub-long v14, v16, v14

    .line 236
    .line 237
    if-nez v10, :cond_a

    .line 238
    .line 239
    cmp-long v16, v11, v14

    .line 240
    .line 241
    if-nez v16, :cond_a

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_a
    const/16 v28, 0x2

    .line 245
    .line 246
    iget v3, v5, Lm4/x0;->h:I

    .line 247
    .line 248
    const/4 v13, -0x1

    .line 249
    if-ne v3, v13, :cond_b

    .line 250
    .line 251
    const/4 v3, 0x1

    .line 252
    goto :goto_8

    .line 253
    :cond_b
    const/4 v3, 0x0

    .line 254
    :goto_8
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 255
    .line 256
    .line 257
    new-instance v16, Lm4/x0;

    .line 258
    .line 259
    iget v3, v8, Lm4/f1;->c:I

    .line 260
    .line 261
    iget-object v5, v5, Lm4/x0;->c:Lm4/i0;

    .line 262
    .line 263
    move-object/from16 v19, v5

    .line 264
    .line 265
    iget-wide v4, v8, Lm4/f1;->e:J

    .line 266
    .line 267
    add-long/2addr v4, v14

    .line 268
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 269
    .line 270
    .line 271
    move-result-wide v22

    .line 272
    iget-wide v4, v8, Lm4/f1;->e:J

    .line 273
    .line 274
    add-long/2addr v4, v14

    .line 275
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v24

    .line 279
    const/16 v26, -0x1

    .line 280
    .line 281
    const/16 v27, -0x1

    .line 282
    .line 283
    const/16 v17, 0x0

    .line 284
    .line 285
    const/16 v20, 0x0

    .line 286
    .line 287
    move/from16 v18, v3

    .line 288
    .line 289
    move/from16 v21, v6

    .line 290
    .line 291
    invoke-direct/range {v16 .. v27}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 292
    .line 293
    .line 294
    move-object/from16 v3, v16

    .line 295
    .line 296
    const/4 v4, 0x0

    .line 297
    invoke-virtual {v1, v7, v9, v4}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 298
    .line 299
    .line 300
    new-instance v5, Lm4/h1;

    .line 301
    .line 302
    invoke-direct {v5}, Lm4/h1;-><init>()V

    .line 303
    .line 304
    .line 305
    iget v6, v9, Lm4/f1;->c:I

    .line 306
    .line 307
    invoke-virtual {v1, v6, v5}, Lm4/i1;->n(ILm4/h1;)V

    .line 308
    .line 309
    .line 310
    new-instance v35, Lm4/x0;

    .line 311
    .line 312
    iget v1, v9, Lm4/f1;->c:I

    .line 313
    .line 314
    iget-object v6, v5, Lm4/h1;->c:Lm4/i0;

    .line 315
    .line 316
    move-object v8, v5

    .line 317
    iget-wide v4, v9, Lm4/f1;->e:J

    .line 318
    .line 319
    add-long/2addr v4, v11

    .line 320
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 321
    .line 322
    .line 323
    move-result-wide v22

    .line 324
    iget-wide v4, v9, Lm4/f1;->e:J

    .line 325
    .line 326
    add-long/2addr v4, v11

    .line 327
    invoke-static {v4, v5}, Lp4/c0;->c0(J)J

    .line 328
    .line 329
    .line 330
    move-result-wide v24

    .line 331
    move/from16 v18, v1

    .line 332
    .line 333
    move-object/from16 v19, v6

    .line 334
    .line 335
    move/from16 v21, v7

    .line 336
    .line 337
    move-object/from16 v16, v35

    .line 338
    .line 339
    invoke-direct/range {v16 .. v27}, Lm4/x0;-><init>(Ljava/lang/Object;ILm4/i0;Ljava/lang/Object;IJJII)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v1, v16

    .line 343
    .line 344
    const/4 v13, 0x1

    .line 345
    invoke-virtual {v2, v3, v1, v13}, Lb7/v3;->d(Lm4/x0;Lm4/x0;I)Lb7/v3;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    if-nez v10, :cond_c

    .line 350
    .line 351
    cmp-long v3, v11, v14

    .line 352
    .line 353
    if-gez v3, :cond_d

    .line 354
    .line 355
    :cond_c
    move-object/from16 v35, v1

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_d
    iget-object v3, v2, Lb7/v3;->c:Lb7/h4;

    .line 359
    .line 360
    iget-wide v3, v3, Lb7/h4;->g:J

    .line 361
    .line 362
    invoke-static {v3, v4}, Lp4/c0;->N(J)J

    .line 363
    .line 364
    .line 365
    move-result-wide v3

    .line 366
    sub-long v5, v11, v14

    .line 367
    .line 368
    sub-long/2addr v3, v5

    .line 369
    const-wide/16 v5, 0x0

    .line 370
    .line 371
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    add-long/2addr v11, v3

    .line 376
    new-instance v34, Lb7/h4;

    .line 377
    .line 378
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 379
    .line 380
    .line 381
    move-result-wide v37

    .line 382
    iget-wide v5, v8, Lm4/h1;->m:J

    .line 383
    .line 384
    invoke-static {v5, v6}, Lp4/c0;->c0(J)J

    .line 385
    .line 386
    .line 387
    move-result-wide v39

    .line 388
    invoke-static {v11, v12}, Lp4/c0;->c0(J)J

    .line 389
    .line 390
    .line 391
    move-result-wide v41

    .line 392
    invoke-static {v11, v12}, Lp4/c0;->c0(J)J

    .line 393
    .line 394
    .line 395
    move-result-wide v5

    .line 396
    iget-wide v7, v8, Lm4/h1;->m:J

    .line 397
    .line 398
    invoke-static {v7, v8}, Lp4/c0;->c0(J)J

    .line 399
    .line 400
    .line 401
    move-result-wide v7

    .line 402
    invoke-static {v5, v6, v7, v8}, Lb7/s3;->e(JJ)I

    .line 403
    .line 404
    .line 405
    move-result v43

    .line 406
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 407
    .line 408
    .line 409
    move-result-wide v44

    .line 410
    const-wide v48, -0x7fffffffffffffffL    # -4.9E-324

    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    invoke-static {v11, v12}, Lp4/c0;->c0(J)J

    .line 416
    .line 417
    .line 418
    move-result-wide v50

    .line 419
    const/16 v36, 0x0

    .line 420
    .line 421
    const-wide v46, -0x7fffffffffffffffL    # -4.9E-324

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    move-object/from16 v35, v1

    .line 427
    .line 428
    invoke-direct/range {v34 .. v51}, Lb7/h4;-><init>(Lm4/x0;ZJJJIJJJJ)V

    .line 429
    .line 430
    .line 431
    move-object/from16 v1, v34

    .line 432
    .line 433
    invoke-virtual {v2, v1}, Lb7/v3;->e(Lb7/h4;)Lb7/v3;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    goto/16 :goto_6

    .line 438
    .line 439
    :goto_9
    new-instance v34, Lb7/h4;

    .line 440
    .line 441
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 442
    .line 443
    .line 444
    move-result-wide v37

    .line 445
    iget-wide v3, v8, Lm4/h1;->m:J

    .line 446
    .line 447
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 448
    .line 449
    .line 450
    move-result-wide v39

    .line 451
    iget-wide v3, v9, Lm4/f1;->e:J

    .line 452
    .line 453
    add-long/2addr v3, v11

    .line 454
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 455
    .line 456
    .line 457
    move-result-wide v41

    .line 458
    iget-wide v3, v9, Lm4/f1;->e:J

    .line 459
    .line 460
    add-long/2addr v3, v11

    .line 461
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 462
    .line 463
    .line 464
    move-result-wide v3

    .line 465
    iget-wide v5, v8, Lm4/h1;->m:J

    .line 466
    .line 467
    invoke-static {v5, v6}, Lp4/c0;->c0(J)J

    .line 468
    .line 469
    .line 470
    move-result-wide v5

    .line 471
    invoke-static {v3, v4, v5, v6}, Lb7/s3;->e(JJ)I

    .line 472
    .line 473
    .line 474
    move-result v43

    .line 475
    iget-wide v3, v9, Lm4/f1;->e:J

    .line 476
    .line 477
    add-long/2addr v3, v11

    .line 478
    invoke-static {v3, v4}, Lp4/c0;->c0(J)J

    .line 479
    .line 480
    .line 481
    move-result-wide v50

    .line 482
    const/16 v36, 0x0

    .line 483
    .line 484
    const-wide/16 v44, 0x0

    .line 485
    .line 486
    const-wide v46, -0x7fffffffffffffffL    # -4.9E-324

    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    const-wide v48, -0x7fffffffffffffffL    # -4.9E-324

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    invoke-direct/range {v34 .. v51}, Lb7/h4;-><init>(Lm4/x0;ZJJJIJJJJ)V

    .line 497
    .line 498
    .line 499
    move-object/from16 v1, v34

    .line 500
    .line 501
    invoke-virtual {v2, v1}, Lb7/v3;->e(Lb7/h4;)Lb7/v3;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    goto/16 :goto_6

    .line 506
    .line 507
    :goto_a
    iget-object v2, v1, Lb7/v3;->c:Lb7/h4;

    .line 508
    .line 509
    iget-object v3, v0, Lb7/t0;->n:Lb7/v3;

    .line 510
    .line 511
    iget-object v3, v3, Lb7/v3;->j:Lm4/i1;

    .line 512
    .line 513
    invoke-virtual {v3}, Lm4/i1;->p()Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    if-nez v3, :cond_e

    .line 518
    .line 519
    iget-object v3, v2, Lb7/h4;->a:Lm4/x0;

    .line 520
    .line 521
    iget v3, v3, Lm4/x0;->b:I

    .line 522
    .line 523
    iget-object v4, v0, Lb7/t0;->n:Lb7/v3;

    .line 524
    .line 525
    iget-object v4, v4, Lb7/v3;->c:Lb7/h4;

    .line 526
    .line 527
    iget-object v4, v4, Lb7/h4;->a:Lm4/x0;

    .line 528
    .line 529
    iget v4, v4, Lm4/x0;->b:I

    .line 530
    .line 531
    if-eq v3, v4, :cond_e

    .line 532
    .line 533
    const/4 v7, 0x1

    .line 534
    goto :goto_b

    .line 535
    :cond_e
    const/4 v7, 0x0

    .line 536
    :goto_b
    if-nez v7, :cond_f

    .line 537
    .line 538
    iget-object v2, v2, Lb7/h4;->a:Lm4/x0;

    .line 539
    .line 540
    iget-wide v2, v2, Lm4/x0;->f:J

    .line 541
    .line 542
    iget-object v4, v0, Lb7/t0;->n:Lb7/v3;

    .line 543
    .line 544
    iget-object v4, v4, Lb7/v3;->c:Lb7/h4;

    .line 545
    .line 546
    iget-object v4, v4, Lb7/h4;->a:Lm4/x0;

    .line 547
    .line 548
    iget-wide v4, v4, Lm4/x0;->f:J

    .line 549
    .line 550
    cmp-long v6, v2, v4

    .line 551
    .line 552
    if-eqz v6, :cond_11

    .line 553
    .line 554
    :cond_f
    const/4 v13, 0x1

    .line 555
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    if-eqz v7, :cond_10

    .line 560
    .line 561
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    :goto_c
    move-object v5, v2

    .line 566
    goto :goto_d

    .line 567
    :cond_10
    const/4 v2, 0x0

    .line 568
    goto :goto_c

    .line 569
    :goto_d
    const/4 v2, 0x0

    .line 570
    const/4 v3, 0x0

    .line 571
    invoke-virtual/range {v0 .. v5}, Lb7/t0;->s(Lb7/v3;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 572
    .line 573
    .line 574
    :cond_11
    :goto_e
    return-void
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
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
.end method

.method public final x()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/t0;->n:Lb7/v3;

    .line 2
    .line 3
    iget-object v0, v0, Lb7/v3;->c:Lb7/h4;

    .line 4
    .line 5
    iget-object v0, v0, Lb7/h4;->a:Lm4/x0;

    .line 6
    .line 7
    iget v0, v0, Lm4/x0;->i:I

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

.method public final z(Lm4/i0;)V
    .locals 7

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lb7/t0;->h(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lb7/i0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1}, Lb7/i0;-><init>(Lb7/t0;Lm4/i0;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lb7/t0;->e(Lb7/r0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, -0x1

    .line 23
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    move-object v1, p0

    .line 30
    invoke-virtual/range {v1 .. v6}, Lb7/t0;->p(Ljava/util/List;IJZ)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
.end method
