.class public final Le7/a0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lh7/g;

.field public final c:Lc4/n;

.field public final d:Landroid/app/Activity;

.field public e:Z

.field public final f:Ld/k0;

.field public final g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Le7/a0;->a:Landroid/content/Context;

    .line 10
    .line 11
    new-instance v0, Lh7/g;

    .line 12
    .line 13
    new-instance v1, Lca/b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, p0, v2}, Lca/b;-><init>(Le7/a0;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, Lh7/g;-><init>(Le7/a0;Lca/b;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Le7/a0;->b:Lh7/g;

    .line 23
    .line 24
    new-instance v0, Lc4/n;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p1, v1}, Lc4/n;-><init>(Landroid/content/Context;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Le7/a0;->c:Lc4/n;

    .line 31
    .line 32
    new-instance v0, Ld9/i;

    .line 33
    .line 34
    const/16 v1, 0xc

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ld9/i;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, Ldf/m;->b0(Ljava/lang/Object;Lic/k;)Ldf/k;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Ldf/k;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Landroid/content/Context;

    .line 59
    .line 60
    instance-of v1, v1, Landroid/app/Activity;

    .line 61
    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v0, 0x0

    .line 66
    :goto_0
    check-cast v0, Landroid/app/Activity;

    .line 67
    .line 68
    iput-object v0, p0, Le7/a0;->d:Landroid/app/Activity;

    .line 69
    .line 70
    new-instance p1, Ld/k0;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Ld/k0;-><init>(Le7/a0;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Le7/a0;->f:Ld/k0;

    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, Le7/a0;->g:Z

    .line 79
    .line 80
    iget-object p1, p0, Le7/a0;->b:Lh7/g;

    .line 81
    .line 82
    iget-object p1, p1, Lh7/g;->s:Le7/n0;

    .line 83
    .line 84
    new-instance v0, Le7/z;

    .line 85
    .line 86
    invoke-direct {v0, p1}, Le7/z;-><init>(Le7/n0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Le7/n0;->a(Le7/m0;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Le7/a0;->b:Lh7/g;

    .line 93
    .line 94
    iget-object p1, p1, Lh7/g;->s:Le7/n0;

    .line 95
    .line 96
    new-instance v0, Le7/b;

    .line 97
    .line 98
    iget-object v1, p0, Le7/a0;->a:Landroid/content/Context;

    .line 99
    .line 100
    invoke-direct {v0, v1}, Le7/b;-><init>(Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Le7/n0;->a(Le7/m0;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Lca/b;

    .line 107
    .line 108
    const/4 v0, 0x2

    .line 109
    invoke-direct {p1, p0, v0}, Lca/b;-><init>(Le7/a0;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lub/a;->d(Lic/a;)Lub/p;

    .line 113
    .line 114
    .line 115
    return-void
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

.method public static b(Le7/a0;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "route"

    .line 5
    .line 6
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Le7/a0;->b:Lh7/g;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lh7/g;->c:Le7/w;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Lh7/g;->i()Le7/w;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, p1, v1, v0}, Le7/w;->m(Ljava/lang/String;ZLe7/u;)Le7/t;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object p1, v0, Le7/t;->a:Le7/u;

    .line 30
    .line 31
    iget-object v0, v0, Le7/t;->b:Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Le7/u;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    new-array v1, v0, [Lub/k;

    .line 41
    .line 42
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, [Lub/k;

    .line 47
    .line 48
    invoke-static {v0}, Ln7/d;->c([Lub/k;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_0
    sget v1, Le7/u;->e:I

    .line 53
    .line 54
    iget-object v1, p1, Le7/u;->b:Lh7/i;

    .line 55
    .line 56
    iget-object v1, v1, Lh7/i;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const-string v2, "android-app://androidx.navigation/"

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const-string v1, ""

    .line 70
    .line 71
    :goto_0
    const-string v2, "uriString"

    .line 72
    .line 73
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v2, "parse(...)"

    .line 81
    .line 82
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Landroid/content/Intent;

    .line 86
    .line 87
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 88
    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    const-string v1, "android-support-nav:controller:deepLinkIntent"

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, v0, v3}, Lh7/g;->k(Le7/u;Landroid/os/Bundle;Le7/d0;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 107
    .line 108
    const-string v1, "Navigation destination that matches route "

    .line 109
    .line 110
    const-string v2, " cannot be found in the navigation graph "

    .line 111
    .line 112
    invoke-static {v1, p1, v2}, La0/c;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object p0, p0, Lh7/g;->c:Le7/w;

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v1, "Cannot navigate to "

    .line 132
    .line 133
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p1, ". Navigation graph has not been set for NavController "

    .line 140
    .line 141
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const/16 p0, 0x2e

    .line 148
    .line 149
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1
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


# virtual methods
.method public final a(Landroid/content/Intent;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    goto/16 :goto_10

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const-string v5, "NavController"

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :try_start_0
    const-string v0, "android-support-nav:controller:deepLinkIds"

    .line 20
    .line 21
    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    new-instance v7, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v8, "handleDeepLink() could not extract deepLink from "

    .line 30
    .line 31
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v5, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    :cond_1
    move-object v0, v6

    .line 45
    :goto_0
    if-eqz v4, :cond_2

    .line 46
    .line 47
    const-string v7, "android-support-nav:controller:deepLinkArgs"

    .line 48
    .line 49
    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v7, v6

    .line 55
    :goto_1
    new-array v8, v3, [Lub/k;

    .line 56
    .line 57
    invoke-static {v8, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, [Lub/k;

    .line 62
    .line 63
    invoke-static {v8}, Ln7/d;->c([Lub/k;)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    const-string v9, "android-support-nav:controller:deepLinkExtras"

    .line 70
    .line 71
    invoke-virtual {v4, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move-object v4, v6

    .line 77
    :goto_2
    if-eqz v4, :cond_4

    .line 78
    .line 79
    invoke-virtual {v8, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    iget-object v4, v1, Le7/a0;->b:Lh7/g;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    array-length v9, v0

    .line 87
    if-nez v9, :cond_7

    .line 88
    .line 89
    :cond_5
    invoke-virtual {v4}, Lh7/g;->i()Le7/w;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    new-instance v10, Lc7/e1;

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    invoke-virtual {v2}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    const/16 v14, 0xb

    .line 108
    .line 109
    invoke-direct {v10, v11, v12, v13, v14}, Lc7/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v10, v9}, Le7/w;->l(Lc7/e1;Le7/u;)Le7/t;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    if-eqz v9, :cond_7

    .line 117
    .line 118
    iget-object v0, v9, Le7/t;->a:Le7/u;

    .line 119
    .line 120
    invoke-virtual {v0, v6}, Le7/u;->i(Le7/u;)[I

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    iget-object v9, v9, Le7/t;->b:Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-virtual {v0, v9}, Le7/u;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    invoke-virtual {v8, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    move-object v0, v7

    .line 136
    move-object v7, v6

    .line 137
    :cond_7
    if-eqz v0, :cond_22

    .line 138
    .line 139
    array-length v9, v0

    .line 140
    if-nez v9, :cond_8

    .line 141
    .line 142
    goto/16 :goto_10

    .line 143
    .line 144
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v9, v4, Lh7/g;->c:Le7/w;

    .line 148
    .line 149
    array-length v10, v0

    .line 150
    const/4 v11, 0x0

    .line 151
    :goto_3
    const/4 v12, 0x1

    .line 152
    if-ge v11, v10, :cond_e

    .line 153
    .line 154
    aget v13, v0, v11

    .line 155
    .line 156
    if-nez v11, :cond_a

    .line 157
    .line 158
    iget-object v14, v4, Lh7/g;->c:Le7/w;

    .line 159
    .line 160
    invoke-static {v14}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v14, v14, Le7/u;->b:Lh7/i;

    .line 164
    .line 165
    iget v14, v14, Lh7/i;->a:I

    .line 166
    .line 167
    if-ne v14, v13, :cond_9

    .line 168
    .line 169
    iget-object v14, v4, Lh7/g;->c:Le7/w;

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    move-object v14, v6

    .line 173
    goto :goto_4

    .line 174
    :cond_a
    invoke-static {v9}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object v14, v9, Le7/w;->f:Lh7/k;

    .line 178
    .line 179
    invoke-virtual {v14, v13}, Lh7/k;->r(I)Le7/u;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    :goto_4
    if-nez v14, :cond_b

    .line 184
    .line 185
    sget v9, Le7/u;->e:I

    .line 186
    .line 187
    iget-object v9, v4, Lh7/g;->a:Le7/a0;

    .line 188
    .line 189
    iget-object v9, v9, Le7/a0;->c:Lc4/n;

    .line 190
    .line 191
    invoke-static {v9, v13}, Le7/g;->a(Lc4/n;I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    goto :goto_6

    .line 196
    :cond_b
    array-length v13, v0

    .line 197
    sub-int/2addr v13, v12

    .line 198
    if-eq v11, v13, :cond_d

    .line 199
    .line 200
    instance-of v12, v14, Le7/w;

    .line 201
    .line 202
    if-eqz v12, :cond_d

    .line 203
    .line 204
    check-cast v14, Le7/w;

    .line 205
    .line 206
    :goto_5
    invoke-static {v14}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    iget-object v9, v14, Le7/w;->f:Lh7/k;

    .line 210
    .line 211
    iget v12, v9, Lh7/k;->b:I

    .line 212
    .line 213
    invoke-virtual {v9, v12}, Lh7/k;->r(I)Le7/u;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    instance-of v12, v12, Le7/w;

    .line 218
    .line 219
    if-eqz v12, :cond_c

    .line 220
    .line 221
    iget v12, v9, Lh7/k;->b:I

    .line 222
    .line 223
    invoke-virtual {v9, v12}, Lh7/k;->r(I)Le7/u;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    move-object v14, v9

    .line 228
    check-cast v14, Le7/w;

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_c
    move-object v9, v14

    .line 232
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_e
    move-object v9, v6

    .line 236
    :goto_6
    if-eqz v9, :cond_f

    .line 237
    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    const-string v4, "Could not find destination "

    .line 241
    .line 242
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v4, " in the navigation graph, ignoring the deep link from "

    .line 249
    .line 250
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    const-string v2, "message"

    .line 261
    .line 262
    invoke-static {v0, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    return v3

    .line 269
    :cond_f
    const-string v5, "android-support-nav:controller:deepLinkIntent"

    .line 270
    .line 271
    invoke-virtual {v8, v5, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 272
    .line 273
    .line 274
    array-length v5, v0

    .line 275
    new-array v9, v5, [Landroid/os/Bundle;

    .line 276
    .line 277
    const/4 v10, 0x0

    .line 278
    :goto_7
    if-ge v10, v5, :cond_11

    .line 279
    .line 280
    new-array v11, v3, [Lub/k;

    .line 281
    .line 282
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    check-cast v11, [Lub/k;

    .line 287
    .line 288
    invoke-static {v11}, Ln7/d;->c([Lub/k;)Landroid/os/Bundle;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    invoke-virtual {v11, v8}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 293
    .line 294
    .line 295
    if-eqz v7, :cond_10

    .line 296
    .line 297
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    check-cast v13, Landroid/os/Bundle;

    .line 302
    .line 303
    if-eqz v13, :cond_10

    .line 304
    .line 305
    invoke-virtual {v11, v13}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 306
    .line 307
    .line 308
    :cond_10
    aput-object v11, v9, v10

    .line 309
    .line 310
    add-int/lit8 v10, v10, 0x1

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_11
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    const/high16 v7, 0x10000000

    .line 318
    .line 319
    and-int/2addr v7, v5

    .line 320
    if-eqz v7, :cond_15

    .line 321
    .line 322
    const v8, 0x8000

    .line 323
    .line 324
    .line 325
    and-int/2addr v5, v8

    .line 326
    if-nez v5, :cond_15

    .line 327
    .line 328
    invoke-virtual {v2, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 329
    .line 330
    .line 331
    new-instance v0, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    iget-object v5, v1, Le7/a0;->a:Landroid/content/Context;

    .line 341
    .line 342
    if-nez v4, :cond_12

    .line 343
    .line 344
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-virtual {v2, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    :cond_12
    if-eqz v4, :cond_13

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    :try_start_1
    invoke-static {v5, v4}, Lg8/a;->K(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    :goto_8
    if-eqz v4, :cond_13

    .line 363
    .line 364
    invoke-virtual {v0, v7, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-static {v5, v4}, Lg8/a;->K(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 372
    .line 373
    .line 374
    move-result-object v4
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 375
    goto :goto_8

    .line 376
    :catch_1
    move-exception v0

    .line 377
    const-string v2, "TaskStackBuilder"

    .line 378
    .line 379
    const-string v3, "Bad ComponentName while traversing activity parent metadata"

    .line 380
    .line 381
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 385
    .line 386
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    throw v2

    .line 390
    :cond_13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-nez v2, :cond_14

    .line 398
    .line 399
    new-array v2, v3, [Landroid/content/Intent;

    .line 400
    .line 401
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, [Landroid/content/Intent;

    .line 406
    .line 407
    new-instance v2, Landroid/content/Intent;

    .line 408
    .line 409
    aget-object v4, v0, v3

    .line 410
    .line 411
    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 412
    .line 413
    .line 414
    const v4, 0x1000c000

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    aput-object v2, v0, v3

    .line 422
    .line 423
    invoke-virtual {v5, v0, v6}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 424
    .line 425
    .line 426
    iget-object v0, v1, Le7/a0;->d:Landroid/app/Activity;

    .line 427
    .line 428
    if-eqz v0, :cond_21

    .line 429
    .line 430
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v3, v3}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_f

    .line 437
    .line 438
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 439
    .line 440
    const-string v2, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 441
    .line 442
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v0

    .line 446
    :cond_15
    if-eqz v7, :cond_16

    .line 447
    .line 448
    const/4 v2, 0x1

    .line 449
    goto :goto_9

    .line 450
    :cond_16
    const/4 v2, 0x0

    .line 451
    :goto_9
    const-string v5, "Deep Linking failed: destination "

    .line 452
    .line 453
    iget-object v7, v1, Le7/a0;->c:Lc4/n;

    .line 454
    .line 455
    if-eqz v2, :cond_1a

    .line 456
    .line 457
    iget-object v2, v4, Lh7/g;->f:Lvb/j;

    .line 458
    .line 459
    invoke-virtual {v2}, Lvb/j;->isEmpty()Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    if-nez v2, :cond_17

    .line 464
    .line 465
    iget-object v2, v4, Lh7/g;->c:Le7/w;

    .line 466
    .line 467
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    iget-object v2, v2, Le7/u;->b:Lh7/i;

    .line 471
    .line 472
    iget v2, v2, Lh7/i;->a:I

    .line 473
    .line 474
    invoke-virtual {v4, v12, v2, v3}, Lh7/g;->l(ZIZ)Z

    .line 475
    .line 476
    .line 477
    :cond_17
    :goto_a
    array-length v2, v0

    .line 478
    if-ge v3, v2, :cond_19

    .line 479
    .line 480
    aget v2, v0, v3

    .line 481
    .line 482
    add-int/lit8 v8, v3, 0x1

    .line 483
    .line 484
    aget-object v3, v9, v3

    .line 485
    .line 486
    invoke-virtual {v4, v2, v6}, Lh7/g;->c(ILe7/u;)Le7/u;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    if-eqz v10, :cond_18

    .line 491
    .line 492
    new-instance v2, Lba/q0;

    .line 493
    .line 494
    const/4 v11, 0x3

    .line 495
    invoke-direct {v2, v11, v10, v1}, Lba/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    new-instance v11, Le7/e0;

    .line 499
    .line 500
    invoke-direct {v11}, Le7/e0;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-interface {v2, v11}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    iget-boolean v14, v11, Le7/e0;->b:Z

    .line 507
    .line 508
    iget-boolean v15, v11, Le7/e0;->c:Z

    .line 509
    .line 510
    iget v2, v11, Le7/e0;->d:I

    .line 511
    .line 512
    iget-boolean v13, v11, Le7/e0;->e:Z

    .line 513
    .line 514
    move/from16 v18, v13

    .line 515
    .line 516
    new-instance v13, Le7/d0;

    .line 517
    .line 518
    iget-object v11, v11, Le7/e0;->a:Le7/c0;

    .line 519
    .line 520
    iget v6, v11, Le7/c0;->b:I

    .line 521
    .line 522
    iget v11, v11, Le7/c0;->c:I

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    move/from16 v16, v2

    .line 527
    .line 528
    move/from16 v19, v6

    .line 529
    .line 530
    move/from16 v20, v11

    .line 531
    .line 532
    invoke-direct/range {v13 .. v20}, Le7/d0;-><init>(ZZIZZII)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v4, v10, v3, v13}, Lh7/g;->k(Le7/u;Landroid/os/Bundle;Le7/d0;)V

    .line 536
    .line 537
    .line 538
    move v3, v8

    .line 539
    const/4 v6, 0x0

    .line 540
    goto :goto_a

    .line 541
    :cond_18
    sget v0, Le7/u;->e:I

    .line 542
    .line 543
    invoke-static {v7, v2}, Le7/g;->a(Lc4/n;I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 548
    .line 549
    const-string v3, " cannot be found from the current destination "

    .line 550
    .line 551
    invoke-static {v5, v0, v3}, La0/c;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v4}, Lh7/g;->f()Le7/u;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    throw v2

    .line 570
    :cond_19
    iput-boolean v12, v1, Le7/a0;->e:Z

    .line 571
    .line 572
    goto/16 :goto_f

    .line 573
    .line 574
    :cond_1a
    iget-object v2, v4, Lh7/g;->c:Le7/w;

    .line 575
    .line 576
    array-length v6, v0

    .line 577
    :goto_b
    if-ge v3, v6, :cond_20

    .line 578
    .line 579
    aget v8, v0, v3

    .line 580
    .line 581
    aget-object v10, v9, v3

    .line 582
    .line 583
    if-nez v3, :cond_1b

    .line 584
    .line 585
    iget-object v11, v4, Lh7/g;->c:Le7/w;

    .line 586
    .line 587
    goto :goto_c

    .line 588
    :cond_1b
    invoke-static {v2}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    iget-object v11, v2, Le7/w;->f:Lh7/k;

    .line 592
    .line 593
    invoke-virtual {v11, v8}, Lh7/k;->r(I)Le7/u;

    .line 594
    .line 595
    .line 596
    move-result-object v11

    .line 597
    :goto_c
    if-eqz v11, :cond_1f

    .line 598
    .line 599
    array-length v8, v0

    .line 600
    sub-int/2addr v8, v12

    .line 601
    if-eq v3, v8, :cond_1d

    .line 602
    .line 603
    instance-of v8, v11, Le7/w;

    .line 604
    .line 605
    if-eqz v8, :cond_1e

    .line 606
    .line 607
    check-cast v11, Le7/w;

    .line 608
    .line 609
    :goto_d
    invoke-static {v11}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    iget-object v2, v11, Le7/w;->f:Lh7/k;

    .line 613
    .line 614
    iget v8, v2, Lh7/k;->b:I

    .line 615
    .line 616
    invoke-virtual {v2, v8}, Lh7/k;->r(I)Le7/u;

    .line 617
    .line 618
    .line 619
    move-result-object v8

    .line 620
    instance-of v8, v8, Le7/w;

    .line 621
    .line 622
    if-eqz v8, :cond_1c

    .line 623
    .line 624
    iget v8, v2, Lh7/k;->b:I

    .line 625
    .line 626
    invoke-virtual {v2, v8}, Lh7/k;->r(I)Le7/u;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    move-object v11, v2

    .line 631
    check-cast v11, Le7/w;

    .line 632
    .line 633
    goto :goto_d

    .line 634
    :cond_1c
    move-object v2, v11

    .line 635
    goto :goto_e

    .line 636
    :cond_1d
    iget-object v8, v4, Lh7/g;->c:Le7/w;

    .line 637
    .line 638
    invoke-static {v8}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    iget-object v8, v8, Le7/u;->b:Lh7/i;

    .line 642
    .line 643
    iget v8, v8, Lh7/i;->a:I

    .line 644
    .line 645
    new-instance v13, Le7/d0;

    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    const/4 v15, 0x0

    .line 649
    const/16 v17, 0x1

    .line 650
    .line 651
    const/16 v18, 0x0

    .line 652
    .line 653
    const/16 v19, 0x0

    .line 654
    .line 655
    const/16 v20, 0x0

    .line 656
    .line 657
    move/from16 v16, v8

    .line 658
    .line 659
    invoke-direct/range {v13 .. v20}, Le7/d0;-><init>(ZZIZZII)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v4, v11, v10, v13}, Lh7/g;->k(Le7/u;Landroid/os/Bundle;Le7/d0;)V

    .line 663
    .line 664
    .line 665
    :cond_1e
    :goto_e
    add-int/lit8 v3, v3, 0x1

    .line 666
    .line 667
    goto :goto_b

    .line 668
    :cond_1f
    sget v0, Le7/u;->e:I

    .line 669
    .line 670
    invoke-static {v7, v8}, Le7/g;->a(Lc4/n;I)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 675
    .line 676
    new-instance v4, Ljava/lang/StringBuilder;

    .line 677
    .line 678
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    const-string v0, " cannot be found in graph "

    .line 685
    .line 686
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    throw v3

    .line 700
    :cond_20
    iput-boolean v12, v1, Le7/a0;->e:Z

    .line 701
    .line 702
    :cond_21
    :goto_f
    return v12

    .line 703
    :cond_22
    :goto_10
    return v3
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

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Le7/a0;->b:Lh7/g;

    .line 2
    .line 3
    iget-object v1, v0, Lh7/g;->f:Lvb/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Lvb/j;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lh7/g;->f()Le7/u;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v1, Le7/u;->b:Lh7/i;

    .line 20
    .line 21
    iget v1, v1, Lh7/i;->a:I

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v2, v1, v3}, Lh7/g;->l(ZIZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Lh7/g;->b()Z

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void
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
