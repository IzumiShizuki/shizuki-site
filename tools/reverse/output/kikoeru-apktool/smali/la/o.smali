.class public final synthetic Lla/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj1/q;

.field public final synthetic c:Lic/n;

.field public final synthetic d:Z

.field public final synthetic e:Lf1/f;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj1/q;Lic/n;Lic/n;ZLic/n;Lic/n;Lf1/f;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lla/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/o;->b:Lj1/q;

    iput-object p2, p0, Lla/o;->c:Lic/n;

    iput-object p3, p0, Lla/o;->h:Ljava/lang/Object;

    iput-boolean p4, p0, Lla/o;->d:Z

    iput-object p5, p0, Lla/o;->i:Ljava/lang/Object;

    iput-object p6, p0, Lla/o;->j:Ljava/lang/Object;

    iput-object p7, p0, Lla/o;->e:Lf1/f;

    iput p8, p0, Lla/o;->f:I

    iput p9, p0, Lla/o;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Lj1/q;ZLq1/l0;Ls/o;Lm0/q1;Lic/n;Lf1/f;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lla/o;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/o;->b:Lj1/q;

    iput-boolean p2, p0, Lla/o;->d:Z

    iput-object p3, p0, Lla/o;->h:Ljava/lang/Object;

    iput-object p4, p0, Lla/o;->i:Ljava/lang/Object;

    iput-object p5, p0, Lla/o;->j:Ljava/lang/Object;

    iput-object p6, p0, Lla/o;->c:Lic/n;

    iput-object p7, p0, Lla/o;->e:Lf1/f;

    iput p8, p0, Lla/o;->f:I

    iput p9, p0, Lla/o;->g:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lla/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lla/o;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Lic/n;

    .line 10
    .line 11
    iget-object v0, p0, Lla/o;->i:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Lic/n;

    .line 15
    .line 16
    iget-object v0, p0, Lla/o;->j:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Lic/n;

    .line 20
    .line 21
    move-object v8, p1

    .line 22
    check-cast v8, Lx0/o;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lla/o;->f:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    iget-object v1, p0, Lla/o;->b:Lj1/q;

    .line 38
    .line 39
    iget-object v2, p0, Lla/o;->c:Lic/n;

    .line 40
    .line 41
    iget-boolean v4, p0, Lla/o;->d:Z

    .line 42
    .line 43
    iget-object v7, p0, Lla/o;->e:Lf1/f;

    .line 44
    .line 45
    iget v10, p0, Lla/o;->g:I

    .line 46
    .line 47
    invoke-static/range {v1 .. v10}, Landroid/support/v4/media/session/b;->g(Lj1/q;Lic/n;Lic/n;ZLic/n;Lic/n;Lf1/f;Lx0/o;II)V

    .line 48
    .line 49
    .line 50
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_0
    iget-object v0, p0, Lla/o;->h:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    check-cast v3, Lq1/l0;

    .line 57
    .line 58
    iget-object v0, p0, Lla/o;->i:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v4, v0

    .line 61
    check-cast v4, Ls/o;

    .line 62
    .line 63
    iget-object v0, p0, Lla/o;->j:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v5, v0

    .line 66
    check-cast v5, Lm0/q1;

    .line 67
    .line 68
    move-object v8, p1

    .line 69
    check-cast v8, Lx0/o;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget p1, p0, Lla/o;->f:I

    .line 77
    .line 78
    or-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    iget-object v1, p0, Lla/o;->b:Lj1/q;

    .line 85
    .line 86
    iget-boolean v2, p0, Lla/o;->d:Z

    .line 87
    .line 88
    iget-object v6, p0, Lla/o;->c:Lic/n;

    .line 89
    .line 90
    iget-object v7, p0, Lla/o;->e:Lf1/f;

    .line 91
    .line 92
    iget v10, p0, Lla/o;->g:I

    .line 93
    .line 94
    invoke-static/range {v1 .. v10}, Lla/t;->a(Lj1/q;ZLq1/l0;Ls/o;Lm0/q1;Lic/n;Lf1/f;Lx0/o;II)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 115
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
.end method
