.class public final synthetic La9/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, La9/j;->a:I

    .line 2
    .line 3
    iput-object p2, p0, La9/j;->b:Ljava/lang/String;

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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, La9/j;->a:I

    .line 2
    .line 3
    const-string v1, "_connection"

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "it"

    .line 8
    .line 9
    sget-object v5, Lub/a0;->a:Lub/a0;

    .line 10
    .line 11
    iget-object v6, p0, La9/j;->b:Ljava/lang/String;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Lq2/k;

    .line 17
    .line 18
    sget-object v0, Lq2/v;->a:[Lpc/u;

    .line 19
    .line 20
    sget-object v0, Lq2/t;->K:Lq2/w;

    .line 21
    .line 22
    invoke-virtual {p1, v0, v6}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-object v5

    .line 26
    :pswitch_0
    check-cast p1, Lq2/k;

    .line 27
    .line 28
    sget-object v0, Lq2/v;->a:[Lpc/u;

    .line 29
    .line 30
    sget-object v0, Lq2/t;->j:Lq2/w;

    .line 31
    .line 32
    sget-object v1, Lq2/v;->a:[Lpc/u;

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    aget-object v2, v1, v2

    .line 36
    .line 37
    new-instance v2, Lq2/e;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v2}, Lq2/w;->a(Lq2/k;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lq2/t;->d:Lq2/w;

    .line 46
    .line 47
    const/4 v2, 0x2

    .line 48
    aget-object v1, v1, v2

    .line 49
    .line 50
    invoke-virtual {v0, p1, v6}, Lq2/w;->a(Lq2/k;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Li9/f;

    .line 54
    .line 55
    const/16 v1, 0xf

    .line 56
    .line 57
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v0}, Lq2/v;->b(Lq2/k;Lic/a;)V

    .line 61
    .line 62
    .line 63
    return-object v5

    .line 64
    :pswitch_1
    check-cast p1, Lq2/k;

    .line 65
    .line 66
    invoke-static {p1, v6}, Lq2/v;->d(Lq2/k;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v2}, Lq2/v;->e(Lq2/k;I)V

    .line 70
    .line 71
    .line 72
    return-object v5

    .line 73
    :pswitch_2
    check-cast p1, Lq2/k;

    .line 74
    .line 75
    invoke-static {p1, v6}, Lq2/v;->d(Lq2/k;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v2}, Lq2/v;->e(Lq2/k;I)V

    .line 79
    .line 80
    .line 81
    return-object v5

    .line 82
    :pswitch_3
    check-cast p1, Loc/d;

    .line 83
    .line 84
    invoke-static {p1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v6, p1}, Lef/n;->N0(Ljava/lang/CharSequence;Loc/d;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {p1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1}, Lef/n;->y0(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-ge v0, v1, :cond_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    move-object v6, p1

    .line 115
    goto :goto_0

    .line 116
    :cond_1
    invoke-static {v6, p1}, Lj2/h0;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    :goto_0
    return-object v6

    .line 121
    :pswitch_5
    check-cast p1, Lz7/a;

    .line 122
    .line 123
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v0, "DELETE FROM SearchHistoryBean WHERE content=(?)"

    .line 127
    .line 128
    invoke-interface {p1, v0}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :try_start_0
    invoke-interface {p1, v3, v6}, Lz7/c;->v(ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1}, Lz7/c;->Z()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 139
    .line 140
    .line 141
    return-object v5

    .line 142
    :catchall_0
    move-exception v0

    .line 143
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :pswitch_6
    check-cast p1, Lz7/a;

    .line 148
    .line 149
    invoke-static {p1, v1}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v0, "SELECT * FROM SearchHistoryBean WHERE content=(?)"

    .line 153
    .line 154
    invoke-interface {p1, v0}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :try_start_1
    invoke-interface {p1, v3, v6}, Lz7/c;->v(ILjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const-string v0, "id"

    .line 162
    .line 163
    invoke-static {p1, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const-string v1, "timestamp"

    .line 168
    .line 169
    invoke-static {p1, v1}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    const-string v2, "content"

    .line 174
    .line 175
    invoke-static {p1, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-interface {p1}, Lz7/c;->Z()Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_2

    .line 184
    .line 185
    invoke-interface {p1, v0}, Lz7/c;->getLong(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v3

    .line 189
    long-to-int v0, v3

    .line 190
    invoke-interface {p1, v1}, Lz7/c;->getLong(I)J

    .line 191
    .line 192
    .line 193
    move-result-wide v3

    .line 194
    invoke-interface {p1, v2}, Lz7/c;->M(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    new-instance v2, Lc9/h;

    .line 199
    .line 200
    invoke-direct {v2, v3, v4, v1, v0}, Lc9/h;-><init>(JLjava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    goto :goto_2

    .line 206
    :cond_2
    const/4 v2, 0x0

    .line 207
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 208
    .line 209
    .line 210
    return-object v2

    .line 211
    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :pswitch_7
    check-cast p1, Lz7/c;

    .line 216
    .line 217
    const-string v0, "_stmt"

    .line 218
    .line 219
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p1, v3, v6}, Lz7/c;->v(ILjava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v5

    .line 226
    :pswitch_8
    check-cast p1, Lka/k;

    .line 227
    .line 228
    sget v0, Lcom/cnl/kikoeru/MainActivity;->u:I

    .line 229
    .line 230
    invoke-static {p1, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {p1}, Lka/n;->b(Lka/k;)V

    .line 234
    .line 235
    .line 236
    sget-object p1, La9/u;->d:Ljava/lang/ref/WeakReference;

    .line 237
    .line 238
    if-eqz p1, :cond_3

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    check-cast p1, Le7/a0;

    .line 245
    .line 246
    if-eqz p1, :cond_3

    .line 247
    .line 248
    const-string v0, "MusicScreen/"

    .line 249
    .line 250
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {p1, v0}, Le7/a0;->b(Le7/a0;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_3
    return-object v5

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
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
