.class public final Lc7/c0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb0/c1;Lc7/n;Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc7/c0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/c0;->e:Ljava/lang/Object;

    iput-object p2, p0, Lc7/c0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lc7/c0;->c:Ljava/lang/Object;

    iput-object p4, p0, Lc7/c0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lc7/c0;->a:I

    iput-object p1, p0, Lc7/c0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lc7/c0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lc7/c0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lc7/c0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lc7/c0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc7/c0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lc7/c0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lu3/e0;

    .line 13
    .line 14
    iget-object v2, p0, Lc7/c0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lm0/w;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lu3/z;->i(Landroid/view/View;Lu3/e0;Lm0/w;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lc7/c0;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    iget-object v0, p0, Lc7/c0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v3, v0

    .line 32
    check-cast v3, Lhf/k;

    .line 33
    .line 34
    :try_start_0
    iget-object v0, p0, Lc7/c0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lyb/h;

    .line 37
    .line 38
    sget-object v1, Lyb/d;->a:Lyb/d;

    .line 39
    .line 40
    invoke-interface {v0, v1}, Lyb/h;->L(Lyb/g;)Lyb/h;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Le/j;

    .line 45
    .line 46
    iget-object v2, p0, Lc7/c0;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ln7/v;

    .line 49
    .line 50
    iget-object v4, p0, Lc7/c0;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Llf/w0;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    const/16 v6, 0x11

    .line 56
    .line 57
    invoke-direct/range {v1 .. v6}, Le/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lhf/a0;->C(Lyb/h;Lic/n;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    invoke-virtual {v3, v0}, Lhf/k;->t(Ljava/lang/Throwable;)Z

    .line 66
    .line 67
    .line 68
    :goto_0
    return-void

    .line 69
    :pswitch_1
    iget-object v0, p0, Lc7/c0;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, p0, Lc7/c0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lc7/n;

    .line 76
    .line 77
    iget-object v1, v1, Lc7/n;->a:Landroid/os/Messenger;

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-object v2, p0, Lc7/c0;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Lb0/c1;

    .line 86
    .line 87
    iget-object v3, v2, Lb0/c1;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Lc7/f0;

    .line 90
    .line 91
    iget-object v3, v3, Lc7/f0;->e:Lo/e;

    .line 92
    .line 93
    invoke-virtual {v3, v1}, Lo/u0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lc7/s;

    .line 98
    .line 99
    const-string v3, "MBServiceCompat"

    .line 100
    .line 101
    if-nez v1, :cond_0

    .line 102
    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v2, "removeSubscription for callback that isn\'t registered id="

    .line 106
    .line 107
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_0
    iget-object v1, v1, Lc7/s;->f:Ljava/util/HashMap;

    .line 122
    .line 123
    iget-object v2, v2, Lb0/c1;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, Lc7/f0;

    .line 126
    .line 127
    iget-object v4, p0, Lc7/c0;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Landroid/os/IBinder;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    const/4 v6, 0x1

    .line 136
    const/4 v7, 0x0

    .line 137
    if-nez v4, :cond_2

    .line 138
    .line 139
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    if-eqz v1, :cond_1

    .line 144
    .line 145
    const/4 v5, 0x1

    .line 146
    :cond_1
    :goto_1
    iput-object v7, v2, Lc7/f0;->f:Lc7/s;

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    goto :goto_5

    .line 151
    :cond_2
    :try_start_2
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    check-cast v8, Ljava/util/List;

    .line 156
    .line 157
    if-eqz v8, :cond_1

    .line 158
    .line 159
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    :cond_3
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-eqz v10, :cond_4

    .line 168
    .line 169
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    check-cast v10, Lt3/b;

    .line 174
    .line 175
    iget-object v10, v10, Lt3/b;->a:Ljava/lang/Object;

    .line 176
    .line 177
    if-ne v4, v10, :cond_3

    .line 178
    .line 179
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 180
    .line 181
    .line 182
    const/4 v5, 0x1

    .line 183
    goto :goto_2

    .line 184
    :cond_4
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_1

    .line 189
    .line 190
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :goto_3
    if-nez v5, :cond_5

    .line 195
    .line 196
    new-instance v1, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v2, "removeSubscription called for "

    .line 199
    .line 200
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v0, " which is not subscribed"

    .line 207
    .line 208
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    :cond_5
    :goto_4
    return-void

    .line 219
    :goto_5
    iput-object v7, v2, Lc7/f0;->f:Lc7/s;

    .line 220
    .line 221
    throw v0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
