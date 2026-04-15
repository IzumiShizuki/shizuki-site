.class public final synthetic Lp9/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfg/f;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbg/p0;Ljava/lang/String;Lfg/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lp9/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/b;->c:Ljava/lang/Object;

    iput-object p2, p0, Lp9/b;->d:Ljava/lang/Object;

    iput-object p3, p0, Lp9/b;->b:Lfg/f;

    return-void
.end method

.method public synthetic constructor <init>(Lfg/f;Lfg/f;Le7/a0;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lp9/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/b;->b:Lfg/f;

    iput-object p2, p0, Lp9/b;->c:Ljava/lang/Object;

    iput-object p3, p0, Lp9/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lfg/f;Lic/k;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lp9/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/b;->c:Ljava/lang/Object;

    iput-object p2, p0, Lp9/b;->b:Lfg/f;

    iput-object p3, p0, Lp9/b;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lp9/b;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lp9/b;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lfg/f;

    .line 11
    .line 12
    iget-object v2, v0, Lp9/b;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Le7/a0;

    .line 15
    .line 16
    move-object/from16 v3, p1

    .line 17
    .line 18
    check-cast v3, La0/d;

    .line 19
    .line 20
    move-object/from16 v11, p2

    .line 21
    .line 22
    check-cast v11, Lx0/o;

    .line 23
    .line 24
    move-object/from16 v4, p3

    .line 25
    .line 26
    check-cast v4, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const-string v5, "$this$item"

    .line 33
    .line 34
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    and-int/lit8 v3, v4, 0x11

    .line 38
    .line 39
    const/16 v5, 0x10

    .line 40
    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v6, 0x1

    .line 43
    if-eq v3, v5, :cond_0

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v3, 0x0

    .line 48
    :goto_0
    and-int/2addr v4, v6

    .line 49
    invoke-virtual {v11, v4, v3}, Lx0/o;->N(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_5

    .line 54
    .line 55
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    sget-object v15, Lx0/k;->a:Lx0/r0;

    .line 60
    .line 61
    if-ne v3, v15, :cond_1

    .line 62
    .line 63
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {v3}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v11, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    check-cast v3, Lx0/w0;

    .line 73
    .line 74
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    if-ne v4, v15, :cond_2

    .line 79
    .line 80
    new-instance v4, Li9/f;

    .line 81
    .line 82
    const/16 v5, 0xa

    .line 83
    .line 84
    invoke-direct {v4, v5}, Li9/f;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v11, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    check-cast v4, Lic/a;

    .line 91
    .line 92
    const/4 v5, 0x7

    .line 93
    sget-object v6, Lj1/n;->a:Lj1/n;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    invoke-static {v6, v7, v4, v5}, Landroidx/compose/foundation/a;->d(Lj1/q;Ljava/lang/String;Lic/a;I)Lj1/q;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    new-instance v5, Ls9/c;

    .line 101
    .line 102
    const/4 v6, 0x0

    .line 103
    iget-object v7, v0, Lp9/b;->b:Lfg/f;

    .line 104
    .line 105
    invoke-direct {v5, v7, v6}, Ls9/c;-><init>(Lfg/f;I)V

    .line 106
    .line 107
    .line 108
    const v6, 0x6158437f

    .line 109
    .line 110
    .line 111
    invoke-static {v6, v5, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    new-instance v5, Laa/g;

    .line 116
    .line 117
    const/16 v7, 0x13

    .line 118
    .line 119
    invoke-direct {v5, v3, v7}, Laa/g;-><init>(Lx0/w0;I)V

    .line 120
    .line 121
    .line 122
    const v7, 0x13ff3082

    .line 123
    .line 124
    .line 125
    invoke-static {v7, v5, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    new-instance v5, Ls9/c;

    .line 130
    .line 131
    const/4 v7, 0x1

    .line 132
    invoke-direct {v5, v1, v7}, Ls9/c;-><init>(Lfg/f;I)V

    .line 133
    .line 134
    .line 135
    const v1, -0x5b1e807d

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v5, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    const v12, 0x1b01b0

    .line 143
    .line 144
    .line 145
    const/16 v13, 0x18

    .line 146
    .line 147
    sget-object v5, Ls9/d;->b:Lf1/f;

    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    invoke-static/range {v4 .. v13}, Landroid/support/v4/media/session/b;->g(Lj1/q;Lic/n;Lic/n;ZLic/n;Lic/n;Lf1/f;Lx0/o;II)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v3}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_4

    .line 165
    .line 166
    const v1, -0x3582f1c8    # -4146062.0f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v11, v1}, Lx0/o;->W(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11}, Lx0/o;->K()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-ne v1, v15, :cond_3

    .line 177
    .line 178
    new-instance v1, Lma/c;

    .line 179
    .line 180
    const/16 v4, 0x18

    .line 181
    .line 182
    invoke-direct {v1, v3, v4}, Lma/c;-><init>(Lx0/w0;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11, v1}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_3
    move-object v4, v1

    .line 189
    check-cast v4, Lic/a;

    .line 190
    .line 191
    new-instance v1, Lba/h0;

    .line 192
    .line 193
    const/16 v5, 0x16

    .line 194
    .line 195
    invoke-direct {v1, v5, v2, v3}, Lba/h0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const v2, -0x20db7bce

    .line 199
    .line 200
    .line 201
    invoke-static {v2, v1, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    new-instance v1, Laa/g;

    .line 206
    .line 207
    const/16 v2, 0x11

    .line 208
    .line 209
    invoke-direct {v1, v3, v2}, Laa/g;-><init>(Lx0/w0;I)V

    .line 210
    .line 211
    .line 212
    const v2, 0x620c3970

    .line 213
    .line 214
    .line 215
    invoke-static {v2, v1, v11}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    const v17, 0x36c36

    .line 220
    .line 221
    .line 222
    const/16 v18, 0x3c4

    .line 223
    .line 224
    const/4 v6, 0x0

    .line 225
    sget-object v8, Ls9/d;->f:Lf1/f;

    .line 226
    .line 227
    sget-object v9, Ls9/d;->g:Lf1/f;

    .line 228
    .line 229
    const/4 v10, 0x0

    .line 230
    move-object/from16 v16, v11

    .line 231
    .line 232
    const-wide/16 v11, 0x0

    .line 233
    .line 234
    const/4 v1, 0x0

    .line 235
    const-wide/16 v13, 0x0

    .line 236
    .line 237
    const/4 v15, 0x0

    .line 238
    invoke-static/range {v4 .. v18}, La2/c;->b(Lic/a;Lf1/f;Lj1/q;Lic/n;Lic/n;Lic/n;Lq1/l0;JJLj3/q;Lx0/o;II)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v11, v16

    .line 242
    .line 243
    :goto_1
    invoke-virtual {v11, v1}, Lx0/o;->p(Z)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_4
    const/4 v1, 0x0

    .line 248
    const v2, -0x35bafc5d

    .line 249
    .line 250
    .line 251
    invoke-virtual {v11, v2}, Lx0/o;->W(I)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_5
    invoke-virtual {v11}, Lx0/o;->Q()V

    .line 256
    .line 257
    .line 258
    :goto_2
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 259
    .line 260
    return-object v1

    .line 261
    :pswitch_0
    iget-object v1, v0, Lp9/b;->c:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v1, Lbg/p0;

    .line 264
    .line 265
    iget-object v2, v0, Lp9/b;->d:Ljava/lang/Object;

    .line 266
    .line 267
    move-object v3, v2

    .line 268
    check-cast v3, Ljava/lang/String;

    .line 269
    .line 270
    move-object/from16 v2, p1

    .line 271
    .line 272
    check-cast v2, Ly/k1;

    .line 273
    .line 274
    move-object/from16 v8, p2

    .line 275
    .line 276
    check-cast v8, Lx0/o;

    .line 277
    .line 278
    move-object/from16 v4, p3

    .line 279
    .line 280
    check-cast v4, Ljava/lang/Integer;

    .line 281
    .line 282
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    const-string v5, "$this$DropdownMenuItem"

    .line 287
    .line 288
    invoke-static {v2, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    and-int/lit8 v2, v4, 0x11

    .line 292
    .line 293
    const/16 v5, 0x10

    .line 294
    .line 295
    const/4 v6, 0x0

    .line 296
    const/4 v7, 0x1

    .line 297
    if-eq v2, v5, :cond_6

    .line 298
    .line 299
    const/4 v2, 0x1

    .line 300
    goto :goto_3

    .line 301
    :cond_6
    const/4 v2, 0x0

    .line 302
    :goto_3
    and-int/2addr v4, v7

    .line 303
    invoke-virtual {v8, v4, v2}, Lx0/o;->N(IZ)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_8

    .line 308
    .line 309
    iget-object v2, v0, Lp9/b;->b:Lfg/f;

    .line 310
    .line 311
    invoke-virtual {v2}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    check-cast v2, Lbg/p0;

    .line 316
    .line 317
    if-ne v2, v1, :cond_7

    .line 318
    .line 319
    const/4 v4, 0x1

    .line 320
    goto :goto_4

    .line 321
    :cond_7
    const/4 v4, 0x0

    .line 322
    :goto_4
    const/4 v1, 0x5

    .line 323
    int-to-float v12, v1

    .line 324
    const/4 v13, 0x0

    .line 325
    const/16 v14, 0xb

    .line 326
    .line 327
    sget-object v9, Lj1/n;->a:Lj1/n;

    .line 328
    .line 329
    const/4 v10, 0x0

    .line 330
    const/4 v11, 0x0

    .line 331
    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->n(Lj1/q;FFFFI)Lj1/q;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    const/16 v9, 0x1b0

    .line 336
    .line 337
    const/16 v10, 0x38

    .line 338
    .line 339
    const/4 v6, 0x0

    .line 340
    const/4 v7, 0x0

    .line 341
    invoke-static/range {v4 .. v10}, Lm0/i5;->a(ZLj1/q;ZLm0/u1;Lx0/o;II)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v22, v8

    .line 345
    .line 346
    const/16 v24, 0x0

    .line 347
    .line 348
    const v25, 0x1fffe

    .line 349
    .line 350
    .line 351
    const/4 v4, 0x0

    .line 352
    const-wide/16 v5, 0x0

    .line 353
    .line 354
    const-wide/16 v7, 0x0

    .line 355
    .line 356
    const/4 v9, 0x0

    .line 357
    const/4 v10, 0x0

    .line 358
    const-wide/16 v11, 0x0

    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const/4 v14, 0x0

    .line 362
    const-wide/16 v15, 0x0

    .line 363
    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    .line 370
    const/16 v20, 0x0

    .line 371
    .line 372
    const/16 v21, 0x0

    .line 373
    .line 374
    const/16 v23, 0x0

    .line 375
    .line 376
    invoke-static/range {v3 .. v25}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 377
    .line 378
    .line 379
    goto :goto_5

    .line 380
    :cond_8
    move-object/from16 v22, v8

    .line 381
    .line 382
    invoke-virtual/range {v22 .. v22}, Lx0/o;->Q()V

    .line 383
    .line 384
    .line 385
    :goto_5
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 386
    .line 387
    return-object v1

    .line 388
    :pswitch_1
    iget-object v1, v0, Lp9/b;->c:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v1, Ljava/util/List;

    .line 391
    .line 392
    iget-object v2, v0, Lp9/b;->d:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v2, Lic/k;

    .line 395
    .line 396
    move-object/from16 v3, p1

    .line 397
    .line 398
    check-cast v3, Ly/k1;

    .line 399
    .line 400
    move-object/from16 v15, p2

    .line 401
    .line 402
    check-cast v15, Lx0/o;

    .line 403
    .line 404
    move-object/from16 v4, p3

    .line 405
    .line 406
    check-cast v4, Ljava/lang/Integer;

    .line 407
    .line 408
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    const-string v5, "$this$BottomNavigation"

    .line 413
    .line 414
    invoke-static {v3, v5}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    and-int/lit8 v5, v4, 0x6

    .line 418
    .line 419
    if-nez v5, :cond_a

    .line 420
    .line 421
    invoke-virtual {v15, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_9

    .line 426
    .line 427
    const/4 v5, 0x4

    .line 428
    goto :goto_6

    .line 429
    :cond_9
    const/4 v5, 0x2

    .line 430
    :goto_6
    or-int/2addr v4, v5

    .line 431
    :cond_a
    move/from16 v17, v4

    .line 432
    .line 433
    and-int/lit8 v4, v17, 0x13

    .line 434
    .line 435
    const/16 v5, 0x12

    .line 436
    .line 437
    const/16 v18, 0x0

    .line 438
    .line 439
    const/16 v19, 0x1

    .line 440
    .line 441
    if-eq v4, v5, :cond_b

    .line 442
    .line 443
    const/4 v4, 0x1

    .line 444
    goto :goto_7

    .line 445
    :cond_b
    const/4 v4, 0x0

    .line 446
    :goto_7
    and-int/lit8 v5, v17, 0x1

    .line 447
    .line 448
    invoke-virtual {v15, v5, v4}, Lx0/o;->N(IZ)Z

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    if-eqz v4, :cond_10

    .line 453
    .line 454
    check-cast v1, Ljava/lang/Iterable;

    .line 455
    .line 456
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    const/4 v4, 0x0

    .line 461
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    if-eqz v5, :cond_11

    .line 466
    .line 467
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    add-int/lit8 v20, v4, 0x1

    .line 472
    .line 473
    if-ltz v4, :cond_f

    .line 474
    .line 475
    check-cast v5, Lp9/f;

    .line 476
    .line 477
    iget-object v6, v0, Lp9/b;->b:Lfg/f;

    .line 478
    .line 479
    invoke-virtual {v6}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    check-cast v7, Ljava/lang/Number;

    .line 484
    .line 485
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 486
    .line 487
    .line 488
    move-result v7

    .line 489
    if-ne v7, v4, :cond_c

    .line 490
    .line 491
    const/4 v7, 0x1

    .line 492
    goto :goto_9

    .line 493
    :cond_c
    const/4 v7, 0x0

    .line 494
    :goto_9
    sget-object v8, Lm0/c1;->a:Lx0/o2;

    .line 495
    .line 496
    invoke-virtual {v15, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    check-cast v9, Lm0/b1;

    .line 501
    .line 502
    invoke-virtual {v9}, Lm0/b1;->f()J

    .line 503
    .line 504
    .line 505
    move-result-wide v11

    .line 506
    invoke-virtual {v15, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    check-cast v8, Lm0/b1;

    .line 511
    .line 512
    invoke-virtual {v8}, Lm0/b1;->e()J

    .line 513
    .line 514
    .line 515
    move-result-wide v13

    .line 516
    invoke-virtual {v15, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v8

    .line 520
    invoke-virtual {v15, v4}, Lx0/o;->d(I)Z

    .line 521
    .line 522
    .line 523
    move-result v9

    .line 524
    or-int/2addr v8, v9

    .line 525
    invoke-virtual {v15, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    or-int/2addr v8, v9

    .line 530
    invoke-virtual {v15}, Lx0/o;->K()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    if-nez v8, :cond_d

    .line 535
    .line 536
    sget-object v8, Lx0/k;->a:Lx0/r0;

    .line 537
    .line 538
    if-ne v9, v8, :cond_e

    .line 539
    .line 540
    :cond_d
    new-instance v9, Lba/d0;

    .line 541
    .line 542
    const/4 v8, 0x2

    .line 543
    invoke-direct {v9, v6, v4, v2, v8}, Lba/d0;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v15, v9}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    :cond_e
    check-cast v9, Lic/a;

    .line 550
    .line 551
    new-instance v8, Lf1/b;

    .line 552
    .line 553
    invoke-direct {v8, v6, v4, v5}, Lf1/b;-><init>(Lfg/f;ILp9/f;)V

    .line 554
    .line 555
    .line 556
    const v4, -0x2572733b

    .line 557
    .line 558
    .line 559
    invoke-static {v4, v8, v15}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    new-instance v4, La9/r;

    .line 564
    .line 565
    const/16 v8, 0x10

    .line 566
    .line 567
    invoke-direct {v4, v8, v5}, La9/r;-><init>(ILjava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    const v5, 0x5047ed22

    .line 571
    .line 572
    .line 573
    invoke-static {v5, v4, v15}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 574
    .line 575
    .line 576
    move-result-object v4

    .line 577
    and-int/lit8 v5, v17, 0xe

    .line 578
    .line 579
    const v8, 0x180c00

    .line 580
    .line 581
    .line 582
    or-int v16, v5, v8

    .line 583
    .line 584
    move-object v5, v9

    .line 585
    move-object v9, v4

    .line 586
    move v4, v7

    .line 587
    const/4 v7, 0x0

    .line 588
    const/4 v8, 0x0

    .line 589
    const/4 v10, 0x0

    .line 590
    invoke-static/range {v3 .. v16}, Lm0/r0;->c(Ly/k1;ZLic/a;Lf1/f;Lj1/q;ZLic/n;ZJJLx0/o;I)V

    .line 591
    .line 592
    .line 593
    move/from16 v4, v20

    .line 594
    .line 595
    goto/16 :goto_8

    .line 596
    .line 597
    :cond_f
    invoke-static {}, Lud/b;->H()V

    .line 598
    .line 599
    .line 600
    const/4 v1, 0x0

    .line 601
    throw v1

    .line 602
    :cond_10
    invoke-virtual {v15}, Lx0/o;->Q()V

    .line 603
    .line 604
    .line 605
    :cond_11
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 606
    .line 607
    return-object v1

    .line 608
    nop

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 610
    .line 611
    .line 612
    .line 613
.end method
