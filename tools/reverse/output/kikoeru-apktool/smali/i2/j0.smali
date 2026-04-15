.class public final Li2/j0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lx0/i;
.implements Li2/q1;
.implements Li2/k;


# static fields
.field public static final R:Li2/e0;

.field public static final S:Li2/d0;

.field public static final T:Landroidx/media3/exoplayer/offline/i;


# instance fields
.field public A:Lj2/z2;

.field public B:Lx0/x;

.field public C:Li2/h0;

.field public D:Li2/h0;

.field public E:Z

.field public final F:Li2/d1;

.field public final G:Li2/n0;

.field public H:Lg2/p0;

.field public I:Li2/g1;

.field public J:Z

.field public K:Lj1/q;

.field public L:Lj1/q;

.field public M:Li3/d;

.field public N:Lc2/a0;

.field public O:Z

.field public P:I

.field public Q:Z

.field public final a:Z

.field public b:I

.field public c:J

.field public d:J

.field public e:J

.field public f:Z

.field public g:Z

.field public h:Li2/j0;

.field public i:I

.field public final j:Landroidx/media3/exoplayer/offline/u;

.field public k:Lz0/e;

.field public l:Z

.field public m:Li2/j0;

.field public n:Li2/p1;

.field public o:Li3/q;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Lq2/k;

.field public t:Z

.field public final u:Lz0/e;

.field public v:Z

.field public w:Lg2/v0;

.field public x:Landroidx/media3/exoplayer/offline/u;

.field public y:Lf3/c;

