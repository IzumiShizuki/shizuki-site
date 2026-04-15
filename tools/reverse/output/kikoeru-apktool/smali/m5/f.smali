.class public final Lm5/f;
.super Lm5/n;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final e:I

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Lm5/j;

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:I

.field public final p:I

.field public final q:Z

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:Z

.field public final w:Z

.field public final x:Z


# direct methods
.method public constructor <init>(ILm4/j1;ILm5/j;IZLm5/e;I)V
    .locals 13

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    invoke-direct/range {p0 .. p3}, Lm5/n;-><init>(ILm4/j1;I)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lm5/f;->h:Lm5/j;

    .line 9
    .line 10
    iget-boolean p1, v0, Lm5/j;->n0:Z

    .line 11
    .line 12
    iget-object v2, v0, Lm4/o1;->s:Lya/i0;

    .line 13
    .line 14
    iget-object v3, v0, Lm4/o1;->o:Lya/i0;

    .line 15
    .line 16
    const/16 v4, 0x18

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/16 p1, 0x18

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 p1, 0x10

    .line 24
    .line 25
    :goto_0
    const/4 v5, 0x0

    .line 26
    iput-boolean v5, p0, Lm5/f;->m:Z

    .line 27
    .line 28
    iget-object v6, p0, Lm5/n;->d:Lm4/q;

    .line 29
    .line 30
    iget-object v6, v6, Lm4/q;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v6}, Lm5/p;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    iput-object v6, p0, Lm5/f;->g:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1, v5}, Lq/t0;->v(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iput-boolean v6, p0, Lm5/f;->i:Z

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    :goto_1
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    const v8, 0x7fffffff

    .line 50
    .line 51
    .line 52
    if-ge v6, v7, :cond_2

    .line 53
    .line 54
    iget-object v7, p0, Lm5/n;->d:Lm4/q;

    .line 55
    .line 56
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v7, v9, v5}, Lm5/p;->g(Lm4/q;Ljava/lang/String;Z)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-lez v7, :cond_1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const v6, 0x7fffffff

    .line 73
    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    :goto_2
    iput v6, p0, Lm5/f;->k:I

    .line 77
    .line 78
    iput v7, p0, Lm5/f;->j:I

    .line 79
    .line 80
    iget-object v3, p0, Lm5/n;->d:Lm4/q;

    .line 81
    .line 82
    iget v3, v3, Lm4/q;->f:I

    .line 83
    .line 84
    iget v6, v0, Lm4/o1;->p:I

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    if-ne v3, v6, :cond_3

    .line 89
    .line 90
    const v3, 0x7fffffff

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    and-int/2addr v3, v6

    .line 95
    invoke-static {v3}, Ljava/lang/Integer;->bitCount(I)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    :goto_3
    iput v3, p0, Lm5/f;->l:I

    .line 100
    .line 101
    iget-object v3, p0, Lm5/n;->d:Lm4/q;

    .line 102
    .line 103
    iget v6, v3, Lm4/q;->f:I

    .line 104
    .line 105
    const/4 v7, 0x1

    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    and-int/2addr v6, v7

    .line 109
    if-eqz v6, :cond_4

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_4
    const/4 v6, 0x0

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    :goto_4
    const/4 v6, 0x1

    .line 115
    :goto_5
    iput-boolean v6, p0, Lm5/f;->n:Z

    .line 116
    .line 117
    iget v6, v3, Lm4/q;->e:I

    .line 118
    .line 119
    and-int/2addr v6, v7

    .line 120
    if-eqz v6, :cond_6

    .line 121
    .line 122
    const/4 v6, 0x1

    .line 123
    goto :goto_6

    .line 124
    :cond_6
    const/4 v6, 0x0

    .line 125
    :goto_6
    iput-boolean v6, p0, Lm5/f;->q:Z

    .line 126
    .line 127
    iget-object v6, v3, Lm4/q;->n:Ljava/lang/String;

    .line 128
    .line 129
    const/4 v9, 0x2

    .line 130
    const/4 v10, -0x1

    .line 131
    if-nez v6, :cond_7

    .line 132
    .line 133
    goto :goto_9

    .line 134
    :cond_7
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    sparse-switch v11, :sswitch_data_0

    .line 139
    .line 140
    .line 141
    :goto_7
    const/4 v6, -0x1

    .line 142
    goto :goto_8

    .line 143
    :sswitch_0
    const-string v11, "audio/iamf"

    .line 144
    .line 145
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_8

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_8
    const/4 v6, 0x2

    .line 153
    goto :goto_8

    .line 154
    :sswitch_1
    const-string v11, "audio/ac4"

    .line 155
    .line 156
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    if-nez v6, :cond_9

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_9
    const/4 v6, 0x1

    .line 164
    goto :goto_8

    .line 165
    :sswitch_2
    const-string v11, "audio/eac3-joc"

    .line 166
    .line 167
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_a

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_a
    const/4 v6, 0x0

    .line 175
    :goto_8
    packed-switch v6, :pswitch_data_0

    .line 176
    .line 177
    .line 178
    :goto_9
    const/4 v6, 0x0

    .line 179
    goto :goto_a

    .line 180
    :pswitch_0
    const/4 v6, 0x1

    .line 181
    :goto_a
    iput-boolean v6, p0, Lm5/f;->x:Z

    .line 182
    .line 183
    iget v6, v3, Lm4/q;->D:I

    .line 184
    .line 185
    iput v6, p0, Lm5/f;->r:I

    .line 186
    .line 187
    iget v11, v3, Lm4/q;->E:I

    .line 188
    .line 189
    iput v11, p0, Lm5/f;->s:I

    .line 190
    .line 191
    iget v11, v3, Lm4/q;->j:I

    .line 192
    .line 193
    iput v11, p0, Lm5/f;->t:I

    .line 194
    .line 195
    if-eq v11, v10, :cond_b

    .line 196
    .line 197
    iget v12, v0, Lm4/o1;->r:I

    .line 198
    .line 199
    if-gt v11, v12, :cond_d

    .line 200
    .line 201
    :cond_b
    if-eq v6, v10, :cond_c

    .line 202
    .line 203
    iget v0, v0, Lm4/o1;->q:I

    .line 204
    .line 205
    if-gt v6, v0, :cond_d

    .line 206
    .line 207
    :cond_c
    move-object/from16 v0, p7

    .line 208
    .line 209
    invoke-virtual {v0, v3}, Lm5/e;->apply(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_d

    .line 214
    .line 215
    const/4 v0, 0x1

    .line 216
    goto :goto_b

    .line 217
    :cond_d
    const/4 v0, 0x0

    .line 218
    :goto_b
    iput-boolean v0, p0, Lm5/f;->f:Z

    .line 219
    .line 220
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    sget v3, Lp4/c0;->a:I

    .line 229
    .line 230
    if-lt v3, v4, :cond_e

    .line 231
    .line 232
    invoke-static {v0}, Lp4/z;->c(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-static {v0}, Lp4/z;->f(Landroid/os/LocaleList;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v3, ","

    .line 241
    .line 242
    invoke-virtual {v0, v3, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    goto :goto_c

    .line 247
    :cond_e
    new-array v3, v7, [Ljava/lang/String;

    .line 248
    .line 249
    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    aput-object v0, v3, v5

    .line 256
    .line 257
    move-object v0, v3

    .line 258
    :goto_c
    const/4 v3, 0x0

    .line 259
    :goto_d
    array-length v4, v0

    .line 260
    if-ge v3, v4, :cond_f

    .line 261
    .line 262
    aget-object v4, v0, v3

    .line 263
    .line 264
    invoke-static {v4}, Lp4/c0;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    aput-object v4, v0, v3

    .line 269
    .line 270
    add-int/lit8 v3, v3, 0x1

    .line 271
    .line 272
    goto :goto_d

    .line 273
    :cond_f
    const/4 v3, 0x0

    .line 274
    :goto_e
    array-length v4, v0

    .line 275
    if-ge v3, v4, :cond_11

    .line 276
    .line 277
    iget-object v4, p0, Lm5/n;->d:Lm4/q;

    .line 278
    .line 279
    aget-object v6, v0, v3

    .line 280
    .line 281
    invoke-static {v4, v6, v5}, Lm5/p;->g(Lm4/q;Ljava/lang/String;Z)I

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-lez v4, :cond_10

    .line 286
    .line 287
    goto :goto_f

    .line 288
    :cond_10
    add-int/lit8 v3, v3, 0x1

    .line 289
    .line 290
    goto :goto_e

    .line 291
    :cond_11
    const v3, 0x7fffffff

    .line 292
    .line 293
    .line 294
    const/4 v4, 0x0

    .line 295
    :goto_f
    iput v3, p0, Lm5/f;->o:I

    .line 296
    .line 297
    iput v4, p0, Lm5/f;->p:I

    .line 298
    .line 299
    const/4 v0, 0x0

    .line 300
    :goto_10
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-ge v0, v3, :cond_13

    .line 305
    .line 306
    iget-object v3, p0, Lm5/n;->d:Lm4/q;

    .line 307
    .line 308
    iget-object v3, v3, Lm4/q;->n:Ljava/lang/String;

    .line 309
    .line 310
    if-eqz v3, :cond_12

    .line 311
    .line 312
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_12

    .line 321
    .line 322
    move v8, v0

    .line 323
    goto :goto_11

    .line 324
    :cond_12
    add-int/lit8 v0, v0, 0x1

    .line 325
    .line 326
    goto :goto_10

    .line 327
    :cond_13
    :goto_11
    iput v8, p0, Lm5/f;->u:I

    .line 328
    .line 329
    and-int/lit16 v0, v1, 0x180

    .line 330
    .line 331
    const/16 v2, 0x80

    .line 332
    .line 333
    if-ne v0, v2, :cond_14

    .line 334
    .line 335
    const/4 v0, 0x1

    .line 336
    goto :goto_12

    .line 337
    :cond_14
    const/4 v0, 0x0

    .line 338
    :goto_12
    iput-boolean v0, p0, Lm5/f;->v:Z

    .line 339
    .line 340
    and-int/lit8 v0, v1, 0x40

    .line 341
    .line 342
    const/16 v2, 0x40

    .line 343
    .line 344
    if-ne v0, v2, :cond_15

    .line 345
    .line 346
    const/4 v0, 0x1

    .line 347
    goto :goto_13

    .line 348
    :cond_15
    const/4 v0, 0x0

    .line 349
    :goto_13
    iput-boolean v0, p0, Lm5/f;->w:Z

    .line 350
    .line 351
    iget-object v0, p0, Lm5/n;->d:Lm4/q;

    .line 352
    .line 353
    iget-boolean v2, p0, Lm5/f;->f:Z

    .line 354
    .line 355
    iget-object v3, p0, Lm5/f;->h:Lm5/j;

    .line 356
    .line 357
    iget-boolean v4, v3, Lm5/j;->p0:Z

    .line 358
    .line 359
    iget-object v6, v3, Lm4/o1;->t:Lm4/m1;

    .line 360
    .line 361
    invoke-static {v1, v4}, Lq/t0;->v(IZ)Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-nez v4, :cond_16

    .line 366
    .line 367
    goto :goto_14

    .line 368
    :cond_16
    if-nez v2, :cond_17

    .line 369
    .line 370
    iget-boolean v4, v3, Lm5/j;->m0:Z

    .line 371
    .line 372
    if-nez v4, :cond_17

    .line 373
    .line 374
    goto :goto_14

    .line 375
    :cond_17
    iget v4, v6, Lm4/m1;->a:I

    .line 376
    .line 377
    if-ne v4, v9, :cond_18

    .line 378
    .line 379
    invoke-static {v3, v1, v0}, Lm5/p;->l(Lm5/j;ILm4/q;)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-nez v4, :cond_18

    .line 384
    .line 385
    goto :goto_14

    .line 386
    :cond_18
    invoke-static {v1, v5}, Lq/t0;->v(IZ)Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_1a

    .line 391
    .line 392
    if-eqz v2, :cond_1a

    .line 393
    .line 394
    iget v0, v0, Lm4/q;->j:I

    .line 395
    .line 396
    if-eq v0, v10, :cond_1a

    .line 397
    .line 398
    iget-boolean v0, v3, Lm4/o1;->A:Z

    .line 399
    .line 400
    if-nez v0, :cond_1a

    .line 401
    .line 402
    iget-boolean v0, v3, Lm4/o1;->z:Z

    .line 403
    .line 404
    if-nez v0, :cond_1a

    .line 405
    .line 406
    iget-boolean v0, v3, Lm5/j;->q0:Z

    .line 407
    .line 408
    if-nez v0, :cond_19

    .line 409
    .line 410
    if-nez p6, :cond_1a

    .line 411
    .line 412
    :cond_19
    iget v0, v6, Lm4/m1;->a:I

    .line 413
    .line 414
    if-eq v0, v9, :cond_1a

    .line 415
    .line 416
    and-int/2addr p1, v1

    .line 417
    if-eqz p1, :cond_1a

    .line 418
    .line 419
    const/4 v5, 0x2

    .line 420
    goto :goto_14

    .line 421
    :cond_1a
    const/4 v5, 0x1

    .line 422
    :goto_14
    iput v5, p0, Lm5/f;->e:I

    .line 423
    .line 424
    return-void

    .line 425
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59afdf4a -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lm5/f;->e:I

    .line 2
    .line 3
    return v0
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

.method public final b(Lm5/n;)Z
    .locals 5

    .line 1
    check-cast p1, Lm5/f;

    .line 2
    .line 3
    iget-object v0, p1, Lm5/n;->d:Lm4/q;

    .line 4
    .line 5
    iget-object v1, p0, Lm5/f;->h:Lm5/j;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lm5/n;->d:Lm4/q;

    .line 11
    .line 12
    iget v2, v1, Lm4/q;->D:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    if-eq v2, v3, :cond_1

    .line 16
    .line 17
    iget v4, v0, Lm4/q;->D:I

    .line 18
    .line 19
    if-ne v2, v4, :cond_1

    .line 20
    .line 21
    iget-boolean v2, p0, Lm5/f;->m:Z

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lm4/q;->n:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, Lm4/q;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v2, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    :cond_0
    iget v1, v1, Lm4/q;->E:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_1

    .line 40
    .line 41
    iget v0, v0, Lm4/q;->E:I

    .line 42
    .line 43
    if-ne v1, v0, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p0, Lm5/f;->v:Z

    .line 46
    .line 47
    iget-boolean v1, p1, Lm5/f;->v:Z

    .line 48
    .line 49
    if-ne v0, v1, :cond_1

    .line 50
    .line 51
    iget-boolean v0, p0, Lm5/f;->w:Z

    .line 52
    .line 53
    iget-boolean p1, p1, Lm5/f;->w:Z

    .line 54
    .line 55
    if-ne v0, p1, :cond_1

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    return p1

    .line 59
    :cond_1
    const/4 p1, 0x0

    .line 60
    return p1
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

.method public final c(Lm5/f;)I
    .locals 7

    .line 1
    iget-boolean v0, p0, Lm5/f;->i:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lm5/f;->f:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v2, Lm5/p;->j:Lya/y0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, Lm5/p;->j:Lya/y0;

    .line 13
    .line 14
    invoke-virtual {v2}, Lya/y0;->a()Lya/y0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    iget-boolean v3, p1, Lm5/f;->i:Z

    .line 19
    .line 20
    iget v4, p1, Lm5/f;->t:I

    .line 21
    .line 22
    sget-object v5, Lya/y;->a:Lya/w;

    .line 23
    .line 24
    invoke-virtual {v5, v0, v3}, Lya/w;->c(ZZ)Lya/y;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v3, p0, Lm5/f;->k:I

    .line 29
    .line 30
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget v5, p1, Lm5/f;->k:I

    .line 35
    .line 36
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    sget-object v6, Lya/x0;->c:Lya/x0;

    .line 41
    .line 42
    invoke-virtual {v0, v3, v5, v6}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v3, p0, Lm5/f;->j:I

    .line 47
    .line 48
    iget v5, p1, Lm5/f;->j:I

    .line 49
    .line 50
    invoke-virtual {v0, v3, v5}, Lya/y;->a(II)Lya/y;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v3, p0, Lm5/f;->l:I

    .line 55
    .line 56
    iget v5, p1, Lm5/f;->l:I

    .line 57
    .line 58
    invoke-virtual {v0, v3, v5}, Lya/y;->a(II)Lya/y;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-boolean v3, p0, Lm5/f;->q:Z

    .line 63
    .line 64
    iget-boolean v5, p1, Lm5/f;->q:Z

    .line 65
    .line 66
    invoke-virtual {v0, v3, v5}, Lya/y;->c(ZZ)Lya/y;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-boolean v3, p0, Lm5/f;->n:Z

    .line 71
    .line 72
    iget-boolean v5, p1, Lm5/f;->n:Z

    .line 73
    .line 74
    invoke-virtual {v0, v3, v5}, Lya/y;->c(ZZ)Lya/y;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget v3, p0, Lm5/f;->o:I

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iget v5, p1, Lm5/f;->o:I

    .line 85
    .line 86
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v0, v3, v5, v6}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget v3, p0, Lm5/f;->p:I

    .line 95
    .line 96
    iget v5, p1, Lm5/f;->p:I

    .line 97
    .line 98
    invoke-virtual {v0, v3, v5}, Lya/y;->a(II)Lya/y;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-boolean v3, p1, Lm5/f;->f:Z

    .line 103
    .line 104
    invoke-virtual {v0, v1, v3}, Lya/y;->c(ZZ)Lya/y;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget v1, p0, Lm5/f;->u:I

    .line 109
    .line 110
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget v3, p1, Lm5/f;->u:I

    .line 115
    .line 116
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v0, v1, v3, v6}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v1, p0, Lm5/f;->h:Lm5/j;

    .line 125
    .line 126
    iget-boolean v1, v1, Lm4/o1;->z:Z

    .line 127
    .line 128
    iget v3, p0, Lm5/f;->t:I

    .line 129
    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    sget-object v6, Lm5/p;->j:Lya/y0;

    .line 141
    .line 142
    invoke-virtual {v6}, Lya/y0;->a()Lya/y0;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v0, v1, v5, v6}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :cond_1
    iget-boolean v1, p0, Lm5/f;->v:Z

    .line 151
    .line 152
    iget-boolean v5, p1, Lm5/f;->v:Z

    .line 153
    .line 154
    invoke-virtual {v0, v1, v5}, Lya/y;->c(ZZ)Lya/y;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-boolean v1, p0, Lm5/f;->w:Z

    .line 159
    .line 160
    iget-boolean v5, p1, Lm5/f;->w:Z

    .line 161
    .line 162
    invoke-virtual {v0, v1, v5}, Lya/y;->c(ZZ)Lya/y;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-boolean v1, p0, Lm5/f;->x:Z

    .line 167
    .line 168
    iget-boolean v5, p1, Lm5/f;->x:Z

    .line 169
    .line 170
    invoke-virtual {v0, v1, v5}, Lya/y;->c(ZZ)Lya/y;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget v1, p0, Lm5/f;->r:I

    .line 175
    .line 176
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget v5, p1, Lm5/f;->r:I

    .line 181
    .line 182
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v0, v1, v5, v2}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget v1, p0, Lm5/f;->s:I

    .line 191
    .line 192
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iget v5, p1, Lm5/f;->s:I

    .line 197
    .line 198
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v0, v1, v5, v2}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iget-object p1, p1, Lm5/f;->g:Ljava/lang/String;

    .line 207
    .line 208
    sget v1, Lp4/c0;->a:I

    .line 209
    .line 210
    iget-object v1, p0, Lm5/f;->g:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-eqz p1, :cond_2

    .line 217
    .line 218
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v0, p1, v1, v2}, Lya/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    :cond_2
    invoke-virtual {v0}, Lya/y;->e()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    return p1
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

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lm5/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm5/f;->c(Lm5/f;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
