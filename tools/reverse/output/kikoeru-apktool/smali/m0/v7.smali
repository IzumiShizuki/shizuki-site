.class public abstract Lm0/v7;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F

.field public static final g:F

.field public static final h:F

.field public static final i:Lr/u1;

.field public static final j:F

.field public static final k:F

.field public static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lm0/v7;->a:F

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    sput v1, Lm0/v7;->b:F

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    sput v1, Lm0/v7;->c:F

    .line 15
    .line 16
    const/16 v2, 0x18

    .line 17
    .line 18
    int-to-float v2, v2

    .line 19
    sput v2, Lm0/v7;->d:F

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    int-to-float v2, v2

    .line 23
    sput v2, Lm0/v7;->e:F

    .line 24
    .line 25
    sput v0, Lm0/v7;->f:F

    .line 26
    .line 27
    sput v1, Lm0/v7;->g:F

    .line 28
    .line 29
    sub-float/2addr v0, v1

    .line 30
    sput v0, Lm0/v7;->h:F

    .line 31
    .line 32
    new-instance v0, Lr/u1;

    .line 33
    .line 34
    const/16 v1, 0x64

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x6

    .line 38
    invoke-direct {v0, v1, v2, v3}, Lr/u1;-><init>(ILr/v;I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lm0/v7;->i:Lr/u1;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    int-to-float v0, v0

    .line 45
    sput v0, Lm0/v7;->j:F

    .line 46
    .line 47
    int-to-float v0, v3

    .line 48
    sput v0, Lm0/v7;->k:F

    .line 49
    .line 50
    const/16 v0, 0x7d

    .line 51
    .line 52
    int-to-float v0, v0

    .line 53
    sput v0, Lm0/v7;->l:F

    .line 54
    .line 55
    return-void
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

.method public static final a(ZLic/k;Lj1/q;ZLm0/w1;Lx0/o;I)V
    .locals 35

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    const v0, 0x18ab249

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v8, v1}, Lx0/o;->g(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p6, v0

    .line 25
    .line 26
    invoke-virtual {v8, v2}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    const/16 v6, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v6, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v6

    .line 38
    or-int/lit16 v0, v0, 0x180

    .line 39
    .line 40
    invoke-virtual {v8, v4}, Lx0/o;->g(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    const/16 v6, 0x800

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v6, 0x400

    .line 50
    .line 51
    :goto_2
    or-int/2addr v0, v6

    .line 52
    or-int/lit16 v0, v0, 0x6000

    .line 53
    .line 54
    move-object/from16 v6, p4

    .line 55
    .line 56
    invoke-virtual {v8, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_3

    .line 61
    .line 62
    const/high16 v7, 0x20000

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    const/high16 v7, 0x10000

    .line 66
    .line 67
    :goto_3
    or-int/2addr v0, v7

    .line 68
    const v7, 0x12493

    .line 69
    .line 70
    .line 71
    and-int/2addr v7, v0

    .line 72
    const v9, 0x12492

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    if-eq v7, v9, :cond_4

    .line 77
    .line 78
    const/4 v7, 0x1

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/4 v7, 0x0

    .line 81
    :goto_4
    and-int/lit8 v9, v0, 0x1

    .line 82
    .line 83
    invoke-virtual {v8, v9, v7}, Lx0/o;->N(IZ)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_19

    .line 88
    .line 89
    invoke-virtual {v8}, Lx0/o;->S()V

    .line 90
    .line 91
    .line 92
    and-int/lit8 v7, p6, 0x1

    .line 93
    .line 94
    sget-object v9, Lj1/n;->a:Lj1/n;

    .line 95
    .line 96
    if-eqz v7, :cond_6

    .line 97
    .line 98
    invoke-virtual {v8}, Lx0/o;->x()Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_5

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    invoke-virtual {v8}, Lx0/o;->Q()V

    .line 106
    .line 107
    .line 108
    move-object/from16 v12, p2

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    :goto_5
    move-object v12, v9

    .line 112
    :goto_6
    invoke-virtual {v8}, Lx0/o;->q()V

    .line 113
    .line 114
    .line 115
    const v7, 0x6b471992

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v7}, Lx0/o;->W(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    sget-object v13, Lx0/k;->a:Lx0/r0;

    .line 126
    .line 127
    if-ne v7, v13, :cond_7

    .line 128
    .line 129
    invoke-static {v8}, Lq/t0;->I(Lx0/o;)Lw/k;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    :cond_7
    check-cast v7, Lw/k;

    .line 134
    .line 135
    invoke-virtual {v8, v10}, Lx0/o;->p(Z)V

    .line 136
    .line 137
    .line 138
    sget-object v14, Lj2/l1;->h:Lx0/o2;

    .line 139
    .line 140
    invoke-virtual {v8, v14}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v15

    .line 144
    check-cast v15, Lf3/c;

    .line 145
    .line 146
    sget v11, Lm0/v7;->h:F

    .line 147
    .line 148
    invoke-interface {v15, v11}, Lf3/c;->Q(F)F

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v15

    .line 156
    if-ne v15, v13, :cond_8

    .line 157
    .line 158
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-static {v15}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    invoke-virtual {v8, v15}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_8
    move-object/from16 v26, v15

    .line 168
    .line 169
    check-cast v26, Lx0/w0;

    .line 170
    .line 171
    invoke-virtual {v8, v14}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    check-cast v14, Lf3/c;

    .line 176
    .line 177
    sget v15, Lm0/v7;->l:F

    .line 178
    .line 179
    invoke-interface {v14, v15}, Lf3/c;->Q(F)F

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    invoke-virtual {v8, v11}, Lx0/o;->c(F)Z

    .line 184
    .line 185
    .line 186
    move-result v15

    .line 187
    invoke-virtual {v8, v14}, Lx0/o;->c(F)Z

    .line 188
    .line 189
    .line 190
    move-result v16

    .line 191
    or-int v15, v15, v16

    .line 192
    .line 193
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    if-nez v15, :cond_9

    .line 198
    .line 199
    if-ne v10, v13, :cond_a

    .line 200
    .line 201
    :cond_9
    new-instance v10, Lm0/a4;

    .line 202
    .line 203
    new-instance v15, Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    .line 206
    .line 207
    .line 208
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 209
    .line 210
    const/16 v16, 0x0

    .line 211
    .line 212
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-interface {v15, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-interface {v15, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    invoke-direct {v10, v15}, Lm0/a4;-><init>(Ljava/util/Map;)V

    .line 229
    .line 230
    .line 231
    new-instance v29, Lm0/x;

    .line 232
    .line 233
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 234
    .line 235
    .line 236
    move-result-object v30

    .line 237
    new-instance v3, Lm0/l3;

    .line 238
    .line 239
    const/16 v5, 0x8

    .line 240
    .line 241
    invoke-direct {v3, v5}, Lm0/l3;-><init>(I)V

    .line 242
    .line 243
    .line 244
    new-instance v5, Lm0/r7;

    .line 245
    .line 246
    invoke-direct {v5, v14}, Lm0/r7;-><init>(F)V

    .line 247
    .line 248
    .line 249
    new-instance v11, Lg1/d;

    .line 250
    .line 251
    const/16 v14, 0x18

    .line 252
    .line 253
    invoke-direct {v11, v14}, Lg1/d;-><init>(I)V

    .line 254
    .line 255
    .line 256
    sget-object v33, Lm0/v7;->i:Lr/u1;

    .line 257
    .line 258
    move-object/from16 v31, v3

    .line 259
    .line 260
    move-object/from16 v32, v5

    .line 261
    .line 262
    move-object/from16 v34, v11

    .line 263
    .line 264
    invoke-direct/range {v29 .. v34}, Lm0/x;-><init>(Ljava/lang/Object;Lic/k;Lic/a;Lr/j;Lic/k;)V

    .line 265
    .line 266
    .line 267
    move-object/from16 v3, v29

    .line 268
    .line 269
    move-object/from16 v5, v30

    .line 270
    .line 271
    iget-object v11, v3, Lm0/x;->m:Lx0/e1;

    .line 272
    .line 273
    invoke-virtual {v11, v10}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v5}, Lm0/x;->i(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    invoke-virtual {v8, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object v10, v3

    .line 283
    :cond_a
    check-cast v10, Lm0/x;

    .line 284
    .line 285
    shr-int/lit8 v3, v0, 0x3

    .line 286
    .line 287
    invoke-static {v2, v8}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object v11

    .line 295
    and-int/lit8 v14, v0, 0xe

    .line 296
    .line 297
    invoke-static {v11, v8}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    invoke-virtual {v8, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v15

    .line 305
    invoke-virtual {v8, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v16

    .line 309
    or-int v15, v15, v16

    .line 310
    .line 311
    invoke-virtual {v8, v5}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v16

    .line 315
    or-int v15, v15, v16

    .line 316
    .line 317
    move/from16 v29, v0

    .line 318
    .line 319
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-nez v15, :cond_b

    .line 324
    .line 325
    if-ne v0, v13, :cond_c

    .line 326
    .line 327
    :cond_b
    new-instance v22, Le/j;

    .line 328
    .line 329
    const/16 v27, 0x0

    .line 330
    .line 331
    const/16 v28, 0x10

    .line 332
    .line 333
    move-object/from16 v25, v5

    .line 334
    .line 335
    move-object/from16 v23, v10

    .line 336
    .line 337
    move-object/from16 v24, v11

    .line 338
    .line 339
    invoke-direct/range {v22 .. v28}, Le/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v0, v22

    .line 343
    .line 344
    invoke-virtual {v8, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_c
    check-cast v0, Lic/n;

    .line 348
    .line 349
    invoke-static {v0, v10, v8}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-interface/range {v26 .. v26}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    check-cast v5, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    const/4 v11, 0x4

    .line 366
    if-ne v14, v11, :cond_d

    .line 367
    .line 368
    const/4 v11, 0x1

    .line 369
    goto :goto_7

    .line 370
    :cond_d
    const/4 v11, 0x0

    .line 371
    :goto_7
    invoke-virtual {v8, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v14

    .line 375
    or-int/2addr v11, v14

    .line 376
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v14

    .line 380
    const/4 v15, 0x0

    .line 381
    if-nez v11, :cond_e

    .line 382
    .line 383
    if-ne v14, v13, :cond_f

    .line 384
    .line 385
    :cond_e
    new-instance v14, Ll0/g1;

    .line 386
    .line 387
    invoke-direct {v14, v1, v10, v15}, Ll0/g1;-><init>(ZLm0/x;Lyb/c;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8, v14}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    :cond_f
    check-cast v14, Lic/n;

    .line 394
    .line 395
    invoke-static {v0, v5, v14, v8}, Lx0/v;->f(Ljava/lang/Object;Ljava/lang/Object;Lic/n;Lx0/o;)V

    .line 396
    .line 397
    .line 398
    sget-object v0, Lj2/l1;->n:Lx0/o2;

    .line 399
    .line 400
    invoke-virtual {v8, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    sget-object v5, Lf3/m;->b:Lf3/m;

    .line 405
    .line 406
    if-ne v0, v5, :cond_10

    .line 407
    .line 408
    const/16 v21, 0x1

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_10
    const/16 v21, 0x0

    .line 412
    .line 413
    :goto_8
    if-eqz v2, :cond_11

    .line 414
    .line 415
    new-instance v0, Lq2/h;

    .line 416
    .line 417
    const/4 v5, 0x2

    .line 418
    invoke-direct {v0, v5}, Lq2/h;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-static {v1, v7, v4, v0, v2}, Landroidx/compose/foundation/selection/c;->c(ZLw/k;ZLq2/h;Lic/k;)Lj1/q;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    goto :goto_9

    .line 426
    :cond_11
    move-object v0, v9

    .line 427
    :goto_9
    if-eqz v2, :cond_12

    .line 428
    .line 429
    sget-object v5, Lm0/t3;->a:Lx0/o2;

    .line 430
    .line 431
    sget-object v9, Landroidx/compose/material/MinimumInteractiveModifier;->a:Landroidx/compose/material/MinimumInteractiveModifier;

    .line 432
    .line 433
    :cond_12
    invoke-interface {v12, v9}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-interface {v5, v0}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 438
    .line 439
    .line 440
    move-result-object v14

    .line 441
    if-eqz v4, :cond_13

    .line 442
    .line 443
    if-eqz v2, :cond_13

    .line 444
    .line 445
    const/16 v17, 0x1

    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_13
    const/16 v17, 0x0

    .line 449
    .line 450
    :goto_a
    iget-object v0, v10, Lm0/x;->f:Lm0/w;

    .line 451
    .line 452
    new-instance v5, Lm0/n;

    .line 453
    .line 454
    const/4 v9, 0x0

    .line 455
    invoke-direct {v5, v9, v10, v15}, Lm0/n;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 456
    .line 457
    .line 458
    sget-object v16, Lu/e1;->b:Lu/e1;

    .line 459
    .line 460
    const/16 v19, 0x0

    .line 461
    .line 462
    move-object v15, v0

    .line 463
    move-object/from16 v20, v5

    .line 464
    .line 465
    move-object/from16 v18, v7

    .line 466
    .line 467
    invoke-static/range {v14 .. v21}, Lu/l0;->a(Lj1/q;Lu/o0;Lu/e1;ZLw/k;ZLic/o;Z)Lj1/q;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sget-object v5, Lj1/c;->e:Lj1/h;

    .line 472
    .line 473
    const/4 v7, 0x2

    .line 474
    invoke-static {v0, v5, v7}, Landroidx/compose/foundation/layout/c;->q(Lj1/q;Lj1/h;I)Lj1/q;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    sget v5, Lm0/v7;->e:F

    .line 479
    .line 480
    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/a;->j(Lj1/q;F)Lj1/q;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, Landroidx/compose/foundation/layout/c;->h(Lj1/q;)Lj1/q;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    sget-object v5, Lj1/c;->a:Lj1/h;

    .line 489
    .line 490
    invoke-static {v5, v9}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-static {v8}, Lx0/v;->q(Lx0/o;)I

    .line 495
    .line 496
    .line 497
    move-result v7

    .line 498
    invoke-virtual {v8}, Lx0/o;->l()Lx0/j1;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    invoke-static {v0, v8}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sget-object v11, Li2/k;->g0:Li2/j;

    .line 507
    .line 508
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    sget-object v11, Li2/j;->b:Li2/i;

    .line 512
    .line 513
    invoke-virtual {v8}, Lx0/o;->a0()V

    .line 514
    .line 515
    .line 516
    iget-boolean v14, v8, Lx0/o;->S:Z

    .line 517
    .line 518
    if-eqz v14, :cond_14

    .line 519
    .line 520
    invoke-virtual {v8, v11}, Lx0/o;->k(Lic/a;)V

    .line 521
    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_14
    invoke-virtual {v8}, Lx0/o;->k0()V

    .line 525
    .line 526
    .line 527
    :goto_b
    sget-object v11, Li2/j;->g:Li2/h;

    .line 528
    .line 529
    invoke-static {v11, v5, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 530
    .line 531
    .line 532
    sget-object v5, Li2/j;->f:Li2/h;

    .line 533
    .line 534
    invoke-static {v5, v9, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 535
    .line 536
    .line 537
    sget-object v5, Li2/j;->j:Li2/h;

    .line 538
    .line 539
    iget-boolean v9, v8, Lx0/o;->S:Z

    .line 540
    .line 541
    if-nez v9, :cond_15

    .line 542
    .line 543
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v9

    .line 547
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 548
    .line 549
    .line 550
    move-result-object v11

    .line 551
    invoke-static {v9, v11}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v9

    .line 555
    if-nez v9, :cond_16

    .line 556
    .line 557
    :cond_15
    invoke-static {v7, v8, v7, v5}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 558
    .line 559
    .line 560
    :cond_16
    sget-object v5, Li2/j;->d:Li2/h;

    .line 561
    .line 562
    invoke-static {v5, v0, v8}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 563
    .line 564
    .line 565
    iget-object v0, v10, Lm0/x;->h:Lx0/c0;

    .line 566
    .line 567
    invoke-virtual {v0}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    check-cast v0, Ljava/lang/Boolean;

    .line 572
    .line 573
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    invoke-virtual {v8, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    invoke-virtual {v8}, Lx0/o;->K()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    if-nez v5, :cond_17

    .line 586
    .line 587
    if-ne v7, v13, :cond_18

    .line 588
    .line 589
    :cond_17
    new-instance v7, Lm0/r;

    .line 590
    .line 591
    const/4 v5, 0x5

    .line 592
    invoke-direct {v7, v10, v5}, Lm0/r;-><init>(Lm0/x;I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v8, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :cond_18
    check-cast v7, Lic/a;

    .line 599
    .line 600
    and-int/lit16 v3, v3, 0x380

    .line 601
    .line 602
    const/4 v5, 0x6

    .line 603
    or-int/2addr v3, v5

    .line 604
    shr-int/lit8 v5, v29, 0x6

    .line 605
    .line 606
    and-int/lit16 v5, v5, 0x1c00

    .line 607
    .line 608
    or-int v9, v3, v5

    .line 609
    .line 610
    move v3, v0

    .line 611
    move-object v5, v6

    .line 612
    move-object v6, v7

    .line 613
    move-object/from16 v7, v18

    .line 614
    .line 615
    invoke-static/range {v3 .. v9}, Lm0/v7;->b(ZZLm0/w1;Lic/a;Lw/k;Lx0/o;I)V

    .line 616
    .line 617
    .line 618
    const/4 v0, 0x1

    .line 619
    invoke-virtual {v8, v0}, Lx0/o;->p(Z)V

    .line 620
    .line 621
    .line 622
    move-object v3, v12

    .line 623
    goto :goto_c

    .line 624
    :cond_19
    invoke-virtual {v8}, Lx0/o;->Q()V

    .line 625
    .line 626
    .line 627
    move-object/from16 v3, p2

    .line 628
    .line 629
    :goto_c
    invoke-virtual {v8}, Lx0/o;->r()Lx0/p1;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    if-eqz v7, :cond_1a

    .line 634
    .line 635
    new-instance v0, Lm0/s7;

    .line 636
    .line 637
    move/from16 v4, p3

    .line 638
    .line 639
    move-object/from16 v5, p4

    .line 640
    .line 641
    move/from16 v6, p6

    .line 642
    .line 643
    invoke-direct/range {v0 .. v6}, Lm0/s7;-><init>(ZLic/k;Lj1/q;ZLm0/w1;I)V

    .line 644
    .line 645
    .line 646
    iput-object v0, v7, Lx0/p1;->d:Lic/n;

    .line 647
    .line 648
    :cond_1a
    return-void
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
.end method

.method public static final b(ZZLm0/w1;Lic/a;Lw/k;Lx0/o;I)V
    .locals 19

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v9, p5

    .line 12
    .line 13
    move/from16 v0, p6

    .line 14
    .line 15
    const v6, 0x439fbf2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9, v6}, Lx0/o;->Y(I)Lx0/o;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v6, v0, 0x6

    .line 22
    .line 23
    sget-object v13, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    .line 24
    .line 25
    if-nez v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v9, v13}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    const/4 v6, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v6, 0x2

    .line 36
    :goto_0
    or-int/2addr v6, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v6, v0

    .line 39
    :goto_1
    and-int/lit8 v7, v0, 0x30

    .line 40
    .line 41
    if-nez v7, :cond_3

    .line 42
    .line 43
    invoke-virtual {v9, v1}, Lx0/o;->g(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    const/16 v7, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v7, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v6, v7

    .line 55
    :cond_3
    and-int/lit16 v7, v0, 0x180

    .line 56
    .line 57
    if-nez v7, :cond_5

    .line 58
    .line 59
    invoke-virtual {v9, v2}, Lx0/o;->g(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v7, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v6, v7

    .line 71
    :cond_5
    and-int/lit16 v7, v0, 0xc00

    .line 72
    .line 73
    if-nez v7, :cond_7

    .line 74
    .line 75
    invoke-virtual {v9, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_6

    .line 80
    .line 81
    const/16 v7, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v7, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v6, v7

    .line 87
    :cond_7
    and-int/lit16 v7, v0, 0x6000

    .line 88
    .line 89
    if-nez v7, :cond_9

    .line 90
    .line 91
    invoke-virtual {v9, v4}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_8

    .line 96
    .line 97
    const/16 v7, 0x4000

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    const/16 v7, 0x2000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v6, v7

    .line 103
    :cond_9
    const/high16 v7, 0x30000

    .line 104
    .line 105
    and-int/2addr v7, v0

    .line 106
    const/high16 v8, 0x20000

    .line 107
    .line 108
    if-nez v7, :cond_b

    .line 109
    .line 110
    invoke-virtual {v9, v5}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_a

    .line 115
    .line 116
    const/high16 v7, 0x20000

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/high16 v7, 0x10000

    .line 120
    .line 121
    :goto_6
    or-int/2addr v6, v7

    .line 122
    :cond_b
    move v15, v6

    .line 123
    const v6, 0x12493

    .line 124
    .line 125
    .line 126
    and-int/2addr v6, v15

    .line 127
    const v7, 0x12492

    .line 128
    .line 129
    .line 130
    const/16 v16, 0x1

    .line 131
    .line 132
    const/4 v10, 0x0

    .line 133
    if-eq v6, v7, :cond_c

    .line 134
    .line 135
    const/4 v6, 0x1

    .line 136
    goto :goto_7

    .line 137
    :cond_c
    const/4 v6, 0x0

    .line 138
    :goto_7
    and-int/lit8 v7, v15, 0x1

    .line 139
    .line 140
    invoke-virtual {v9, v7, v6}, Lx0/o;->N(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_1e

    .line 145
    .line 146
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    sget-object v7, Lx0/k;->a:Lx0/r0;

    .line 151
    .line 152
    if-ne v6, v7, :cond_d

    .line 153
    .line 154
    new-instance v6, Lh1/s;

    .line 155
    .line 156
    invoke-direct {v6}, Lh1/s;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_d
    check-cast v6, Lh1/s;

    .line 163
    .line 164
    const/high16 v11, 0x70000

    .line 165
    .line 166
    and-int/2addr v11, v15

    .line 167
    if-ne v11, v8, :cond_e

    .line 168
    .line 169
    const/4 v8, 0x1

    .line 170
    goto :goto_8

    .line 171
    :cond_e
    const/4 v8, 0x0

    .line 172
    :goto_8
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    if-nez v8, :cond_f

    .line 177
    .line 178
    if-ne v11, v7, :cond_10

    .line 179
    .line 180
    :cond_f
    new-instance v11, Lm0/m1;

    .line 181
    .line 182
    const/4 v8, 0x2

    .line 183
    const/4 v12, 0x0

    .line 184
    invoke-direct {v11, v5, v6, v12, v8}, Lm0/m1;-><init>(Lw/k;Lh1/s;Lyb/c;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v11}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_10
    check-cast v11, Lic/n;

    .line 191
    .line 192
    invoke-static {v11, v5, v9}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6}, Lh1/s;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-nez v6, :cond_11

    .line 200
    .line 201
    sget v6, Lm0/v7;->k:F

    .line 202
    .line 203
    :goto_9
    move v12, v6

    .line 204
    goto :goto_a

    .line 205
    :cond_11
    sget v6, Lm0/v7;->j:F

    .line 206
    .line 207
    goto :goto_9

    .line 208
    :goto_a
    const v6, -0x461d9342

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v6}, Lx0/o;->W(I)V

    .line 212
    .line 213
    .line 214
    if-eqz v2, :cond_13

    .line 215
    .line 216
    move/from16 v17, v15

    .line 217
    .line 218
    if-eqz v1, :cond_12

    .line 219
    .line 220
    iget-wide v14, v3, Lm0/w1;->b:J

    .line 221
    .line 222
    goto :goto_b

    .line 223
    :cond_12
    iget-wide v14, v3, Lm0/w1;->d:J

    .line 224
    .line 225
    goto :goto_b

    .line 226
    :cond_13
    move/from16 v17, v15

    .line 227
    .line 228
    if-eqz v1, :cond_14

    .line 229
    .line 230
    iget-wide v14, v3, Lm0/w1;->f:J

    .line 231
    .line 232
    goto :goto_b

    .line 233
    :cond_14
    iget-wide v14, v3, Lm0/w1;->h:J

    .line 234
    .line 235
    :goto_b
    new-instance v6, Lq1/q;

    .line 236
    .line 237
    invoke-direct {v6, v14, v15}, Lq1/q;-><init>(J)V

    .line 238
    .line 239
    .line 240
    invoke-static {v6, v9}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-virtual {v9, v10}, Lx0/o;->p(Z)V

    .line 245
    .line 246
    .line 247
    sget-object v8, Lj1/c;->e:Lj1/h;

    .line 248
    .line 249
    sget-object v14, Lj1/n;->a:Lj1/n;

    .line 250
    .line 251
    invoke-virtual {v13, v14, v8}, Landroidx/compose/foundation/layout/b;->a(Lj1/q;Lj1/d;)Lj1/q;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    sget-object v11, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 256
    .line 257
    invoke-interface {v8, v11}, Lj1/q;->e(Lj1/q;)Lj1/q;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-virtual {v9, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    if-nez v11, :cond_15

    .line 270
    .line 271
    if-ne v15, v7, :cond_16

    .line 272
    .line 273
    :cond_15
    new-instance v15, Laa/d;

    .line 274
    .line 275
    const/16 v11, 0xc

    .line 276
    .line 277
    invoke-direct {v15, v6, v11}, Laa/d;-><init>(Lx0/w0;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v9, v15}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_16
    check-cast v15, Lic/k;

    .line 284
    .line 285
    invoke-static {v10, v15, v8, v9}, Lnh/b;->a(ILic/k;Lj1/q;Lx0/o;)V

    .line 286
    .line 287
    .line 288
    const v6, -0x3f58d77

    .line 289
    .line 290
    .line 291
    invoke-virtual {v9, v6}, Lx0/o;->W(I)V

    .line 292
    .line 293
    .line 294
    if-eqz v2, :cond_18

    .line 295
    .line 296
    if-eqz v1, :cond_17

    .line 297
    .line 298
    iget-wide v10, v3, Lm0/w1;->a:J

    .line 299
    .line 300
    goto :goto_c

    .line 301
    :cond_17
    iget-wide v10, v3, Lm0/w1;->c:J

    .line 302
    .line 303
    goto :goto_c

    .line 304
    :cond_18
    if-eqz v1, :cond_19

    .line 305
    .line 306
    iget-wide v10, v3, Lm0/w1;->e:J

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_19
    iget-wide v10, v3, Lm0/w1;->g:J

    .line 310
    .line 311
    :goto_c
    new-instance v8, Lq1/q;

    .line 312
    .line 313
    invoke-direct {v8, v10, v11}, Lq1/q;-><init>(J)V

    .line 314
    .line 315
    .line 316
    invoke-static {v8, v9}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    const/4 v6, 0x0

    .line 321
    invoke-virtual {v9, v6}, Lx0/o;->p(Z)V

    .line 322
    .line 323
    .line 324
    sget-object v10, Lm0/x2;->a:Lx0/o2;

    .line 325
    .line 326
    invoke-virtual {v9, v10}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v10

    .line 330
    check-cast v10, Lm0/r1;

    .line 331
    .line 332
    sget-object v11, Lm0/x2;->b:Lx0/z;

    .line 333
    .line 334
    invoke-virtual {v9, v11}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    check-cast v11, Lf3/f;

    .line 339
    .line 340
    iget v11, v11, Lf3/f;->a:F

    .line 341
    .line 342
    add-float/2addr v11, v12

    .line 343
    invoke-interface {v8}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v15

    .line 347
    check-cast v15, Lq1/q;

    .line 348
    .line 349
    move-object/from16 v18, v7

    .line 350
    .line 351
    iget-wide v6, v15, Lq1/q;->a:J

    .line 352
    .line 353
    sget-object v15, Lm0/c1;->a:Lx0/o2;

    .line 354
    .line 355
    invoke-virtual {v9, v15}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v15

    .line 359
    check-cast v15, Lm0/b1;

    .line 360
    .line 361
    invoke-virtual {v15}, Lm0/b1;->i()J

    .line 362
    .line 363
    .line 364
    move-result-wide v0

    .line 365
    invoke-static {v6, v7, v0, v1}, Lq1/q;->c(JJ)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_1a

    .line 370
    .line 371
    if-eqz v10, :cond_1a

    .line 372
    .line 373
    const v0, -0x2838f045

    .line 374
    .line 375
    .line 376
    invoke-virtual {v9, v0}, Lx0/o;->W(I)V

    .line 377
    .line 378
    .line 379
    invoke-interface {v8}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Lq1/q;

    .line 384
    .line 385
    iget-wide v7, v0, Lq1/q;->a:J

    .line 386
    .line 387
    move v9, v11

    .line 388
    const/4 v11, 0x0

    .line 389
    move-object v6, v10

    .line 390
    move-object/from16 v1, v18

    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    move-object/from16 v10, p5

    .line 394
    .line 395
    invoke-virtual/range {v6 .. v11}, Lm0/r1;->a(JFLx0/o;I)J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    move-object v9, v10

    .line 400
    invoke-virtual {v9, v0}, Lx0/o;->p(Z)V

    .line 401
    .line 402
    .line 403
    goto :goto_d

    .line 404
    :cond_1a
    move-object/from16 v1, v18

    .line 405
    .line 406
    const/4 v0, 0x0

    .line 407
    const v6, -0x283794da

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9, v6}, Lx0/o;->W(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9, v0}, Lx0/o;->p(Z)V

    .line 414
    .line 415
    .line 416
    invoke-interface {v8}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    check-cast v6, Lq1/q;

    .line 421
    .line 422
    iget-wide v6, v6, Lq1/q;->a:J

    .line 423
    .line 424
    :goto_d
    const/4 v10, 0x0

    .line 425
    const/16 v11, 0xe

    .line 426
    .line 427
    const/4 v8, 0x0

    .line 428
    invoke-static/range {v6 .. v11}, Lq/u1;->a(JLr/u1;Lx0/o;II)Lx0/n2;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    sget-object v7, Lj1/c;->d:Lj1/h;

    .line 433
    .line 434
    invoke-virtual {v13, v14, v7}, Landroidx/compose/foundation/layout/b;->a(Lj1/q;Lj1/d;)Lj1/q;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    const v8, 0xe000

    .line 439
    .line 440
    .line 441
    and-int v8, v17, v8

    .line 442
    .line 443
    const/16 v10, 0x4000

    .line 444
    .line 445
    if-ne v8, v10, :cond_1b

    .line 446
    .line 447
    goto :goto_e

    .line 448
    :cond_1b
    const/16 v16, 0x0

    .line 449
    .line 450
    :goto_e
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v8

    .line 454
    if-nez v16, :cond_1c

    .line 455
    .line 456
    if-ne v8, v1, :cond_1d

    .line 457
    .line 458
    :cond_1c
    new-instance v8, Lda/z;

    .line 459
    .line 460
    const/4 v1, 0x6

    .line 461
    invoke-direct {v8, v1, v4}, Lda/z;-><init>(ILic/a;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v9, v8}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_1d
    check-cast v8, Lic/k;

    .line 468
    .line 469
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/a;->g(Lj1/q;Lic/k;)Lj1/q;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    sget v7, Lm0/v7;->d:F

    .line 474
    .line 475
    const-wide/16 v10, 0x0

    .line 476
    .line 477
    const/4 v8, 0x4

    .line 478
    invoke-static {v7, v8, v10, v11, v0}, Lm0/l5;->a(FIJZ)Lm0/m5;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    invoke-static {v1, v5, v7}, Landroidx/compose/foundation/f;->a(Lj1/q;Lw/k;Ls/m0;)Lj1/q;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    sget v7, Lm0/v7;->c:F

    .line 487
    .line 488
    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/c;->g(Lj1/q;F)Lj1/q;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    sget-object v7, Lg0/g;->a:Lg0/f;

    .line 493
    .line 494
    const/16 v8, 0x18

    .line 495
    .line 496
    invoke-static {v1, v12, v7, v0, v8}, Llc/b;->U(Lj1/q;FLq1/l0;ZI)Lj1/q;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-interface {v6}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, Lq1/q;

    .line 505
    .line 506
    iget-wide v10, v1, Lq1/q;->a:J

    .line 507
    .line 508
    invoke-static {v0, v10, v11, v7}, Landroidx/compose/foundation/a;->b(Lj1/q;JLq1/l0;)Lj1/q;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-static {v0, v9}, Ly/d;->d(Lj1/q;Lx0/o;)V

    .line 513
    .line 514
    .line 515
    goto :goto_f

    .line 516
    :cond_1e
    invoke-virtual {v9}, Lx0/o;->Q()V

    .line 517
    .line 518
    .line 519
    :goto_f
    invoke-virtual {v9}, Lx0/o;->r()Lx0/p1;

    .line 520
    .line 521
    .line 522
    move-result-object v7

    .line 523
    if-eqz v7, :cond_1f

    .line 524
    .line 525
    new-instance v0, Lm0/t7;

    .line 526
    .line 527
    move/from16 v1, p0

    .line 528
    .line 529
    move/from16 v6, p6

    .line 530
    .line 531
    invoke-direct/range {v0 .. v6}, Lm0/t7;-><init>(ZZLm0/w1;Lic/a;Lw/k;I)V

    .line 532
    .line 533
    .line 534
    iput-object v0, v7, Lx0/p1;->d:Lic/n;

    .line 535
    .line 536
    :cond_1f
    return-void
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
.end method
