.class public final Lj9/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lj9/d;

.field public static final synthetic b:[Lpc/u;

.field public static c:Ljava/lang/ref/WeakReference;

.field public static d:Landroid/view/WindowManager$LayoutParams;

.field public static e:Z

.field public static final f:Lhg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ljc/o;

    .line 2
    .line 3
    const-class v1, Lj9/d;

    .line 4
    .line 5
    const-string v2, "offsetY"

    .line 6
    .line 7
    const-string v3, "getOffsetY()F"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/o;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->e(Ljc/o;)Lpc/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v3, Ljc/r;

    .line 20
    .line 21
    const-string v5, "<v#0>"

    .line 22
    .line 23
    const-string v6, "noTouchable"

    .line 24
    .line 25
    invoke-direct {v3, v1, v6, v5, v4}, Ljc/r;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljc/a0;->f(Ljc/r;)Lpc/r;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v5, Ljc/r;

    .line 33
    .line 34
    const-string v7, "<v#1>"

    .line 35
    .line 36
    invoke-direct {v5, v1, v6, v7, v4}, Ljc/r;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v5}, Ljc/a0;->f(Ljc/r;)Lpc/r;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x3

    .line 44
    new-array v2, v2, [Lpc/u;

    .line 45
    .line 46
    aput-object v0, v2, v4

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    aput-object v3, v2, v0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    aput-object v1, v2, v0

    .line 53
    .line 54
    sput-object v2, Lj9/d;->b:[Lpc/u;

    .line 55
    .line 56
    new-instance v0, Lj9/d;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, Lj9/d;->a:Lj9/d;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-static {v2}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "floatingLrcY"

    .line 79
    .line 80
    invoke-static {v1, v3, v0, v2}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sput-object v0, Lj9/d;->f:Lhg/b;

    .line 85
    .line 86
    return-void
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

.method public static b(Lcom/cnl/kikoeru/MainApplication;)V
    .locals 8

    .line 1
    const-string v0, "ctx"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lj9/d;->c(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "window"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    .line 20
    .line 21
    invoke-static {v0, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast v0, Landroid/view/WindowManager;

    .line 25
    .line 26
    sget-object v1, Lj9/d;->c:Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/view/View;

    .line 36
    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    :cond_1
    new-instance v1, Lj2/k1;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lj2/k1;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lj9/a;->a:Lf1/f;

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Lj2/k1;->setContent(Lic/n;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, Lj9/e0;

    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v3, Landroidx/lifecycle/z;

    .line 55
    .line 56
    invoke-direct {v3, p0, v2}, Landroidx/lifecycle/z;-><init>(Landroidx/lifecycle/x;Z)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lj9/e0;->a:Landroidx/lifecycle/z;

    .line 60
    .line 61
    new-instance v4, Lm4/z;

    .line 62
    .line 63
    new-instance v5, Lt9/f;

    .line 64
    .line 65
    const/4 v6, 0x5

    .line 66
    invoke-direct {v5, v6, p0}, Lt9/f;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v4, p0, v5}, Lm4/z;-><init>(Lw7/e;Lt9/f;)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Lv2/e;

    .line 73
    .line 74
    invoke-direct {v5, v4}, Lv2/e;-><init>(Lm4/z;)V

    .line 75
    .line 76
    .line 77
    iput-object v5, p0, Lj9/e0;->b:Lv2/e;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-virtual {v5, v4}, Lv2/e;->t(Landroid/os/Bundle;)V

    .line 81
    .line 82
    .line 83
    sget-object v5, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 84
    .line 85
    const-string v6, "event"

    .line 86
    .line 87
    invoke-static {v5, v6}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v5}, Landroidx/lifecycle/z;->D1(Landroidx/lifecycle/o;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v1, p0}, Landroidx/lifecycle/m0;->i(Landroid/view/View;Landroidx/lifecycle/x;)V

    .line 94
    .line 95
    .line 96
    const v3, 0x7f0700a3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v3, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Lj9/c;

    .line 103
    .line 104
    invoke-direct {p0}, Lj9/c;-><init>()V

    .line 105
    .line 106
    .line 107
    const v3, 0x7f0700a4

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lj2/t0;->m:Lub/p;

    .line 114
    .line 115
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-ne p0, v3, :cond_2

    .line 124
    .line 125
    sget-object p0, Lj2/t0;->m:Lub/p;

    .line 126
    .line 127
    invoke-virtual {p0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, Lyb/h;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    sget-object p0, Lj2/t0;->n:Lah/c;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Lyb/h;

    .line 141
    .line 142
    if-eqz p0, :cond_6

    .line 143
    .line 144
    :goto_0
    invoke-static {p0}, Lhf/a0;->b(Lyb/h;)Lnf/d;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    new-instance v5, Lx0/t1;

    .line 149
    .line 150
    invoke-direct {v5, p0}, Lx0/t1;-><init>(Lyb/h;)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lj2/l3;->a:Ljava/util/LinkedHashMap;

    .line 154
    .line 155
    const p0, 0x7f070029

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    new-instance p0, Lba/v0;

    .line 162
    .line 163
    const/4 v6, 0x6

    .line 164
    invoke-direct {p0, v6, v5, v4}, Lba/v0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 165
    .line 166
    .line 167
    const/4 v5, 0x3

    .line 168
    invoke-static {v3, v4, v4, p0, v5}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 169
    .line 170
    .line 171
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 172
    .line 173
    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    sput-object p0, Lj9/d;->c:Ljava/lang/ref/WeakReference;

    .line 177
    .line 178
    :cond_3
    new-instance p0, Landroid/view/WindowManager$LayoutParams;

    .line 179
    .line 180
    invoke-direct {p0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 181
    .line 182
    .line 183
    const/4 v3, -0x1

    .line 184
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 185
    .line 186
    const/4 v3, -0x2

    .line 187
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 188
    .line 189
    sget-object v3, Lj9/d;->a:Lj9/d;

    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    sget-object v4, Lj9/d;->b:[Lpc/u;

    .line 196
    .line 197
    aget-object v3, v4, v3

    .line 198
    .line 199
    sget-object v5, Lj9/d;->f:Lhg/b;

    .line 200
    .line 201
    invoke-virtual {v5, v3}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, Ljava/lang/Number;

    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    float-to-int v3, v3

    .line 212
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 213
    .line 214
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 215
    .line 216
    const/16 v5, 0x1a

    .line 217
    .line 218
    if-lt v3, v5, :cond_4

    .line 219
    .line 220
    const/16 v3, 0x7f6

    .line 221
    .line 222
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_4
    const/16 v3, 0x7d2

    .line 226
    .line 227
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 228
    .line 229
    :goto_1
    const v3, -0x7ffffff8

    .line 230
    .line 231
    .line 232
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 233
    .line 234
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 241
    .line 242
    invoke-static {v6}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    const-string v7, "floatingLrcTouch"

    .line 247
    .line 248
    invoke-static {v5, v7, v3, v6}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    const/4 v5, 0x2

    .line 253
    aget-object v4, v4, v5

    .line 254
    .line 255
    invoke-virtual {v3, v4}, Lhg/b;->c(Lpc/u;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_5

    .line 266
    .line 267
    iget v3, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 268
    .line 269
    or-int/lit8 v3, v3, 0x10

    .line 270
    .line 271
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 272
    .line 273
    :cond_5
    const/4 v3, -0x3

    .line 274
    iput v3, p0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 275
    .line 276
    sput-object p0, Lj9/d;->d:Landroid/view/WindowManager$LayoutParams;

    .line 277
    .line 278
    invoke-interface {v0, v1, p0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 279
    .line 280
    .line 281
    sput-boolean v2, Lj9/d;->e:Z

    .line 282
    .line 283
    return-void

    .line 284
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 285
    .line 286
    const-string v0, "no AndroidUiDispatcher for this thread"

    .line 287
    .line 288
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    throw p0
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

.method public static c(Landroid/content/Context;)Z
    .locals 5

    .line 1
    const-string v0, "ctx"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x17

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-static {p0}, Landroid/support/v4/media/c;->v(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v1, Landroid/content/Intent;

    .line 21
    .line 22
    const-string v2, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 23
    .line 24
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v4, "package:"

    .line 34
    .line 35
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const/high16 v2, 0x10000000

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    const/high16 v2, 0x20000000

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const/high16 v2, 0x10000

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return v0
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

.method public static d(Lcom/cnl/kikoeru/MainApplication;)V
    .locals 1

    .line 1
    const-string v0, "ctx"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "window"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    .line 13
    .line 14
    invoke-static {p0, v0}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/view/WindowManager;

    .line 18
    .line 19
    :try_start_0
    sget-object v0, Lj9/d;->c:Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/view/View;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    invoke-interface {p0, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    sput-boolean p0, Lj9/d;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    invoke-static {p0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 40
    .line 41
    .line 42
    return-void
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


# virtual methods
.method public final a(ILx0/o;)V
    .locals 46

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    const v2, -0x54ea1599

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1, v2}, Lx0/o;->Y(I)Lx0/o;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v5, 0x0

    .line 17
    :goto_0
    invoke-virtual {v1, v2, v5}, Lx0/o;->N(IZ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_e

    .line 22
    .line 23
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v5, Lx0/k;->a:Lx0/r0;

    .line 28
    .line 29
    if-ne v2, v5, :cond_1

    .line 30
    .line 31
    invoke-static {v1}, Lx0/v;->m(Lx0/o;)Lhf/y;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    check-cast v2, Lhf/y;

    .line 39
    .line 40
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    if-ne v6, v5, :cond_2

    .line 45
    .line 46
    const-string v6, ""

    .line 47
    .line 48
    invoke-static {v6}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v1, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    check-cast v6, Lx0/w0;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    if-nez v7, :cond_3

    .line 66
    .line 67
    if-ne v8, v5, :cond_4

    .line 68
    .line 69
    :cond_3
    new-instance v8, Landroidx/lifecycle/r;

    .line 70
    .line 71
    const/16 v7, 0x8

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    invoke-direct {v8, v2, v6, v9, v7}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v8}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    check-cast v8, Lic/n;

    .line 81
    .line 82
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 83
    .line 84
    invoke-static {v8, v2, v1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-ne v7, v5, :cond_5

    .line 92
    .line 93
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    const-string v10, "floatingLyricsTextAlignCenter"

    .line 106
    .line 107
    invoke-static {v8, v10, v7, v9}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v1, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    check-cast v7, Lhg/b;

    .line 115
    .line 116
    invoke-static {v7, v1}, Llc/b;->F(Lhg/b;Lx0/o;)Lx0/w0;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    if-ne v8, v5, :cond_6

    .line 125
    .line 126
    new-instance v8, Lba/r;

    .line 127
    .line 128
    const/4 v9, 0x3

    .line 129
    invoke-direct {v8, v7, v9}, Lba/r;-><init>(Lx0/n2;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {v8}, Lx0/v;->o(Lic/a;)Lx0/c0;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-virtual {v1, v8}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    move-object/from16 v24, v8

    .line 140
    .line 141
    check-cast v24, Lx0/n2;

    .line 142
    .line 143
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    if-ne v7, v5, :cond_7

    .line 148
    .line 149
    const/16 v7, 0x19

    .line 150
    .line 151
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 160
    .line 161
    invoke-static {v9}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    const-string v10, "floatingLyricsTextSize"

    .line 166
    .line 167
    invoke-static {v8, v10, v7, v9}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-virtual {v1, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_7
    check-cast v7, Lhg/b;

    .line 175
    .line 176
    invoke-static {v7, v1}, Llc/b;->F(Lhg/b;Lx0/o;)Lx0/w0;

    .line 177
    .line 178
    .line 179
    move-result-object v25

    .line 180
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 185
    .line 186
    const-wide v9, 0xffffffffL

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    if-ne v7, v5, :cond_8

    .line 192
    .line 193
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-static {v8}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    const-string v13, "floatLyricsTextColor"

    .line 206
    .line 207
    invoke-static {v11, v13, v7, v12}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-virtual {v1, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    check-cast v7, Lhg/b;

    .line 215
    .line 216
    invoke-static {v7, v1}, Llc/b;->F(Lhg/b;Lx0/o;)Lx0/w0;

    .line 217
    .line 218
    .line 219
    move-result-object v26

    .line 220
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    if-ne v7, v5, :cond_9

    .line 225
    .line 226
    const-wide v11, 0xff000000L

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-static {v8}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    const-string v12, "floatLyricsTextShadowColor"

    .line 244
    .line 245
    invoke-static {v11, v12, v7, v8}, Lpc/f0;->P(Lhg/a;Ljava/lang/String;Ljava/lang/Object;Lpc/v;)Lhg/b;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v1, v7}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :cond_9
    check-cast v7, Lhg/b;

    .line 253
    .line 254
    invoke-static {v7, v1}, Llc/b;->F(Lhg/b;Lx0/o;)Lx0/w0;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    sget-object v8, Lj1/n;->a:Lj1/n;

    .line 259
    .line 260
    const/high16 v11, 0x3f800000    # 1.0f

    .line 261
    .line 262
    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/c;->c(Lj1/q;F)Lj1/q;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    if-ne v11, v5, :cond_a

    .line 271
    .line 272
    sget-object v11, Lj9/b;->a:Lj9/b;

    .line 273
    .line 274
    invoke-virtual {v1, v11}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_a
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 278
    .line 279
    invoke-static {v8, v2, v11}, Lc2/e0;->a(Lj1/q;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lj1/q;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    const/4 v5, 0x5

    .line 284
    int-to-float v5, v5

    .line 285
    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/a;->j(Lj1/q;F)Lj1/q;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    sget-object v5, Lj1/c;->e:Lj1/h;

    .line 290
    .line 291
    invoke-static {v5, v3}, Ly/p;->d(Lj1/h;Z)Lg2/v0;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-static {v1}, Lx0/v;->q(Lx0/o;)I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    invoke-virtual {v1}, Lx0/o;->l()Lx0/j1;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-static {v2, v1}, Lj1/a;->c(Lj1/q;Lx0/o;)Lj1/q;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    sget-object v11, Li2/k;->g0:Li2/j;

    .line 308
    .line 309
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    sget-object v11, Li2/j;->b:Li2/i;

    .line 313
    .line 314
    invoke-virtual {v1}, Lx0/o;->a0()V

    .line 315
    .line 316
    .line 317
    iget-boolean v12, v1, Lx0/o;->S:Z

    .line 318
    .line 319
    if-eqz v12, :cond_b

    .line 320
    .line 321
    invoke-virtual {v1, v11}, Lx0/o;->k(Lic/a;)V

    .line 322
    .line 323
    .line 324
    goto :goto_1

    .line 325
    :cond_b
    invoke-virtual {v1}, Lx0/o;->k0()V

    .line 326
    .line 327
    .line 328
    :goto_1
    sget-object v11, Li2/j;->g:Li2/h;

    .line 329
    .line 330
    invoke-static {v11, v3, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 331
    .line 332
    .line 333
    sget-object v3, Li2/j;->f:Li2/h;

    .line 334
    .line 335
    invoke-static {v3, v8, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 336
    .line 337
    .line 338
    sget-object v3, Li2/j;->j:Li2/h;

    .line 339
    .line 340
    iget-boolean v8, v1, Lx0/o;->S:Z

    .line 341
    .line 342
    if-nez v8, :cond_c

    .line 343
    .line 344
    invoke-virtual {v1}, Lx0/o;->K()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    invoke-static {v8, v11}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    if-nez v8, :cond_d

    .line 357
    .line 358
    :cond_c
    invoke-static {v5, v1, v5, v3}, Lj2/h0;->s(ILx0/o;ILi2/h;)V

    .line 359
    .line 360
    .line 361
    :cond_d
    sget-object v3, Li2/j;->d:Li2/h;

    .line 362
    .line 363
    invoke-static {v3, v2, v1}, Lx0/v;->A(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 364
    .line 365
    .line 366
    invoke-interface {v6}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, Ljava/lang/String;

    .line 371
    .line 372
    invoke-interface {v7}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    check-cast v3, Ljava/lang/Number;

    .line 377
    .line 378
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 379
    .line 380
    .line 381
    move-result-wide v11

    .line 382
    invoke-static {v11, v12}, Lq1/h0;->e(J)J

    .line 383
    .line 384
    .line 385
    move-result-wide v11

    .line 386
    invoke-interface/range {v25 .. v25}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    invoke-static {v3}, Llc/b;->C(I)J

    .line 397
    .line 398
    .line 399
    move-result-wide v13

    .line 400
    invoke-interface/range {v24 .. v24}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    check-cast v3, Le3/k;

    .line 405
    .line 406
    iget v3, v3, Le3/k;->a:I

    .line 407
    .line 408
    sget-object v27, Lt2/l0;->d:Lt2/l0;

    .line 409
    .line 410
    new-instance v15, Ls1/h;

    .line 411
    .line 412
    const/16 v18, 0x0

    .line 413
    .line 414
    const/16 v20, 0x14

    .line 415
    .line 416
    const/high16 v16, 0x40a00000    # 5.0f

    .line 417
    .line 418
    const/high16 v17, 0x41200000    # 10.0f

    .line 419
    .line 420
    const/16 v19, 0x1

    .line 421
    .line 422
    invoke-direct/range {v15 .. v20}, Ls1/h;-><init>(FFIII)V

    .line 423
    .line 424
    .line 425
    new-instance v16, Lq1/k0;

    .line 426
    .line 427
    invoke-interface {v7}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Ljava/lang/Number;

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 434
    .line 435
    .line 436
    move-result-wide v7

    .line 437
    invoke-static {v7, v8}, Lq1/h0;->e(J)J

    .line 438
    .line 439
    .line 440
    move-result-wide v17

    .line 441
    const/high16 v5, 0x40a00000    # 5.0f

    .line 442
    .line 443
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    int-to-long v7, v7

    .line 448
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    int-to-long v4, v5

    .line 453
    const/16 v19, 0x20

    .line 454
    .line 455
    shl-long v7, v7, v19

    .line 456
    .line 457
    and-long/2addr v4, v9

    .line 458
    or-long v19, v7, v4

    .line 459
    .line 460
    const/high16 v21, 0x41a00000    # 20.0f

    .line 461
    .line 462
    invoke-direct/range {v16 .. v21}, Lq1/k0;-><init>(JJF)V

    .line 463
    .line 464
    .line 465
    const/16 v42, 0x0

    .line 466
    .line 467
    const v43, 0xff9fff

    .line 468
    .line 469
    .line 470
    const-wide/16 v28, 0x0

    .line 471
    .line 472
    const-wide/16 v30, 0x0

    .line 473
    .line 474
    const/16 v32, 0x0

    .line 475
    .line 476
    const/16 v33, 0x0

    .line 477
    .line 478
    const/16 v34, 0x0

    .line 479
    .line 480
    const-wide/16 v35, 0x0

    .line 481
    .line 482
    const-wide/16 v39, 0x0

    .line 483
    .line 484
    const/16 v41, 0x0

    .line 485
    .line 486
    move-object/from16 v38, v15

    .line 487
    .line 488
    move-object/from16 v37, v16

    .line 489
    .line 490
    invoke-static/range {v27 .. v43}, Lt2/l0;->a(Lt2/l0;JJLx2/k;Lx2/i;Lx2/n;JLq1/k0;Ls1/h;JLt2/w;Le3/i;I)Lt2/l0;

    .line 491
    .line 492
    .line 493
    move-result-object v19

    .line 494
    move-wide v4, v11

    .line 495
    new-instance v12, Le3/k;

    .line 496
    .line 497
    invoke-direct {v12, v3}, Le3/k;-><init>(I)V

    .line 498
    .line 499
    .line 500
    const/4 v3, 0x1

    .line 501
    const/16 v22, 0xc30

    .line 502
    .line 503
    const v23, 0xd5f2

    .line 504
    .line 505
    .line 506
    move-object v1, v2

    .line 507
    const/4 v2, 0x0

    .line 508
    const/4 v7, 0x0

    .line 509
    const/4 v8, 0x0

    .line 510
    const-wide/16 v9, 0x0

    .line 511
    .line 512
    const/4 v11, 0x0

    .line 513
    move-wide v15, v4

    .line 514
    move-object v4, v6

    .line 515
    move-wide v5, v13

    .line 516
    const-wide/16 v13, 0x0

    .line 517
    .line 518
    move-wide/from16 v44, v15

    .line 519
    .line 520
    move-object/from16 v16, v4

    .line 521
    .line 522
    move-wide/from16 v3, v44

    .line 523
    .line 524
    const/16 v17, 0x1

    .line 525
    .line 526
    const/4 v15, 0x2

    .line 527
    move-object/from16 v18, v16

    .line 528
    .line 529
    const/16 v16, 0x0

    .line 530
    .line 531
    const/16 v20, 0x1

    .line 532
    .line 533
    const/16 v17, 0x3

    .line 534
    .line 535
    move-object/from16 v21, v18

    .line 536
    .line 537
    const/16 v18, 0x0

    .line 538
    .line 539
    move-object/from16 v27, v21

    .line 540
    .line 541
    const/16 v21, 0x0

    .line 542
    .line 543
    move-object/from16 v20, p2

    .line 544
    .line 545
    const/4 v0, 0x1

    .line 546
    invoke-static/range {v1 .. v23}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 547
    .line 548
    .line 549
    invoke-interface/range {v27 .. v27}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    check-cast v1, Ljava/lang/String;

    .line 554
    .line 555
    invoke-interface/range {v26 .. v26}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    check-cast v2, Ljava/lang/Number;

    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 562
    .line 563
    .line 564
    move-result-wide v2

    .line 565
    invoke-static {v2, v3}, Lq1/h0;->e(J)J

    .line 566
    .line 567
    .line 568
    move-result-wide v3

    .line 569
    invoke-interface/range {v25 .. v25}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    check-cast v2, Ljava/lang/Number;

    .line 574
    .line 575
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    invoke-static {v2}, Llc/b;->C(I)J

    .line 580
    .line 581
    .line 582
    move-result-wide v5

    .line 583
    invoke-interface/range {v24 .. v24}, Lx0/n2;->getValue()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    check-cast v2, Le3/k;

    .line 588
    .line 589
    iget v2, v2, Le3/k;->a:I

    .line 590
    .line 591
    new-instance v12, Le3/k;

    .line 592
    .line 593
    invoke-direct {v12, v2}, Le3/k;-><init>(I)V

    .line 594
    .line 595
    .line 596
    const v23, 0x1d5f2

    .line 597
    .line 598
    .line 599
    const/4 v2, 0x0

    .line 600
    const/16 v19, 0x0

    .line 601
    .line 602
    invoke-static/range {v1 .. v23}, Lm0/z8;->b(Ljava/lang/String;Lj1/q;JJLx2/i;Lx2/k;JLe3/l;Le3/k;JIZIILt2/l0;Lx0/o;III)V

    .line 603
    .line 604
    .line 605
    move-object/from16 v1, v20

    .line 606
    .line 607
    invoke-virtual {v1, v0}, Lx0/o;->p(Z)V

    .line 608
    .line 609
    .line 610
    goto :goto_2

    .line 611
    :cond_e
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 612
    .line 613
    .line 614
    :goto_2
    invoke-virtual {v1}, Lx0/o;->r()Lx0/p1;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    if-eqz v0, :cond_f

    .line 619
    .line 620
    new-instance v1, La9/r;

    .line 621
    .line 622
    const/4 v2, 0x7

    .line 623
    move-object/from16 v3, p0

    .line 624
    .line 625
    move/from16 v4, p1

    .line 626
    .line 627
    invoke-direct {v1, v4, v2, v3}, La9/r;-><init>(IILjava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    iput-object v1, v0, Lx0/p1;->d:Lic/n;

    .line 631
    .line 632
    return-void

    .line 633
    :cond_f
    move-object/from16 v3, p0

    .line 634
    .line 635
    return-void
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