.field public z:Lf3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2/e0;

    .line 2
    .line 3
    const-string v1, "Undefined intrinsics block and it is required"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/g0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li2/j0;->R:Li2/e0;

    .line 9
    .line 10
    new-instance v0, Li2/d0;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Li2/j0;->S:Li2/d0;

    .line 16
    .line 17
    new-instance v0, Landroidx/media3/exoplayer/offline/i;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/offline/i;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Li2/j0;->T:Landroidx/media3/exoplayer/offline/i;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 1
    :goto_0
    sget-object v1, Lq2/m;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 2
    invoke-direct {p0, v0, p1}, Li2/j0;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 4

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p2, p0, Li2/j0;->a:Z

    .line 5
    iput p1, p0, Li2/j0;->b:I

    const-wide p1, 0x7fffffff7fffffffL

    .line 6
    iput-wide p1, p0, Li2/j0;->c:J

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Li2/j0;->d:J

    .line 8
    iput-wide p1, p0, Li2/j0;->e:J

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Li2/j0;->f:Z

    .line 10
    new-instance p2, Landroidx/media3/exoplayer/offline/u;

    .line 11
    new-instance v0, Lz0/e;

    const/16 v1, 0x10

    new-array v2, v1, [Li2/j0;

    invoke-direct {v0, v2}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 12
    new-instance v2, Lb0/d0;

    const/16 v3, 0xd

    invoke-direct {v2, v3, p0}, Lb0/d0;-><init>(ILjava/lang/Object;)V

    const/16 v3, 0x16

    invoke-direct {p2, v3, v0, v2}, Landroidx/media3/exoplayer/offline/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 13
    new-instance p2, Lz0/e;

    new-array v0, v1, [Li2/j0;

    invoke-direct {p2, v0}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 14
    iput-object p2, p0, Li2/j0;->u:Lz0/e;

    .line 15
    iput-boolean p1, p0, Li2/j0;->v:Z

    .line 16
    sget-object p2, Li2/j0;->R:Li2/e0;

    iput-object p2, p0, Li2/j0;->w:Lg2/v0;

    .line 17
    sget-object p2, Li2/m0;->a:Lf3/d;

    .line 18
    iput-object p2, p0, Li2/j0;->y:Lf3/c;

    .line 19
    sget-object p2, Lf3/m;->a:Lf3/m;

    iput-object p2, p0, Li2/j0;->z:Lf3/m;

    .line 20
    sget-object p2, Li2/j0;->S:Li2/d0;

    iput-object p2, p0, Li2/j0;->A:Lj2/z2;

    .line 21
    sget-object p2, Lx0/x;->o0:Lx0/w;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    sget-object p2, Lx0/w;->b:Lf1/k;

    .line 23
    iput-object p2, p0, Li2/j0;->B:Lx0/x;

    .line 24
    sget-object p2, Li2/h0;->c:Li2/h0;

    iput-object p2, p0, Li2/j0;->C:Li2/h0;

    .line 25
    iput-object p2, p0, Li2/j0;->D:Li2/h0;

    .line 26
    new-instance p2, Li2/d1;

    invoke-direct {p2, p0}, Li2/d1;-><init>(Li2/j0;)V

    iput-object p2, p0, Li2/j0;->F:Li2/d1;

    .line 27
    new-instance p2, Li2/n0;

    invoke-direct {p2, p0}, Li2/n0;-><init>(Li2/j0;)V

    iput-object p2, p0, Li2/j0;->G:Li2/n0;

    .line 28
    iput-boolean p1, p0, Li2/j0;->J:Z

    .line 29
    sget-object p1, Lj1/n;->a:Lj1/n;

    iput-object p1, p0, Li2/j0;->K:Lj1/q;

    return-void
.end method

.method public static R(Li2/j0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    iget-boolean v1, v0, Li2/z0;->j:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v0, v0, Lg2/g1;->d:J

    .line 10
    .line 11
    new-instance v2, Lf3/a;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, Lf3/a;-><init>(J)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0, v2}, Li2/j0;->Q(Lf3/a;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
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

.method public static W(Li2/j0;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    :cond_2
    iget-object p2, p0, Li2/j0;->h:Li2/j0;

    .line 21
    .line 22
    if-eqz p2, :cond_3

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_3
    const-string p2, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    .line 26
    .line 27
    invoke-static {p2}, Lf2/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    iget-object p2, p0, Li2/j0;->n:Li2/p1;

    .line 31
    .line 32
    if-nez p2, :cond_4

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_4
    iget-boolean v3, p0, Li2/j0;->q:Z

    .line 36
    .line 37
    if-nez v3, :cond_b

    .line 38
    .line 39
    iget-boolean v3, p0, Li2/j0;->a:Z

    .line 40
    .line 41
    if-nez v3, :cond_b

    .line 42
    .line 43
    check-cast p2, Lj2/v;

    .line 44
    .line 45
    invoke-virtual {p2, p0, v2, p1, v0}, Lj2/v;->D(Li2/j0;ZZZ)V

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_b

    .line 49
    .line 50
    iget-object p0, p0, Li2/j0;->G:Li2/n0;

    .line 51
    .line 52
    iget-object p0, p0, Li2/n0;->q:Li2/v0;

    .line 53
    .line 54
    invoke-static {p0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Li2/v0;->f:Li2/n0;

    .line 58
    .line 59
    iget-object p2, p0, Li2/n0;->a:Li2/j0;

    .line 60
    .line 61
    invoke-virtual {p2}, Li2/j0;->v()Li2/j0;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object p0, p0, Li2/n0;->a:Li2/j0;

    .line 66
    .line 67
    iget-object p0, p0, Li2/j0;->C:Li2/h0;

    .line 68
    .line 69
    if-eqz p2, :cond_b

    .line 70
    .line 71
    sget-object v0, Li2/h0;->c:Li2/h0;

    .line 72
    .line 73
    if-eq p0, v0, :cond_b

    .line 74
    .line 75
    :goto_2
    iget-object v0, p2, Li2/j0;->C:Li2/h0;

    .line 76
    .line 77
    if-ne v0, p0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p2}, Li2/j0;->v()Li2/j0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move-object p2, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_9

    .line 93
    .line 94
    if-ne p0, v2, :cond_8

    .line 95
    .line 96
    iget-object p0, p2, Li2/j0;->h:Li2/j0;

    .line 97
    .line 98
    if-eqz p0, :cond_7

    .line 99
    .line 100
    invoke-virtual {p2, p1}, Li2/j0;->V(Z)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_7
    invoke-virtual {p2, p1}, Li2/j0;->X(Z)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string p1, "Intrinsics isn\'t used by the parent"

    .line 111
    .line 112
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_9
    iget-object p0, p2, Li2/j0;->h:Li2/j0;

    .line 117
    .line 118
    const/4 v0, 0x6

    .line 119
    if-eqz p0, :cond_a

    .line 120
    .line 121
    invoke-static {p2, p1, v0}, Li2/j0;->W(Li2/j0;ZI)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_a
    invoke-static {p2, p1, v0}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 126
    .line 127
    .line 128
    :cond_b
    :goto_4
    return-void
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

.method public static Y(Li2/j0;ZI)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    :goto_0
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    const/4 p2, 0x0

    .line 22
    :goto_1
    iget-boolean v3, p0, Li2/j0;->q:Z

    .line 23
    .line 24
    if-nez v3, :cond_8

    .line 25
    .line 26
    iget-boolean v3, p0, Li2/j0;->a:Z

    .line 27
    .line 28
    if-nez v3, :cond_8

    .line 29
    .line 30
    iget-object v3, p0, Li2/j0;->n:Li2/p1;

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_3
    check-cast v3, Lj2/v;

    .line 36
    .line 37
    invoke-virtual {v3, p0, v1, p1, v0}, Lj2/v;->D(Li2/j0;ZZZ)V

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_8

    .line 41
    .line 42
    iget-object p0, p0, Li2/j0;->G:Li2/n0;

    .line 43
    .line 44
    iget-object p0, p0, Li2/n0;->p:Li2/z0;

    .line 45
    .line 46
    iget-object p0, p0, Li2/z0;->f:Li2/n0;

    .line 47
    .line 48
    iget-object p2, p0, Li2/n0;->a:Li2/j0;

    .line 49
    .line 50
    invoke-virtual {p2}, Li2/j0;->v()Li2/j0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object p0, p0, Li2/n0;->a:Li2/j0;

    .line 55
    .line 56
    iget-object p0, p0, Li2/j0;->C:Li2/h0;

    .line 57
    .line 58
    if-eqz p2, :cond_8

    .line 59
    .line 60
    sget-object v0, Li2/h0;->c:Li2/h0;

    .line 61
    .line 62
    if-eq p0, v0, :cond_8

    .line 63
    .line 64
    :goto_2
    iget-object v0, p2, Li2/j0;->C:Li2/h0;

    .line 65
    .line 66
    if-ne v0, p0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p2}, Li2/j0;->v()Li2/j0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object p2, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    if-ne p0, v2, :cond_6

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Li2/j0;->X(Z)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string p1, "Intrinsics isn\'t used by the parent"

    .line 92
    .line 93
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_7
    const/4 p0, 0x6

    .line 98
    invoke-static {p2, p1, p0}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 99
    .line 100
    .line 101
    :cond_8
    :goto_4
    return-void
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

.method public static Z(Li2/j0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v1, v0, Li2/n0;->d:Li2/f0;

    .line 4
    .line 5
    sget-object v2, Li2/i0;->a:[I

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v1, v2, v1

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v1, v2, :cond_4

    .line 15
    .line 16
    iget-boolean v1, v0, Li2/n0;->e:Z

    .line 17
    .line 18
    const/4 v3, 0x6

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-static {p0, v2, v3}, Li2/j0;->W(Li2/j0;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-boolean v0, v0, Li2/n0;->f:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Li2/j0;->V(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Li2/j0;->r()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-static {p0, v2, v3}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Li2/j0;->p()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Li2/j0;->X(Z)V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-void

    .line 52
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v2, "Unexpected state "

    .line 57
    .line 58
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v0, Li2/n0;->d:Li2/f0;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
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

.method private final j(Li2/j0;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Cannot insert "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " because it already has a parent or an owner. This tree: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1}, Li2/j0;->g(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, " Other tree: "

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, Li2/j0;->m:Li2/j0;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Li2/j0;->g(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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


# virtual methods
.method public final A(JLi2/s;IZ)V
    .locals 10

    .line 1
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 2
    .line 3
    iget-object v1, v0, Li2/d1;->d:Li2/g1;

    .line 4
    .line 5
    sget-object v2, Li2/g1;->M:Lq1/i0;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2}, Li2/g1;->J0(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    iget-object v3, v0, Li2/d1;->d:Li2/g1;

    .line 12
    .line 13
    sget-object v4, Li2/g1;->P:Li2/d;

    .line 14
    .line 15
    move-object v7, p3

    .line 16
    move v8, p4

    .line 17
    move v9, p5

    .line 18
    invoke-virtual/range {v3 .. v9}, Li2/g1;->R0(Li2/d;JLi2/s;IZ)V

    .line 19
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
.end method

.method public final B(ILi2/j0;)V
    .locals 2

    .line 1
    iget-object v0, p2, Li2/j0;->m:Li2/j0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p2, Li2/j0;->n:Li2/p1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p2}, Li2/j0;->j(Li2/j0;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p0, p2, Li2/j0;->m:Li2/j0;

    .line 18
    .line 19
    iget-object v0, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 20
    .line 21
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lz0/e;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Lz0/e;->a(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lb0/d0;

    .line 31
    .line 32
    invoke-virtual {p1}, Lb0/d0;->b()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Li2/j0;->P()V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p2, Li2/j0;->a:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Li2/j0;->i:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Li2/j0;->i:I

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Li2/j0;->H()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Li2/j0;->n:Li2/p1;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Li2/j0;->d(Li2/p1;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p2, Li2/j0;->G:Li2/n0;

    .line 59
    .line 60
    iget p1, p1, Li2/n0;->l:I

    .line 61
    .line 62
    if-lez p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, Li2/j0;->G:Li2/n0;

    .line 65
    .line 66
    iget v0, p1, Li2/n0;->l:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Li2/n0;->d(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget p1, p2, Li2/j0;->P:I

    .line 74
    .line 75
    if-lez p1, :cond_5

    .line 76
    .line 77
    iget p1, p0, Li2/j0;->P:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Li2/j0;->e0(I)V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-void
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

.method public final C()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Li2/j0;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 6
    .line 7
    iget-object v1, v0, Li2/d1;->c:Li2/u;

    .line 8
    .line 9
    iget-object v0, v0, Li2/d1;->d:Li2/g1;

    .line 10
    .line 11
    iget-object v0, v0, Li2/g1;->s:Li2/g1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Li2/j0;->I:Li2/g1;

    .line 15
    .line 16
    :goto_0
    invoke-static {v1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v3, v1, Li2/g1;->K:Li2/o1;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    :goto_1
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iput-object v1, p0, Li2/j0;->I:Li2/g1;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v1, Li2/g1;->s:Li2/g1;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_2
    iget-object v0, p0, Li2/j0;->I:Li2/g1;

    .line 41
    .line 42
    if-eqz v0, :cond_5

    .line 43
    .line 44
    iget-object v1, v0, Li2/g1;->K:Li2/o1;

    .line 45
    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_4
    const-string v0, "layer was not set"

    .line 50
    .line 51
    invoke-static {v0}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    throw v0

    .line 56
    :cond_5
    :goto_3
    if-eqz v0, :cond_6

    .line 57
    .line 58
    invoke-virtual {v0}, Li2/g1;->T0()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_6
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_7

    .line 67
    .line 68
    invoke-virtual {v0}, Li2/j0;->C()V

    .line 69
    .line 70
    .line 71
    :cond_7
    return-void
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

.method public final D()V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 2
    .line 3
    iget-object v1, v0, Li2/d1;->d:Li2/g1;

    .line 4
    .line 5
    iget-object v2, v0, Li2/d1;->c:Li2/u;

    .line 6
    .line 7
    :goto_0
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const-string v3, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    .line 10
    .line 11
    invoke-static {v1, v3}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Li2/c0;

    .line 15
    .line 16
    iget-object v3, v1, Li2/g1;->K:Li2/o1;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-interface {v3}, Li2/o1;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v1, v1, Li2/g1;->r:Li2/g1;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object v0, v0, Li2/d1;->c:Li2/u;

    .line 27
    .line 28
    iget-object v0, v0, Li2/g1;->K:Li2/o1;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Li2/o1;->invalidate()V

    .line 33
    .line 34
    .line 35
    :cond_2
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

.method public final E()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Li2/j0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Li2/j0;->E()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Li2/j0;->h:Li2/j0;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0, v2, v1}, Li2/j0;->W(Li2/j0;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {p0, v2, v1}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
.end method

.method public final F()V
    .locals 4

    .line 1
    iget-wide v0, p0, Li2/j0;->c:J

    .line 2
    .line 3
    const-wide v2, 0x7fffffff7fffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1, v2, v3}, Lf3/j;->b(JJ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iput-wide v2, p0, Li2/j0;->c:J

    .line 16
    .line 17
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 22
    .line 23
    iget v0, v0, Lz0/e;->c:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v3, v1, v2

    .line 29
    .line 30
    check-cast v3, Li2/j0;

    .line 31
    .line 32
    invoke-virtual {v3}, Li2/j0;->F()V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    return-void
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

.method public final G()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Li2/j0;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 7
    .line 8
    iget-object v0, v0, Li2/d1;->b:Li2/c1;

    .line 9
    .line 10
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Li2/j0;->L:Lj1/q;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :goto_0
    iput-boolean v1, p0, Li2/j0;->r:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iget-object v0, p0, Li2/j0;->s:Lq2/k;

    .line 24
    .line 25
    iput-boolean v1, p0, Li2/j0;->t:Z

    .line 26
    .line 27
    new-instance v1, Ljc/y;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lq2/k;

    .line 33
    .line 34
    invoke-direct {v2}, Lq2/k;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, v1, Ljc/y;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p0}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lj2/v;

    .line 44
    .line 45
    invoke-virtual {v2}, Lj2/v;->getSnapshotObserver()Li2/r1;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, Lb0/s1;

    .line 50
    .line 51
    const/4 v4, 0x5

    .line 52
    invoke-direct {v3, v4, p0, v1}, Lb0/s1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v2, Li2/r1;->d:Li2/e;

    .line 56
    .line 57
    invoke-virtual {v2, p0, v4, v3}, Li2/r1;->a(Li2/q1;Lic/k;Lic/a;)V

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    iput-boolean v2, p0, Li2/j0;->t:Z

    .line 62
    .line 63
    iget-object v1, v1, Ljc/y;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lq2/k;

    .line 66
    .line 67
    iput-object v1, p0, Li2/j0;->s:Lq2/k;

    .line 68
    .line 69
    iput-boolean v2, p0, Li2/j0;->r:Z

    .line 70
    .line 71
    invoke-static {p0}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lj2/v;

    .line 76
    .line 77
    invoke-virtual {v1}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, p0, v0}, Lq2/q;->b(Li2/j0;Lq2/k;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lj2/v;->F()V

    .line 85
    .line 86
    .line 87
    return-void
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

.method public final H()V
    .locals 1

    .line 1
    iget v0, p0, Li2/j0;->i:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Li2/j0;->l:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Li2/j0;->a:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Li2/j0;->m:Li2/j0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Li2/j0;->H()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
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

.method public final I()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

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

.method public final J()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    iget-boolean v0, v0, Li2/z0;->t:Z

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

.method public final K()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->q:Li2/v0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Li2/v0;->F()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
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

.method public final L()V
    .locals 7

    .line 1
    iget-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 2
    .line 3
    sget-object v1, Li2/h0;->c:Li2/h0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Li2/j0;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 11
    .line 12
    iget-object v0, v0, Li2/n0;->q:Li2/v0;

    .line 13
    .line 14
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    :try_start_0
    iput-boolean v2, v0, Li2/v0;->g:Z

    .line 20
    .line 21
    iget-boolean v2, v0, Li2/v0;->l:Z

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "replace() called on item that was not placed"

    .line 26
    .line 27
    invoke-static {v2}, Lf2/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    iput-boolean v1, v0, Li2/v0;->y:Z

    .line 34
    .line 35
    invoke-virtual {v0}, Li2/v0;->F()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-wide v3, v0, Li2/v0;->o:J

    .line 40
    .line 41
    iget-object v5, v0, Li2/v0;->p:Lic/k;

    .line 42
    .line 43
    iget-object v6, v0, Li2/v0;->q:Lt1/b;

    .line 44
    .line 45
    invoke-virtual {v0, v3, v4, v5, v6}, Li2/v0;->r0(JLic/k;Lt1/b;)V

    .line 46
    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iget-boolean v2, v0, Li2/v0;->y:Z

    .line 51
    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    iget-object v2, v0, Li2/v0;->f:Li2/n0;

    .line 55
    .line 56
    iget-object v2, v2, Li2/n0;->a:Li2/j0;

    .line 57
    .line 58
    invoke-virtual {v2}, Li2/j0;->v()Li2/j0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Li2/j0;->V(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-boolean v1, v0, Li2/v0;->g:Z

    .line 68
    .line 69
    return-void

    .line 70
    :goto_1
    iput-boolean v1, v0, Li2/v0;->g:Z

    .line 71
    .line 72
    throw v2
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

.method public final M(III)V
    .locals 6

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p3, :cond_3

    .line 6
    .line 7
    if-le p1, p2, :cond_1

    .line 8
    .line 9
    add-int v1, p1, v0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v1, p1

    .line 13
    :goto_1
    if-le p1, p2, :cond_2

    .line 14
    .line 15
    add-int v2, p2, v0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    add-int v2, p2, p3

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    :goto_2
    iget-object v3, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 23
    .line 24
    iget-object v4, v3, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lz0/e;

    .line 27
    .line 28
    iget-object v5, v3, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Lb0/d0;

    .line 31
    .line 32
    invoke-virtual {v4, v1}, Lz0/e;->k(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v5}, Lb0/d0;->b()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v1, Li2/j0;

    .line 40
    .line 41
    iget-object v3, v3, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lz0/e;

    .line 44
    .line 45
    invoke-virtual {v3, v2, v1}, Lz0/e;->a(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Lb0/d0;->b()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0}, Li2/j0;->P()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Li2/j0;->H()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Li2/j0;->E()V

    .line 61
    .line 62
    .line 63
    return-void
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

.method public final N(Li2/j0;)V
    .locals 4

    .line 1
    iget-object v0, p1, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget v0, v0, Li2/n0;->l:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 8
    .line 9
    iget v1, v0, Li2/n0;->l:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Li2/n0;->d(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Li2/j0;->h()V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, Li2/j0;->m:Li2/j0;

    .line 25
    .line 26
    iget v1, p1, Li2/j0;->P:I

    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    iget v1, p0, Li2/j0;->P:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Li2/j0;->e0(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v1, p1, Li2/j0;->F:Li2/d1;

    .line 38
    .line 39
    iget-object v1, v1, Li2/d1;->d:Li2/g1;

    .line 40
    .line 41
    iput-object v0, v1, Li2/g1;->s:Li2/g1;

    .line 42
    .line 43
    iget-boolean v1, p1, Li2/j0;->a:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget v1, p0, Li2/j0;->i:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    iput v1, p0, Li2/j0;->i:I

    .line 52
    .line 53
    iget-object p1, p1, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 54
    .line 55
    iget-object p1, p1, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lz0/e;

    .line 58
    .line 59
    iget-object v1, p1, Lz0/e;->a:[Ljava/lang/Object;

    .line 60
    .line 61
    iget p1, p1, Lz0/e;->c:I

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    :goto_0
    if-ge v2, p1, :cond_3

    .line 65
    .line 66
    aget-object v3, v1, v2

    .line 67
    .line 68
    check-cast v3, Li2/j0;

    .line 69
    .line 70
    iget-object v3, v3, Li2/j0;->F:Li2/d1;

    .line 71
    .line 72
    iget-object v3, v3, Li2/d1;->d:Li2/g1;

    .line 73
    .line 74
    iput-object v0, v3, Li2/g1;->s:Li2/g1;

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {p0}, Li2/j0;->H()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Li2/j0;->P()V

    .line 83
    .line 84
    .line 85
    return-void
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

.method public final O()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li2/j0;->f:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    iget v0, v0, Lz0/e;->c:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    aget-object v3, v1, v2

    .line 16
    .line 17
    check-cast v3, Li2/j0;

    .line 18
    .line 19
    invoke-virtual {v3}, Li2/j0;->F()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final P()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Li2/j0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Li2/j0;->P()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Li2/j0;->v:Z

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

.method public final Q(Lf3/a;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 4
    .line 5
    sget-object v1, Li2/h0;->c:Li2/h0;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Li2/j0;->e()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 13
    .line 14
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 15
    .line 16
    iget-wide v1, p1, Lf3/a;->a:J

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Li2/z0;->v0(J)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    return p1
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

.method public final S()V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lz0/e;

    .line 6
    .line 7
    iget-object v2, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lz0/e;

    .line 10
    .line 11
    iget v1, v1, Lz0/e;->c:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    :goto_0
    const/4 v3, -0x1

    .line 16
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v3, v2, Lz0/e;->a:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v3, v3, v1

    .line 21
    .line 22
    check-cast v3, Li2/j0;

    .line 23
    .line 24
    invoke-virtual {p0, v3}, Li2/j0;->N(Li2/j0;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Lz0/e;->g()V

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lb0/d0;

    .line 36
    .line 37
    invoke-virtual {v0}, Lb0/d0;->b()Ljava/lang/Object;

    .line 38
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

.method public final T(II)V
    .locals 2

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "count ("

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ") must be greater than 0"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lf2/a;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    add-int/2addr p2, p1

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    if-gt p1, p2, :cond_1

    .line 30
    .line 31
    :goto_1
    iget-object v0, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 32
    .line 33
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lz0/e;

    .line 36
    .line 37
    iget-object v1, v1, Lz0/e;->a:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v1, v1, p2

    .line 40
    .line 41
    check-cast v1, Li2/j0;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Li2/j0;->N(Li2/j0;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lz0/e;

    .line 49
    .line 50
    invoke-virtual {v1, p2}, Lz0/e;->k(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lb0/d0;

    .line 57
    .line 58
    invoke-virtual {v0}, Lb0/d0;->b()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    check-cast v1, Li2/j0;

    .line 62
    .line 63
    if-eq p2, p1, :cond_1

    .line 64
    .line 65
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void
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
.end method

.method public final U()V
    .locals 9

    .line 1
    iget-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 2
    .line 3
    sget-object v1, Li2/h0;->c:Li2/h0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Li2/j0;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 11
    .line 12
    iget-object v1, v0, Li2/n0;->p:Li2/z0;

    .line 13
    .line 14
    iget-object v7, v1, Li2/z0;->f:Li2/n0;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v0, 0x1

    .line 18
    :try_start_0
    iput-boolean v0, v1, Li2/z0;->g:Z

    .line 19
    .line 20
    iget-boolean v0, v1, Li2/z0;->k:Z

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string v0, "replace called on unplaced item"

    .line 25
    .line 26
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget-boolean v0, v1, Li2/z0;->t:Z

    .line 33
    .line 34
    iget-wide v2, v1, Li2/z0;->n:J

    .line 35
    .line 36
    iget v4, v1, Li2/z0;->q:F

    .line 37
    .line 38
    iget-object v5, v1, Li2/z0;->o:Lic/k;

    .line 39
    .line 40
    iget-object v6, v1, Li2/z0;->p:Lt1/b;

    .line 41
    .line 42
    invoke-virtual/range {v1 .. v6}, Li2/z0;->t0(JFLic/k;Lt1/b;)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-boolean v0, v1, Li2/z0;->G:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v7, Li2/n0;->a:Li2/j0;

    .line 52
    .line 53
    invoke-virtual {v0}, Li2/j0;->v()Li2/j0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0, v8}, Li2/j0;->X(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_2
    iput-boolean v8, v1, Li2/z0;->g:Z

    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    :try_start_1
    iget-object v2, v7, Li2/n0;->a:Li2/j0;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Li2/j0;->b0(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    iput-boolean v8, v1, Li2/z0;->g:Z

    .line 74
    .line 75
    throw v0
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

.method public final V(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li2/j0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    check-cast v0, Lj2/v;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lj2/v;->E(Li2/j0;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final X(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li2/j0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    check-cast v0, Lj2/v;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lj2/v;->E(Li2/j0;ZZ)V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j0;->o:Li3/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li3/h;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Li2/j0;->H:Lg2/p0;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lg2/p0;->a()V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 16
    .line 17
    iget-object v1, v0, Li2/d1;->d:Li2/g1;

    .line 18
    .line 19
    iget-object v0, v0, Li2/d1;->c:Li2/u;

    .line 20
    .line 21
    iget-object v0, v0, Li2/g1;->r:Li2/g1;

    .line 22
    .line 23
    :goto_0
    invoke-static {v1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, Li2/g1;->Z0()V

    .line 32
    .line 33
    .line 34
    iget-object v1, v1, Li2/g1;->r:Li2/g1;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-void
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

.method public final a0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

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
    :goto_0
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    aget-object v3, v1, v2

    .line 13
    .line 14
    check-cast v3, Li2/j0;

    .line 15
    .line 16
    iget-object v4, v3, Li2/j0;->D:Li2/h0;

    .line 17
    .line 18
    iput-object v4, v3, Li2/j0;->C:Li2/h0;

    .line 19
    .line 20
    sget-object v5, Li2/h0;->c:Li2/h0;

    .line 21
    .line 22
    if-eq v4, v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Li2/j0;->a0()V

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
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
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/j0;->o:Li3/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Li3/h;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Li2/j0;->H:Lg2/p0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg2/p0;->e(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iput-boolean v1, p0, Li2/j0;->Q:Z

    .line 17
    .line 18
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 19
    .line 20
    iget-object v0, v0, Li2/d1;->e:Li2/a2;

    .line 21
    .line 22
    move-object v1, v0

    .line 23
    :goto_0
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-boolean v2, v1, Lj1/p;->n:Z

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Lj1/p;->w0()V

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    move-object v1, v0

    .line 36
    :goto_1
    if-eqz v1, :cond_5

    .line 37
    .line 38
    iget-boolean v2, v1, Lj1/p;->n:Z

    .line 39
    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    invoke-virtual {v1}, Lj1/p;->y0()V

    .line 43
    .line 44
    .line 45
    :cond_4
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_5
    :goto_2
    if-eqz v0, :cond_7

    .line 49
    .line 50
    iget-boolean v1, v0, Lj1/p;->n:Z

    .line 51
    .line 52
    if-eqz v1, :cond_6

    .line 53
    .line 54
    invoke-virtual {v0}, Lj1/p;->q0()V

    .line 55
    .line 56
    .line 57
    :cond_6
    iget-object v0, v0, Lj1/p;->e:Lj1/p;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_7
    invoke-virtual {p0}, Li2/j0;->I()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    if-eqz v0, :cond_8

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Li2/j0;->s:Lq2/k;

    .line 69
    .line 70
    iput-boolean v1, p0, Li2/j0;->r:Z

    .line 71
    .line 72
    :cond_8
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 73
    .line 74
    if-eqz v0, :cond_9

    .line 75
    .line 76
    check-cast v0, Lj2/v;

    .line 77
    .line 78
    invoke-virtual {v0}, Lj2/v;->getRectManager()Lr2/b;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2, p0}, Lr2/b;->j(Li2/j0;)V

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lj2/v;->e()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_9

    .line 90
    .line 91
    iget-object v0, v0, Lj2/v;->F:Lk1/b;

    .line 92
    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    iget-object v2, v0, Lk1/b;->h:Lo/z;

    .line 96
    .line 97
    iget v3, p0, Li2/j0;->b:I

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lo/z;->e(I)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_9

    .line 104
    .line 105
    iget-object v2, v0, Lk1/b;->a:Li7/p2;

    .line 106
    .line 107
    iget-object v0, v0, Lk1/b;->c:Lj2/v;

    .line 108
    .line 109
    iget v3, p0, Li2/j0;->b:I

    .line 110
    .line 111
    invoke-virtual {v2, v0, v3, v1}, Li7/p2;->C(Landroid/view/View;IZ)V

    .line 112
    .line 113
    .line 114
    :cond_9
    return-void
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

.method public final b0(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j0;->B:Lx0/x;

    .line 2
    .line 3
    sget-object v1, Li1/d;->a:Lx0/o2;

    .line 4
    .line 5
    check-cast v0, Lf1/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lx0/v;->w(Lx0/j1;Lx0/m1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Li1/c;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, La9/d;

    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    invoke-direct {v1, v2, v0, p0}, La9/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v1}, Lpc/f0;->V(Ljava/lang/Throwable;Lic/a;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    throw p1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final c(Lj1/q;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li2/j0;->F:Li2/d1;

    .line 6
    .line 7
    const/16 v7, 0x10

    .line 8
    .line 9
    invoke-virtual {v2, v7}, Li2/d1;->d(I)Z

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget-object v9, v2, Li2/d1;->e:Li2/a2;

    .line 14
    .line 15
    const/16 v10, 0x400

    .line 16
    .line 17
    invoke-virtual {v2, v10}, Li2/d1;->d(I)Z

    .line 18
    .line 19
    .line 20
    move-result v11

    .line 21
    iput-object v1, v0, Li2/j0;->K:Lj1/q;

    .line 22
    .line 23
    iget-object v3, v2, Li2/d1;->c:Li2/u;

    .line 24
    .line 25
    iget-object v4, v2, Li2/d1;->a:Li2/j0;

    .line 26
    .line 27
    iget-object v5, v2, Li2/d1;->f:Lj1/p;

    .line 28
    .line 29
    iget-object v12, v2, Li2/d1;->b:Li2/c1;

    .line 30
    .line 31
    if-eq v5, v12, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v5, "padChain called on already padded chain"

    .line 35
    .line 36
    invoke-static {v5}, Lf2/a;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v5, v2, Li2/d1;->f:Lj1/p;

    .line 40
    .line 41
    iput-object v12, v5, Lj1/p;->e:Lj1/p;

    .line 42
    .line 43
    iput-object v5, v12, Lj1/p;->f:Lj1/p;

    .line 44
    .line 45
    move-object v5, v3

    .line 46
    iget-object v3, v2, Li2/d1;->g:Lz0/e;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget v6, v3, Lz0/e;->c:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v6, 0x0

    .line 54
    :goto_1
    iget-object v14, v2, Li2/d1;->h:Lz0/e;

    .line 55
    .line 56
    if-nez v14, :cond_2

    .line 57
    .line 58
    new-instance v14, Lz0/e;

    .line 59
    .line 60
    new-array v15, v7, [Lj1/o;

    .line 61
    .line 62
    invoke-direct {v14, v15}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v15, v2, Li2/d1;->i:Lz0/e;

    .line 66
    .line 67
    invoke-virtual {v15, v1}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    :goto_2
    iget v1, v15, Lz0/e;->c:I

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    add-int/lit8 v1, v1, -0x1

    .line 77
    .line 78
    invoke-virtual {v15, v1}, Lz0/e;->k(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lj1/q;

    .line 83
    .line 84
    instance-of v13, v1, Lj1/j;

    .line 85
    .line 86
    if-eqz v13, :cond_3

    .line 87
    .line 88
    check-cast v1, Lj1/j;

    .line 89
    .line 90
    iget-object v13, v1, Lj1/j;->b:Lj1/q;

    .line 91
    .line 92
    invoke-virtual {v15, v13}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v1, Lj1/j;->a:Lj1/q;

    .line 96
    .line 97
    invoke-virtual {v15, v1}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    instance-of v13, v1, Lj1/o;

    .line 102
    .line 103
    if-eqz v13, :cond_4

    .line 104
    .line 105
    invoke-virtual {v14, v1}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    if-nez v16, :cond_5

    .line 110
    .line 111
    new-instance v13, Li2/e1;

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    invoke-direct {v13, v10, v14}, Li2/e1;-><init>(ILz0/e;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 v16, v13

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move-object/from16 v13, v16

    .line 121
    .line 122
    :goto_3
    invoke-interface {v1, v13}, Lj1/q;->k(Lic/k;)Z

    .line 123
    .line 124
    .line 125
    :goto_4
    const/16 v10, 0x400

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    iget v1, v14, Lz0/e;->c:I

    .line 129
    .line 130
    const-string v13, "expected prior modifier list to be non-empty"

    .line 131
    .line 132
    if-ne v1, v6, :cond_11

    .line 133
    .line 134
    iget-object v1, v12, Lj1/p;->f:Lj1/p;

    .line 135
    .line 136
    move-object v5, v2

    .line 137
    const/4 v2, 0x0

    .line 138
    :goto_5
    if-eqz v1, :cond_c

    .line 139
    .line 140
    if-ge v2, v6, :cond_c

    .line 141
    .line 142
    if-eqz v3, :cond_b

    .line 143
    .line 144
    const/16 v16, 0x2

    .line 145
    .line 146
    iget-object v10, v3, Lz0/e;->a:[Ljava/lang/Object;

    .line 147
    .line 148
    aget-object v10, v10, v2

    .line 149
    .line 150
    check-cast v10, Lj1/o;

    .line 151
    .line 152
    iget-object v7, v14, Lz0/e;->a:[Ljava/lang/Object;

    .line 153
    .line 154
    aget-object v7, v7, v2

    .line 155
    .line 156
    check-cast v7, Lj1/o;

    .line 157
    .line 158
    invoke-static {v10, v7}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v17

    .line 162
    if-eqz v17, :cond_7

    .line 163
    .line 164
    move-object/from16 v18, v3

    .line 165
    .line 166
    const/4 v3, 0x2

    .line 167
    goto :goto_6

    .line 168
    :cond_7
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    move-object/from16 v18, v3

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    if-ne v15, v3, :cond_8

    .line 179
    .line 180
    const/4 v3, 0x1

    .line 181
    goto :goto_6

    .line 182
    :cond_8
    const/4 v3, 0x0

    .line 183
    :goto_6
    if-eqz v3, :cond_a

    .line 184
    .line 185
    const/4 v15, 0x1

    .line 186
    if-eq v3, v15, :cond_9

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_9
    invoke-static {v10, v7, v1}, Li2/d1;->h(Lj1/o;Lj1/o;Lj1/p;)V

    .line 190
    .line 191
    .line 192
    :goto_7
    iget-object v1, v1, Lj1/p;->f:Lj1/p;

    .line 193
    .line 194
    add-int/lit8 v2, v2, 0x1

    .line 195
    .line 196
    move-object/from16 v3, v18

    .line 197
    .line 198
    const/16 v7, 0x10

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_a
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_b
    invoke-static {v13}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    throw v1

    .line 209
    :cond_c
    move-object/from16 v18, v3

    .line 210
    .line 211
    const/16 v16, 0x2

    .line 212
    .line 213
    :goto_8
    if-ge v2, v6, :cond_10

    .line 214
    .line 215
    if-eqz v18, :cond_f

    .line 216
    .line 217
    if-eqz v1, :cond_e

    .line 218
    .line 219
    iget-object v3, v4, Li2/j0;->L:Lj1/q;

    .line 220
    .line 221
    if-eqz v3, :cond_d

    .line 222
    .line 223
    const/16 v17, 0x1

    .line 224
    .line 225
    :goto_9
    const/4 v15, 0x1

    .line 226
    goto :goto_a

    .line 227
    :cond_d
    const/16 v17, 0x0

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :goto_a
    xor-int/lit8 v6, v17, 0x1

    .line 231
    .line 232
    move-object v3, v5

    .line 233
    move-object v5, v1

    .line 234
    move-object v1, v3

    .line 235
    move-object v4, v14

    .line 236
    move-object/from16 v3, v18

    .line 237
    .line 238
    const/4 v7, 0x0

    .line 239
    invoke-virtual/range {v1 .. v6}, Li2/d1;->f(ILz0/e;Lz0/e;Lj1/p;Z)V

    .line 240
    .line 241
    .line 242
    move-object v5, v12

    .line 243
    :goto_b
    const/4 v15, 0x1

    .line 244
    goto/16 :goto_13

    .line 245
    .line 246
    :cond_e
    const-string v1, "structuralUpdate requires a non-null tail"

    .line 247
    .line 248
    invoke-static {v1}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    throw v1

    .line 253
    :cond_f
    invoke-static {v13}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    throw v1

    .line 258
    :cond_10
    move-object v2, v5

    .line 259
    move-object/from16 v3, v18

    .line 260
    .line 261
    const/4 v7, 0x0

    .line 262
    goto :goto_10

    .line 263
    :cond_11
    const/4 v7, 0x0

    .line 264
    const/16 v16, 0x2

    .line 265
    .line 266
    iget-object v10, v4, Li2/j0;->L:Lj1/q;

    .line 267
    .line 268
    if-eqz v10, :cond_14

    .line 269
    .line 270
    if-nez v6, :cond_14

    .line 271
    .line 272
    move-object v4, v12

    .line 273
    const/4 v1, 0x0

    .line 274
    :goto_c
    iget v5, v14, Lz0/e;->c:I

    .line 275
    .line 276
    if-ge v1, v5, :cond_12

    .line 277
    .line 278
    iget-object v5, v14, Lz0/e;->a:[Ljava/lang/Object;

    .line 279
    .line 280
    aget-object v5, v5, v1

    .line 281
    .line 282
    check-cast v5, Lj1/o;

    .line 283
    .line 284
    invoke-static {v5, v4}, Li2/d1;->b(Lj1/o;Lj1/p;)Lj1/p;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    add-int/lit8 v1, v1, 0x1

    .line 289
    .line 290
    goto :goto_c

    .line 291
    :cond_12
    iget-object v1, v9, Lj1/p;->e:Lj1/p;

    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    :goto_d
    if-eqz v1, :cond_13

    .line 295
    .line 296
    if-eq v1, v12, :cond_13

    .line 297
    .line 298
    iget v5, v1, Lj1/p;->c:I

    .line 299
    .line 300
    or-int/2addr v4, v5

    .line 301
    iput v4, v1, Lj1/p;->d:I

    .line 302
    .line 303
    iget-object v1, v1, Lj1/p;->e:Lj1/p;

    .line 304
    .line 305
    goto :goto_d

    .line 306
    :cond_13
    move-object v1, v2

    .line 307
    move-object v5, v12

    .line 308
    move-object v4, v14

    .line 309
    goto :goto_b

    .line 310
    :cond_14
    if-nez v1, :cond_18

    .line 311
    .line 312
    if-eqz v3, :cond_17

    .line 313
    .line 314
    iget-object v1, v12, Lj1/p;->f:Lj1/p;

    .line 315
    .line 316
    const/4 v6, 0x0

    .line 317
    :goto_e
    if-eqz v1, :cond_15

    .line 318
    .line 319
    iget v10, v3, Lz0/e;->c:I

    .line 320
    .line 321
    if-ge v6, v10, :cond_15

    .line 322
    .line 323
    invoke-static {v1}, Li2/d1;->c(Lj1/p;)Lj1/p;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    iget-object v1, v1, Lj1/p;->f:Lj1/p;

    .line 328
    .line 329
    add-int/lit8 v6, v6, 0x1

    .line 330
    .line 331
    goto :goto_e

    .line 332
    :cond_15
    invoke-virtual {v4}, Li2/j0;->v()Li2/j0;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    if-eqz v1, :cond_16

    .line 337
    .line 338
    iget-object v1, v1, Li2/j0;->F:Li2/d1;

    .line 339
    .line 340
    iget-object v1, v1, Li2/d1;->c:Li2/u;

    .line 341
    .line 342
    goto :goto_f

    .line 343
    :cond_16
    move-object v1, v7

    .line 344
    :goto_f
    iput-object v1, v5, Li2/g1;->s:Li2/g1;

    .line 345
    .line 346
    iput-object v5, v2, Li2/d1;->d:Li2/g1;

    .line 347
    .line 348
    :goto_10
    move-object v1, v2

    .line 349
    move-object v5, v12

    .line 350
    move-object v4, v14

    .line 351
    const/4 v15, 0x0

    .line 352
    goto :goto_13

    .line 353
    :cond_17
    invoke-static {v13}, Lj2/h0;->g(Ljava/lang/String;)Lce/j0;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    throw v1

    .line 358
    :cond_18
    if-nez v3, :cond_19

    .line 359
    .line 360
    new-instance v3, Lz0/e;

    .line 361
    .line 362
    const/16 v1, 0x10

    .line 363
    .line 364
    new-array v4, v1, [Lj1/o;

    .line 365
    .line 366
    invoke-direct {v3, v4}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_19
    if-eqz v10, :cond_1a

    .line 370
    .line 371
    const/4 v15, 0x1

    .line 372
    :goto_11
    const/16 v17, 0x1

    .line 373
    .line 374
    goto :goto_12

    .line 375
    :cond_1a
    const/4 v15, 0x0

    .line 376
    goto :goto_11

    .line 377
    :goto_12
    xor-int/lit8 v6, v15, 0x1

    .line 378
    .line 379
    move-object v1, v2

    .line 380
    const/4 v2, 0x0

    .line 381
    move-object v5, v12

    .line 382
    move-object v4, v14

    .line 383
    invoke-virtual/range {v1 .. v6}, Li2/d1;->f(ILz0/e;Lz0/e;Lj1/p;Z)V

    .line 384
    .line 385
    .line 386
    goto/16 :goto_b

    .line 387
    .line 388
    :goto_13
    iput-object v4, v1, Li2/d1;->g:Lz0/e;

    .line 389
    .line 390
    if-eqz v3, :cond_1b

    .line 391
    .line 392
    invoke-virtual {v3}, Lz0/e;->g()V

    .line 393
    .line 394
    .line 395
    goto :goto_14

    .line 396
    :cond_1b
    move-object v3, v7

    .line 397
    :goto_14
    iput-object v3, v1, Li2/d1;->h:Lz0/e;

    .line 398
    .line 399
    iget-object v2, v5, Lj1/p;->f:Lj1/p;

    .line 400
    .line 401
    if-nez v2, :cond_1c

    .line 402
    .line 403
    goto :goto_15

    .line 404
    :cond_1c
    move-object v9, v2

    .line 405
    :goto_15
    iput-object v7, v9, Lj1/p;->e:Lj1/p;

    .line 406
    .line 407
    iput-object v7, v5, Lj1/p;->f:Lj1/p;

    .line 408
    .line 409
    const/4 v2, -0x1

    .line 410
    iput v2, v5, Lj1/p;->d:I

    .line 411
    .line 412
    iput-object v7, v5, Lj1/p;->h:Li2/g1;

    .line 413
    .line 414
    if-eq v9, v5, :cond_1d

    .line 415
    .line 416
    goto :goto_16

    .line 417
    :cond_1d
    const-string v2, "trimChain did not update the head"

    .line 418
    .line 419
    invoke-static {v2}, Lf2/a;->b(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    :goto_16
    iput-object v9, v1, Li2/d1;->f:Lj1/p;

    .line 423
    .line 424
    if-eqz v15, :cond_1e

    .line 425
    .line 426
    invoke-virtual {v1}, Li2/d1;->g()V

    .line 427
    .line 428
    .line 429
    :cond_1e
    const/16 v2, 0x10

    .line 430
    .line 431
    invoke-virtual {v1, v2}, Li2/d1;->d(I)Z

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    const/16 v3, 0x400

    .line 436
    .line 437
    invoke-virtual {v1, v3}, Li2/d1;->d(I)Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    iget-object v4, v0, Li2/j0;->G:Li2/n0;

    .line 442
    .line 443
    invoke-virtual {v4}, Li2/n0;->j()V

    .line 444
    .line 445
    .line 446
    iget-object v4, v0, Li2/j0;->h:Li2/j0;

    .line 447
    .line 448
    if-nez v4, :cond_1f

    .line 449
    .line 450
    const/16 v4, 0x200

    .line 451
    .line 452
    invoke-virtual {v1, v4}, Li2/d1;->d(I)Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_1f

    .line 457
    .line 458
    invoke-virtual {v0, v0}, Li2/j0;->f0(Li2/j0;)V

    .line 459
    .line 460
    .line 461
    :cond_1f
    if-ne v8, v2, :cond_20

    .line 462
    .line 463
    if-eq v11, v3, :cond_22

    .line 464
    .line 465
    :cond_20
    invoke-static {v0}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, Lj2/v;

    .line 470
    .line 471
    invoke-virtual {v1}, Lj2/v;->getRectManager()Lr2/b;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0}, Li2/j0;->I()Z

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    if-eqz v4, :cond_22

    .line 483
    .line 484
    iget-object v1, v1, Lr2/b;->a:Lah/j;

    .line 485
    .line 486
    iget v4, v0, Li2/j0;->b:I

    .line 487
    .line 488
    const v5, 0x3ffffff

    .line 489
    .line 490
    .line 491
    and-int/2addr v4, v5

    .line 492
    iget-object v6, v1, Lah/j;->c:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v6, [J

    .line 495
    .line 496
    iget v1, v1, Lah/j;->b:I

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    :goto_17
    array-length v7, v6

    .line 500
    add-int/lit8 v7, v7, -0x2

    .line 501
    .line 502
    if-ge v13, v7, :cond_22

    .line 503
    .line 504
    if-ge v13, v1, :cond_22

    .line 505
    .line 506
    add-int/lit8 v7, v13, 0x2

    .line 507
    .line 508
    aget-wide v8, v6, v7

    .line 509
    .line 510
    long-to-int v10, v8

    .line 511
    and-int/2addr v10, v5

    .line 512
    if-ne v10, v4, :cond_21

    .line 513
    .line 514
    const-wide v4, 0x3fffffffffffffffL    # 1.9999999999999998

    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    and-long/2addr v4, v8

    .line 520
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 521
    .line 522
    int-to-long v10, v3

    .line 523
    mul-long v10, v10, v8

    .line 524
    .line 525
    or-long/2addr v4, v10

    .line 526
    const-wide/high16 v8, -0x8000000000000000L

    .line 527
    .line 528
    int-to-long v1, v2

    .line 529
    mul-long v1, v1, v8

    .line 530
    .line 531
    or-long/2addr v1, v4

    .line 532
    aput-wide v1, v6, v7

    .line 533
    .line 534
    return-void

    .line 535
    :cond_21
    add-int/lit8 v13, v13, 0x3

    .line 536
    .line 537
    goto :goto_17

    .line 538
    :cond_22
    return-void
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

.method public final c0(Lx0/x;)V
    .locals 8

    .line 1
    iput-object p1, p0, Li2/j0;->B:Lx0/x;

    .line 2
    .line 3
    sget-object v0, Lj2/l1;->h:Lx0/o2;

    .line 4
    .line 5
    check-cast p1, Lf1/k;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lx0/v;->w(Lx0/j1;Lx0/m1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lf3/c;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Li2/j0;->d0(Lf3/c;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lj2/l1;->n:Lx0/o2;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lx0/v;->w(Lx0/j1;Lx0/m1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lf3/m;

    .line 26
    .line 27
    iget-object v1, p0, Li2/j0;->z:Lf3/m;

    .line 28
    .line 29
    iget-object v2, p0, Li2/j0;->F:Li2/d1;

    .line 30
    .line 31
    if-eq v1, v0, :cond_1

    .line 32
    .line 33
    iput-object v0, p0, Li2/j0;->z:Lf3/m;

    .line 34
    .line 35
    invoke-virtual {p0}, Li2/j0;->E()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Li2/j0;->C()V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p0}, Li2/j0;->D()V

    .line 48
    .line 49
    .line 50
    iget-object v0, v2, Li2/d1;->f:Lj1/p;

    .line 51
    .line 52
    :goto_0
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, Lj1/p;->u0()V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, Lj1/p;->f:Lj1/p;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    sget-object v0, Lj2/l1;->s:Lx0/o2;

    .line 61
    .line 62
    invoke-static {p1, v0}, Lx0/v;->w(Lx0/j1;Lx0/m1;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lj2/z2;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Li2/j0;->i0(Lj2/z2;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, v2, Li2/d1;->f:Lj1/p;

    .line 72
    .line 73
    iget v0, p1, Lj1/p;->d:I

    .line 74
    .line 75
    const v1, 0x8000

    .line 76
    .line 77
    .line 78
    and-int/2addr v0, v1

    .line 79
    if-eqz v0, :cond_b

    .line 80
    .line 81
    :goto_1
    if-eqz p1, :cond_b

    .line 82
    .line 83
    iget v0, p1, Lj1/p;->c:I

    .line 84
    .line 85
    and-int/2addr v0, v1

    .line 86
    if-eqz v0, :cond_a

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    move-object v2, p1

    .line 90
    move-object v3, v0

    .line 91
    :goto_2
    if-eqz v2, :cond_a

    .line 92
    .line 93
    instance-of v4, v2, Li2/l;

    .line 94
    .line 95
    const/4 v5, 0x1

    .line 96
    if-eqz v4, :cond_3

    .line 97
    .line 98
    check-cast v2, Li2/l;

    .line 99
    .line 100
    check-cast v2, Lj1/p;

    .line 101
    .line 102
    iget-object v2, v2, Lj1/p;->a:Lj1/p;

    .line 103
    .line 104
    iget-boolean v4, v2, Lj1/p;->n:Z

    .line 105
    .line 106
    if-eqz v4, :cond_2

    .line 107
    .line 108
    invoke-static {v2}, Li2/h1;->c(Lj1/p;)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_2
    iput-boolean v5, v2, Lj1/p;->j:Z

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_3
    iget v4, v2, Lj1/p;->c:I

    .line 116
    .line 117
    and-int/2addr v4, v1

    .line 118
    if-eqz v4, :cond_9

    .line 119
    .line 120
    instance-of v4, v2, Li2/n;

    .line 121
    .line 122
    if-eqz v4, :cond_9

    .line 123
    .line 124
    move-object v4, v2

    .line 125
    check-cast v4, Li2/n;

    .line 126
    .line 127
    iget-object v4, v4, Li2/n;->p:Lj1/p;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    :goto_3
    if-eqz v4, :cond_8

    .line 131
    .line 132
    iget v7, v4, Lj1/p;->c:I

    .line 133
    .line 134
    and-int/2addr v7, v1

    .line 135
    if-eqz v7, :cond_7

    .line 136
    .line 137
    add-int/lit8 v6, v6, 0x1

    .line 138
    .line 139
    if-ne v6, v5, :cond_4

    .line 140
    .line 141
    move-object v2, v4

    .line 142
    goto :goto_4

    .line 143
    :cond_4
    if-nez v3, :cond_5

    .line 144
    .line 145
    new-instance v3, Lz0/e;

    .line 146
    .line 147
    const/16 v7, 0x10

    .line 148
    .line 149
    new-array v7, v7, [Lj1/p;

    .line 150
    .line 151
    invoke-direct {v3, v7}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_5
    if-eqz v2, :cond_6

    .line 155
    .line 156
    invoke-virtual {v3, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    move-object v2, v0

    .line 160
    :cond_6
    invoke-virtual {v3, v4}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    :goto_4
    iget-object v4, v4, Lj1/p;->f:Lj1/p;

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_8
    if-ne v6, v5, :cond_9

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_9
    :goto_5
    invoke-static {v3}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    goto :goto_2

    .line 174
    :cond_a
    iget v0, p1, Lj1/p;->d:I

    .line 175
    .line 176
    and-int/2addr v0, v1

    .line 177
    if-eqz v0, :cond_b

    .line 178
    .line 179
    iget-object p1, p1, Lj1/p;->f:Lj1/p;

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_b
    return-void
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

.method public final d(Li2/p1;)V
    .locals 9

    .line 1
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Cannot attach "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " as it already is attached.  Tree: "

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Li2/j0;->g(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Li2/j0;->m:Li2/j0;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, Li2/j0;->n:Li2/p1;

    .line 42
    .line 43
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v3, "Attaching to a different owner("

    .line 53
    .line 54
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v3, ") than the parent\'s owner("

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    iget-object v3, v3, Li2/j0;->n:Li2/p1;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v3, v2

    .line 75
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v3, "). This tree: "

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Li2/j0;->g(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v3, " Parent tree: "

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Li2/j0;->m:Li2/j0;

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Li2/j0;->g(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move-object v3, v2

    .line 105
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lf2/a;->b(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v3, p0, Li2/j0;->G:Li2/n0;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    iget-object v5, v3, Li2/n0;->p:Li2/z0;

    .line 125
    .line 126
    iput-boolean v4, v5, Li2/z0;->t:Z

    .line 127
    .line 128
    iget-object v5, v3, Li2/n0;->q:Li2/v0;

    .line 129
    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    sget-object v6, Li2/s0;->a:Li2/s0;

    .line 133
    .line 134
    iput-object v6, v5, Li2/v0;->r:Li2/s0;

    .line 135
    .line 136
    :cond_5
    iget-object v5, p0, Li2/j0;->F:Li2/d1;

    .line 137
    .line 138
    iget-object v6, v5, Li2/d1;->d:Li2/g1;

    .line 139
    .line 140
    if-eqz v0, :cond_6

    .line 141
    .line 142
    iget-object v7, v0, Li2/j0;->F:Li2/d1;

    .line 143
    .line 144
    iget-object v7, v7, Li2/d1;->c:Li2/u;

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    move-object v7, v2

    .line 148
    :goto_4
    iput-object v7, v6, Li2/g1;->s:Li2/g1;

    .line 149
    .line 150
    iput-object p1, p0, Li2/j0;->n:Li2/p1;

    .line 151
    .line 152
    if-eqz v0, :cond_7

    .line 153
    .line 154
    iget v6, v0, Li2/j0;->p:I

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    const/4 v6, -0x1

    .line 158
    :goto_5
    add-int/2addr v6, v4

    .line 159
    iput v6, p0, Li2/j0;->p:I

    .line 160
    .line 161
    iget-object v6, p0, Li2/j0;->L:Lj1/q;

    .line 162
    .line 163
    if-eqz v6, :cond_8

    .line 164
    .line 165
    invoke-virtual {p0, v6}, Li2/j0;->c(Lj1/q;)V

    .line 166
    .line 167
    .line 168
    :cond_8
    iput-object v2, p0, Li2/j0;->L:Lj1/q;

    .line 169
    .line 170
    move-object v2, p1

    .line 171
    check-cast v2, Lj2/v;

    .line 172
    .line 173
    invoke-virtual {v2}, Lj2/v;->getLayoutNodes()Lo/y;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    iget v7, p0, Li2/j0;->b:I

    .line 178
    .line 179
    invoke-virtual {v6, v7, p0}, Lo/y;->h(ILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v6, p0, Li2/j0;->g:Z

    .line 183
    .line 184
    if-eqz v6, :cond_9

    .line 185
    .line 186
    invoke-virtual {p0, p0}, Li2/j0;->f0(Li2/j0;)V

    .line 187
    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_9
    iget-object v6, p0, Li2/j0;->m:Li2/j0;

    .line 191
    .line 192
    if-eqz v6, :cond_a

    .line 193
    .line 194
    iget-object v6, v6, Li2/j0;->h:Li2/j0;

    .line 195
    .line 196
    if-nez v6, :cond_b

    .line 197
    .line 198
    :cond_a
    iget-object v6, p0, Li2/j0;->h:Li2/j0;

    .line 199
    .line 200
    :cond_b
    invoke-virtual {p0, v6}, Li2/j0;->f0(Li2/j0;)V

    .line 201
    .line 202
    .line 203
    iget-object v6, p0, Li2/j0;->h:Li2/j0;

    .line 204
    .line 205
    if-nez v6, :cond_c

    .line 206
    .line 207
    const/16 v6, 0x200

    .line 208
    .line 209
    invoke-virtual {v5, v6}, Li2/d1;->d(I)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_c

    .line 214
    .line 215
    invoke-virtual {p0, p0}, Li2/j0;->f0(Li2/j0;)V

    .line 216
    .line 217
    .line 218
    :cond_c
    :goto_6
    iget-boolean v6, p0, Li2/j0;->Q:Z

    .line 219
    .line 220
    if-nez v6, :cond_d

    .line 221
    .line 222
    iget-object v6, v5, Li2/d1;->f:Lj1/p;

    .line 223
    .line 224
    :goto_7
    if-eqz v6, :cond_d

    .line 225
    .line 226
    invoke-virtual {v6}, Lj1/p;->p0()V

    .line 227
    .line 228
    .line 229
    iget-object v6, v6, Lj1/p;->f:Lj1/p;

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_d
    iget-object v6, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 233
    .line 234
    iget-object v6, v6, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v6, Lz0/e;

    .line 237
    .line 238
    iget-object v7, v6, Lz0/e;->a:[Ljava/lang/Object;

    .line 239
    .line 240
    iget v6, v6, Lz0/e;->c:I

    .line 241
    .line 242
    :goto_8
    if-ge v1, v6, :cond_e

    .line 243
    .line 244
    aget-object v8, v7, v1

    .line 245
    .line 246
    check-cast v8, Li2/j0;

    .line 247
    .line 248
    invoke-virtual {v8, p1}, Li2/j0;->d(Li2/p1;)V

    .line 249
    .line 250
    .line 251
    add-int/lit8 v1, v1, 0x1

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_e
    iget-boolean v1, p0, Li2/j0;->Q:Z

    .line 255
    .line 256
    if-nez v1, :cond_f

    .line 257
    .line 258
    invoke-virtual {v5}, Li2/d1;->e()V

    .line 259
    .line 260
    .line 261
    :cond_f
    invoke-virtual {p0}, Li2/j0;->E()V

    .line 262
    .line 263
    .line 264
    if-eqz v0, :cond_10

    .line 265
    .line 266
    invoke-virtual {v0}, Li2/j0;->E()V

    .line 267
    .line 268
    .line 269
    :cond_10
    iget-object v0, p0, Li2/j0;->M:Li3/d;

    .line 270
    .line 271
    if-eqz v0, :cond_11

    .line 272
    .line 273
    invoke-virtual {v0, p1}, Li3/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    :cond_11
    invoke-virtual {v3}, Li2/n0;->j()V

    .line 277
    .line 278
    .line 279
    iget-boolean p1, p0, Li2/j0;->Q:Z

    .line 280
    .line 281
    if-nez p1, :cond_12

    .line 282
    .line 283
    const/16 p1, 0x8

    .line 284
    .line 285
    invoke-virtual {v5, p1}, Li2/d1;->d(I)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-eqz p1, :cond_12

    .line 290
    .line 291
    invoke-virtual {p0}, Li2/j0;->G()V

    .line 292
    .line 293
    .line 294
    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Lj2/v;->e()Z

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    if-eqz p1, :cond_13

    .line 302
    .line 303
    iget-object p1, v2, Lj2/v;->F:Lk1/b;

    .line 304
    .line 305
    if-eqz p1, :cond_13

    .line 306
    .line 307
    invoke-virtual {p0}, Li2/j0;->x()Lq2/k;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-eqz v0, :cond_13

    .line 312
    .line 313
    iget-object v0, v0, Lq2/k;->a:Lo/k0;

    .line 314
    .line 315
    sget-object v1, Lq2/t;->q:Lq2/w;

    .line 316
    .line 317
    invoke-virtual {v0, v1}, Lo/k0;->b(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-ne v0, v4, :cond_13

    .line 322
    .line 323
    iget-object v0, p1, Lk1/b;->h:Lo/z;

    .line 324
    .line 325
    iget v1, p0, Li2/j0;->b:I

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Lo/z;->a(I)Z

    .line 328
    .line 329
    .line 330
    iget-object v0, p1, Lk1/b;->a:Li7/p2;

    .line 331
    .line 332
    iget-object p1, p1, Lk1/b;->c:Lj2/v;

    .line 333
    .line 334
    iget v1, p0, Li2/j0;->b:I

    .line 335
    .line 336
    invoke-virtual {v0, p1, v1, v4}, Li7/p2;->C(Landroid/view/View;IZ)V

    .line 337
    .line 338
    .line 339
    :cond_13
    return-void
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

.method public final d0(Lf3/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->y:Lf3/c;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Li2/j0;->y:Lf3/c;

    .line 10
    .line 11
    invoke-virtual {p0}, Li2/j0;->E()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Li2/j0;->C()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Li2/j0;->D()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Li2/j0;->F:Li2/d1;

    .line 27
    .line 28
    iget-object p1, p1, Li2/d1;->f:Lj1/p;

    .line 29
    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Lj1/p;->s0()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, Lj1/p;->f:Lj1/p;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
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
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 2
    .line 3
    iput-object v0, p0, Li2/j0;->D:Li2/h0;

    .line 4
    .line 5
    sget-object v0, Li2/h0;->c:Li2/h0;

    .line 6
    .line 7
    iput-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 8
    .line 9
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, v0, Lz0/e;->c:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    check-cast v3, Li2/j0;

    .line 23
    .line 24
    iget-object v4, v3, Li2/j0;->C:Li2/h0;

    .line 25
    .line 26
    sget-object v5, Li2/h0;->c:Li2/h0;

    .line 27
    .line 28
    if-eq v4, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Li2/j0;->e()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
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

.method public final e0(I)V
    .locals 2

    .line 1
    iget v0, p0, Li2/j0;->P:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, v0, Li2/j0;->P:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Li2/j0;->e0(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget v0, p0, Li2/j0;->P:I

    .line 25
    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, Li2/j0;->P:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Li2/j0;->e0(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput p1, p0, Li2/j0;->P:I

    .line 42
    .line 43
    :cond_2
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

.method public final f()V
    .locals 6

    .line 1
    iget-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 2
    .line 3
    iput-object v0, p0, Li2/j0;->D:Li2/h0;

    .line 4
    .line 5
    sget-object v0, Li2/h0;->c:Li2/h0;

    .line 6
    .line 7
    iput-object v0, p0, Li2/j0;->C:Li2/h0;

    .line 8
    .line 9
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lz0/e;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, v0, Lz0/e;->c:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    check-cast v3, Li2/j0;

    .line 23
    .line 24
    iget-object v4, v3, Li2/j0;->C:Li2/h0;

    .line 25
    .line 26
    sget-object v5, Li2/h0;->b:Li2/h0;

    .line 27
    .line 28
    if-ne v4, v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3}, Li2/j0;->f()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
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

.method public final f0(Li2/j0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li2/j0;->h:Li2/j0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Li2/j0;->h:Li2/j0;

    .line 10
    .line 11
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, Li2/n0;->q:Li2/v0;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Li2/v0;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Li2/v0;-><init>(Li2/n0;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, Li2/n0;->q:Li2/v0;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Li2/j0;->F:Li2/d1;

    .line 27
    .line 28
    iget-object v0, p1, Li2/d1;->d:Li2/g1;

    .line 29
    .line 30
    iget-object p1, p1, Li2/d1;->c:Li2/u;

    .line 31
    .line 32
    iget-object p1, p1, Li2/g1;->r:Li2/g1;

    .line 33
    .line 34
    :goto_0
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Li2/g1;->H0()V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Li2/g1;->r:Li2/g1;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    iput-object p1, v0, Li2/n0;->q:Li2/v0;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, v0, Li2/n0;->f:Z

    .line 53
    .line 54
    iput-boolean p1, v0, Li2/n0;->e:Z

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Li2/j0;->E()V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
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

.method public final g(I)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    const-string v3, "  "

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "|-"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Li2/j0;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v3, v2, Lz0/e;->a:[Ljava/lang/Object;

    .line 40
    .line 41
    iget v2, v2, Lz0/e;->c:I

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    :goto_1
    if-ge v4, v2, :cond_1

    .line 45
    .line 46
    aget-object v5, v3, v4

    .line 47
    .line 48
    check-cast v5, Li2/j0;

    .line 49
    .line 50
    add-int/lit8 v6, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Li2/j0;->g(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v0, "substring(...)"

    .line 79
    .line 80
    invoke-static {p1, v0}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_2
    return-object v0
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

.method public final g0(Lg2/v0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->w:Lg2/v0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Li2/j0;->w:Lg2/v0;

    .line 10
    .line 11
    iget-object v0, p0, Li2/j0;->x:Landroidx/media3/exoplayer/offline/u;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lx0/e1;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Li2/j0;->E()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
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

.method public final h()V
    .locals 11

    .line 1
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "Cannot detach node that is already detached!  Tree: "

    .line 10
    .line 11
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v2}, Li2/j0;->g(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lf2/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lce/j0;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    invoke-virtual {p0}, Li2/j0;->v()Li2/j0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Li2/j0;->G:Li2/n0;

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v3}, Li2/j0;->C()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Li2/j0;->E()V

    .line 52
    .line 53
    .line 54
    iget-object v3, v4, Li2/n0;->p:Li2/z0;

    .line 55
    .line 56
    sget-object v5, Li2/h0;->c:Li2/h0;

    .line 57
    .line 58
    iput-object v5, v3, Li2/z0;->l:Li2/h0;

    .line 59
    .line 60
    iget-object v3, v4, Li2/n0;->q:Li2/v0;

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iput-object v5, v3, Li2/v0;->j:Li2/h0;

    .line 65
    .line 66
    :cond_2
    iget-object v3, v4, Li2/n0;->p:Li2/z0;

    .line 67
    .line 68
    iget-object v3, v3, Li2/z0;->y:Li2/k0;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    iput-boolean v5, v3, Li2/k0;->b:Z

    .line 72
    .line 73
    iput-boolean v2, v3, Li2/k0;->c:Z

    .line 74
    .line 75
    iput-boolean v2, v3, Li2/k0;->e:Z

    .line 76
    .line 77
    iput-boolean v2, v3, Li2/k0;->d:Z

    .line 78
    .line 79
    iput-boolean v2, v3, Li2/k0;->f:Z

    .line 80
    .line 81
    iput-boolean v2, v3, Li2/k0;->g:Z

    .line 82
    .line 83
    iput-object v1, v3, Li2/k0;->h:Li2/a;

    .line 84
    .line 85
    iget-object v3, v4, Li2/n0;->q:Li2/v0;

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    iget-object v3, v3, Li2/v0;->s:Li2/k0;

    .line 90
    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    iput-boolean v5, v3, Li2/k0;->b:Z

    .line 94
    .line 95
    iput-boolean v2, v3, Li2/k0;->c:Z

    .line 96
    .line 97
    iput-boolean v2, v3, Li2/k0;->e:Z

    .line 98
    .line 99
    iput-boolean v2, v3, Li2/k0;->d:Z

    .line 100
    .line 101
    iput-boolean v2, v3, Li2/k0;->f:Z

    .line 102
    .line 103
    iput-boolean v2, v3, Li2/k0;->g:Z

    .line 104
    .line 105
    iput-object v1, v3, Li2/k0;->h:Li2/a;

    .line 106
    .line 107
    :cond_3
    iget-object v3, p0, Li2/j0;->F:Li2/d1;

    .line 108
    .line 109
    iget-object v6, v3, Li2/d1;->d:Li2/g1;

    .line 110
    .line 111
    iget-object v7, v3, Li2/d1;->e:Li2/a2;

    .line 112
    .line 113
    iget-object v8, v3, Li2/d1;->c:Li2/u;

    .line 114
    .line 115
    iget-object v8, v8, Li2/g1;->r:Li2/g1;

    .line 116
    .line 117
    :goto_0
    invoke-static {v6, v8}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-nez v9, :cond_4

    .line 122
    .line 123
    if-eqz v6, :cond_4

    .line 124
    .line 125
    invoke-virtual {v6}, Li2/g1;->e1()V

    .line 126
    .line 127
    .line 128
    iget-object v6, v6, Li2/g1;->r:Li2/g1;

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    iget-object v6, p0, Li2/j0;->N:Lc2/a0;

    .line 132
    .line 133
    if-eqz v6, :cond_5

    .line 134
    .line 135
    invoke-virtual {v6, v0}, Lc2/a0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_5
    move-object v6, v7

    .line 139
    :goto_1
    if-eqz v6, :cond_7

    .line 140
    .line 141
    iget-boolean v8, v6, Lj1/p;->n:Z

    .line 142
    .line 143
    if-eqz v8, :cond_6

    .line 144
    .line 145
    invoke-virtual {v6}, Lj1/p;->y0()V

    .line 146
    .line 147
    .line 148
    :cond_6
    iget-object v6, v6, Lj1/p;->e:Lj1/p;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    iput-boolean v5, p0, Li2/j0;->q:Z

    .line 152
    .line 153
    iget-object v6, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 154
    .line 155
    iget-object v6, v6, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v6, Lz0/e;

    .line 158
    .line 159
    iget-object v8, v6, Lz0/e;->a:[Ljava/lang/Object;

    .line 160
    .line 161
    iget v6, v6, Lz0/e;->c:I

    .line 162
    .line 163
    const/4 v9, 0x0

    .line 164
    :goto_2
    if-ge v9, v6, :cond_8

    .line 165
    .line 166
    aget-object v10, v8, v9

    .line 167
    .line 168
    check-cast v10, Li2/j0;

    .line 169
    .line 170
    invoke-virtual {v10}, Li2/j0;->h()V

    .line 171
    .line 172
    .line 173
    add-int/lit8 v9, v9, 0x1

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_8
    iput-boolean v2, p0, Li2/j0;->q:Z

    .line 177
    .line 178
    :goto_3
    if-eqz v7, :cond_a

    .line 179
    .line 180
    iget-boolean v6, v7, Lj1/p;->n:Z

    .line 181
    .line 182
    if-eqz v6, :cond_9

    .line 183
    .line 184
    invoke-virtual {v7}, Lj1/p;->q0()V

    .line 185
    .line 186
    .line 187
    :cond_9
    iget-object v7, v7, Lj1/p;->e:Lj1/p;

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_a
    check-cast v0, Lj2/v;

    .line 191
    .line 192
    invoke-virtual {v0}, Lj2/v;->getLayoutNodes()Lo/y;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    iget v7, p0, Li2/j0;->b:I

    .line 197
    .line 198
    invoke-virtual {v6, v7}, Lo/y;->g(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    iget-object v6, v0, Lj2/v;->P:Li2/x0;

    .line 202
    .line 203
    iget-object v7, v6, Li2/x0;->b:Lc7/e1;

    .line 204
    .line 205
    iget-object v8, v7, Lc7/e1;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v8, Lb0/c1;

    .line 208
    .line 209
    invoke-virtual {v8, p0}, Lb0/c1;->C(Li2/j0;)Z

    .line 210
    .line 211
    .line 212
    iget-object v8, v7, Lc7/e1;->c:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v8, Lb0/c1;

    .line 215
    .line 216
    invoke-virtual {v8, p0}, Lb0/c1;->C(Li2/j0;)Z

    .line 217
    .line 218
    .line 219
    iget-object v7, v7, Lc7/e1;->d:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v7, Lb0/c1;

    .line 222
    .line 223
    invoke-virtual {v7, p0}, Lb0/c1;->C(Li2/j0;)Z

    .line 224
    .line 225
    .line 226
    iget-object v6, v6, Li2/x0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 227
    .line 228
    iget-object v6, v6, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v6, Lz0/e;

    .line 231
    .line 232
    invoke-virtual {v6, p0}, Lz0/e;->j(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    iput-boolean v5, v0, Lj2/v;->G:Z

    .line 236
    .line 237
    invoke-virtual {v0}, Lj2/v;->getRectManager()Lr2/b;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v5, p0}, Lr2/b;->j(Li2/j0;)V

    .line 242
    .line 243
    .line 244
    invoke-static {}, Lj2/v;->e()Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-eqz v5, :cond_b

    .line 249
    .line 250
    iget-object v5, v0, Lj2/v;->F:Lk1/b;

    .line 251
    .line 252
    if-eqz v5, :cond_b

    .line 253
    .line 254
    iget-object v6, v5, Lk1/b;->h:Lo/z;

    .line 255
    .line 256
    iget v7, p0, Li2/j0;->b:I

    .line 257
    .line 258
    invoke-virtual {v6, v7}, Lo/z;->e(I)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_b

    .line 263
    .line 264
    iget-object v6, v5, Lk1/b;->a:Li7/p2;

    .line 265
    .line 266
    iget-object v5, v5, Lk1/b;->c:Lj2/v;

    .line 267
    .line 268
    iget v7, p0, Li2/j0;->b:I

    .line 269
    .line 270
    invoke-virtual {v6, v5, v7, v2}, Li7/p2;->C(Landroid/view/View;IZ)V

    .line 271
    .line 272
    .line 273
    :cond_b
    iput-object v1, p0, Li2/j0;->n:Li2/p1;

    .line 274
    .line 275
    const-wide v5, 0x7fffffff7fffffffL

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    iput-wide v5, p0, Li2/j0;->c:J

    .line 281
    .line 282
    invoke-virtual {p0, v1}, Li2/j0;->f0(Li2/j0;)V

    .line 283
    .line 284
    .line 285
    iput v2, p0, Li2/j0;->p:I

    .line 286
    .line 287
    iget-object v5, v4, Li2/n0;->p:Li2/z0;

    .line 288
    .line 289
    const v6, 0x7fffffff

    .line 290
    .line 291
    .line 292
    iput v6, v5, Li2/z0;->i:I

    .line 293
    .line 294
    iput v6, v5, Li2/z0;->h:I

    .line 295
    .line 296
    iput-boolean v2, v5, Li2/z0;->t:Z

    .line 297
    .line 298
    iget-object v4, v4, Li2/n0;->q:Li2/v0;

    .line 299
    .line 300
    if-eqz v4, :cond_c

    .line 301
    .line 302
    iput v6, v4, Li2/v0;->i:I

    .line 303
    .line 304
    iput v6, v4, Li2/v0;->h:I

    .line 305
    .line 306
    sget-object v5, Li2/s0;->c:Li2/s0;

    .line 307
    .line 308
    iput-object v5, v4, Li2/v0;->r:Li2/s0;

    .line 309
    .line 310
    :cond_c
    const/16 v4, 0x8

    .line 311
    .line 312
    invoke-virtual {v3, v4}, Li2/d1;->d(I)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-eqz v3, :cond_d

    .line 317
    .line 318
    iget-object v3, p0, Li2/j0;->s:Lq2/k;

    .line 319
    .line 320
    iput-object v1, p0, Li2/j0;->s:Lq2/k;

    .line 321
    .line 322
    iput-boolean v2, p0, Li2/j0;->r:Z

    .line 323
    .line 324
    invoke-virtual {v0}, Lj2/v;->getSemanticsOwner()Lq2/q;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1, p0, v3}, Lq2/q;->b(Li2/j0;Lq2/k;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Lj2/v;->F()V

    .line 332
    .line 333
    .line 334
    :cond_d
    return-void
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

.method public final h0(Lj1/q;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Li2/j0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Li2/j0;->K:Lj1/q;

    .line 6
    .line 7
    sget-object v1, Lj1/n;->a:Lj1/n;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    .line 13
    .line 14
    invoke-static {v0}, Lf2/a;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iget-boolean v0, p0, Li2/j0;->Q:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v0, "modifier is updated when deactivated"

    .line 22
    .line 23
    invoke-static {v0}, Lf2/a;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {p0}, Li2/j0;->I()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Li2/j0;->c(Lj1/q;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, Li2/j0;->r:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Li2/j0;->G()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void

    .line 43
    :cond_4
    iput-object p1, p0, Li2/j0;->L:Lj1/q;

    .line 44
    .line 45
    return-void
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

.method public final i(Lq1/o;Lt1/b;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 2
    .line 3
    iget-object v0, v0, Li2/d1;->d:Li2/g1;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Li2/g1;->F0(Lq1/o;Lt1/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p0, p1}, Li2/j0;->b0(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    throw p1
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

.method public final i0(Lj2/z2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Li2/j0;->A:Lj2/z2;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iput-object p1, p0, Li2/j0;->A:Lj2/z2;

    .line 10
    .line 11
    iget-object p1, p0, Li2/j0;->F:Li2/d1;

    .line 12
    .line 13
    iget-object p1, p1, Li2/d1;->f:Lj1/p;

    .line 14
    .line 15
    iget v0, p1, Lj1/p;->d:I

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    and-int/2addr v0, v1

    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    :goto_0
    if-eqz p1, :cond_8

    .line 23
    .line 24
    iget v0, p1, Lj1/p;->c:I

    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    if-eqz v0, :cond_7

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    move-object v2, p1

    .line 31
    move-object v3, v0

    .line 32
    :goto_1
    if-eqz v2, :cond_7

    .line 33
    .line 34
    instance-of v4, v2, Li2/u1;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    check-cast v2, Li2/u1;

    .line 39
    .line 40
    invoke-interface {v2}, Li2/u1;->h0()V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget v4, v2, Lj1/p;->c:I

    .line 45
    .line 46
    and-int/2addr v4, v1

    .line 47
    if-eqz v4, :cond_6

    .line 48
    .line 49
    instance-of v4, v2, Li2/n;

    .line 50
    .line 51
    if-eqz v4, :cond_6

    .line 52
    .line 53
    move-object v4, v2

    .line 54
    check-cast v4, Li2/n;

    .line 55
    .line 56
    iget-object v4, v4, Li2/n;->p:Lj1/p;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    :goto_2
    const/4 v6, 0x1

    .line 60
    if-eqz v4, :cond_5

    .line 61
    .line 62
    iget v7, v4, Lj1/p;->c:I

    .line 63
    .line 64
    and-int/2addr v7, v1

    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    if-ne v5, v6, :cond_1

    .line 70
    .line 71
    move-object v2, v4

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    if-nez v3, :cond_2

    .line 74
    .line 75
    new-instance v3, Lz0/e;

    .line 76
    .line 77
    new-array v6, v1, [Lj1/p;

    .line 78
    .line 79
    invoke-direct {v3, v6}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    if-eqz v2, :cond_3

    .line 83
    .line 84
    invoke-virtual {v3, v2}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v2, v0

    .line 88
    :cond_3
    invoke-virtual {v3, v4}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_3
    iget-object v4, v4, Lj1/p;->f:Lj1/p;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    if-ne v5, v6, :cond_6

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    :goto_4
    invoke-static {v3}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    iget v0, p1, Lj1/p;->d:I

    .line 103
    .line 104
    and-int/2addr v0, v1

    .line 105
    if-eqz v0, :cond_8

    .line 106
    .line 107
    iget-object p1, p1, Lj1/p;->f:Lj1/p;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_8
    return-void
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
.end method

.method public final j0()V
    .locals 6

    .line 1
    iget v0, p0, Li2/j0;->i:I

    .line 2
    .line 3
    if-lez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Li2/j0;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Li2/j0;->l:Z

    .line 11
    .line 12
    iget-object v1, p0, Li2/j0;->k:Lz0/e;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lz0/e;

    .line 17
    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    new-array v2, v2, [Li2/j0;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Li2/j0;->k:Lz0/e;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, Lz0/e;->g()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lz0/e;

    .line 35
    .line 36
    iget-object v3, v2, Lz0/e;->a:[Ljava/lang/Object;

    .line 37
    .line 38
    iget v2, v2, Lz0/e;->c:I

    .line 39
    .line 40
    :goto_0
    if-ge v0, v2, :cond_2

    .line 41
    .line 42
    aget-object v4, v3, v0

    .line 43
    .line 44
    check-cast v4, Li2/j0;

    .line 45
    .line 46
    iget-boolean v5, v4, Li2/j0;->a:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, Li2/j0;->z()Lz0/e;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget v5, v1, Lz0/e;->c:I

    .line 55
    .line 56
    invoke-virtual {v1, v5, v4}, Lz0/e;->d(ILz0/e;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 67
    .line 68
    iget-object v1, v0, Li2/n0;->p:Li2/z0;

    .line 69
    .line 70
    const/4 v2, 0x1

    .line 71
    iput-boolean v2, v1, Li2/z0;->A:Z

    .line 72
    .line 73
    iget-object v0, v0, Li2/n0;->q:Li2/v0;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iput-boolean v2, v0, Li2/v0;->u:Z

    .line 78
    .line 79
    :cond_3
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
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j0;->h:Li2/j0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, v2, v1}, Li2/j0;->W(Li2/j0;ZI)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0, v2, v1}, Li2/j0;->Y(Li2/j0;ZI)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 15
    .line 16
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 17
    .line 18
    iget-boolean v1, v0, Li2/z0;->j:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-wide v0, v0, Lg2/g1;->d:J

    .line 23
    .line 24
    new-instance v2, Lf3/a;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lf3/a;-><init>(J)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_1
    if-eqz v2, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-wide v1, v2, Lf3/a;->a:J

    .line 38
    .line 39
    check-cast v0, Lj2/v;

    .line 40
    .line 41
    invoke-virtual {v0, p0, v1, v2}, Lj2/v;->z(Li2/j0;J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v0, p0, Li2/j0;->n:Li2/p1;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    check-cast v0, Lj2/v;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lj2/v;->y(Z)V

    .line 53
    .line 54
    .line 55
    :cond_3
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

.method public final l()Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->q:Li2/v0;

    .line 4
    .line 5
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Li2/v0;->t:Lz0/e;

    .line 9
    .line 10
    iget-object v2, v0, Li2/v0;->f:Li2/n0;

    .line 11
    .line 12
    iget-object v3, v2, Li2/n0;->a:Li2/j0;

    .line 13
    .line 14
    invoke-virtual {v3}, Li2/j0;->n()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    iget-boolean v3, v0, Li2/v0;->u:Z

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Lz0/e;->f()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v2, v2, Li2/n0;->a:Li2/j0;

    .line 27
    .line 28
    invoke-virtual {v2}, Li2/j0;->z()Lz0/e;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget-object v4, v3, Lz0/e;->a:[Ljava/lang/Object;

    .line 33
    .line 34
    iget v3, v3, Lz0/e;->c:I

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    :goto_0
    if-ge v6, v3, :cond_2

    .line 39
    .line 40
    aget-object v7, v4, v6

    .line 41
    .line 42
    check-cast v7, Li2/j0;

    .line 43
    .line 44
    iget v8, v1, Lz0/e;->c:I

    .line 45
    .line 46
    if-gt v8, v6, :cond_1

    .line 47
    .line 48
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 49
    .line 50
    iget-object v7, v7, Li2/n0;->q:Li2/v0;

    .line 51
    .line 52
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v7}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object v7, v7, Li2/j0;->G:Li2/n0;

    .line 60
    .line 61
    iget-object v7, v7, Li2/n0;->q:Li2/v0;

    .line 62
    .line 63
    invoke-static {v7}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v8, v1, Lz0/e;->a:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v9, v8, v6

    .line 69
    .line 70
    aput-object v7, v8, v6

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v2}, Li2/j0;->n()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lz0/b;

    .line 80
    .line 81
    iget-object v2, v2, Lz0/b;->a:Lz0/e;

    .line 82
    .line 83
    iget v2, v2, Lz0/e;->c:I

    .line 84
    .line 85
    iget v3, v1, Lz0/e;->c:I

    .line 86
    .line 87
    invoke-virtual {v1, v2, v3}, Lz0/e;->l(II)V

    .line 88
    .line 89
    .line 90
    iput-boolean v5, v0, Li2/v0;->u:Z

    .line 91
    .line 92
    invoke-virtual {v1}, Lz0/e;->f()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0
    .line 97
    .line 98
.end method

.method public final m()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    invoke-virtual {v0}, Li2/z0;->l0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final n()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lz0/e;->f()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final o()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lz0/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz0/e;->f()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public final p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    iget-boolean v0, v0, Li2/z0;->w:Z

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

.method public final q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Li2/j0;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

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

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    iget-boolean v0, v0, Li2/z0;->v:Z

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

.method public final s()Li2/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    iget-object v0, v0, Li2/z0;->l:Li2/h0;

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

.method public final t()Li2/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->q:Li2/v0;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Li2/v0;->j:Li2/h0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    sget-object v0, Li2/h0;->c:Li2/h0;

    .line 14
    .line 15
    return-object v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lj2/l0;->G(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " children: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Li2/j0;->n()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lz0/b;

    .line 23
    .line 24
    iget-object v1, v1, Lz0/b;->a:Lz0/e;

    .line 25
    .line 26
    iget v1, v1, Lz0/e;->c:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " measurePolicy: "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Li2/j0;->w:Lg2/v0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, " deactivated: "

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-boolean v1, p0, Li2/j0;->Q:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
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

.method public final u()Landroidx/media3/exoplayer/offline/u;
    .locals 2

    .line 1
    iget-object v0, p0, Li2/j0;->x:Landroidx/media3/exoplayer/offline/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/media3/exoplayer/offline/u;

    .line 6
    .line 7
    iget-object v1, p0, Li2/j0;->w:Lg2/v0;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Landroidx/media3/exoplayer/offline/u;-><init>(Li2/j0;Lg2/v0;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Li2/j0;->x:Landroidx/media3/exoplayer/offline/u;

    .line 13
    .line 14
    :cond_0
    return-object v0
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

.method public final v()Li2/j0;
    .locals 3

    .line 1
    iget-object v0, p0, Li2/j0;->m:Li2/j0;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, Li2/j0;->a:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Li2/j0;->m:Li2/j0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object v0
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

.method public final w()I
    .locals 1

    .line 1
    iget-object v0, p0, Li2/j0;->G:Li2/n0;

    .line 2
    .line 3
    iget-object v0, v0, Li2/n0;->p:Li2/z0;

    .line 4
    .line 5
    iget v0, v0, Li2/z0;->i:I

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

.method public final x()Lq2/k;
    .locals 2

    .line 1
    invoke-virtual {p0}, Li2/j0;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Li2/j0;->Q:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Li2/j0;->F:Li2/d1;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Li2/d1;->d(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Li2/j0;->s:Lq2/k;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 26
    return-object v0
    .line 27
    .line 28
    .line 29
.end method

.method public final y()Lz0/e;
    .locals 5

    .line 1
    iget-boolean v0, p0, Li2/j0;->v:Z

    .line 2
    .line 3
    iget-object v1, p0, Li2/j0;->u:Lz0/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lz0/e;->g()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Li2/j0;->z()Lz0/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, Lz0/e;->c:I

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Lz0/e;->d(ILz0/e;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lz0/e;->a:[Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, v1, Lz0/e;->c:I

    .line 22
    .line 23
    sget-object v3, Li2/j0;->T:Landroidx/media3/exoplayer/offline/i;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static {v0, v3, v4, v2}, Lvb/l;->L0([Ljava/lang/Object;Ljava/util/Comparator;II)V

    .line 27
    .line 28
    .line 29
    iput-boolean v4, p0, Li2/j0;->v:Z

    .line 30
    .line 31
    :cond_0
    return-object v1
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
.end method

.method public final z()Lz0/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Li2/j0;->j0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li2/j0;->i:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Li2/j0;->j:Landroidx/media3/exoplayer/offline/u;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/media3/exoplayer/offline/u;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lz0/e;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v0, p0, Li2/j0;->k:Lz0/e;

    .line 16
    .line 17
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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
