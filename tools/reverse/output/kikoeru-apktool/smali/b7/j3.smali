.class public final synthetic Lb7/j3;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lp4/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb7/t1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lb7/t1;II)V
    .locals 0

    .line 1
    iput p3, p0, Lb7/j3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lb7/j3;->b:Lb7/t1;

    .line 4
    .line 5
    iput p2, p0, Lb7/j3;->c:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lb7/j3;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, -0x1

    .line 7
    const-string v4, "MediaSessionStub"

    .line 8
    .line 9
    iget v5, v1, Lb7/j3;->c:I

    .line 10
    .line 11
    iget-object v6, v1, Lb7/j3;->b:Lb7/t1;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Lcb/y;

    .line 19
    .line 20
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lb7/i4;

    .line 25
    .line 26
    const-string v7, "SessionResult must not be null"

    .line 27
    .line 28
    invoke-static {v0, v7}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :catch_0
    move-exception v0

    .line 33
    goto :goto_0

    .line 34
    :catch_1
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_2
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :goto_0
    const-string v2, "Session operation failed"

    .line 39
    .line 40
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lb7/i4;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    instance-of v0, v0, Ljava/lang/UnsupportedOperationException;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    const/4 v3, -0x6

    .line 54
    :cond_0
    invoke-direct {v2, v3}, Lb7/i4;-><init>(I)V

    .line 55
    .line 56
    .line 57
    move-object v0, v2

    .line 58
    goto :goto_2

    .line 59
    :goto_1
    const-string v3, "Session operation cancelled"

    .line 60
    .line 61
    invoke-static {v4, v3, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lb7/i4;

    .line 65
    .line 66
    invoke-direct {v0, v2}, Lb7/i4;-><init>(I)V

    .line 67
    .line 68
    .line 69
    :goto_2
    invoke-static {v6, v5, v0}, Lb7/q3;->H0(Lb7/t1;ILb7/i4;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_0
    const-string v7, "no error message provided"

    .line 74
    .line 75
    move-object/from16 v0, p1

    .line 76
    .line 77
    check-cast v0, Lcb/y;

    .line 78
    .line 79
    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Lb7/y;

    .line 84
    .line 85
    const-string v8, "LibraryResult must not be null"

    .line 86
    .line 87
    invoke-static {v0, v8}, Lp4/c;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3

    .line 88
    .line 89
    .line 90
    goto :goto_6

    .line 91
    :catch_3
    move-exception v0

    .line 92
    goto :goto_3

    .line 93
    :catch_4
    move-exception v0

    .line 94
    goto :goto_3

    .line 95
    :catch_5
    move-exception v0

    .line 96
    goto :goto_5

    .line 97
    :goto_3
    const-string v2, "Library operation failed"

    .line 98
    .line 99
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lb7/y;->g:Ljava/lang/String;

    .line 103
    .line 104
    new-instance v13, Lb7/g4;

    .line 105
    .line 106
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 107
    .line 108
    invoke-direct {v13, v7, v3, v0}, Lb7/g4;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 109
    .line 110
    .line 111
    new-instance v8, Lb7/y;

    .line 112
    .line 113
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v10

    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x4

    .line 119
    iget v9, v13, Lb7/g4;->a:I

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    invoke-direct/range {v8 .. v15}, Lb7/y;-><init>(IJLb7/j1;Lb7/g4;Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    :goto_4
    move-object v0, v8

    .line 126
    goto :goto_6

    .line 127
    :goto_5
    const-string v3, "Library operation cancelled"

    .line 128
    .line 129
    invoke-static {v4, v3, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lb7/y;->g:Ljava/lang/String;

    .line 133
    .line 134
    new-instance v13, Lb7/g4;

    .line 135
    .line 136
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 137
    .line 138
    invoke-direct {v13, v7, v2, v0}, Lb7/g4;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 139
    .line 140
    .line 141
    new-instance v8, Lb7/y;

    .line 142
    .line 143
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 144
    .line 145
    .line 146
    move-result-wide v10

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x4

    .line 149
    iget v9, v13, Lb7/g4;->a:I

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    invoke-direct/range {v8 .. v15}, Lb7/y;-><init>(IJLb7/j1;Lb7/g4;Ljava/lang/Object;I)V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :goto_6
    :try_start_2
    iget-object v2, v6, Lb7/t1;->d:Lb7/s1;

    .line 157
    .line 158
    invoke-static {v2}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v2, v5, v0}, Lb7/s1;->e(ILb7/y;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_6

    .line 162
    .line 163
    .line 164
    goto :goto_7

    .line 165
    :catch_6
    move-exception v0

    .line 166
    new-instance v2, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v3, "Failed to send result to browser "

    .line 169
    .line 170
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-static {v4, v2, v0}, Lp4/c;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    :goto_7
    return-void

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
