.class public abstract Lu9/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lf1/f;

.field public static final b:Lf1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lt2/x;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lt2/x;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lf1/f;

    .line 9
    .line 10
    const v2, 0x77d32627

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v0, v2, v3}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lu9/j;->a:Lf1/f;

    .line 18
    .line 19
    new-instance v0, Lt2/x;

    .line 20
    .line 21
    const/16 v1, 0x19

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lt2/x;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lf1/f;

    .line 27
    .line 28
    const v2, -0x4ea32697

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, v0, v2, v3}, Lf1/f;-><init>(Ljava/lang/Object;IZ)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Lu9/j;->b:Lf1/f;

    .line 35
    .line 36
    return-void
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

.method public static final a(ILx0/o;)V
    .locals 25

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    const v1, 0x596cf6c8

    .line 6
    .line 7
    .line 8
    invoke-virtual {v9, v1}, Lx0/o;->Y(I)Lx0/o;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    :goto_0
    and-int/lit8 v4, v0, 0x1

    .line 19
    .line 20
    invoke-virtual {v9, v4, v3}, Lx0/o;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_18

    .line 25
    .line 26
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    .line 31
    .line 32
    array-length v5, v3

    .line 33
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    array-length v5, v3

    .line 37
    const/4 v6, 0x0

    .line 38
    :goto_1
    if-ge v6, v5, :cond_1

    .line 39
    .line 40
    aget-object v7, v3, v6

    .line 41
    .line 42
    iget-boolean v8, v7, Lu9/i;->a:Z

    .line 43
    .line 44
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    new-instance v10, Lub/k;

    .line 49
    .line 50
    invoke-direct {v10, v7, v8}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object v3, Lna/w;->a:Lxf/r;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v5, Lwf/d;

    .line 65
    .line 66
    new-instance v6, Lwf/s0;

    .line 67
    .line 68
    new-instance v7, Lwf/y;

    .line 69
    .line 70
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const-string v10, "com.cnl.kikoeru.ui.screen.main.others.card.CardTags"

    .line 75
    .line 76
    invoke-direct {v7, v10, v8}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 77
    .line 78
    .line 79
    sget-object v8, Lwf/g;->a:Lwf/g;

    .line 80
    .line 81
    const/4 v11, 0x1

    .line 82
    invoke-direct {v6, v7, v8, v11}, Lwf/s0;-><init>(Lsf/a;Lsf/a;I)V

    .line 83
    .line 84
    .line 85
    const/4 v7, 0x0

    .line 86
    invoke-direct {v5, v6, v7}, Lwf/d;-><init>(Lsf/a;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v5, v4}, Lxf/c;->b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const v5, 0x1dd68e42

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9, v5}, Lx0/o;->W(I)V

    .line 97
    .line 98
    .line 99
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    new-instance v6, Ljc/y;

    .line 104
    .line 105
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    const v7, 0x6e3c21fe

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9, v7}, Lx0/o;->W(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    sget-object v11, Lx0/k;->a:Lx0/r0;

    .line 119
    .line 120
    if-ne v7, v11, :cond_2

    .line 121
    .line 122
    const-class v7, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v7}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    const-string v12, "cardTagsOrder"

    .line 129
    .line 130
    invoke-static {v12, v4, v5, v1, v7}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v9, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    check-cast v7, Lfg/f;

    .line 138
    .line 139
    invoke-virtual {v9, v2}, Lx0/o;->p(Z)V

    .line 140
    .line 141
    .line 142
    iput-object v7, v6, Ljc/y;->a:Ljava/lang/Object;

    .line 143
    .line 144
    new-instance v4, La9/t;

    .line 145
    .line 146
    const/4 v5, 0x4

    .line 147
    invoke-direct {v4, v6, v5}, La9/t;-><init>(Ljc/y;I)V

    .line 148
    .line 149
    .line 150
    invoke-static {v7, v4, v9}, Lx0/v;->c(Ljava/lang/Object;Lic/k;Lx0/o;)V

    .line 151
    .line 152
    .line 153
    iget-object v4, v6, Ljc/y;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Lfg/f;

    .line 156
    .line 157
    invoke-virtual {v9, v2}, Lx0/o;->p(Z)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    if-ne v5, v11, :cond_3

    .line 165
    .line 166
    invoke-virtual {v4}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Ljava/lang/String;

    .line 171
    .line 172
    new-instance v6, Lwf/d;

    .line 173
    .line 174
    new-instance v7, Lwf/s0;

    .line 175
    .line 176
    new-instance v12, Lwf/y;

    .line 177
    .line 178
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    invoke-direct {v12, v10, v13}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 183
    .line 184
    .line 185
    const/4 v10, 0x1

    .line 186
    invoke-direct {v7, v12, v8, v10}, Lwf/s0;-><init>(Lsf/a;Lsf/a;I)V

    .line 187
    .line 188
    .line 189
    const/4 v8, 0x0

    .line 190
    invoke-direct {v6, v7, v8}, Lwf/d;-><init>(Lsf/a;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v5, v6}, Lxf/c;->a(Ljava/lang/String;Lsf/a;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v9, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_3
    check-cast v5, Lx0/w0;

    .line 205
    .line 206
    invoke-interface {v5}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/util/List;

    .line 211
    .line 212
    invoke-virtual {v9, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    const/4 v8, 0x0

    .line 221
    if-nez v6, :cond_4

    .line 222
    .line 223
    if-ne v7, v11, :cond_5

    .line 224
    .line 225
    :cond_4
    new-instance v7, Lu9/a;

    .line 226
    .line 227
    invoke-direct {v7, v5, v4, v8}, Lu9/a;-><init>(Lx0/w0;Lfg/f;Lyb/c;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_5
    check-cast v7, Lic/n;

    .line 234
    .line 235
    invoke-static {v7, v3, v9}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    check-cast v3, Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v9, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    if-nez v6, :cond_6

    .line 253
    .line 254
    if-ne v7, v11, :cond_7

    .line 255
    .line 256
    :cond_6
    new-instance v7, Lu9/a;

    .line 257
    .line 258
    invoke-direct {v7, v4, v5, v8}, Lu9/a;-><init>(Lfg/f;Lx0/w0;Lyb/c;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_7
    check-cast v7, Lic/n;

    .line 265
    .line 266
    invoke-static {v7, v3, v9}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 267
    .line 268
    .line 269
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lx0/o2;

    .line 270
    .line 271
    invoke-virtual {v9, v3}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    check-cast v3, Landroid/view/View;

    .line 276
    .line 277
    invoke-static {v9}, La0/j0;->a(Lx0/o;)La0/g0;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-virtual {v9, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    if-nez v6, :cond_8

    .line 290
    .line 291
    if-ne v7, v11, :cond_9

    .line 292
    .line 293
    :cond_8
    new-instance v7, Lu9/h;

    .line 294
    .line 295
    invoke-direct {v7, v3, v5, v8}, Lu9/h;-><init>(Landroid/view/View;Lx0/w0;Lyb/c;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v9, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_9
    check-cast v7, Lic/p;

    .line 302
    .line 303
    const-string v6, "lazyListState"

    .line 304
    .line 305
    invoke-static {v4, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    const-string v6, "onMove"

    .line 309
    .line 310
    invoke-static {v7, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    const v6, -0x26729d78

    .line 314
    .line 315
    .line 316
    invoke-virtual {v9, v6}, Lx0/o;->W(I)V

    .line 317
    .line 318
    .line 319
    int-to-float v6, v2

    .line 320
    new-instance v8, Ly/e1;

    .line 321
    .line 322
    invoke-direct {v8, v6, v6, v6, v6}, Ly/e1;-><init>(FFFF)V

    .line 323
    .line 324
    .line 325
    sget v10, Luh/k;->a:F

    .line 326
    .line 327
    const v12, 0x50503642

    .line 328
    .line 329
    .line 330
    invoke-virtual {v9, v12}, Lx0/o;->W(I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v9, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v12

    .line 337
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    if-nez v12, :cond_a

    .line 342
    .line 343
    if-ne v13, v11, :cond_b

    .line 344
    .line 345
    :cond_a
    new-instance v13, Luh/v;

    .line 346
    .line 347
    const/4 v12, 0x0

    .line 348
    invoke-direct {v13, v4, v12}, Luh/v;-><init>(La0/g0;I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v9, v13}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_b
    check-cast v13, Lic/a;

    .line 355
    .line 356
    invoke-virtual {v9, v2}, Lx0/o;->p(Z)V

    .line 357
    .line 358
    .line 359
    const-string v12, "pixelAmountProvider"

    .line 360
    .line 361
    invoke-static {v13, v12}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    const v12, 0x3b679380

    .line 365
    .line 366
    .line 367
    invoke-virtual {v9, v12}, Lx0/o;->W(I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v12

    .line 374
    if-ne v12, v11, :cond_c

    .line 375
    .line 376
    invoke-static {v9}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 377
    .line 378
    .line 379
    move-result-object v12

    .line 380
    new-instance v14, Lx0/y;

    .line 381
    .line 382
    invoke-direct {v14, v12}, Lx0/y;-><init>(Lhf/y;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v9, v14}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object v12, v14

    .line 389
    :cond_c
    check-cast v12, Lx0/y;

    .line 390
    .line 391
    iget-object v12, v12, Lx0/y;->a:Lhf/y;

    .line 392
    .line 393
    invoke-static {v13, v9}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 394
    .line 395
    .line 396
    move-result-object v13

    .line 397
    const-wide/16 v14, 0x64

    .line 398
    .line 399
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-static {v1, v9}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    const v2, 0x6e6c34f1

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9, v2}, Lx0/o;->W(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    invoke-virtual {v9, v12}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v16

    .line 421
    or-int v2, v2, v16

    .line 422
    .line 423
    invoke-virtual {v9, v14, v15}, Lx0/o;->e(J)Z

    .line 424
    .line 425
    .line 426
    move-result v14

    .line 427
    or-int/2addr v2, v14

    .line 428
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v14

    .line 432
    if-nez v2, :cond_d

    .line 433
    .line 434
    if-ne v14, v11, :cond_e

    .line 435
    .line 436
    :cond_d
    new-instance v14, Luh/g0;

    .line 437
    .line 438
    new-instance v2, Lb0/s1;

    .line 439
    .line 440
    const/16 v15, 0x13

    .line 441
    .line 442
    invoke-direct {v2, v15, v13, v1}, Lb0/s1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-direct {v14, v4, v12, v2}, Luh/g0;-><init>(La0/g0;Lhf/y;Lb0/s1;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v9, v14}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :cond_e
    check-cast v14, Luh/g0;

    .line 452
    .line 453
    const/4 v1, 0x0

    .line 454
    invoke-virtual {v9, v1}, Lx0/o;->p(Z)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v9, v1}, Lx0/o;->p(Z)V

    .line 458
    .line 459
    .line 460
    sget-object v1, Lj2/l1;->h:Lx0/o2;

    .line 461
    .line 462
    invoke-virtual {v9, v1}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    check-cast v1, Lf3/c;

    .line 467
    .line 468
    invoke-interface {v1, v10}, Lf3/c;->Q(F)F

    .line 469
    .line 470
    .line 471
    move-result v20

    .line 472
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    if-ne v2, v11, :cond_f

    .line 477
    .line 478
    invoke-static {v9}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    new-instance v12, Lx0/y;

    .line 483
    .line 484
    invoke-direct {v12, v2}, Lx0/y;-><init>(Lhf/y;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v9, v12}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    move-object v2, v12

    .line 491
    :cond_f
    check-cast v2, Lx0/y;

    .line 492
    .line 493
    iget-object v2, v2, Lx0/y;->a:Lhf/y;

    .line 494
    .line 495
    invoke-static {v7, v9}, Lx0/v;->y(Ljava/lang/Object;Lx0/o;)Lx0/w0;

    .line 496
    .line 497
    .line 498
    move-result-object v19

    .line 499
    sget-object v7, Lj2/l1;->n:Lx0/o2;

    .line 500
    .line 501
    invoke-virtual {v9, v7}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    check-cast v7, Lf3/m;

    .line 506
    .line 507
    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->e(Ly/d1;Lf3/m;)F

    .line 508
    .line 509
    .line 510
    move-result v12

    .line 511
    invoke-interface {v1, v12}, Lf3/c;->Q(F)F

    .line 512
    .line 513
    .line 514
    move-result v12

    .line 515
    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->d(Ly/d1;Lf3/m;)F

    .line 516
    .line 517
    .line 518
    move-result v13

    .line 519
    invoke-interface {v1, v13}, Lf3/c;->Q(F)F

    .line 520
    .line 521
    .line 522
    move-result v13

    .line 523
    invoke-interface {v1, v6}, Lf3/c;->Q(F)F

    .line 524
    .line 525
    .line 526
    move-result v15

    .line 527
    invoke-interface {v1, v6}, Lf3/c;->Q(F)F

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    new-instance v6, Luh/a;

    .line 532
    .line 533
    invoke-direct {v6, v12, v13, v15, v1}, Luh/a;-><init>(FFFF)V

    .line 534
    .line 535
    .line 536
    const v1, 0x5050b180

    .line 537
    .line 538
    .line 539
    invoke-virtual {v9, v1}, Lx0/o;->W(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v9, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    if-nez v1, :cond_10

    .line 551
    .line 552
    if-ne v12, v11, :cond_11

    .line 553
    .line 554
    :cond_10
    new-instance v12, Luh/v;

    .line 555
    .line 556
    const/4 v1, 0x1

    .line 557
    invoke-direct {v12, v4, v1}, Luh/v;-><init>(La0/g0;I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v9, v12}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :cond_11
    check-cast v12, Lic/a;

    .line 564
    .line 565
    const/4 v1, 0x0

    .line 566
    invoke-virtual {v9, v1}, Lx0/o;->p(Z)V

    .line 567
    .line 568
    .line 569
    invoke-static {v12}, Lx0/v;->o(Lic/a;)Lx0/c0;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-virtual {v1}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    check-cast v12, Lu/e1;

    .line 578
    .line 579
    const v13, 0x5050bbec

    .line 580
    .line 581
    .line 582
    invoke-virtual {v9, v13}, Lx0/o;->W(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v9, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v13

    .line 589
    invoke-virtual {v9, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v15

    .line 593
    or-int/2addr v13, v15

    .line 594
    invoke-virtual {v9, v10}, Lx0/o;->c(F)Z

    .line 595
    .line 596
    .line 597
    move-result v10

    .line 598
    or-int/2addr v10, v13

    .line 599
    invoke-virtual {v9, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v8

    .line 603
    or-int/2addr v8, v10

    .line 604
    invoke-virtual {v9, v14}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    or-int/2addr v8, v10

    .line 609
    invoke-virtual {v9, v12}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v10

    .line 613
    or-int/2addr v8, v10

    .line 614
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    if-nez v8, :cond_12

    .line 619
    .line 620
    if-ne v10, v11, :cond_15

    .line 621
    .line 622
    :cond_12
    new-instance v16, Luh/y;

    .line 623
    .line 624
    invoke-virtual {v1}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    check-cast v1, Lu/e1;

    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 631
    .line 632
    .line 633
    move-result v1

    .line 634
    if-eqz v1, :cond_14

    .line 635
    .line 636
    const/4 v8, 0x1

    .line 637
    if-ne v1, v8, :cond_13

    .line 638
    .line 639
    sget-object v1, Luh/w;->d:Luh/w;

    .line 640
    .line 641
    :goto_2
    move-object/from16 v24, v1

    .line 642
    .line 643
    goto :goto_3

    .line 644
    :cond_13
    new-instance v0, Lce/j0;

    .line 645
    .line 646
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 647
    .line 648
    .line 649
    throw v0

    .line 650
    :cond_14
    sget-object v1, Luh/w;->c:Luh/w;

    .line 651
    .line 652
    goto :goto_2

    .line 653
    :goto_3
    const-string v1, "scroller"

    .line 654
    .line 655
    invoke-static {v14, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    const-string v1, "layoutDirection"

    .line 659
    .line 660
    invoke-static {v7, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    new-instance v1, La0/z;

    .line 664
    .line 665
    invoke-direct {v1, v4}, La0/z;-><init>(La0/g0;)V

    .line 666
    .line 667
    .line 668
    move-object/from16 v17, v1

    .line 669
    .line 670
    move-object/from16 v18, v2

    .line 671
    .line 672
    move-object/from16 v21, v6

    .line 673
    .line 674
    move-object/from16 v23, v7

    .line 675
    .line 676
    move-object/from16 v22, v14

    .line 677
    .line 678
    invoke-direct/range {v16 .. v24}, Luh/y;-><init>(La0/z;Lhf/y;Lx0/w0;FLuh/a;Luh/g0;Lf3/m;Lic/n;)V

    .line 679
    .line 680
    .line 681
    move-object/from16 v10, v16

    .line 682
    .line 683
    invoke-virtual {v9, v10}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    :cond_15
    check-cast v10, Luh/y;

    .line 687
    .line 688
    const/4 v1, 0x0

    .line 689
    invoke-virtual {v9, v1}, Lx0/o;->p(Z)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v9, v1}, Lx0/o;->p(Z)V

    .line 693
    .line 694
    .line 695
    sget-object v6, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 696
    .line 697
    const/4 v1, 0x5

    .line 698
    int-to-float v1, v1

    .line 699
    new-instance v2, Ly/e1;

    .line 700
    .line 701
    invoke-direct {v2, v1, v1, v1, v1}, Ly/e1;-><init>(FFFF)V

    .line 702
    .line 703
    .line 704
    invoke-static {v1}, Ly/k;->g(F)Ly/g;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    invoke-virtual {v9, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    invoke-virtual {v9, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    or-int/2addr v7, v8

    .line 717
    invoke-virtual {v9}, Lx0/o;->K()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v8

    .line 721
    if-nez v7, :cond_16

    .line 722
    .line 723
    if-ne v8, v11, :cond_17

    .line 724
    .line 725
    :cond_16
    new-instance v8, Lba/i;

    .line 726
    .line 727
    const/16 v7, 0xd

    .line 728
    .line 729
    invoke-direct {v8, v5, v10, v3, v7}, Lba/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v9, v8}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    :cond_17
    check-cast v8, Lic/k;

    .line 736
    .line 737
    move-object v10, v1

    .line 738
    const/16 v1, 0x6186

    .line 739
    .line 740
    move-object v11, v2

    .line 741
    const/16 v2, 0x1e8

    .line 742
    .line 743
    const/4 v5, 0x0

    .line 744
    const/4 v7, 0x0

    .line 745
    move-object v3, v4

    .line 746
    move-object v4, v8

    .line 747
    const/4 v8, 0x0

    .line 748
    const/4 v12, 0x0

    .line 749
    invoke-static/range {v1 .. v12}, La/a;->g(IILa0/g0;Lic/k;Lj1/f;Lj1/q;Ls/f;Lu/p0;Lx0/o;Ly/h;Ly/d1;Z)V

    .line 750
    .line 751
    .line 752
    goto :goto_4

    .line 753
    :cond_18
    invoke-virtual/range {p1 .. p1}, Lx0/o;->Q()V

    .line 754
    .line 755
    .line 756
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lx0/o;->r()Lx0/p1;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    if-eqz v1, :cond_19

    .line 761
    .line 762
    new-instance v2, Lt2/x;

    .line 763
    .line 764
    const/16 v3, 0x16

    .line 765
    .line 766
    invoke-direct {v2, v0, v3}, Lt2/x;-><init>(II)V

    .line 767
    .line 768
    .line 769
    iput-object v2, v1, Lx0/p1;->d:Lic/n;

    .line 770
    .line 771
    :cond_19
    return-void
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

.method public static final b(ILx0/o;)V
    .locals 10

    .line 1
    const v0, 0x48575bcd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    and-int/lit8 v3, p0, 0x1

    .line 15
    .line 16
    invoke-virtual {p1, v3, v2}, Lx0/o;->N(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_5

    .line 21
    .line 22
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    array-length v4, v2

    .line 29
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    array-length v4, v2

    .line 33
    const/4 v5, 0x0

    .line 34
    :goto_1
    if-ge v5, v4, :cond_1

    .line 35
    .line 36
    aget-object v6, v2, v5

    .line 37
    .line 38
    iget-boolean v7, v6, Lu9/i;->a:Z

    .line 39
    .line 40
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    new-instance v8, Lub/k;

    .line 45
    .line 46
    invoke-direct {v8, v6, v7}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sget-object v2, Lna/w;->a:Lxf/r;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v4, Lwf/d;

    .line 61
    .line 62
    new-instance v5, Lwf/s0;

    .line 63
    .line 64
    new-instance v6, Lwf/y;

    .line 65
    .line 66
    const-string v7, "com.cnl.kikoeru.ui.screen.main.others.card.CardTags"

    .line 67
    .line 68
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-direct {v6, v7, v8}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 73
    .line 74
    .line 75
    sget-object v7, Lwf/g;->a:Lwf/g;

    .line 76
    .line 77
    const/4 v8, 0x1

    .line 78
    invoke-direct {v5, v6, v7, v8}, Lwf/s0;-><init>(Lsf/a;Lsf/a;I)V

    .line 79
    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-direct {v4, v5, v6}, Lwf/d;-><init>(Lsf/a;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v3}, Lxf/c;->b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const v3, 0x1dd68e42

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Lx0/o;->W(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    new-instance v4, Ljc/y;

    .line 100
    .line 101
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    const v5, 0x6e3c21fe

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v5}, Lx0/o;->W(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    sget-object v6, Lx0/k;->a:Lx0/r0;

    .line 115
    .line 116
    if-ne v5, v6, :cond_2

    .line 117
    .line 118
    const-class v5, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v5}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    const-string v7, "cardTagsOrder"

    .line 125
    .line 126
    invoke-static {v7, v2, v3, v0, v5}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {p1, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    check-cast v5, Lfg/f;

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Lx0/o;->p(Z)V

    .line 136
    .line 137
    .line 138
    iput-object v5, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 139
    .line 140
    new-instance v0, La9/t;

    .line 141
    .line 142
    const/4 v2, 0x5

    .line 143
    invoke-direct {v0, v4, v2}, La9/t;-><init>(Ljc/y;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v5, v0, p1}, Lx0/v;->c(Ljava/lang/Object;Lic/k;Lx0/o;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lfg/f;

    .line 152
    .line 153
    invoke-virtual {p1, v1}, Lx0/o;->p(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-nez v1, :cond_3

    .line 165
    .line 166
    if-ne v2, v6, :cond_4

    .line 167
    .line 168
    :cond_3
    new-instance v2, Lt9/f;

    .line 169
    .line 170
    const/4 v1, 0x1

    .line 171
    invoke-direct {v2, v1, v0}, Lt9/f;-><init>(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    move-object v3, v2

    .line 178
    check-cast v3, Lic/a;

    .line 179
    .line 180
    const/16 v8, 0x6000

    .line 181
    .line 182
    const/16 v9, 0xe

    .line 183
    .line 184
    const/4 v4, 0x0

    .line 185
    const/4 v5, 0x0

    .line 186
    sget-object v6, Lu9/j;->b:Lf1/f;

    .line 187
    .line 188
    move-object v7, p1

    .line 189
    invoke-static/range {v3 .. v9}, Lm0/p3;->a(Lic/a;Lj1/q;ZLic/n;Lx0/o;II)V

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_5
    move-object v7, p1

    .line 194
    invoke-virtual {v7}, Lx0/o;->Q()V

    .line 195
    .line 196
    .line 197
    :goto_2
    invoke-virtual {v7}, Lx0/o;->r()Lx0/p1;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-eqz p1, :cond_6

    .line 202
    .line 203
    new-instance v0, Lt2/x;

    .line 204
    .line 205
    const/16 v1, 0x15

    .line 206
    .line 207
    invoke-direct {v0, p0, v1}, Lt2/x;-><init>(II)V

    .line 208
    .line 209
    .line 210
    iput-object v0, p1, Lx0/p1;->d:Lic/n;

    .line 211
    .line 212
    :cond_6
    return-void
    .line 213
    .line 214
.end method
