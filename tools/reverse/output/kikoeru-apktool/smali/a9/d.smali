.class public final synthetic La9/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La9/d;->a:I

    iput-object p2, p0, La9/d;->b:Ljava/lang/Object;

    iput-object p3, p0, La9/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput p1, p0, La9/d;->a:I

    iput-object p2, p0, La9/d;->c:Ljava/lang/Object;

    iput-object p3, p0, La9/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le7/l;Le7/j;Z)V
    .locals 0

    .line 3
    const/16 p3, 0x9

    iput p3, p0, La9/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/d;->b:Ljava/lang/Object;

    iput-object p2, p0, La9/d;->c:Ljava/lang/Object;

    return-void
.end method

.method private final f()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La9/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le7/l;

    .line 4
    .line 5
    iget-object v1, p0, La9/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Le7/j;

    .line 8
    .line 9
    iget-object v2, v0, Le7/l;->a:Lg5/w;

    .line 10
    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    iget-object v0, v0, Le7/l;->b:Llf/b1;

    .line 13
    .line 14
    invoke-virtual {v0}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    move-object v6, v5

    .line 40
    check-cast v6, Le7/j;

    .line 41
    .line 42
    invoke-static {v6, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-virtual {v0, v1, v4}, Llf/b1;->m(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit v2

    .line 63
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 64
    .line 65
    return-object v0

    .line 66
    :goto_2
    monitor-exit v2

    .line 67
    throw v0
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, La9/d;->a:I

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Luf/g;

    .line 17
    .line 18
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lxf/c;

    .line 21
    .line 22
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v4, v2, Lxf/c;->a:Lxf/j;

    .line 28
    .line 29
    invoke-static {v0, v2}, Lyf/k;->n(Luf/g;Lxf/c;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Luf/g;->p()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v4, 0x0

    .line 37
    :goto_0
    if-ge v4, v2, :cond_5

    .line 38
    .line 39
    invoke-interface {v0, v4}, Luf/g;->r(I)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/lang/Iterable;

    .line 44
    .line 45
    new-instance v6, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_1

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    instance-of v9, v8, Lxf/u;

    .line 65
    .line 66
    if-eqz v9, :cond_0

    .line 67
    .line 68
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {v6}, Lvb/m;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lxf/u;

    .line 77
    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    invoke-interface {v5}, Lxf/u;->names()[Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    array-length v6, v5

    .line 87
    const/4 v8, 0x0

    .line 88
    :goto_2
    if-ge v8, v6, :cond_4

    .line 89
    .line 90
    aget-object v9, v5, v8

    .line 91
    .line 92
    invoke-interface {v0}, Luf/g;->j()Lud/n;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    sget-object v11, Luf/j;->b:Luf/j;

    .line 97
    .line 98
    invoke-static {v10, v11}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_2

    .line 103
    .line 104
    const-string v10, "enum value"

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_2
    const-string v10, "property"

    .line 108
    .line 109
    :goto_3
    invoke-interface {v3, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    if-nez v11, :cond_3

    .line 114
    .line 115
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-interface {v3, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    add-int/lit8 v8, v8, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    new-instance v2, Lsf/l;

    .line 126
    .line 127
    new-instance v5, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v6, "The suggested name \'"

    .line 130
    .line 131
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v6, "\' for "

    .line 138
    .line 139
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v6, 0x20

    .line 146
    .line 147
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-interface {v0, v4}, Luf/g;->q(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v4, " is already one of the names for "

    .line 158
    .line 159
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-static {v9, v3}, Lvb/w;->r(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-interface {v0, v3}, Luf/g;->q(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v3, " in "

    .line 186
    .line 187
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const-string v3, "message"

    .line 198
    .line 199
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v2

    .line 206
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_5
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_6

    .line 215
    .line 216
    sget-object v3, Lvb/s;->a:Lvb/s;

    .line 217
    .line 218
    :cond_6
    return-object v3

    .line 219
    :pswitch_0
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lo/l0;

    .line 222
    .line 223
    iget-object v3, v1, La9/d;->c:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v3, Lx0/u;

    .line 226
    .line 227
    iget-object v5, v0, Lo/l0;->b:[Ljava/lang/Object;

    .line 228
    .line 229
    iget-object v0, v0, Lo/l0;->a:[J

    .line 230
    .line 231
    array-length v6, v0

    .line 232
    sub-int/2addr v6, v4

    .line 233
    if-ltz v6, :cond_a

    .line 234
    .line 235
    const/4 v4, 0x0

    .line 236
    :goto_4
    aget-wide v8, v0, v4

    .line 237
    .line 238
    not-long v10, v8

    .line 239
    shl-long/2addr v10, v2

    .line 240
    and-long/2addr v10, v8

    .line 241
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    and-long/2addr v10, v12

    .line 247
    cmp-long v14, v10, v12

    .line 248
    .line 249
    if-eqz v14, :cond_9

    .line 250
    .line 251
    sub-int v10, v4, v6

    .line 252
    .line 253
    not-int v10, v10

    .line 254
    ushr-int/lit8 v10, v10, 0x1f

    .line 255
    .line 256
    const/16 v11, 0x8

    .line 257
    .line 258
    rsub-int/lit8 v10, v10, 0x8

    .line 259
    .line 260
    const/4 v12, 0x0

    .line 261
    :goto_5
    if-ge v12, v10, :cond_8

    .line 262
    .line 263
    const-wide/16 v13, 0xff

    .line 264
    .line 265
    and-long/2addr v13, v8

    .line 266
    const-wide/16 v15, 0x80

    .line 267
    .line 268
    cmp-long v17, v13, v15

    .line 269
    .line 270
    if-gez v17, :cond_7

    .line 271
    .line 272
    shl-int/lit8 v13, v4, 0x3

    .line 273
    .line 274
    add-int/2addr v13, v12

    .line 275
    aget-object v13, v5, v13

    .line 276
    .line 277
    invoke-virtual {v3, v13}, Lx0/u;->z(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_7
    shr-long/2addr v8, v11

    .line 281
    add-int/lit8 v12, v12, 0x1

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_8
    if-ne v10, v11, :cond_a

    .line 285
    .line 286
    :cond_9
    if-eq v4, v6, :cond_a

    .line 287
    .line 288
    add-int/lit8 v4, v4, 0x1

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_a
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_1
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Lwf/y;

    .line 297
    .line 298
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v2, Ljava/lang/String;

    .line 301
    .line 302
    new-instance v3, Lwf/x;

    .line 303
    .line 304
    iget-object v0, v0, Lwf/y;->a:[Ljava/lang/Enum;

    .line 305
    .line 306
    array-length v4, v0

    .line 307
    invoke-direct {v3, v4, v2}, Lwf/x;-><init>(ILjava/lang/String;)V

    .line 308
    .line 309
    .line 310
    array-length v2, v0

    .line 311
    const/4 v4, 0x0

    .line 312
    :goto_6
    if-ge v4, v2, :cond_b

    .line 313
    .line 314
    aget-object v5, v0, v4

    .line 315
    .line 316
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    invoke-virtual {v3, v5, v7}, Lwf/b1;->b(Ljava/lang/String;Z)V

    .line 321
    .line 322
    .line 323
    add-int/lit8 v4, v4, 0x1

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_b
    return-object v3

    .line 327
    :pswitch_2
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lt9/g;

    .line 330
    .line 331
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v2, Lc9/b;

    .line 334
    .line 335
    const-string v3, "bean"

    .line 336
    .line 337
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-static {v0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    sget-object v3, Lhf/l0;->a:Lpf/e;

    .line 345
    .line 346
    sget-object v3, Lpf/d;->c:Lpf/d;

    .line 347
    .line 348
    new-instance v6, La9/k;

    .line 349
    .line 350
    const/16 v7, 0x13

    .line 351
    .line 352
    invoke-direct {v6, v7, v2, v5}, La9/k;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v3, v5, v6, v4}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 356
    .line 357
    .line 358
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 359
    .line 360
    return-object v0

    .line 361
    :pswitch_3
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Ljava/lang/String;

    .line 364
    .line 365
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, Lsf/f;

    .line 368
    .line 369
    sget-object v3, Luf/c;->c:Luf/c;

    .line 370
    .line 371
    new-array v4, v7, [Luf/g;

    .line 372
    .line 373
    new-instance v5, Lsf/e;

    .line 374
    .line 375
    invoke-direct {v5, v2, v7}, Lsf/e;-><init>(Lsf/f;I)V

    .line 376
    .line 377
    .line 378
    invoke-static {v0, v3, v4, v5}, Lud/e;->f(Ljava/lang/String;Lud/n;[Luf/g;Lic/k;)Luf/h;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    return-object v0

    .line 383
    :pswitch_4
    iget-object v0, v1, La9/d;->c:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Le7/a0;

    .line 386
    .line 387
    iget-object v2, v1, La9/d;->b:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v2, Ljava/lang/String;

    .line 390
    .line 391
    invoke-static {v0, v2}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_5
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lbg/p;

    .line 400
    .line 401
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, Lx0/w0;

    .line 404
    .line 405
    sget-object v3, Lg9/a;->a:Lef/l;

    .line 406
    .line 407
    iget-object v0, v0, Lbg/p;->a:Ljava/lang/String;

    .line 408
    .line 409
    const-string v3, "id"

    .line 410
    .line 411
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    const-string v3, "https://www.asmr-300.com/playlist?id="

    .line 415
    .line 416
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v0}, Lna/q;->f(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-interface {v2, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_6
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v0, Lna/u;

    .line 434
    .line 435
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v2, Lka/g;

    .line 438
    .line 439
    iget-object v0, v0, Lna/u;->d:Ljava/lang/String;

    .line 440
    .line 441
    invoke-static {v0}, Lna/q;->e(Ljava/lang/String;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 445
    .line 446
    .line 447
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_7
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Lbg/d;

    .line 453
    .line 454
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v2, Lx0/w0;

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-interface {v2, v0}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_8
    iget-object v0, v1, La9/d;->c:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Lm0/t2;

    .line 471
    .line 472
    iget-object v2, v1, La9/d;->b:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v2, Lhf/y;

    .line 475
    .line 476
    iget-object v3, v0, Lm0/t2;->a:Lm0/x;

    .line 477
    .line 478
    iget-object v3, v3, Lm0/x;->d:Lic/k;

    .line 479
    .line 480
    sget-object v4, Lm0/u2;->a:Lm0/u2;

    .line 481
    .line 482
    invoke-interface {v3, v4}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    check-cast v3, Ljava/lang/Boolean;

    .line 487
    .line 488
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    if-eqz v3, :cond_c

    .line 493
    .line 494
    new-instance v3, Lm0/o2;

    .line 495
    .line 496
    invoke-direct {v3, v0, v5, v6}, Lm0/o2;-><init>(Lm0/t2;Lyb/c;I)V

    .line 497
    .line 498
    .line 499
    const/4 v0, 0x3

    .line 500
    invoke-static {v2, v5, v5, v3, v0}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 501
    .line 502
    .line 503
    :cond_c
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 504
    .line 505
    return-object v0

    .line 506
    :pswitch_9
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Lfg/f;

    .line 509
    .line 510
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v2, Ljava/lang/String;

    .line 513
    .line 514
    invoke-virtual {v0, v2}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 518
    .line 519
    return-object v0

    .line 520
    :pswitch_a
    iget-object v0, v1, La9/d;->c:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, Le7/a0;

    .line 523
    .line 524
    iget-object v2, v1, La9/d;->b:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v2, Lbg/t1;

    .line 527
    .line 528
    iget-wide v2, v2, Lbg/t1;->a:J

    .line 529
    .line 530
    new-instance v4, Ljava/lang/StringBuilder;

    .line 531
    .line 532
    const-string v5, "MusicScreen/"

    .line 533
    .line 534
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-static {v0, v2}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 548
    .line 549
    return-object v0

    .line 550
    :pswitch_b
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v0, Lla/a;

    .line 553
    .line 554
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v2, Le7/a0;

    .line 557
    .line 558
    invoke-static {v2, v0}, Lla/d0;->g(Le7/a0;Lbg/t;)V

    .line 559
    .line 560
    .line 561
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 562
    .line 563
    return-object v0

    .line 564
    :pswitch_c
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, Lbg/o1;

    .line 567
    .line 568
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v2, Le7/a0;

    .line 571
    .line 572
    invoke-static {v2, v0}, Lla/d0;->g(Le7/a0;Lbg/t;)V

    .line 573
    .line 574
    .line 575
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 576
    .line 577
    return-object v0

    .line 578
    :pswitch_d
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Lbg/e1;

    .line 581
    .line 582
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v2, Le7/a0;

    .line 585
    .line 586
    invoke-static {v2, v0}, Lla/d0;->g(Le7/a0;Lbg/t;)V

    .line 587
    .line 588
    .line 589
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 590
    .line 591
    return-object v0

    .line 592
    :pswitch_e
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v0, Lka/k;

    .line 595
    .line 596
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v2, Lic/k;

    .line 599
    .line 600
    iput-boolean v6, v0, Lka/k;->l:Z

    .line 601
    .line 602
    invoke-interface {v2, v0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 606
    .line 607
    return-object v0

    .line 608
    :pswitch_f
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v0, Ljava/lang/String;

    .line 611
    .line 612
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v2, Lka/g;

    .line 615
    .line 616
    invoke-static {v0}, Lna/w;->b(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 620
    .line 621
    .line 622
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 623
    .line 624
    return-object v0

    .line 625
    :pswitch_10
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v0, Li1/c;

    .line 628
    .line 629
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 630
    .line 631
    iget-object v0, v0, Li1/c;->a:Lx0/o;

    .line 632
    .line 633
    iget-object v4, v0, Lx0/o;->c:Lx0/a2;

    .line 634
    .line 635
    sget-object v6, Lvb/r;->a:Lvb/r;

    .line 636
    .line 637
    iget-boolean v8, v0, Lx0/o;->C:Z

    .line 638
    .line 639
    if-nez v8, :cond_d

    .line 640
    .line 641
    goto/16 :goto_11

    .line 642
    .line 643
    :cond_d
    invoke-virtual {v4}, Lx0/a2;->j()Lx0/z1;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    const/4 v9, 0x0

    .line 648
    :goto_7
    :try_start_0
    iget v10, v4, Lx0/a2;->b:I

    .line 649
    .line 650
    if-ge v9, v10, :cond_17

    .line 651
    .line 652
    invoke-virtual {v8, v9}, Lx0/z1;->l(I)Z

    .line 653
    .line 654
    .line 655
    move-result v10

    .line 656
    if-eqz v10, :cond_11

    .line 657
    .line 658
    invoke-virtual {v8, v9}, Lx0/z1;->n(I)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v10

    .line 662
    if-eq v10, v2, :cond_10

    .line 663
    .line 664
    instance-of v11, v10, Lx0/v1;

    .line 665
    .line 666
    if-eqz v11, :cond_e

    .line 667
    .line 668
    check-cast v10, Lx0/v1;

    .line 669
    .line 670
    goto :goto_8

    .line 671
    :cond_e
    move-object v10, v5

    .line 672
    :goto_8
    if-eqz v10, :cond_f

    .line 673
    .line 674
    iget-object v10, v10, Lx0/v1;->a:Lx0/u1;

    .line 675
    .line 676
    goto :goto_9

    .line 677
    :cond_f
    move-object v10, v5

    .line 678
    :goto_9
    if-ne v10, v2, :cond_11

    .line 679
    .line 680
    :cond_10
    new-instance v2, Li1/h;

    .line 681
    .line 682
    invoke-direct {v2, v9, v5}, Li1/h;-><init>(ILjava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 683
    .line 684
    .line 685
    invoke-virtual {v8}, Lx0/z1;->c()V

    .line 686
    .line 687
    .line 688
    move-object v5, v2

    .line 689
    goto :goto_f

    .line 690
    :catchall_0
    move-exception v0

    .line 691
    goto/16 :goto_12

    .line 692
    .line 693
    :cond_11
    :try_start_1
    iget-object v10, v8, Lx0/z1;->b:[I

    .line 694
    .line 695
    invoke-static {v10, v9}, Lx0/c2;->c([II)I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    add-int/lit8 v12, v9, 0x1

    .line 700
    .line 701
    iget v13, v8, Lx0/z1;->c:I

    .line 702
    .line 703
    if-ge v12, v13, :cond_12

    .line 704
    .line 705
    mul-int/lit8 v13, v12, 0x5

    .line 706
    .line 707
    add-int/2addr v13, v3

    .line 708
    aget v10, v10, v13

    .line 709
    .line 710
    goto :goto_a

    .line 711
    :cond_12
    iget v10, v8, Lx0/z1;->e:I

    .line 712
    .line 713
    :goto_a
    sub-int/2addr v10, v11

    .line 714
    const/4 v11, 0x0

    .line 715
    :goto_b
    if-ge v11, v10, :cond_18

    .line 716
    .line 717
    invoke-virtual {v8, v9, v11}, Lx0/z1;->h(II)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v13

    .line 721
    if-eq v13, v2, :cond_16

    .line 722
    .line 723
    instance-of v14, v13, Lx0/v1;

    .line 724
    .line 725
    if-eqz v14, :cond_13

    .line 726
    .line 727
    check-cast v13, Lx0/v1;

    .line 728
    .line 729
    goto :goto_c

    .line 730
    :cond_13
    move-object v13, v5

    .line 731
    :goto_c
    if-eqz v13, :cond_14

    .line 732
    .line 733
    iget-object v13, v13, Lx0/v1;->a:Lx0/u1;

    .line 734
    .line 735
    goto :goto_d

    .line 736
    :cond_14
    move-object v13, v5

    .line 737
    :goto_d
    if-ne v13, v2, :cond_15

    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_15
    add-int/lit8 v11, v11, 0x1

    .line 741
    .line 742
    goto :goto_b

    .line 743
    :cond_16
    :goto_e
    new-instance v5, Li1/h;

    .line 744
    .line 745
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-direct {v5, v9, v2}, Li1/h;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 750
    .line 751
    .line 752
    :cond_17
    invoke-virtual {v8}, Lx0/z1;->c()V

    .line 753
    .line 754
    .line 755
    goto :goto_f

    .line 756
    :cond_18
    move v9, v12

    .line 757
    goto :goto_7

    .line 758
    :goto_f
    if-eqz v5, :cond_1a

    .line 759
    .line 760
    iget v2, v5, Li1/h;->a:I

    .line 761
    .line 762
    iget-object v3, v5, Li1/h;->b:Ljava/lang/Integer;

    .line 763
    .line 764
    iget-boolean v5, v0, Lx0/o;->C:Z

    .line 765
    .line 766
    if-nez v5, :cond_19

    .line 767
    .line 768
    goto :goto_10

    .line 769
    :cond_19
    invoke-virtual {v4}, Lx0/a2;->j()Lx0/z1;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    :try_start_2
    invoke-static {v4, v2, v3}, Llc/b;->Y(Lx0/z1;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 774
    .line 775
    .line 776
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 777
    invoke-virtual {v4}, Lx0/z1;->c()V

    .line 778
    .line 779
    .line 780
    :goto_10
    check-cast v6, Ljava/util/Collection;

    .line 781
    .line 782
    invoke-virtual {v0}, Lx0/o;->D()Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    check-cast v0, Ljava/lang/Iterable;

    .line 787
    .line 788
    invoke-static {v6, v0}, Lvb/m;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 789
    .line 790
    .line 791
    move-result-object v6

    .line 792
    goto :goto_11

    .line 793
    :catchall_1
    move-exception v0

    .line 794
    invoke-virtual {v4}, Lx0/z1;->c()V

    .line 795
    .line 796
    .line 797
    throw v0

    .line 798
    :cond_1a
    :goto_11
    return-object v6

    .line 799
    :goto_12
    invoke-virtual {v8}, Lx0/z1;->c()V

    .line 800
    .line 801
    .line 802
    throw v0

    .line 803
    :pswitch_11
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v0, Lf7/q;

    .line 806
    .line 807
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v2, Le7/j;

    .line 810
    .line 811
    invoke-virtual {v0, v2, v7}, Lf7/q;->e(Le7/j;Z)V

    .line 812
    .line 813
    .line 814
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 815
    .line 816
    return-object v0

    .line 817
    :pswitch_12
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v0, Lef/l;

    .line 820
    .line 821
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v2, Ljava/lang/CharSequence;

    .line 824
    .line 825
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    const-string v3, "input"

    .line 829
    .line 830
    invoke-static {v2, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    iget-object v0, v0, Lef/l;->a:Ljava/util/regex/Pattern;

    .line 834
    .line 835
    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    const-string v3, "matcher(...)"

    .line 840
    .line 841
    invoke-static {v0, v3}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-static {v0, v7, v2}, Lpc/f0;->e(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lef/j;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    return-object v0

    .line 849
    :pswitch_13
    invoke-direct {v1}, La9/d;->f()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    return-object v0

    .line 854
    :pswitch_14
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v0, Lhf/y;

    .line 857
    .line 858
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v2, Lda/m0;

    .line 861
    .line 862
    sget-object v3, Lhf/l0;->a:Lpf/e;

    .line 863
    .line 864
    sget-object v3, Lpf/d;->c:Lpf/d;

    .line 865
    .line 866
    new-instance v6, Lba/v0;

    .line 867
    .line 868
    invoke-direct {v6, v4, v2, v5}, Lba/v0;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 869
    .line 870
    .line 871
    invoke-static {v0, v3, v5, v6, v4}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 872
    .line 873
    .line 874
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 875
    .line 876
    return-object v0

    .line 877
    :pswitch_15
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Lch/p;

    .line 880
    .line 881
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v2, Ljc/y;

    .line 884
    .line 885
    iget-object v3, v0, Lch/p;->a:Lch/n;

    .line 886
    .line 887
    iget-object v2, v2, Ljc/y;->a:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v2, Lch/c0;

    .line 890
    .line 891
    invoke-virtual {v3, v0, v2}, Lch/n;->a(Lch/p;Lch/c0;)V

    .line 892
    .line 893
    .line 894
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 895
    .line 896
    return-object v0

    .line 897
    :pswitch_16
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v0, Lbd/i;

    .line 900
    .line 901
    iget-object v3, v1, La9/d;->c:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v3, Lch/c0;

    .line 904
    .line 905
    new-instance v4, Ljc/y;

    .line 906
    .line 907
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 908
    .line 909
    .line 910
    iget-object v0, v0, Lbd/i;->c:Ljava/lang/Object;

    .line 911
    .line 912
    move-object v6, v0

    .line 913
    check-cast v6, Lch/p;

    .line 914
    .line 915
    iget-object v8, v6, Lch/p;->w:Lch/y;

    .line 916
    .line 917
    monitor-enter v8

    .line 918
    :try_start_3
    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 919
    :try_start_4
    iget-object v0, v6, Lch/p;->r:Lch/c0;

    .line 920
    .line 921
    new-instance v9, Lch/c0;

    .line 922
    .line 923
    invoke-direct {v9}, Lch/c0;-><init>()V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v9, v0}, Lch/c0;->b(Lch/c0;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v9, v3}, Lch/c0;->b(Lch/c0;)V

    .line 930
    .line 931
    .line 932
    iput-object v9, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 933
    .line 934
    invoke-virtual {v9}, Lch/c0;->a()I

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    int-to-long v9, v3

    .line 939
    invoke-virtual {v0}, Lch/c0;->a()I

    .line 940
    .line 941
    .line 942
    move-result v0

    .line 943
    int-to-long v11, v0

    .line 944
    sub-long/2addr v9, v11

    .line 945
    const-wide/16 v11, 0x0

    .line 946
    .line 947
    cmp-long v3, v9, v11

    .line 948
    .line 949
    if-eqz v3, :cond_1c

    .line 950
    .line 951
    iget-object v0, v6, Lch/p;->b:Ljava/util/LinkedHashMap;

    .line 952
    .line 953
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 954
    .line 955
    .line 956
    move-result v0

    .line 957
    if-eqz v0, :cond_1b

    .line 958
    .line 959
    goto :goto_13

    .line 960
    :cond_1b
    iget-object v0, v6, Lch/p;->b:Ljava/util/LinkedHashMap;

    .line 961
    .line 962
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    new-array v5, v7, [Lch/x;

    .line 967
    .line 968
    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    move-object v5, v0

    .line 973
    check-cast v5, [Lch/x;

    .line 974
    .line 975
    goto :goto_13

    .line 976
    :catchall_2
    move-exception v0

    .line 977
    goto :goto_16

    .line 978
    :cond_1c
    :goto_13
    iget-object v0, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v0, Lch/c0;

    .line 981
    .line 982
    const-string v11, "<set-?>"

    .line 983
    .line 984
    invoke-static {v0, v11}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 985
    .line 986
    .line 987
    iput-object v0, v6, Lch/p;->r:Lch/c0;

    .line 988
    .line 989
    iget-object v0, v6, Lch/p;->j:Lyg/b;

    .line 990
    .line 991
    new-instance v11, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 994
    .line 995
    .line 996
    iget-object v12, v6, Lch/p;->c:Ljava/lang/String;

    .line 997
    .line 998
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    const-string v12, " onSettings"

    .line 1002
    .line 1003
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v11

    .line 1010
    new-instance v12, La9/d;

    .line 1011
    .line 1012
    invoke-direct {v12, v2, v6, v4}, La9/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v0, v11, v12}, Lyg/b;->c(Lyg/b;Ljava/lang/String;Lic/a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1016
    .line 1017
    .line 1018
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1019
    :try_start_6
    iget-object v0, v6, Lch/p;->w:Lch/y;

    .line 1020
    .line 1021
    iget-object v2, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v2, Lch/c0;

    .line 1024
    .line 1025
    invoke-virtual {v0, v2}, Lch/y;->b(Lch/c0;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1026
    .line 1027
    .line 1028
    goto :goto_14

    .line 1029
    :catchall_3
    move-exception v0

    .line 1030
    goto :goto_17

    .line 1031
    :catch_0
    move-exception v0

    .line 1032
    :try_start_7
    sget-object v2, Lch/b;->d:Lch/b;

    .line 1033
    .line 1034
    invoke-virtual {v6, v2, v2, v0}, Lch/p;->b(Lch/b;Lch/b;Ljava/io/IOException;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1035
    .line 1036
    .line 1037
    :goto_14
    monitor-exit v8

    .line 1038
    if-eqz v5, :cond_1e

    .line 1039
    .line 1040
    array-length v0, v5

    .line 1041
    :goto_15
    if-ge v7, v0, :cond_1e

    .line 1042
    .line 1043
    aget-object v2, v5, v7

    .line 1044
    .line 1045
    monitor-enter v2

    .line 1046
    :try_start_8
    iget-wide v11, v2, Lch/x;->e:J

    .line 1047
    .line 1048
    add-long/2addr v11, v9

    .line 1049
    iput-wide v11, v2, Lch/x;->e:J

    .line 1050
    .line 1051
    if-lez v3, :cond_1d

    .line 1052
    .line 1053
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1054
    .line 1055
    .line 1056
    :cond_1d
    monitor-exit v2

    .line 1057
    add-int/lit8 v7, v7, 0x1

    .line 1058
    .line 1059
    goto :goto_15

    .line 1060
    :catchall_4
    move-exception v0

    .line 1061
    monitor-exit v2

    .line 1062
    throw v0

    .line 1063
    :cond_1e
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1064
    .line 1065
    return-object v0

    .line 1066
    :goto_16
    :try_start_9
    monitor-exit v6

    .line 1067
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 1068
    :goto_17
    monitor-exit v8

    .line 1069
    throw v0

    .line 1070
    :pswitch_17
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 1071
    .line 1072
    move-object v2, v0

    .line 1073
    check-cast v2, Lch/p;

    .line 1074
    .line 1075
    iget-object v0, v1, La9/d;->c:Ljava/lang/Object;

    .line 1076
    .line 1077
    move-object v4, v0

    .line 1078
    check-cast v4, Lch/x;

    .line 1079
    .line 1080
    :try_start_a
    iget-object v0, v2, Lch/p;->a:Lch/n;

    .line 1081
    .line 1082
    invoke-virtual {v0, v4}, Lch/n;->b(Lch/x;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1

    .line 1083
    .line 1084
    .line 1085
    goto :goto_18

    .line 1086
    :catch_1
    move-exception v0

    .line 1087
    sget-object v5, Lfh/e;->a:Lfh/e;

    .line 1088
    .line 1089
    sget-object v5, Lfh/e;->a:Lfh/e;

    .line 1090
    .line 1091
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    const-string v7, "Http2Connection.Listener failure for "

    .line 1094
    .line 1095
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    iget-object v2, v2, Lch/p;->c:Ljava/lang/String;

    .line 1099
    .line 1100
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    invoke-virtual {v5, v2, v3, v0}, Lfh/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 1108
    .line 1109
    .line 1110
    :try_start_b
    sget-object v2, Lch/b;->d:Lch/b;

    .line 1111
    .line 1112
    invoke-virtual {v4, v2, v0}, Lch/x;->c(Lch/b;Ljava/io/IOException;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2

    .line 1113
    .line 1114
    .line 1115
    :catch_2
    :goto_18
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1116
    .line 1117
    return-object v0

    .line 1118
    :pswitch_18
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, Lx0/w0;

    .line 1121
    .line 1122
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v2, Ljava/lang/String;

    .line 1125
    .line 1126
    new-instance v4, Ly2/y;

    .line 1127
    .line 1128
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1129
    .line 1130
    .line 1131
    move-result v5

    .line 1132
    invoke-static {v5, v5}, Lt2/c0;->b(II)J

    .line 1133
    .line 1134
    .line 1135
    move-result-wide v5

    .line 1136
    invoke-direct {v4, v5, v6, v2, v3}, Ly2/y;-><init>(JLjava/lang/String;I)V

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v0, v4}, Lx0/w0;->setValue(Ljava/lang/Object;)V

    .line 1140
    .line 1141
    .line 1142
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1143
    .line 1144
    return-object v0

    .line 1145
    :pswitch_19
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v0, Lic/k;

    .line 1148
    .line 1149
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v2, Ljava/lang/String;

    .line 1152
    .line 1153
    invoke-interface {v0, v2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1157
    .line 1158
    return-object v0

    .line 1159
    :pswitch_1a
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 1160
    .line 1161
    check-cast v0, Lbg/e2;

    .line 1162
    .line 1163
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 1164
    .line 1165
    check-cast v2, Lic/a;

    .line 1166
    .line 1167
    sget-object v3, Lba/b0;->a:Lfg/f;

    .line 1168
    .line 1169
    const-string v3, "<set-?>"

    .line 1170
    .line 1171
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    sget-object v3, Lba/b0;->a:Lfg/f;

    .line 1175
    .line 1176
    invoke-virtual {v3, v0}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1183
    .line 1184
    return-object v0

    .line 1185
    :pswitch_1b
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v0, Lbg/u;

    .line 1188
    .line 1189
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 1190
    .line 1191
    check-cast v2, Lic/a;

    .line 1192
    .line 1193
    sget-object v3, Lba/b0;->a:Lfg/f;

    .line 1194
    .line 1195
    const-string v3, "<set-?>"

    .line 1196
    .line 1197
    invoke-static {v0, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    sget-object v3, Lba/b0;->b:Lfg/f;

    .line 1201
    .line 1202
    invoke-virtual {v3, v0}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 1203
    .line 1204
    .line 1205
    invoke-interface {v2}, Lic/a;->b()Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :pswitch_1c
    iget-object v0, v1, La9/d;->b:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v0, Lhf/y;

    .line 1214
    .line 1215
    iget-object v2, v1, La9/d;->c:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v2, Le7/a0;

    .line 1218
    .line 1219
    sget-object v3, Lhf/l0;->a:Lpf/e;

    .line 1220
    .line 1221
    sget-object v3, Lnf/n;->a:Ljf/d;

    .line 1222
    .line 1223
    new-instance v6, La9/e;

    .line 1224
    .line 1225
    invoke-direct {v6, v2, v5, v7}, La9/e;-><init>(Le7/a0;Lyb/c;I)V

    .line 1226
    .line 1227
    .line 1228
    invoke-static {v0, v3, v5, v6, v4}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 1229
    .line 1230
    .line 1231
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 1232
    .line 1233
    return-object v0

    .line 1234
    nop

    .line 1235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
