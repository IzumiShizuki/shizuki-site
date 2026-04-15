.class public final synthetic Ld9/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld9/g;

.field public final synthetic c:Lc9/a;


# direct methods
.method public synthetic constructor <init>(Ld9/g;Lc9/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld9/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld9/a;->b:Ld9/g;

    .line 4
    .line 5
    iput-object p2, p0, Ld9/a;->c:Lc9/a;

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ld9/a;->a:I

    .line 2
    .line 3
    check-cast p1, Lz7/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "_connection"

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ld9/a;->b:Ld9/g;

    .line 14
    .line 15
    iget-object v0, v0, Ld9/g;->d:Ld9/d;

    .line 16
    .line 17
    iget-object v1, p0, Ld9/a;->c:Lc9/a;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ln7/d;->u(Lz7/a;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_0
    const-string v0, "_connection"

    .line 26
    .line 27
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ld9/a;->b:Ld9/g;

    .line 31
    .line 32
    iget-object v0, v0, Ld9/g;->b:Ld9/c;

    .line 33
    .line 34
    iget-object v1, p0, Ld9/a;->c:Lc9/a;

    .line 35
    .line 36
    invoke-virtual {v0, p1, v1}, Ln7/e;->w(Lz7/a;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    const-string v0, "<unused var>"

    .line 41
    .line 42
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Ld9/a;->c:Lc9/a;

    .line 46
    .line 47
    iget-object v2, p1, Lc9/a;->b:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p1, Lc9/a;->c:Ljava/lang/String;

    .line 50
    .line 51
    const-string v0, "server"

    .line 52
    .line 53
    invoke-static {v2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "username"

    .line 57
    .line 58
    invoke-static {v3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v8, p0, Ld9/a;->b:Ld9/g;

    .line 62
    .line 63
    iget-object v9, v8, Ld9/g;->a:Ln7/v;

    .line 64
    .line 65
    new-instance v0, Ld9/b;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, v1, v2, v3}, Ld9/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v10, 0x1

    .line 72
    const/4 v11, 0x0

    .line 73
    invoke-static {v9, v10, v11, v0}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lc9/a;

    .line 78
    .line 79
    if-nez v0, :cond_0

    .line 80
    .line 81
    new-instance v0, Ld9/a;

    .line 82
    .line 83
    const/4 v1, 0x2

    .line 84
    invoke-direct {v0, v8, p1, v1}, Ld9/a;-><init>(Ld9/g;Lc9/a;I)V

    .line 85
    .line 86
    .line 87
    invoke-static {v9, v11, v10, v0}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    iget v1, v0, Lc9/a;->a:I

    .line 92
    .line 93
    iget-object v4, p1, Lc9/a;->d:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v5, p1, Lc9/a;->e:Ljava/lang/String;

    .line 96
    .line 97
    iget-wide v6, p1, Lc9/a;->f:J

    .line 98
    .line 99
    const-string p1, "password"

    .line 100
    .line 101
    invoke-static {v4, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string p1, "token"

    .line 105
    .line 106
    invoke-static {v5, p1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lc9/a;

    .line 110
    .line 111
    invoke-direct/range {v0 .. v7}, Lc9/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 112
    .line 113
    .line 114
    new-instance p1, Ld9/a;

    .line 115
    .line 116
    const/4 v1, 0x3

    .line 117
    invoke-direct {p1, v8, v0, v1}, Ld9/a;-><init>(Ld9/g;Lc9/a;I)V

    .line 118
    .line 119
    .line 120
    invoke-static {v9, v11, v10, p1}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_2
    const-string v0, "_connection"

    .line 127
    .line 128
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Ld9/a;->b:Ld9/g;

    .line 132
    .line 133
    iget-object v0, v0, Ld9/g;->c:Ld9/d;

    .line 134
    .line 135
    iget-object v1, p0, Ld9/a;->c:Lc9/a;

    .line 136
    .line 137
    invoke-virtual {v0, p1, v1}, Ln7/d;->u(Lz7/a;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
