.class public final synthetic Lla/t0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lic/a;

.field public final synthetic d:Lj1/q;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lic/a;Lj1/q;ZLy/d1;Lw/k;Lic/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lla/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/t0;->c:Lic/a;

    iput-object p2, p0, Lla/t0;->d:Lj1/q;

    iput-boolean p3, p0, Lla/t0;->b:Z

    iput-object p4, p0, Lla/t0;->f:Ljava/lang/Object;

    iput-object p5, p0, Lla/t0;->g:Ljava/lang/Object;

    iput-object p6, p0, Lla/t0;->h:Ljava/lang/Object;

    iput p7, p0, Lla/t0;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Lic/a;Lj1/q;ZLy/d1;Lw1/f;Ljava/lang/String;II)V
    .locals 0

    .line 2
    const/4 p7, 0x0

    iput p7, p0, Lla/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/t0;->c:Lic/a;

    iput-object p2, p0, Lla/t0;->d:Lj1/q;

    iput-boolean p3, p0, Lla/t0;->b:Z

    iput-object p4, p0, Lla/t0;->f:Ljava/lang/Object;

    iput-object p5, p0, Lla/t0;->g:Ljava/lang/Object;

    iput-object p6, p0, Lla/t0;->h:Ljava/lang/Object;

    iput p8, p0, Lla/t0;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Lm0/d3;ZLic/a;Lj1/q;Ls/o1;Lf1/f;I)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lla/t0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/t0;->f:Ljava/lang/Object;

    iput-boolean p2, p0, Lla/t0;->b:Z

    iput-object p3, p0, Lla/t0;->c:Lic/a;

    iput-object p4, p0, Lla/t0;->d:Lj1/q;

    iput-object p5, p0, Lla/t0;->g:Ljava/lang/Object;

    iput-object p6, p0, Lla/t0;->h:Ljava/lang/Object;

    iput p7, p0, Lla/t0;->e:I

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lla/t0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lla/t0;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v4, v0

    .line 9
    check-cast v4, Ly/d1;

    .line 10
    .line 11
    iget-object v0, p0, Lla/t0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Lw/k;

    .line 15
    .line 16
    iget-object v0, p0, Lla/t0;->h:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v0

    .line 19
    check-cast v6, Lic/o;

    .line 20
    .line 21
    move-object v7, p1

    .line 22
    check-cast v7, Lx0/o;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lla/t0;->e:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    iget-object v1, p0, Lla/t0;->c:Lic/a;

    .line 38
    .line 39
    iget-object v2, p0, Lla/t0;->d:Lj1/q;

    .line 40
    .line 41
    iget-boolean v3, p0, Lla/t0;->b:Z

    .line 42
    .line 43
    invoke-static/range {v1 .. v8}, Lm0/f4;->b(Lic/a;Lj1/q;ZLy/d1;Lw/k;Lic/o;Lx0/o;I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    iget-object v0, p0, Lla/t0;->f:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v1, v0

    .line 52
    check-cast v1, Lm0/d3;

    .line 53
    .line 54
    iget-object v0, p0, Lla/t0;->g:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v5, v0

    .line 57
    check-cast v5, Ls/o1;

    .line 58
    .line 59
    iget-object v0, p0, Lla/t0;->h:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v6, v0

    .line 62
    check-cast v6, Lf1/f;

    .line 63
    .line 64
    move-object v7, p1

    .line 65
    check-cast v7, Lx0/o;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget p1, p0, Lla/t0;->e:I

    .line 73
    .line 74
    or-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    iget-boolean v2, p0, Lla/t0;->b:Z

    .line 81
    .line 82
    iget-object v3, p0, Lla/t0;->c:Lic/a;

    .line 83
    .line 84
    iget-object v4, p0, Lla/t0;->d:Lj1/q;

    .line 85
    .line 86
    invoke-virtual/range {v1 .. v8}, Lm0/d3;->a(ZLic/a;Lj1/q;Ls/o1;Lf1/f;Lx0/o;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_1
    iget-object v0, p0, Lla/t0;->f:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v4, v0

    .line 93
    check-cast v4, Ly/d1;

    .line 94
    .line 95
    iget-object v0, p0, Lla/t0;->g:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v5, v0

    .line 98
    check-cast v5, Lw1/f;

    .line 99
    .line 100
    iget-object v0, p0, Lla/t0;->h:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v6, v0

    .line 103
    check-cast v6, Ljava/lang/String;

    .line 104
    .line 105
    move-object v7, p1

    .line 106
    check-cast v7, Lx0/o;

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    iget-object v1, p0, Lla/t0;->c:Lic/a;

    .line 119
    .line 120
    iget-object v2, p0, Lla/t0;->d:Lj1/q;

    .line 121
    .line 122
    iget-boolean v3, p0, Lla/t0;->b:Z

    .line 123
    .line 124
    iget v9, p0, Lla/t0;->e:I

    .line 125
    .line 126
    invoke-static/range {v1 .. v9}, Lla/l;->l(Lic/a;Lj1/q;ZLy/d1;Lw1/f;Ljava/lang/String;Lx0/o;II)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
