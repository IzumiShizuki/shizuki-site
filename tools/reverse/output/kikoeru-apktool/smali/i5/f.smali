.class public final Li5/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/media3/exoplayer/offline/g;Li5/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li5/f;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Li5/f;->c:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, Li5/f;->d:Ljava/lang/Object;

    .line 12
    iput-object p3, p0, Li5/f;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, Lp4/c0;->o(Landroidx/media3/exoplayer/offline/f;)Landroid/os/Handler;

    move-result-object p1

    .line 14
    iput-object p1, p0, Li5/f;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvd/a;Lyd/e;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li5/f;->a:I

    const-string v0, "kind"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li5/f;->c:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Li5/f;->d:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Li5/f;->e:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Li5/f;->f:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Li5/f;->g:Ljava/lang/Object;

    .line 7
    iput-object p6, p0, Li5/f;->h:Ljava/lang/Object;

    .line 8
    iput p7, p0, Li5/f;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Li5/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li5/c;

    .line 4
    .line 5
    iget-object v1, p0, Li5/f;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Li5/c;->a(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Li5/f;->b:I

    .line 14
    .line 15
    if-eq v1, v0, :cond_0

    .line 16
    .line 17
    iput v0, p0, Li5/f;->b:I

    .line 18
    .line 19
    iget-object v1, p0, Li5/f;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Landroidx/media3/exoplayer/offline/g;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/media3/exoplayer/offline/g;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Landroidx/media3/exoplayer/offline/m;

    .line 26
    .line 27
    invoke-virtual {v1, p0, v0}, Landroidx/media3/exoplayer/offline/m;->d(Li5/f;I)V

    .line 28
    .line 29
    .line 30
    :cond_0
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

.method public b()I
    .locals 5

    .line 1
    iget-object v0, p0, Li5/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li5/c;

    .line 4
    .line 5
    iget-object v1, p0, Li5/f;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Li5/c;->a(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iput v2, p0, Li5/f;->b:I

    .line 14
    .line 15
    new-instance v2, Landroid/content/IntentFilter;

    .line 16
    .line 17
    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v0, v0, Li5/c;->a:I

    .line 21
    .line 22
    and-int/lit8 v3, v0, 0x1

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    sget v3, Lp4/c0;->a:I

    .line 27
    .line 28
    const/16 v4, 0x18

    .line 29
    .line 30
    if-lt v3, v4, :cond_0

    .line 31
    .line 32
    const-string v3, "connectivity"

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/net/ConnectivityManager;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v4, Li5/e;

    .line 44
    .line 45
    invoke-direct {v4, p0}, Li5/e;-><init>(Li5/f;)V

    .line 46
    .line 47
    .line 48
    iput-object v4, p0, Li5/f;->h:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v3, v4}, La3/a;->q(Landroid/net/ConnectivityManager;Li5/e;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    and-int/lit8 v3, v0, 0x8

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    const-string v3, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v3, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    and-int/lit8 v3, v0, 0x4

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    sget v3, Lp4/c0;->a:I

    .line 78
    .line 79
    const/16 v4, 0x17

    .line 80
    .line 81
    if-lt v3, v4, :cond_3

    .line 82
    .line 83
    const-string v3, "android.os.action.DEVICE_IDLE_MODE_CHANGED"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-string v3, "android.intent.action.SCREEN_ON"

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v3, "android.intent.action.SCREEN_OFF"

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_1
    and-int/lit8 v0, v0, 0x10

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    const-string v0, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v0, "android.intent.action.DEVICE_STORAGE_OK"

    .line 109
    .line 110
    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    new-instance v0, Lb7/m2;

    .line 114
    .line 115
    const/4 v3, 0x1

    .line 116
    invoke-direct {v0, v3, p0}, Lb7/m2;-><init>(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Li5/f;->g:Ljava/lang/Object;

    .line 120
    .line 121
    iget-object v3, p0, Li5/f;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, Landroid/os/Handler;

    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-virtual {v1, v0, v2, v4, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 127
    .line 128
    .line 129
    iget v0, p0, Li5/f;->b:I

    .line 130
    .line 131
    return v0
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Li5/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Li5/f;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lvd/a;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " version="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Li5/f;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lyd/e;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
