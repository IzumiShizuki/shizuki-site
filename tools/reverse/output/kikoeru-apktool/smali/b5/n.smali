.class public final synthetic Lb5/n;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lb5/n;->a:I

    iput-object p1, p0, Lb5/n;->c:Ljava/lang/Object;

    iput p2, p0, Lb5/n;->b:I

    iput-object p3, p0, Lb5/n;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, Lb5/n;->a:I

    iput-object p1, p0, Lb5/n;->c:Ljava/lang/Object;

    iput-object p2, p0, Lb5/n;->d:Ljava/lang/Object;

    iput p3, p0, Lb5/n;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lb5/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/n;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv4/q0;

    .line 9
    .line 10
    iget-object v1, p0, Lb5/n;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/util/Pair;

    .line 13
    .line 14
    iget-object v0, v0, Lv4/q0;->b:Lv4/t0;

    .line 15
    .line 16
    iget-object v0, v0, Lv4/t0;->h:Lw4/d;

    .line 17
    .line 18
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lj5/d0;

    .line 29
    .line 30
    iget v3, p0, Lb5/n;->b:I

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1, v3}, Lw4/d;->w(ILj5/d0;I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    iget-object v0, p0, Lb5/n;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 39
    .line 40
    iget-object v1, p0, Lb5/n;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lp4/k;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lp4/m;

    .line 59
    .line 60
    iget-boolean v3, v2, Lp4/m;->d:Z

    .line 61
    .line 62
    if-nez v3, :cond_0

    .line 63
    .line 64
    const/4 v3, -0x1

    .line 65
    iget v4, p0, Lb5/n;->b:I

    .line 66
    .line 67
    if-eq v4, v3, :cond_1

    .line 68
    .line 69
    iget-object v3, v2, Lp4/m;->b:Lk5/d;

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Lk5/d;->a(I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    const/4 v3, 0x1

    .line 75
    iput-boolean v3, v2, Lp4/m;->c:Z

    .line 76
    .line 77
    iget-object v2, v2, Lp4/m;->a:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-interface {v1, v2}, Lp4/k;->a(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    return-void

    .line 84
    :pswitch_1
    iget-object v0, p0, Lb5/n;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lc0/s;

    .line 87
    .line 88
    iget-object v0, v0, Lc0/s;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lk7/c;

    .line 91
    .line 92
    iget v1, p0, Lb5/n;->b:I

    .line 93
    .line 94
    iget-object v2, p0, Lb5/n;->d:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-interface {v0, v1, v2}, Lk7/c;->f(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_2
    iget-object v0, p0, Lb5/n;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ld/m;

    .line 103
    .line 104
    iget-object v1, p0, Lb5/n;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    .line 107
    .line 108
    new-instance v2, Landroid/content/Intent;

    .line 109
    .line 110
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 114
    .line 115
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string v3, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 120
    .line 121
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget v2, p0, Lb5/n;->b:I

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-virtual {v0, v2, v3, v1}, Ld/m;->a(IILandroid/content/Intent;)Z

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_3
    iget-object v0, p0, Lb5/n;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Lb7/t0;

    .line 135
    .line 136
    iget-object v1, p0, Lb5/n;->d:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Lcb/y;

    .line 139
    .line 140
    iget v2, p0, Lb5/n;->b:I

    .line 141
    .line 142
    const-string v3, "MCImplBase"

    .line 143
    .line 144
    :try_start_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lb7/i4;

    .line 149
    .line 150
    const-string v4, "SessionResult must not be null"

    .line 151
    .line 152
    invoke-static {v1, v4}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :catch_0
    move-exception v1

    .line 157
    goto :goto_1

    .line 158
    :catch_1
    move-exception v1

    .line 159
    goto :goto_1

    .line 160
    :catch_2
    move-exception v1

    .line 161
    goto :goto_2

    .line 162
    :goto_1
    const-string v4, "Session operation failed"

    .line 163
    .line 164
    invoke-static {v3, v4, v1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    new-instance v1, Lb7/i4;

    .line 168
    .line 169
    const/4 v4, -0x1

    .line 170
    invoke-direct {v1, v4}, Lb7/i4;-><init>(I)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :goto_2
    const-string v4, "Session operation cancelled"

    .line 175
    .line 176
    invoke-static {v3, v4, v1}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Lb7/i4;

    .line 180
    .line 181
    const/4 v4, 0x1

    .line 182
    invoke-direct {v1, v4}, Lb7/i4;-><init>(I)V

    .line 183
    .line 184
    .line 185
    :goto_3
    iget-object v4, v0, Lb7/t0;->w:Lb7/t;

    .line 186
    .line 187
    if-nez v4, :cond_3

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_3
    :try_start_1
    iget-object v0, v0, Lb7/t0;->c:Lb7/i1;

    .line 191
    .line 192
    invoke-virtual {v1}, Lb7/i4;->b()Landroid/os/Bundle;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-interface {v4, v0, v2, v1}, Lb7/t;->V(Lb7/r;ILandroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_3

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :catch_3
    const-string v0, "Error in sending"

    .line 201
    .line 202
    invoke-static {v3, v0}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    :goto_4
    return-void

    .line 206
    :pswitch_4
    iget-object v0, p0, Lb5/n;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lb5/q;

    .line 209
    .line 210
    iget v1, v0, Lb5/q;->a:I

    .line 211
    .line 212
    iget-object v0, v0, Lb5/q;->b:Lj5/d0;

    .line 213
    .line 214
    iget-object v2, p0, Lb5/n;->d:Ljava/lang/Object;

    .line 215
    .line 216
    iget v3, p0, Lb5/n;->b:I

    .line 217
    .line 218
    invoke-interface {v2, v1, v0, v3}, Lb5/r;->w(ILj5/d0;I)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
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
