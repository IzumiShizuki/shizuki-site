.class public final synthetic Lt9/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt9/f;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lt9/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lx0/t1;

    .line 9
    .line 10
    iget-object v1, v0, Lx0/t1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    invoke-virtual {v0}, Lx0/t1;->y()Lhf/j;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v0, Lx0/t1;->t:Llf/b1;

    .line 18
    .line 19
    invoke-virtual {v3}, Llf/b1;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lx0/q1;

    .line 24
    .line 25
    sget-object v4, Lx0/q1;->b:Lx0/q1;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 28
    .line 29
    .line 30
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-lez v3, :cond_1

    .line 32
    .line 33
    monitor-exit v1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 37
    .line 38
    check-cast v2, Lhf/k;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Lhf/k;->h(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    :try_start_1
    const-string v2, "Recomposer shutdown; frame clock awaiter will never resume"

    .line 47
    .line 48
    iget-object v0, v0, Lx0/t1;->d:Ljava/lang/Throwable;

    .line 49
    .line 50
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 51
    .line 52
    invoke-direct {v3, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    monitor-exit v1

    .line 61
    throw v0

    .line 62
    :pswitch_0
    const-string v0, "kotlin.Unit"

    .line 63
    .line 64
    iget-object v1, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, Lbg/k;

    .line 67
    .line 68
    sget-object v2, Luf/k;->e:Luf/k;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    new-array v3, v3, [Luf/g;

    .line 72
    .line 73
    new-instance v4, Le7/y;

    .line 74
    .line 75
    const/16 v5, 0x12

    .line 76
    .line 77
    invoke-direct {v4, v5, v1}, Le7/y;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v2, v3, v4}, Lud/e;->f(Ljava/lang/String;Lud/n;[Luf/g;Lic/k;)Luf/h;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    :pswitch_1
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lw7/e;

    .line 88
    .line 89
    invoke-interface {v0}, Landroidx/lifecycle/x;->f()Landroidx/lifecycle/q;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, Lw7/b;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-direct {v2, v0, v3}, Lw7/b;-><init>(Lw7/e;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2}, Landroidx/lifecycle/q;->W0(Landroidx/lifecycle/w;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_2
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Ljava/lang/Iterable;

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0

    .line 114
    :pswitch_3
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v0}, Ljc/k;->a([Ljava/lang/Object;)Ljc/b;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :pswitch_4
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Luf/h;

    .line 126
    .line 127
    iget-object v1, v0, Luf/h;->k:[Luf/g;

    .line 128
    .line 129
    invoke-static {v0, v1}, Lwf/z0;->e(Luf/g;[Luf/g;)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :pswitch_5
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lfg/f;

    .line 141
    .line 142
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    new-instance v2, Ljava/util/ArrayList;

    .line 147
    .line 148
    array-length v3, v1

    .line 149
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    array-length v3, v1

    .line 153
    const/4 v4, 0x0

    .line 154
    :goto_0
    if-ge v4, v3, :cond_2

    .line 155
    .line 156
    aget-object v5, v1, v4

    .line 157
    .line 158
    iget-boolean v6, v5, Lu9/i;->a:Z

    .line 159
    .line 160
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    new-instance v7, Lub/k;

    .line 165
    .line 166
    invoke-direct {v7, v5, v6}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    add-int/lit8 v4, v4, 0x1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_2
    sget-object v1, Lna/w;->a:Lxf/r;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v3, Lwf/d;

    .line 181
    .line 182
    new-instance v4, Lwf/s0;

    .line 183
    .line 184
    new-instance v5, Lwf/y;

    .line 185
    .line 186
    const-string v6, "com.cnl.kikoeru.ui.screen.main.others.card.CardTags"

    .line 187
    .line 188
    invoke-static {}, Lu9/i;->values()[Lu9/i;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-direct {v5, v6, v7}, Lwf/y;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 193
    .line 194
    .line 195
    sget-object v6, Lwf/g;->a:Lwf/g;

    .line 196
    .line 197
    const/4 v7, 0x1

    .line 198
    invoke-direct {v4, v5, v6, v7}, Lwf/s0;-><init>(Lsf/a;Lsf/a;I)V

    .line 199
    .line 200
    .line 201
    const/4 v5, 0x0

    .line 202
    invoke-direct {v3, v4, v5}, Lwf/d;-><init>(Lsf/a;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v3, v2}, Lxf/c;->b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0, v1}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_6
    iget-object v0, p0, Lt9/f;->b:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lt9/a;

    .line 218
    .line 219
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v1}, Lcom/cnl/kikoeru/data/db/AppDatabase;->r()Ld9/j;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    const-string v1, "type"

    .line 235
    .line 236
    invoke-static {v0, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    const-string v1, "SELECT * FROM BlacklistBean WHERE type=(?)"

    .line 240
    .line 241
    new-instance v3, Ln7/w;

    .line 242
    .line 243
    new-instance v2, La9/j;

    .line 244
    .line 245
    const/4 v5, 0x1

    .line 246
    invoke-direct {v2, v5, v0}, La9/j;-><init>(ILjava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-direct {v3, v1, v2}, Ln7/w;-><init>(Ljava/lang/String;Lic/k;)V

    .line 250
    .line 251
    .line 252
    iget-object v5, v4, Ld9/j;->a:Ln7/v;

    .line 253
    .line 254
    const-string v0, "BlacklistBean"

    .line 255
    .line 256
    filled-new-array {v0}, [Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    new-instance v2, Ld9/f;

    .line 261
    .line 262
    const/4 v7, 0x1

    .line 263
    invoke-direct/range {v2 .. v7}, Ld9/f;-><init>(Ln7/w;Ljava/lang/Object;Ln7/v;[Ljava/lang/String;I)V

    .line 264
    .line 265
    .line 266
    return-object v2

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
